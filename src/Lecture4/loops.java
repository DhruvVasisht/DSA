package Lecture4;

import java.util.Scanner;

public class loops {
    public static void main(String[] args) {
        //for(int i=0;i<=5;i++) {
        System.out.println("Hello");
        //System.out.println(i);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();
      /* System.out.println("Table Of Number Is: ");
        for(int i=0;i<=10;i++){
            System.out.println(i+"*"+n+"="+i*n);


        int sum=0;
        for(int i=0;i<=n;i++) {
            if (i % 2 == 0) {
                sum = sum + i;
            }
        }
        System.out.println("Sum is: "+sum);

        for (int i = 1; i <= 3; i++) {
            for (int j = 3; j >= 1; j--) {
                System.out.print(i + " " + j + " ");
            }
        }*/

        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
    }}}}