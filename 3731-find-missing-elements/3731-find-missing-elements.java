class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int max=nums[0];
        int min=nums[0];
        HashSet<Integer>set=new HashSet<>();
        for(int x:nums){
            max=Math.max(x,max);
            min=Math.min(x,min);
            set.add(x);
        }
        ArrayList<Integer>ls=new ArrayList<>();
        for(int i=min+1;i<max;i++){
            if(!set.contains(i)){
                ls.add(i);
            }
        }
        return ls;
    }
}