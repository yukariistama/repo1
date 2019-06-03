package method_test;

public class forMax {
    public static void main(String[] args) {
        int []a={1,2,3,4,5,6,7,8,9};
        getmax(a);
    }
    public static void getmax(int[]a){
        int max = a[0];
        for(int i=1;i<a.length;i++){
            if(max<a[i]){
                max=a[i];
            }
        }
        System.out.println(max);
    }
}
