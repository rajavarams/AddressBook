package com.tts;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressFunction = new AddressBook();

        boolean restart = true;

        while (restart) {

            System.out.println("Please choose what you'd like to do with the address book: \n" +
                    "1: Add a new entry \n" +
                    "2: Delete a single entry \n" +
                    "3: Search for an entry \n" +
                    "4: Print the entire address book \n" +
                    "5: Delete the whole address book \n" +
                    "6: Quit the program \n");


            Integer userDecision = scanner.nextInt();

            switch (userDecision) {
                case 1:
                    addressFunction.add();
                    break;

                case 2:
                    addressFunction.deletePerson();
                    break;

                case 3:
                    addressFunction.search();
                    break;
                case 4:
                    addressFunction.print();
                    break;
                case 5:
                    addressFunction.deleteAddressBook();
                    break;

                case 6:
                    addressFunction.quit();
                    break;

                default:
                    System.out.println("Please choose a number between 1 and 6 (inclusive).");
            }
        }
    }
}