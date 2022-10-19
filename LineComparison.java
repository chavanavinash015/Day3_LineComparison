package com.Bridgelabz;

public class LineComparison {

    static double length(int x1 , int y1, int x2, int y2){


        double line = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        return line;
    }

    static double equalOrNotCheck(double lengthline1, double lengthline2){

        int d1= (int) (lengthline1);
        int d2= (int) (lengthline2);
        if (d1 == d2)
            System.out.println("Line 1 and Line 2 have equal Length.");
        else
            System.out.println("Line 1 and Line 2 have do not have equal length.");
        return lengthline1;
    }

     static double compareTo(double lengthLine1, double lengthLine2){

        Double d3 = lengthLine1;
        Double d4 = lengthLine2;
        System.out.println("print the length ="+d3);
        System.out.println("print the length ="+d4);

        int value = d3.compareTo(d4);
        if(value > 0){
            System.out.println("the length are greater");
        } else if (value < 0) {
            System.out.println("the length are lesser");
        }else {
            System.out.println(" the length are equals");
        }

         return lengthLine1;
     }


    public static void main(String[] args) {
        System.out.println("Welcome to the Line And Comparison Programs");
          double length1 = length(1,1,5,5);
          double length2 =  length(1,2,5,4);
          equalOrNotCheck(length1, length2);
          compareTo(length1,length2);

          Lines ref = new Lines();

          ref.setLength3(length1);
          ref.setLength4(length2);

        System.out.println(ref.getLength3());
        System.out.println(ref.getLength4());

        ref.setLength3(equalOrNotCheck(length1,length2));
     //   System.out.println();
        ref.setLength3(compareTo(length1,length2));
     //   System.out.println();

    }

}
