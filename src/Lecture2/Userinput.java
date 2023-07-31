package Lecture2;
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        /*
        /System.out.println("Enter the Age");
        int age=sc.nextInt();
        System.out.println("Age is "+age);*/
        System.out.println("Enter The First Number");
        int firstNumber=sc.nextInt();
        System.out.println("Enter The Second Number");
        int secondNumber=sc.nextInt();
        int result=firstNumber+secondNumber;
        System.out.println("Result is "+result);
        sc.close();


    }
}
