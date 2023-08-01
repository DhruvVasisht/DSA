package Lecture3;

public class ifelse {
    public static void main(String[] args) {
/*
        /int age=19;
        if(age>=18){
            System.out.println("Good Morning");
            System.out.println("You Can Vote");
        }
        else{
            System.out.println("You Cannot Vote");
        }*/

        /*int day=3;
        if(day==1){
            System.out.println("Got to Home");
        }
        else if(day==2) {
            System.out.println("Got to Village");
        }

        else if (day==3) {
            System.out.println("Got To Office");

        } else{
            System.out.println("Got To Party");
        }

        System.out.println("When Somewhere Today");

        int a=4;
        int b=9;
        int c=8;

        if(a>b){
            System.out.println("A is Bigger than B");
            if(a>c){
                System.out.println("A is Bigger Than C");
                System.out.println("A Is Largest: "+a);
            }
            else{
                System.out.println("C Is Largest: "+c);
            }
        }
        else{
            System.out.println("B Is Bigger Than A");
            if(b>c){
                System.out.println("B Is Largest "+b);
            }
            else{
                System.out.println("C Is Largest: "+c);
            }

        }*/

        int a=12;
        int b=23;
        int c=33;
        int max=0;
        max= a>b?a>c?a:c:b>c?b:c;
        System.out.println("Maximum "+max);




    }
}
