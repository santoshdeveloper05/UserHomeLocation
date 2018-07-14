package com.test.location;

import java.util.ArrayList;
import java.util.List;

import com.test.model.Visit;

public class VisitTestData {

    public static List<Visit> getVisits() {
        List<Visit> visitList = new ArrayList<Visit>();
        Visit visit1 = new Visit("45.12345", "-118.12345", "05/30/2015 10:12:35", "05/30/2015 18:12:35");
        Visit visit2 = new Visit("46.12345", "-118.12345", "05/31/2015 10:12:35", "05/31/2015 18:12:35");
        Visit visit3 = new Visit("45.12344", "-118.12345", "06/01/2015 10:12:35", "06/01/2015 23:12:35");
        Visit visit4 = new Visit("45.12344", "-118.12345", "06/01/2015 10:12:35", "06/01/2015 23:12:35");
        Visit visit5 = new Visit("46.12344", "-118.12345", "06/02/2015 19:13:35", "06/03/2015 18:12:35");
        Visit visit6 = new Visit("-47.12344", "-118.12345", "06/03/2015 18:13:35", "06/04/2015 09:12:35");
        Visit visit7 = new Visit("-45.12344", "118.12345", "06/04/2015 10:12:35", "06/04/2015 12:12:35");
        Visit visit8 = new Visit("46.12344", "-118.12345", "06/04/2015 19:13:35", "06/05/2015 11:12:35");
        Visit visit9 = new Visit("45.12344", "-118.12345", "06/05/2015 13:13:35", "06/07/2015 11:12:35");
        Visit visit10 = new Visit("46.12344", "-118.12345", "06/07/2015 11:13:35", "06/07/2015 21:12:35");
        Visit visit11 = new Visit("45.12344", "-118.12345", "06/07/2015 21:13:35", "06/08/2015 06:12:35");
        Visit visit12 = new Visit("46.12344", "-118.12345", "06/08/2015 19:13:35", "06/09/2015 09:12:35");
        Visit visit13 = new Visit("47.12444", "-118.12445", "06/09/2015 09:13:35", "06/09/2015 22:12:35");
        Visit visit14 = new Visit("45.12444", "-118.12445", "06/09/2015 22:13:35", "06/10/2015 07:12:35");
        Visit visit15 = new Visit("47.12444", "-118.12445", "06/10/2015 09:13:35", "06/10/2015 16:12:35");
        Visit visit16 = new Visit("46.12444", "-118.12445", "06/10/2015 17:13:35", "06/11/2015 10:12:35");
        Visit visit17 = new Visit("45.12444", "-118.12445", "06/11/2015 17:13:35", "06/12/2015 10:12:35");
        Visit visit18 = new Visit("45.12444", "-118.12445", "06/12/2015 17:13:35", "06/13/2015 10:12:35");
        Visit visit19 = new Visit("45.12444", "-118.12445", "06/13/2015 17:13:35", "06/14/2015 10:12:35");

        visitList.add(visit1);
        visitList.add(visit2);
        visitList.add(visit3);
        visitList.add(visit4);
        visitList.add(visit5);
        visitList.add(visit6);
        visitList.add(visit7);
        visitList.add(visit8);
        visitList.add(visit9);
        visitList.add(visit10);
        visitList.add(visit11);
        visitList.add(visit12);
        visitList.add(visit13);
        visitList.add(visit14);
        visitList.add(visit15);
        visitList.add(visit16);
        visitList.add(visit17);
        visitList.add(visit18);
        visitList.add(visit19);

        return visitList;
    }
}
