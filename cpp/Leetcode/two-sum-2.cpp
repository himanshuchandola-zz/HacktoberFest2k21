//link to the problem-https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/


class Solution {
public:
    vector<int> twoSum(vector<int>& numbers, int target) {
               unordered_map<int,int>mpp;
        vector<int>res;
        for(int i=0;i<numbers.size();i++)
        {
            if(mpp.find(target-numbers[i])!=mpp.end())
            {
                res.push_back(mpp[target-numbers[i]]+1);
                res.push_back(i+1);
                
            }
            else
      mpp[numbers[i]]=i;
        }
        return res;
    }
};
