package stepik.algorithms.first;

import java.util.Scanner;

public class lessonНОД {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        boolean i = true;
        while (i=true) {
            if (a==0) {
                System.out.println(b);
                break;
            }
            if (b==0) {
                System.out.println(a);
                break;
            }
            if (a>=b)
                a=a%b;
            else
                b=b%a;

        }

    }

}
