package binarysearch;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        BinarySearch bs = new BinarySearch();
        int value;
        String choice;
        boolean done = false;
        int[] arr = {1, 3, 15, 40, 60, 80, 100, 120};
        while (done == false) {
            System.out.print("Enter a value to find in the array: ");
            value = kb.nextInt();
            kb.nextLine();
            System.out.println(bs.search(arr, value));
            System.out.print("Type STOP to end the program: ");
            choice = kb.nextLine().toUpperCase();
            if (choice.equals("STOP")){
                done = true;
            }
        }
    }
}
