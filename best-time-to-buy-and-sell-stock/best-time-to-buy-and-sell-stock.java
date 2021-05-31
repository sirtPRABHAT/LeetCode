class Solution {
    //KANADE'S ALGORITH
    public int maxProfit(int[] prices) {
    int maxPro = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int i = 0; i < prices.length; i++){
            minPrice = Math.min(minPrice, prices[i]);
            maxPro = Math.max(maxPro, prices[i] - minPrice);
    }
        return maxPro;
    }
}


//MY BRUTE_FORCE SOLUTION
 // public int maxProfit(int[] prices) {
 //        int profit_max = 0;
 //        for(int i = 0; i < prices.length; i++){
 //            for(int j = i+1; j< prices.length; j++){
 //                if(j < i){
 //                    continue;
 //                }         
 //             int  profit_now = prices[j] - prices[i];
 //                if(profit_now > profit_max){
 //                    profit_max = profit_now;
 //                }             
 //            }
 //        }
 //        return profit_max;
 //    }