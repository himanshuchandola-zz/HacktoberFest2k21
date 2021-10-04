//https://leetcode.com/problems/kth-largest-element-in-a-stream/
class KthLargest {
public:
       priority_queue<int,vector<int>,greater<int>>minh;
    int k1;
    KthLargest(int k, vector<int>& nums) {
        k1=k;
        for(int i=0;i<nums.size();i++)
            minh.push(nums[i]);
        
        while(minh.size()>k)
            minh.pop();
     }
    
    int add(int val) {
        minh.push(val);
        
        if(minh.size()>k1)
            minh.pop();
        return minh.top();
        
    }
};
