class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int max=0;
        for(int n:set){
            if(!set.contains(n-1)){
                int curr=n;
                int len=1;
            
             while(set.contains(curr+1)){
                len++;
                curr++;
             }
             max=Math.max(max,len);}
        }
        return max;
    }
}