class Solution {
    public int maxProfit(int[] prices) {
        int minPrice= Integer.MAX_VALUE;
        int maxPrice= 0;

        for(int i=0;i<prices.length;i++){
            int price=prices[i];
            minPrice=Math.min(minPrice,price);
            maxPrice=Math.max(maxPrice, price-minPrice);
        }
        return maxPrice;
    }
}