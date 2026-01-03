package datastructure.greedy;

import java.util.Arrays;

record Data(double[] weights, double[] profits) {

}

public class FractionalKnapsackProblem {
    public static void main(String[] args) {
        Data data = new Data(new double[]{10 , 6 , 2}, new double[]{40 , 30 ,6});

        double max_weight = 17;
        double max_profit = 0;
        int selected_wt = 0;
        int n = data.profits().length;
        double[] profit_weight_ratio = new double[n];

        for (int i = 0; i < n; i++) {
            profit_weight_ratio[i] = data.profits()[i] / data.weights()[i];
        }

        System.out.println("Profit/Weight Ratio: "+ Arrays.toString(profit_weight_ratio));

        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(profit_weight_ratio[i] < profit_weight_ratio[j]) {
                    double temp = profit_weight_ratio[i];
                    profit_weight_ratio[i] = profit_weight_ratio[j];
                    profit_weight_ratio[j] = temp;

                    double temp_weights = data.weights()[i];
                    data.weights()[i] = data.weights()[j];
                    data.weights()[j] = temp_weights;

                    double temp_profits = data.profits()[i];
                    data.profits()[i]= data.profits()[j];
                    data.profits()[j] = temp_profits;

                }
            }
        }

        System.out.println("Descending Order Profit/Weight Ratio: "+ Arrays.toString(profit_weight_ratio));
        System.out.println("Descending Order Weights: "+ Arrays.toString(data.weights()));
        System.out.println("Descending Order Profits: "+ Arrays.toString(data.profits()));


        for (int i = 0; i < n; i++) {
            if( selected_wt + data.weights()[i] <= max_weight) {
                selected_wt += data.weights()[i];
                max_profit += data.profits()[i];
            }else{
                double fraction_wt = (max_weight - selected_wt) / data.weights()[i];
                double fraction_val = data.profits()[i] * fraction_wt;

                selected_wt += (max_weight - selected_wt);
                max_profit += fraction_val;
            }

        }

        System.out.println("Selected Weights: "+selected_wt);
        System.out.println("Max Profit: "+ max_profit);
    }
}
