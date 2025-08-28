// Print value from back to front
public class recursion3 {
    static void reverseSquence(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        n--;
        reverseSquence(n);
    }
    public static void main(String[] args){
        int n=10;
        reverseSquence(n);
    }
}
