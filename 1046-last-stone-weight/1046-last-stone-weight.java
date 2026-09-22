class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<stones.length;i++){
            pq.add(stones[i]);
        }
        if(pq.size()==0){
            return pq.poll();
        }
        while(pq.size()>1){
            int a=pq.poll();
            int b=pq.poll();
            if(a!=b){
              pq.add(a-b);
            }
        }
        if(pq.size()==1){
            return pq.poll();
        }
        return 0;
    }
}