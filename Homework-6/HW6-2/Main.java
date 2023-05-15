import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice;
        int size=0;
        int searchElement, temp;
        boolean isFound = false;

        try {
            System.out.print("Enter the size of array: ");
            size = input.nextInt();
        }catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }

        int[] arr = new int[size];

        do {
            System.out.println("\nMENU");
            System.out.println("=====");
            System.out.println("1. Accept elements of an array");
            System.out.println("2. Display elements of an array");
            System.out.println("3. Search the element within array");
            System.out.println("4. Sort the array");
            System.out.println("5. Stop");


                System.out.print("Enter your choice: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        // Accept elements of array
                        System.out.println("\nEnter the elements of the array:");

                        for (int i = 0; i < size; i++) {
                            try {
                                arr[i] = input.nextInt();
                            } catch (Exception e) {
                                System.out.println("pls enter valid input");
                            }
                            input.next();
                            i--;
                        }
                        break;

                    case 2:
                        // Display elements of array
                        System.out.println("\nThe elements of the array are:");
                        for (int i = 0; i < size; i++) {
                            System.out.print(arr[i] + " ");
                        }
                        System.out.println();
                        break;

                    case 3:
                        // Search the element within array

                        try {
                            System.out.print("\nEnter the element to search: ");
                            searchElement = input.nextInt();

                            for (int i = 0; i < size; i++) {
                                if (arr[i] == searchElement) {
                                    System.out.println("\nElement found at index " + i);
                                    isFound = true;
                                    break;
                                }
                            }

                            if (!isFound) {
                                System.out.println("\nElement not found in array");
                            }
                        } catch (InputMismatchException e2) {
                            System.out.println("please enter valid intger");
                        }

                        break;

                    case 4:
                        // Sort the array
                        for (int i = 0; i < size; i++) {
                            for (int j = i + 1; j < size; j++) {
                                if (arr[i] > arr[j]) {
                                    temp = arr[i];
                                    arr[i] = arr[j];
                                    arr[j] = temp;
                                }
                            }
                        }

                        System.out.println("\nArray sorted in ascending order");
                        break;

                    case 5:
                        // Exit the program
                        System.out.println("\nThank you for using the program!");
                        break;

                    default:
                        // Invalid input
                        System.out.println("\nInvalid choice. Please enter a valid choice.");
                        break;
                }

            }while (choice != 5) ;


    }
}

