package method_test;

import java.util.Random;

public class randomOne {
    public static void main(String[] args) {
        //(1)定义一个长度为10的int类型数组，元素值使用随机数生成（范围为50-80）
        //(2)打印该数组中满足个位和十位不包含7的元素。
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            Random n = new Random();
            int b = n.nextInt(30) + 50;
            a[i] = b;
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("-----------------");
        for (int m = 0; m < a.length; m++) {
            if (a[m] % 10 % 7 != 0 && a[m] / 10 % 7 != 0) {
                System.out.print(a[m]+" ");
            }
        }
    }
}
