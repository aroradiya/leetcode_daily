class Solution {
public:
    int findNonMinOrMax(vector<int>& nums) {
        int n=nums.size();
        int mini=INT_MAX;
        int maxi=INT_MIN;
        for(int i=0;i<n;i++){
            if(nums[i]>maxi){
                maxi=nums[i];
            }
            if(nums[i]<mini){
                mini=nums[i];
            }
        }
        bool is=false;
        int ans;
        for(int i=0;i<n;i++){
            if(nums[i]!=maxi && nums[i]!=mini){
                is=true;
                ans=nums[i];

            }
        }
        if(is){
            return ans;
        }
        else{
            return -1;
        }
    }

};