// Print sum of N numbers using parameterized;
public class recursion6parameter {
    static void sum(int n, int sum){
        if(n<1){
            System.out.println(sum);
            return;
        }
        sum(n-1,sum+n);
    }
    public static void main(String[] args){
        int sum=0;
        int n=10;
        sum(n,sum);
    }
}
