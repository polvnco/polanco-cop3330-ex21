/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Christopher Polanco
 */
package Assignment1.example;


import java.util.Scanner;

public class ex21
{
    public static void main( String[] args )
    {
        System.out.print("Please enter the number of the month: ");
        Scanner scan = new Scanner(System.in);
        while (!scan.hasNextInt()){
            System.out.print("Please enter a number!\nPlease enter the number of the month: ");
            scan.next();
        }
        int month = scan.nextInt();
            if ((month > 12) || (month < 1)) {
                System.out.print("You did not enter a number from 1 to 12.");
                return;
            }

                System.out.print("The name of the month is ");
                switch (month) {
                    case 1:
                        System.out.print("January.");
                        break;
                    case 2:
                        System.out.print("February.");
                        break;
                    case 3:
                        System.out.print("March.");
                        break;
                    case 4:
                        System.out.print("April.");
                        break;
                    case 5:
                        System.out.print("May.");
                        break;
                    case 6:
                        System.out.print("June.");
                        break;
                    case 7:
                        System.out.print("July.");
                        break;
                    case 8:
                        System.out.print("August.");
                    case 9:
                        System.out.print("September.");
                    case 10:
                        System.out.print("October.");
                    case 11:
                        System.out.print("November.");
                    case 12:
                        System.out.print("December.");
                }
            }

    }

