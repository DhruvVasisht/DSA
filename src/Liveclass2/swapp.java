package Liveclass2;

public class swapp {
    public static void main(String[] args) {
        int numbers[]={1,2,3,4,5};
        int index1=0;
        int index2=2;
        swap(numbers,index1,index2);
        for(int num:numbers){
            System.out.print(num+" ");
        }
    }




    public static void swap(int a[],int num1,int num2){
        int temp=a[num1];
        a[num1]=a[num2];
        a[num2]=temp;
    }

}
