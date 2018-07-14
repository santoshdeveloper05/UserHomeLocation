package com.test.location;

import java.util.HashMap;
import java.util.List;

import com.test.model.UserHome;
import com.test.model.Visit;
import com.test.utils.Utils;

/**
 * This class finds the user home for the list of visit data passed to run()
 * ASSUMPTIONS : location with last three decimal values are same, and all
 * location lat long are of same length
 */
public class FindUserHomeTask {

    /**
     * This function will return the location where user spent most time between
     * 8 PM to 8 AM, provided time spent is > 30 hours otherwise it only returns
     * location where user spent highest time at
     * 
     * @param visits
     *            - list of visits
     * @return userHome object
     */
    public UserHome run(List<Visit> visits) {

        if (visits == null || visits.isEmpty()) {
            throw new IllegalArgumentException("Visit Data is not available");
        }

        UserHome userHome = new UserHome();
        try {
            HashMap<Visit, Long> finalResult = new HashMap<Visit, Long>();
            long highestTimeSpent = 0;
            String latitude = null;
            String longitude = null;

            for (Visit visit : visits) {

                visit.setLatitude(Utils.roundLocation(visit.getLatitude()));
                visit.setLongitude(Utils.roundLocation(visit.getLongitude()));
                long midnight = (Utils.getMidnight(Utils.convertDate(visit.getArrivalTime())));
                long timeTillMidnight = (midnight - Utils.convertDate(visit.getArrivalTime()).getTime()) / 60000;
                long timeAfterMidnight = (Utils.convertDate(visit.getDepartureTime()).getTime() - midnight) / 60000;

                if (timeTillMidnight > Utils.FOUR_HOURS) {
                    timeTillMidnight = Utils.FOUR_HOURS;
                }

                long timeAfterMidnightMode = timeAfterMidnight % Utils.TWENTY_FOUR_HOURS;
                if (timeAfterMidnightMode > Utils.EIGHT_HOURS && timeAfterMidnightMode < Utils.TWENTY_HOURS) {
                    timeAfterMidnightMode = Utils.EIGHT_HOURS;
                } else if (timeAfterMidnightMode > Utils.TWENTY_HOURS) {
                    timeAfterMidnightMode = timeAfterMidnightMode - Utils.TWELVE_HOURS;
                }
                long totalTime = timeTillMidnight + (timeAfterMidnight / Utils.TWENTY_FOUR_HOURS) * Utils.TWELVE_HOURS
                        + timeAfterMidnightMode;

                if (totalTime > 0) {
                    if (finalResult.containsKey(visit)) {
                        finalResult.put(visit, finalResult.get(visit) + totalTime);
                    } else {
                        finalResult.put(visit, totalTime);
                    }
                    if (highestTimeSpent < finalResult.get(visit)) {
                        highestTimeSpent = finalResult.get(visit);
                        latitude = visit.getLatitude();
                        longitude = visit.getLongitude();
                    }
                }

            }

            userHome.setLatitude(latitude);
            userHome.setLongitude(longitude);
            userHome.setHighesTimeSpent(highestTimeSpent / 60);

            if (highestTimeSpent > Utils.THIRTY_HOURS) {
                userHome.setHomeLocation(true);
            } else {
                userHome.setHomeLocation(false);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userHome;
    }
}
