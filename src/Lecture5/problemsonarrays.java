package Lecture5;


public class problemsonarrays {
    public static int x=5;
    public static void main(String[] args) {

       /* int nums[]={2,5,6,84,234};
        int min=nums[0];
        for(int num:nums){
            if(min>num){
                min=num;
;            }
        }
        System.out.println("Minimum Number is: "+min);

        int marks[][]= {
                {12,98,24},
                {13,45,65},
                {16,76,43}
        };
        System.out.println(marks[0][1]);

        int[] arr1 = {1, 2, 3};
        int[] arr2 ={1, 2, 3};
        System.out.println(arr1 == arr2);*/




        /*marks[0][0]=12;
        marks[0][1]=28;
        marks[0][2]=23;

        marks[1][0]=12;
        marks[1][1]=26;
        marks[1][2]=12;





        int [][] matrix = new int[3][3];
        int value = 1;
        for (int i = 0; i<matrix.length; i++) {
            for (int j = 0; j<matrix[i].length; j++){
                matrix[i][j] = value;
                value++;
            }}
        int sum = 0;
        for (int [] row : matrix) {
            for (int num : row) {
                sum += num;

            }}
        System.out.println(sum);*/




        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3;
        boolean found = false;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                break;
            }}
            System.out.println(found);

        }



}
