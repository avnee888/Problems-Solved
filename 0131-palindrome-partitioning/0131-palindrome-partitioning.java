class Solution {
    List<List<String>> ans=new ArrayList<>();
    List<String> res=new ArrayList<>();
    public List<List<String>> partition(String s) {
        recur(s,0);
        return ans;
    }
    public void recur(String s,int index){
        if(index==s.length()){
            ans.add(new ArrayList<>(res));
            return;
        }
        for(int i=index;i<s.length();i++){
            if(ispalindrome(s,index,i)){
                res.add(s.substring(index,i+1));
                recur(s,i+1);
            res.remove(res.size()-1);
            }
            
        }
    }
    public boolean ispalindrome(String s, int start, int end){
        while(start<end){
            if(s.charAt(start++)!=s.charAt(end--)){
              return false;
            }
            
        }
        return true;
    }
}