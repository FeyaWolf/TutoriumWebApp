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
//        } else if (query.contains("15 plus 13")) {
//            return "28";
//
//        } else if (query.contains("11 plus 4")) {
//            return "15";
//        } else if (query.contains("18 plus 9")) {
//            return "27";
//        } else if (query.contains("10 plus 4")) {
//            return "14";
//        } else if (query.contains("10 plus 17")) {
//            return "27";
//        } else if (query.contains("16 plus 10")) {
//            return "26";
//        } else if (query.contains("1 plus 17")) {
//            return "18";
        } else if (query.contains("plus")) {//what is 18 plus 9 7f5d3170: what is 17 plus 14
            String rechnung = query.substring(18);
            String[] zweiZahlen = rechnung.split("plus");
            int ersteZahl = Integer.parseInt(zweiZahlen[0]);
            int zweiteZahl = Integer.parseInt(zweiZahlen[1]);
            return "" + ersteZahl + zweiteZahl;
//            String[] plusRechnen = query.split("plus");
//
//            plusRechnen[0].length();
//
//        } else if (query.contains("largest:")) { // largest: 70, 43
//            String[] numbers = query.split("largest:");
//            String[] zahl = query.split(",");
//            int[] nachGroesse = new int[zahl.length - 1];
//            for (int i = 0; i < zahl.length; i++) {
//                nachGroesse[i] = Integer.parseInt(zahl[i]);
//            }
//            int groessteZahl = 0;
//            for (int j : nachGroesse) {
//                if (j > groessteZahl) {
//                    groessteZahl = j;
//                }
//            }
//            return "" + groessteZahl;
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
