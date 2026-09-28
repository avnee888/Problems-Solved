class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int num:map.keySet()){
            int freq=map.get(num);
            if(bucket[freq]==null){
                bucket[freq]= new ArrayList<>();
            }
           bucket[freq].add(num);
        }
        int [] ans=new int[k];
        int index=0;
        for(int freq=bucket.length-1;freq>=0 && index<k;freq--){
            if(bucket[freq]!=null){
                for(int num:bucket[freq]){
                    ans[index]=num;
                    index++;
                    if(index==k){
                break;
            }
                }
            }
            
        }
        return ans;
    }
}