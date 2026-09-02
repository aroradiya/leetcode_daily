class Solution {
    public int maxFreqSum(String s) {
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int maxVowel=0;
        int maxConsonant=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                maxVowel=Math.max(maxVowel,map.get(ch));
            }
            else{
                maxConsonant=Math.max(maxConsonant,map.get(ch));
            }
        }
        return maxVowel+maxConsonant;
    }
}