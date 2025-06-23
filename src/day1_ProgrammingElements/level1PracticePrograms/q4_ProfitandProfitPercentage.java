package day1_ProgrammingElements.level1PracticePrograms;
public class q4_ProfitandProfitPercentage {
    public static void main(String[] args) {
        double costPrice = 129, sellingPrice = 191;
        double profit = sellingPrice - costPrice;
        double profitPercent = (profit / costPrice) * 100;
        System.out.println("The Cost Price is INR " + costPrice + " and Selling Price is INR " + sellingPrice +
                "\nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercent);
    }
}
