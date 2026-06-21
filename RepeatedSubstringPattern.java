public class RepeatedSubstringPattern {
    // Leet code problem number:459
    public boolean repeatedSubstringPattern(String s) {

        int length = s.length();
        
        for (int i = 1; i <= length / 2; i++) {
            if (length % i == 0) {
                String pattern = s.substring(0, i);
                
                int matcher = length / i;
                if (pattern.repeat(matcher).equals(s)) {
                    return true; 
                }
            }
        }
        
        return false;
      
        
    }
}

