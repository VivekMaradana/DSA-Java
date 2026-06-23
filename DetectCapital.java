class Solution {
    // Leet code problem number:520
    public boolean detectCapitalUse(String word) {
        int count=0;
        int max=0;
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                count++;
            }
            else if(Character.isLowerCase(word.charAt(i))){
                max++;
            }
        }
        if(count==word.length()|| count==0 || ((Character.isUpperCase(word.charAt(0)))&& (max==word.length()-1))){
            return true;
        }
        return false;
    }
}