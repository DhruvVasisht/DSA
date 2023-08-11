package Lecture7;

import java.util.Locale;
import java.util.Scanner;

public class stringques {
    public static void main(String[] args) {
        /*
        /System.out.println("Enter ur Fist Name :");
        Scanner sc= new Scanner(System.in);
        String firstName=sc.nextLine();
        System.out.println("Enter Your Last Name :");
        String lastName=sc.nextLine();
        System.out.println("Your Full name Is : "+firstName+" "+lastName);
*/

        String name="   dHruV123  ";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.trim());
        System.out.println("Carpet".startsWith("Car"));
        System.out.println("Carpet".endsWith("pett"));
        System.out.println("Carpet".equals("Carpet"));
        System.out.println("Carpet".charAt(4));

        int age=123;
        String stringAge=String.valueOf(age);
        System.out.println(age);
        System.out.println(stringAge);

        String sentence="I Love Java, Java Is A Good Langauge";
        String newsentence= sentence.replace("Java","C++");
        System.out.println(newsentence);
        System.out.println(sentence.contains("C++"));

        String subString=sentence.substring(2,5);

        /*String words[]=sentence.split(" ");
        for(String word: words){
            System.out.println(word);
        }*/

        String word="Java Programming";
        String[]words=word.split("a");
        System.out.println(words.length);









    }
}
