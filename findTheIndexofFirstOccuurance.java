class Solution {
    // Leett code problem no: 28
    public int strStr(String haystack, String needle) {
        boolean a=haystack.contains(needle);
        if(a){
             int b=haystack.indexOf(needle);
             return b;
        }
        return -1;
    }
}