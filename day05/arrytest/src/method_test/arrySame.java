package method_test;

import java.util.Scanner;

public class arrySame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        System.out.println("请输入第一组数字：");
        for (int x = 0; x < a.length; x++) {
            int c = sc.nextInt();
            a[x] = c;
        }
        System.out.println("请输入第二组数字");
        for (int x = 0; x < b.length; x++) {
            int c = sc.nextInt();
            b[x] = c;
        }
        if(same(a,b)){
            System.out.println("您输入的两组数字相等，结果为："+same(a,b));
        }else{
            System.out.println("您输入的两组数字不相等，结果为："+same(a,b));
        }
    }

    public static boolean same(int[] a, int[] b) {
        if (a.length != b.length) {
            return false;
        }
        for (int m = 0; m < a.length; m++) {
            if (a[m] != b[m]) {
                return false;
            }
        }
        return true;
    }

}
