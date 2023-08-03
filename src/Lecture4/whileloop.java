package Lecture4;
import java.util.Scanner;

public class whileloop {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        /*
        /boolean haslearnt=false;
        int i=0;
        while(!haslearnt){
            System.out.println("Went To School Try To Learn");
            System.out.println("have u Understood");
            haslearnt=sc.nextBoolean();
        }*/

        int i=0;
//        while(i<=5){
//            System.out.println(i);
//            i++;
//        }


        do{
            System.out.println(i);
            i++;
        } while (i<=5);




    }
}
