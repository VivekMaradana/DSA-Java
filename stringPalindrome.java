public class stringPalindrome {
    static boolean stringCheck(String a,int n,int b){
        if(b>n/2){
            return true;
        }
        else if(a.charAt(b)!=(a.charAt(n))){
            return false;
        }
        return stringCheck(a, n-1, b+1);
    }
    
    public static void main(String[] args) {
        String a="Vivek";
        int n=a.length()-1;
        int b=0;
        boolean c=stringCheck(a,n,b);
        if(c){
        System.out.println(a+" is a palindrome");
        }
        else{
        System.out.println(a+" is not a palindrome");

        }
    }
}
