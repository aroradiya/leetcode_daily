class Solution {
public:
    int maxProduct(vector<int>& nums) {
        int n=nums.size();
        int maxi=INT_MIN;
        int smax=INT_MIN;
        for(int i=0;i<n;i++){
            if(nums[i]>maxi){
                smax = maxi;
                maxi=nums[i];
            }
            else if(nums[i]>smax){
                smax=nums[i];
            }
        }
        return (maxi-1)*(smax-1);

        
    }
};