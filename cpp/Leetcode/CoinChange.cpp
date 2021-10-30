class Solution {
public:
    int change(int amount, vector<int>& coins) {
        int dp[amount + 1];
        memset(dp, 0, sizeof(dp));
        
        dp[0] = 1;
        
        for(int i=0; i<coins.size(); i++){
            for(int j=0; j<amount + 1; j++){
                if(j-coins[i] >= 0) dp[j] += dp[j-coins[i]];
            }
        }
        
        return dp[amount];
    }
};
