public class NumberofSegmentsinaString {
    // leet code problem number:434
    public int countSegments(String s) {
        String []words=s.split(" ");
        int count=0;
        for(String word:words){
            if(word.length()!=0)
            count++;
        }
        return count;

    }
}

