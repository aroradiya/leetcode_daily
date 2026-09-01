class Solution {
    public int findLucky(int[] arr) {
        int n=arr.length;
        //ArrayList<Integer> list=new ArrayList<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int max = -1;

        for(int i=0; i<n; i++){
            if(arr[i] == map.get(arr[i])){
            max = Math.max(max, arr[i]);
            }
        }
        return max;


        // for(int i=0;i<n;i++){
        //     if(arr[i]==map.get(arr[i])){
        //         list.add(arr[i]);
        //     }
        // }
        // int max=-1;
        // for(int i=0;i<list.size();i++){
        //     if(list.get(i)>max){
        //         max=list.get(i);
        //     }
        // }
        // return max;
    }
}