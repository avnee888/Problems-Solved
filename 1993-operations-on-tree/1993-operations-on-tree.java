class LockingTree {
    int[] parent;
    List<Integer>[] children;
    int[] locked;
    public LockingTree(int[] parent) {
        this.parent=parent;
        int n=parent.length;
        children=new ArrayList[n];
        locked=new int[n];
        for(int i=0;i<n;i++){
            children[i]=new ArrayList<>();
            locked[i]=-1;
        }
        for(int i=1;i<n;i++){
            int p=parent[i];
            children[p].add(i);
        }
    }
    
    public boolean lock(int num, int user) {
        if(locked[num]!=-1){
            return false;
        }
        locked[num]=user;
        return true;
    }
    
    public boolean unlock(int num, int user) {
        if(locked[num]==-1){
            return false;
        }
        if(locked[num]!=user){
            return false;
        }
        locked[num]=-1;
        return true;
    }
    
    public boolean upgrade(int num, int user) {
        if(locked[num]!=-1){
            return false;
        }
        int current=parent[num];
        while(current!=-1){
            if(locked[current]!=-1){
                return false;
            }
            current=parent[current];
        }
        boolean lockeddes=unlockdes(num);
        if(!lockeddes){
            return false;
        }
        locked[num]=user;
        return true;
        
    }
    private boolean unlockdes(int num){
        boolean lockeddes=false;
         for (int child : children[num]) {

            // If child is locked
            if (locked[child] != -1) {

                // Unlock child
                locked[child] = -1;

                // At least one locked descendant found
                lockeddes = true;
            }
        if(unlockdes(child)){
            lockeddes=true;
        }}
        return lockeddes;
         }
}


/**
 * Your LockingTree object will be instantiated and called as such:
 * LockingTree obj = new LockingTree(parent);
 * boolean param_1 = obj.lock(num,user);
 * boolean param_2 = obj.unlock(num,user);
 * boolean param_3 = obj.upgrade(num,user);
 */