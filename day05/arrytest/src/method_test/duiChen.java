package method_test;

public class duiChen {
    public static void main(String[] args) {
        dui();
    }

    public static void dui() {
        int c = 0;
        for (int i = 9999; i >= 1000; i--) {
            int qian = i / 1000;
            int bai = i / 100 % 10;
            int shi = i % 100 / 10;
            int ge = i % 100 % 10;
            if ((ge + bai) == (shi + qian)) {
                System.out.print(i + " ");
                c++;
                if (c % 5 == 0) {
                    System.out.println();
                }
            }

        }

    }
}
