public class ReverseString {
     public void reverseString(char[] s) {
        // Leet code problem number: 344
        int count=0;
        char[] a=new char[s.length];
        for(int i=s.length-1;i>=0;i--){
            a[count]=s[i];
            count++;
        }
        int max=0;
        for(char b:a){
            s[max]=b;
            max++;
        }
    }
}
