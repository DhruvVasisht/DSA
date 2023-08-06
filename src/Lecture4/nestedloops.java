package Lecture4;

public class nestedloops {
    public static void main(String[] args) {

      /*  /for (int count = 0; count <=10; count++) {
            for (int i=0;i<6;i++) {
            System.out.print(i + " ");
        }
            System.out.println("Printed " + count);
        }*/

        
        
       /* for (int i = 0; i < 5 ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print(j + " ");
            }
            System.out.println( );


        }

        for (int i = 0; i <=5 ; i++) {
            int j=0;
            while(j<=i){
                if(j==3) {
                    break;
                }
                System.out.print("*"+ " ");
                j++;
            }
            System.out.println();
            
        }*/
        int i=0;
        int j=1;
       for( i=1;i<=20;i++){
           if(i==3)
               continue;
           System.out.println(i);
        }



    }
}
