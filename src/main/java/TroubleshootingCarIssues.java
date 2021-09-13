/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Liam Carroll
 */

import java.util.Scanner;

public class TroubleshootingCarIssues {
    public static void main(String[] args) {
        System.out.println("Is the system silent when you turn the key? (y/n)");
        Scanner input = new Scanner(System.in);
        String yn = input.nextLine();
        if (yn.equals("y")) {
            System.out.println("Are the battery terminals corroded? (y/n)");
            input = new Scanner(System.in);
            yn = input.nextLine();
            if (yn.equals("y")) {
                System.out.println("Clean terminals and try starting again.");
            } else {
                System.out.println("Replace cables and try again.");
            }
        } else {
            System.out.println("Does the car make a slicking noise? (y/n)");
            input = new Scanner(System.in);
            yn = input.nextLine();
            if (yn.equals("y")) {
                System.out.println("Replace the battery.");
            } else {
                System.out.println("Does the car crank up but fail to start? (y/n)");
                input = new Scanner(System.in);
                yn = input.nextLine();
                if (yn.equals("y")) {
                    System.out.println("Check spark plug connections.");
                } else {
                    System.out.println("Does the engine start and then die? (y/n)");
                    input = new Scanner(System.in);
                    yn = input.nextLine();
                    if (yn.equals("y")) {
                        System.out.println("Does the car have fuel injection? (y/n)");
                        input = new Scanner(System.in);
                        yn = input.nextLine();
                        if (yn.equals("y")) {
                            System.out.println("Get it in for service.");
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing.");
                        }
                        System.exit(0);
                    } else {
                        System.out.println("This should not be possible.");
                    }
                }
            }
        } System.exit(0);
    }
}
