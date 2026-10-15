class Solution {
    public int addMinimum(String word) {
        int ans=0;
        int i=0;
        while(i<word.length() ){
            char expected='a';
            while(expected<='c'){
                if(i<word.length() && word.charAt(i)==expected){
                    i++;
                }else{
                    ans++;
                }
                expected++;
            }
        }
        return ans;
    }
}