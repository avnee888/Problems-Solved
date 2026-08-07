class Solution {
    public int lengthOfLongestSubstring(String s) {
     int i=0,j=1;
     if(s.length()==1 || s.length()==0)return s.length();
     HashSet<Character> set=new HashSet<>();
     set.add(s.charAt(0));
     int count=1;
     while(i<=j && j<s.length()){
        if(!set.contains(s.charAt(j))){
            
            set.add(s.charAt(j));
            j++;
            
        }
         else{
            set.remove(s.charAt(i));
            i++;
            
         }
         count=Math.max(count,set.size());
     }
      return count;
    }
}