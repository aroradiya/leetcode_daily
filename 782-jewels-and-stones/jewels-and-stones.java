class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int s2=stones.length();
        int count=0;
        for(int i=0;i<s2;i++){
            if(jewels.indexOf(stones.charAt(i))!=-1){
                count++;
            }
        }
        return count;
    }
}