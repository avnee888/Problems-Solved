class Solution {

    public String smallestPalindrome(String s) {

        int n = s.length();

        String left = s.substring(0, n / 2);

        char[] arr = left.toCharArray();
        Arrays.sort(arr);

        String firstHalf = new String(arr);
        String secondHalf = new StringBuilder(firstHalf).reverse().toString();

        if (n % 2 == 0) {
            return firstHalf + secondHalf;
        }

        return firstHalf + s.charAt(n / 2) + secondHalf;
    }
}