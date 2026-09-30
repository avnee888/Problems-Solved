class Solution {
    public String makeSmallestPalindrome(String s) {
       int i=0;
       int j=s.length()-1;
       StringBuilder sb=new StringBuilder(s);

       while(i<j){
        if(s.charAt(i)==s.charAt(j)){
            sb.setCharAt(i,s.charAt(i));
            sb.setCharAt(j,s.charAt(j));
        }
        else if(s.charAt(i)-'0'>s.charAt(j)-'0'){
            sb.setCharAt(i,s.charAt(j));
            sb.setCharAt(j,s.charAt(j));
        }
        else{
            sb.setCharAt(i,s.charAt(i));
            sb.setCharAt(j,s.charAt(i));
        }
        i++;
        j--;
       }
       return sb.toString();
    }
}