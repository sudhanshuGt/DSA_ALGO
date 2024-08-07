

public class buySellStock {

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            System.out.println(maxProfit);
            if (prices[i] > prices[i - 1]) {
                maxProfit += prices[i] - prices[i - 1];
            }
        }

        return maxProfit;
    }

    public static void main(String[] args) {
           int[] prices = {100, 180, 260, 310, 40, 535, 695};
        System.out.println("Maximum Profit: " + maxProfit(prices));

    }
}
