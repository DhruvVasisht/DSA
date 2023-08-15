package Liveclass2;

public class BubbleSort {
    public static void main(String[] args) {
        int numer[]={9,4564,234,324,346};
        insertionsort(numer);
        for(int num:numer){
            System.out.print(num+" ");
        }}

       static void insertionsort(int a[]){
        int n=a.length;
        for (int i = 1; i < n ; i++)

    {
        int last = a[i];
        int j = i - 1;
        while (j >= 0 && a[j] > last) {
            a[j + 1] = a[j];
            j--;

        }
        a[j + 1] = last;
    }}}

        
















