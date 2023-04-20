package stepik.algorithms.first;

import java.math.BigInteger;
import java.util.Scanner;

public class fibanachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if(n<=1)
            System.out.println(n);
        BigInteger a= BigInteger.valueOf(0);
        BigInteger b =BigInteger.valueOf(1);
        for(int i =2; i<=n; i++){
            BigInteger new_b = a.add(b);
            a=b;
            b=new_b;
        }
        System.out.println(b);

    }

}
