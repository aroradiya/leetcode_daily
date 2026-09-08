class Solution {
    public int maxDifference(String s) {
        int n=s.length();
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int evenfreq=Integer.MAX_VALUE; //largest value possible
        int oddfreq=0;                  //smallest value possible so zero
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(map.get(ch)%2==0 && map.get(ch)<evenfreq){
                evenfreq=map.get(ch);
            }
            else if(map.get(ch)%2!=0 && map.get(ch)>oddfreq){
                oddfreq=map.get(ch);
            }
        }
        return oddfreq-evenfreq;
    }
}

//maximum diff=max odd-min even