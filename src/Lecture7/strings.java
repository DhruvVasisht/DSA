package Lecture7;

public class strings {
    public static void main(String[] args) {

      String name="Dhruv";
      String newName="Dhruv";
      String sameName= new String("Dhruv");
      String sameName2= new String("DHRUV");
    /*  if(name==newName){
          System.out.println("Both Are Same");

      }
        if(name==sameName){
            System.out.println("Both Are Same");
        }
        else{
            System.out.println("They Are Different names");
        }*/

        if(name.equals(sameName)){
            System.out.println("Both Have Same Values");
        }

        if(name.equalsIgnoreCase(sameName2)){
            System.out.println("Both Are Same name");
        }

    }
}
