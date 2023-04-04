package stepik.algorithms.first;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
public class greedy_algoritm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введите кол");
        int n = scanner.nextInt();
        System.out.println("введите вместимость рюкзака");
        double W= scanner.nextInt();
        double d = 0;
        double[] w=new double [n];
        double[] c=new double[n];
        Double[] p= new Double[n];
        for (int i=0; i<n;i++){
            System.out.println("введите стоимость");
            double a = scanner.nextFloat();
            c[i]=a;
            System.out.println("введите массу");
            double b = scanner.nextFloat();
            w[i]=b;
            p[i]=c[i]/w[i];
        }
        Arrays.sort(p, Collections.reverseOrder());
        for (int i=0; i<n;i++){
            // здесь нужно чтобы при сортировке массива p[] паралельно сортировались  массивы c[] и w[]
            // и потом сравнить w[i] с  W
            if (w[i]/* имееться ввиду масса самого дорого предмета за 1кг */<=W){
                W=W-w[i];
                d=d+c[i];
            }
            else {
                d=p[i]*W;
            }
            if (W==0)
                break;
        }
        System.out.println(d);
        for (double values : p) {
            System.out.print(values + ", ");
        }
    }
}
