class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = 0;
        int fullBottles = numBottles, emptyBottles = 0;
        
        while (fullBottles > 0) {
            System.out.print(fullBottles + " ");
            ans += fullBottles;
            emptyBottles += fullBottles;
            fullBottles = emptyBottles / numExchange;
            emptyBottles = emptyBottles % numExchange;
        }
        return ans;
    }
}