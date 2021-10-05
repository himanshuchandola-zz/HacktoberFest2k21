//link to the problem-https://leetcode.com/problems/two-sum/


class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        unordered_map<int,int>mpp;
        vector<int>res;
        for(int i=0;i<nums.size();i++)
        {
            if(mpp.find(target-nums[i])!=mpp.end())
            {
                res.push_back(mpp[target-nums[i]]);
                res.push_back(i);
                
            }
            else
      mpp[nums[i]]=i;
        }
        return res;
    }
};
