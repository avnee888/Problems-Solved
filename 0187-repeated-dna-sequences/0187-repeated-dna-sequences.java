class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
      int n=s.length();
      String ans="";
      ArrayList<String>res=new ArrayList<>();
      HashMap<String,Integer>map=new HashMap<>();
      for(int i=0;i<=n-10;i++){
        if(map.containsKey(s.substring(i,i+10))){
            ans=s.substring(i,i+10);
           
        }
        
       map.put(s.substring(i,i+10),map.getOrDefault(s.substring(i,i+10),0)+1);
        if(map.get(s.substring(i,i+10))==2){
                res.add(ans);
            }  
      }
      


      return res; 
    }
}