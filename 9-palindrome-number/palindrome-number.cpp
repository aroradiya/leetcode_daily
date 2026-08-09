class Solution {
public:
    bool isPalindrome(int x) {
        string s=to_string(x);
        int len=s.length();
        int left=0;
        int right=len-1;
        while(left<right){
            if(s[left]!=s[right]){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
};