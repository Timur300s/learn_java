package stepik.algorithms.first;

import java.util.Scanner;

public class lesson2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] f = new int[n+1];
        f[0]=0;
        f[1]=1;
        for (int i=2;i<=n;i++){
            f[i]=(f[i-1]+ f[i-2])%10;
        }
        System.out.println(f[n]);

    }
}
