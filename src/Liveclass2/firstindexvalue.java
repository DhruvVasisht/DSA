package Liveclass2;

public class firstindexvalue {
    public static void main(String[] args) {
        int numbers[]={12,24,46,234};
        int value=valueoffirstindex(numbers);
        System.out.println(value);
    }

    static int valueoffirstindex(int[] a){
        return a[0];
    }

}
