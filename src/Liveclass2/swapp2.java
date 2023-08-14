package Liveclass2;

public class swapp2 {
    public static void main(String[] args) {


    int numbers[]={1,2,3,4,5};

    swap(numbers,0,3);
        for(int num:numbers){
        System.out.print(num+" ");
    }
}




    public static void swap(int a[],int num0,int num1){
        int temp=a[num0];
        a[num0]=a[num1];
        a[num1]=temp;
    }

}
