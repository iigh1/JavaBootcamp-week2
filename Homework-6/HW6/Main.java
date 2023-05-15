import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//  Call Question 1
        printHelloWorld();

//  Call Question 2.............
        try{
        Scanner s =new Scanner(System.in);
        System.out.println("please enter first word");
        String str1 =s.next();
        System.out.println("please enter secod word");
        String str2 =s.next();
        System.out.println(concat(str1,str2)); }
        catch (InputMismatchException e1) {
            System.out.println("please enter valid word");
        }
//  Call 3...............

        try{
        Scanner s = new Scanner(System.in);
        System.out.println("pls enter first num");
        int num1 = s.nextInt();
        System.out.println("pls enter second num");
        int num2 = s.nextInt();
        System.out.println("pls enter third num");
        int num3 = s.nextInt();
        int graetest = CompareNumber(num1, num2, num3);
        System.out.println("The greatest number is: " + graetest);
        } catch (Exception e2) {
            System.out.println("please enter correct number");
        }

//  Call 4..........................


        try{
        Scanner s = new Scanner(System.in);
        System.out.println("pls enter first num");
        int num1 = s.nextInt();
        System.out.println("pls enter second num");
        int num2 = s.nextInt();
        System.out.println("pls enter third num");
        int num3 = s.nextInt();
            int[] result = calculate(num1,num2, num3);
            System.out.println("Sum is: " + result[0]);
            System.out.println("Average is: " + result[1]);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }


//        Call 5.....................

        try{
        Scanner s = new Scanner(System.in);
        System.out.println("Enter operation: ");
        String operation = s.next();
        int n1=10;
        int n2=20;
        int result;
        result = calculator(n1,n2,operation);
        System.out.println(n1+" "+operation+" "+n2 +" = "+result);
        } catch (InputMismatchException e){
            System.out.println(e.getMessage());
        }


//                Call 6..............

        try{
            Scanner s = new Scanner(System.in);
            System.out.println("enter array");
            int[] arr = new int[]{s.nextInt()};

            System.out.print("The unique numbers in the array are: ");
            printUniqueNumbers(arr);

        }catch (InputMismatchException e1){
            System.out.println("please enter corrct input");
        }


//        Call 7.................


            Scanner s = new Scanner(System.in);
            System.out.println("please enter word");
            String str = s.next();

            int count = countVowels(str);
            System.out.println("The number of vowels in " + str + " is: " + count);


////        Call 8.............
        try {

            Scanner s = new Scanner(System.in);
            System.out.println("pls enter sentece");
            String str = s.next();
            printWords(str);
        }catch (InputMismatchException e){
            System.out.println("pls enter correct input");
        }catch (Exception e2){
            System.out.println(e2.getMessage());
        }


    }

    public static void printHelloWorld() {
        System.out.println("Hello World");
    }

    public static String concat(String a, String b) {
        return a + b;

    }

    public static int CompareNumber(int num1, int num2, int num3){

        int graetest = num1;
        if (num2 > graetest) {
            graetest = num2;
        }
        if (num3 > graetest) {
            graetest = num3;
        }
        return graetest;
    }

    public static int[] calculate(int n1, int n2, int n3) throws Exception {
        int sum = n1 + n2 + n3;
        int avg = sum / 3;
        int[] result = {sum, avg};

        return result;

    }

    public static int calculator(int n1, int n2, String op) {
        int result = 0;
        switch (op) {
            case "+":
                result = n1 + n2;
                break;
            case "-":
                result = n1 - n2;
                break;
            case "*":
                result = n1 * n2;
                break;
            case "/":
                result = n1 / n2;
                break;
            default:
                System.out.println("Invalid operation!");
                break;
        }
        return result;
    }

    public static void printUniqueNumbers(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(arr[i] + " ");
            }
        }
    }


    public static int countVowels(String str) {


            int vowelCount = 0;
            for (int i = 0; i < str.length(); i++) {
                char c = str.charAt(i);
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowelCount++;
                } else {
                    System.out.println("not correct");
                }
            } return vowelCount;
    }



    public static void printWords (String str){
        String [] words = str.split(" ");
        for (String word:words) {
            System.out.println(word);
        }

    }
    }
