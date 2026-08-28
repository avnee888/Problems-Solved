class SmallestInfiniteSet {
    PriorityQueue<Integer>minheap;
    int current;
    HashSet<Integer>set;
    public SmallestInfiniteSet() {
        minheap=new PriorityQueue<>();
         current=1;
         set=new HashSet<>();
    }
    
    public int popSmallest() {
        if(!minheap.isEmpty()){
            int res= minheap.poll();
            set.remove(res);
            return res;
        }
        int res=current;
        current++;
        return res;
    }
    
    public void addBack(int num) {
       if(num<current && !set.contains(num)){
        set.add(num);
        minheap.add(num);
        return;}
    }
}

/**
 * Your SmallestInfiniteSet object will be instantiated and called as such:
 * SmallestInfiniteSet obj = new SmallestInfiniteSet();
 * int param_1 = obj.popSmallest();
 * obj.addBack(num);
 */