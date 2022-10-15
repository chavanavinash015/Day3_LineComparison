package com.Bridgelabz;

public class LineComparison {

    static void length(int x1 , int y1, int x2, int y2){


        double Line = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println(Line);
    }

    static void equalOrNotCheck(double lengthline1, double lengthline2){

        int d1= (int) (lengthline1);
        int d2= (int) (lengthline2);
        if (d1 == d2)
            System.out.println("Line 1 and Line 2 have equal Length.");
        else
            System.out.println("Line 1 and Line 2 have do not have equal length.");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to the Line And Comparison Programs");
          length(1,1,5,5);
          equalOrNotCheck(2.5,2.5);
    }
}
