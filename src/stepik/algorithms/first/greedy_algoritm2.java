package stepik.algorithms.first;

import java.util.Scanner;

public class greedy_algoritm2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i=1;
        int k = 0;
        long n = scanner.nextLong();
        int[] sum = new int[100000000];
        sum[0] = 0;
        if (n == 1) {
            System.out.println(1);
            System.out.println(1);
        } else if (n == 2) {
            System.out.println(1);
            System.out.println(2);
        } else {
            while (n>=0) {
                n = n - i;
                if (n >= i + 1) {
                    sum[i - 1] = i;
                    k++;
                } else {
                    sum[i - 1] = (int) (n+i);
                    k++;
                    break;
                }
                i++;
            }
            System.out.println(k);
            for (int j = 0; j < k; j++) {
                System.out.print(sum[j]+" ");
            }


        }
    }
}