public class ProfitCalculator {
    public static void main(String[] args) {
        // Given cost price and selling price
        int costPrice = 129;
        int sellingPrice = 191;

        // Calculate profit
        int profit = sellingPrice - costPrice;

        // Calculate profit percentage
        double profitPercentage = (profit / (double) costPrice) * 100;

        // Display result using a single print statement
        System.out.println(
            "The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice + "\n" +
            "The Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage + "%"
        );
    }
}
