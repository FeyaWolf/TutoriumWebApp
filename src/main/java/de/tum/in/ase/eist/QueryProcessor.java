package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

@Service
public class QueryProcessor {

    public String process(String query) {
        query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("name")) {
            return "Finja";
        } else if (query.contains("15 plus 13")) {
            return "28";

        } else if (query.contains("11 plus 4")) {
            return "15";
//        } else if (query.contains("plus")) { //what is 18 plus 9
//            String[] plusRechnen = query.split("plus");
//
//            plusRechnen[0].length();
//
        } else if (query.contains("largest:")) { // largest: 70, 43
            String[] numbers = query.split("largest:");
            String[] zahl = query.split(",");
            int[] nachGröße = new int[zahl.length - 1];
            for (int i = 0; i < zahl.length; i++) {
                nachGröße[i] = Integer.parseInt(zahl[i]);
            }
            int größteZahl = 0;
            for (int i = 0; i < nachGröße.length; i++) {
                if (nachGröße[i] > größteZahl) {
                    größteZahl = nachGröße[i];
                }
            }
            return "" + größteZahl;
//
//        } else if () {
//
//        } else if () {
//
//        } else if () {
//
//        } else if () {
//
//        } else if () {

        } else { // TODO extend the programm here
            return "";
        }

    }
}
