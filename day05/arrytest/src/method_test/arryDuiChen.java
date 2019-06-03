package method_test;

import java.util.Scanner;

public class arryDuiChen {
   // (1)定义方法public static boolean isSym(int[] arr)，判断数组中的元素值是否对称,对称返回true，不对称返回false；
   // (2)在main方法中，定义一个数组，并调用方法。
   // (3)打印结果：[1,2,3,4,3,2,1]是否对称：true
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int [] a = new int[5];
       for(int b=0;b<a.length;b++){
           int c = sc.nextInt();
           a[b]=c;
       }
       arrline(a);
       exchange(a);
       for(int n=0;n<a.length;n++){
           System.out.println(a[n]);
       }
       arrline(a);
       boolean y = dui(a);
       System.out.println(y);

   }
   public static void arrline(int[]a){
       System.out.print("[");
       for(int x=0;x<a.length;x++){
           if(x==a.length-1){
               System.out.println(a[x]+"]");
           }else{
               System.out.print(a[x]+",");
           }
       }
   }
    public static void exchange(int[]a){
       for(int start=0,end=a.length-1;start<end;start++,end--){
           int huan = a[start];
           a[start]=a[end];
           a[end]=huan;
       }
    }
    public static boolean dui(int []a){
       int count =0;
       for(int start =0,end=a.length-1;start<end;start++,end--){
           if(a[start]!=a[end]){
               count++;
           }
       }
       if(count==0){
           return true;
       }else{
           return false;
       }
    }
}
