class Solution {
    public String restoreString(String s, int[] indices) {
        int n=indices.length;
        char ans[]=new char[n];
        for(int i=0;i<n;i++){
            ans[indices[i]]=s.charAt(i);    //i moves to indices[i] 
        }
        return new String(ans);
        

        
    }
}

// a b c 
// 0 1 2 
// abc 

// c o d e l e e t
// 4 5 6 7 0 2 1 3
