class Solution {
    public int digitFrequencyScore(int n) {
        int score = 0;
        while(n>0){
            score+= n%10;
            n=n/10;
        }
        return score;
        // HashMap<Integer,Integer> map=new HashMap<>();

        // String s = String.valueOf(n);
        // int[] arr = new int[s.length()];

        // for(int i = 0; i < s.length(); i++) {
        // arr[i] = s.charAt(i) - '0';
        // }

        // for(int i=0;i<arr.length;i++){
        //     map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        // }
        // int freq;
        // int score=0;
        // for(int i=0;i<arr.length;i++){
        //     freq=map.get(arr[i]);
        //     score+=arr[i]*freq;
        // }
        // return score;
        
    }
}