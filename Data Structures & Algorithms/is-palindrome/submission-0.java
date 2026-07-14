class Solution {
    public boolean isPalindrome(String s) {
        String original =s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        String target=new StringBuilder(original).reverse().toString();
        return original.equals(target);
    }
}
