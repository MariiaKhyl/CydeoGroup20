package Group1.Alonina_Olga;

public class BestBuy {
    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxProfit += prices[i] - prices[i - 1];
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        int[] arr2 = {1, 2, 3, 4, 5};
        int[] arr3 = {7, 6, 4, 3, 1};
        System.out.println( maxProfit( arr ) );
        System.out.println( maxProfit( arr2 ) );
        System.out.println( maxProfit( arr3 ) );
    }
}