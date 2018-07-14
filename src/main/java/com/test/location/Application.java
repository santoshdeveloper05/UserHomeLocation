package com.test.location;

import java.util.ArrayList;
import java.util.List;

import com.test.model.UserHome;
import com.test.model.Visit;

public class Application {
	
	/**
	 * Sample activity of a user. Further test cases are present in test classes.
	 *  
	 * @author Developer
	 * @param args
	 */
    public static void main(String[] args) {
    	Visit office = new Visit("77.1819191", "112.121948", "07/14/2018 08:00:00", "07/14/2018 12:00:00");
    	
    	Visit restaurant = new Visit("77.1119191", "112.141948", "07/14/2018 12:00:00", "07/14/2018 13:00:00");
    	
    	Visit office2 = new Visit("177.1819191", "112.121948", "07/14/2018 13:00:00", "07/14/2018 16:00:00");
    	
    	Visit club = new Visit("177.1219191", "112.131948", "07/14/2018 16:00:00", "07/14/2018 17:30:00");
    	
    	Visit bar = new Visit("177.1419191", "112.141948", "07/14/2018 17:30:00", "07/14/2018 19:00:00");
    	
    	Visit home = new Visit("177.1519191", "112.151948", "07/14/2018 19:00:00", "07/15/2018 08:00:00");
    	
    	Visit home2 = new Visit("177.1519191", "112.151948", "07/15/2018 19:00:00", "07/16/2018 09:00:00");
    	
    	Visit home3 = new Visit("177.1519191", "112.151948", "07/16/2018 19:00:00", "07/17/2018 08:30:00");
    	
    	List<Visit> visits = new ArrayList<Visit>();
    	
    	visits.add(office);
    	visits.add(office2);
    	visits.add(restaurant);
    	visits.add(bar);
    	visits.add(club);
    	visits.add(home);
    	visits.add(home2);
    	visits.add(home3);
    	
		UserHome userHome = new FindUserHomeTask().run(visits);
		
		System.out.println(userHome.toString());
    }
}