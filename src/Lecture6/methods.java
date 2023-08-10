package Lecture6;

public class methods {
    public static void main(String[] args) {

        //greet();

        for(String arg:args){
            System.out.println(arg);
        }


        int avgfromfunction=average(4,6);
        System.out.println("Hello");
        System.out.println(avgfromfunction);
        average(2,7);



    }
    /*/
    static void greet(){
        System.out.println("Hello World");
    }*/


    public static int average(int a,int b){
        int avg=(a+b)/2;
        return avg;


    }




}
