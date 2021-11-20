package com.gtrxone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

//        int min = 0, max = 0;
//        boolean first = true;

        while (true) {
            System.out.println("Enter number");
            boolean hasNextInt = scanner.hasNextInt();

            if (hasNextInt){
                int number = scanner.nextInt();

//                if (first){
//                    min = number;
//                    max =number;
//                    first =false;
//                }

                if (number < min ){
                    min =number;
                }else if (number > max){
                    max = number;
                }
            }else {
                break;
            }
        }
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
        scanner.close();
    }
}
