package DSA.LinkedList;

import java.util.Scanner;

public class FrequencyInList {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        LinkedList myLinkedList = new LinkedList();
        while (true) {
            System.out.println("1. Add Element ");
            System.out.println("2. Frequency ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter element : ");
                    Object element = sc.next();
                    myLinkedList.insertIntoList(element);
                    break;
                case 2:
                    myLinkedList.frequencyCount();
                    break;
            }
        }
    }

}
