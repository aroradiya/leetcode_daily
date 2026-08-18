class Solution {
    public boolean rotateString(String s, String goal) {
        // if(s.length()!=goal.length()){
        //     return false;
        // }
        // String doubles=s+s;
        // if(doubles.contains(goal)){
        //     return true;
        // }
        // else{
        //     return false;
        // }

        return s.length()==goal.length() &&(s+s).contains(goal);









        // int last=s[len-1];
        // for(int i=1;i<len;i++){
        //     s[i-1]=s[i];
        // }
        // s[0]=last;
    }
}