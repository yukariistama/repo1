package method_test;

public class forMax2 {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9};
        int number=max(a);
        System.out.println(number);
    }

    public static int max(int[]a){
        int max=a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        return max;
    }
}
