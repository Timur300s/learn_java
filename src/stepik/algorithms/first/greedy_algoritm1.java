package stepik.algorithms.first;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Collections;
public class greedy_algoritm1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int elementsCount = scanner.nextInt();
        double knapsackWeight= scanner.nextInt();
        double resultMaxCostInKnapsack = 0;
        double[] weights=new double [elementsCount];
        double[] costs=new double[elementsCount];
        Integer[] indexes= new Integer[elementsCount];
        for (int i=0; i<elementsCount;i++){
            costs[i]= scanner.nextFloat();
            weights[i] = scanner.nextFloat();
            indexes[i]=i;
        }
        Arrays.sort(indexes,new Comparator<Integer>() {
            @Override
            public int compare(Integer index1, Integer index2) {
                return Double.compare(costs[index1] / weights[index1], costs[index2] / weights[index2]);
            }
        }.reversed());
        for (int i=0; i<elementsCount;i++){
            Integer sortedIndex = indexes[i];
            if (weights[sortedIndex]<=knapsackWeight){
                knapsackWeight=knapsackWeight-weights[sortedIndex];
                resultMaxCostInKnapsack=resultMaxCostInKnapsack+costs[sortedIndex];
            }
            else { double partialCost = (knapsackWeight / weights[sortedIndex]) * costs[sortedIndex];
                resultMaxCostInKnapsack = resultMaxCostInKnapsack + partialCost;
                knapsackWeight = 0;
            }
            if (knapsackWeight==0)
                break;
        }
        System.out.println(resultMaxCostInKnapsack);
    }
}
