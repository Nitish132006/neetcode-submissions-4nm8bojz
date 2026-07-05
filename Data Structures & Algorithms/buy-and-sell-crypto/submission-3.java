class Solution {
    public int maxProfit(int[] prices) {
        int profit=0;
        int ans=0;
        int min=0;
    for(int i=0;i<prices.length;i++){
        int b=prices[i];
        for(int j=i+1;j<prices.length;j++){
                profit=prices[j]-b;
                ans=Math.max(ans,profit);

            }
        }
    return ans;
    }
    }
    

