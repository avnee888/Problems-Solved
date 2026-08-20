class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer>res=new ArrayList<>();
        int[] freqp=new int[26];
       int[] cw=new int[26];
       if(s.length()<p.length()){
        return res;
       }
       for(int i=0;i<p.length();i++){
        freqp[p.charAt(i)-'a']++;}
       
       for(int j=0;j<p.length();j++){
         cw[s.charAt(j)-'a']++;}
       
       if(Arrays.equals(freqp,cw)){
        res.add(0);
       }
       for(int k=p.length();k<s.length();k++){
        cw[s.charAt(k)-'a']++;
        cw[s.charAt(k-p.length())-'a']--;
        if(Arrays.equals(cw,freqp)){
            res.add(k-p.length()+1);
        }
       }
       return res;
    }

}