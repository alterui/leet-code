package com.lr.leetcode.number121;

/**
 * @author liurui
 * @date 2021/2/4 6:37 下午
 */
public class App {

    public int maxProfit(int[] prices) {
        if(prices.length ==0){
            return 0;
        }
        int max = 0;
        int min = prices[0];

        for(int i = 1;i<prices.length;i++){
            if(prices[i]<min){
                min = prices[i];
            }else{
                max = max > prices[i] - min ? max : prices[i] - min;
            }
        }
        return max;
    }
}
