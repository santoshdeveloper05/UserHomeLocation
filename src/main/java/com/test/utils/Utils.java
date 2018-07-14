package com.test.utils;

import java.math.RoundingMode;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Utils {

    public static long FOUR_HOURS = 240;
    public static long EIGHT_HOURS = 480;
    public static long TWENTY_FOUR_HOURS = 1440;
    public static long TWENTY_HOURS = 1200;
    public static long TWELVE_HOURS = 720;
    public static long THIRTY_HOURS = 1800;

    /**
     * Converts a string date to Date Object
     * 
     * @param date
     * @return Date object
     * @throws ParseException
     */
    public static Date convertDate(String date) throws ParseException {
        DateFormat format = new SimpleDateFormat("MM/dd/yyyy kk:mm:ss", Locale.ENGLISH);
        return format.parse(date);
    }

    /**
     * This class gets next midnight of any give date Object
     * 
     * @param dateObject
     * @return midnight in milliseconds
     */
    public static long getMidnight(Date dateObject) {
        Calendar cal = Calendar.getInstance(); // locale-specific
        cal.setTime(dateObject);
        cal.add(Calendar.DATE, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);
        cal.set(Calendar.MILLISECOND, 0);
        return cal.getTimeInMillis();
    }

    /**
     * Return the rounded of location to three decimal places.
     * 
     * @param location
     * @return
     */
    public static String roundLocation(String location) {
    	DecimalFormat df = new DecimalFormat("#.###");
    	df.setRoundingMode(RoundingMode.CEILING);
    	double loc = Double.parseDouble(location);
    	return df.format(loc).toString();
    }
}
