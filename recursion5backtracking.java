//  Print numbers serial using back tracking(printing numbers from the back)
public class recursion5backtracking {
    static void reverseSequel(int n,int count){
        if(count>n){
            return;
        }
        reverseSequel(n,count+1);
        System.out.println(count);
    }
    public static void main(String[] args){
        int n=10;
        int count=1;
        reverseSequel(n,count);
    }
}
