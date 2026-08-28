class ATM {
     private long[] notes;
     private long[] denomination={20,50,100,200,500};

    public ATM() {
    notes = new long[5];
    }
    
    public void deposit(int[] notes) {
        for(int i=0;i<5;i++){
            this.notes[i]=this.notes[i]+notes[i];
        }
    }
    
    public int[] withdraw(int amount) {
        int[] used=new int[5];
        for(int i=4;i>=0;i--){
            long req=amount/denomination[i];
            long take=Math.min(req,notes[i]);
            used[i]=(int)take;
            amount-=(int)(take*denomination[i]);
            
        }
        if(amount!=0){
            return new int[]{-1};
        }
        for(int i=0;i<5;i++){
            notes[i]-=used[i];
        }
        return used;
    }
}

/**
 * Your ATM object will be instantiated and called as such:
 * ATM obj = new ATM();
 * obj.deposit(banknotesCount);
 * int[] param_2 = obj.withdraw(amount);
 */