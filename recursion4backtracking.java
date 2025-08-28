// Print numbers from front to back using back tracking
public class recursion4backtracking {
    static void serial(int n, int count){
        if(count==0){
            return;
        }
        serial(n,count-1);
        System.out.println(count);
    }
    public static void main(String[] args){
        int n=10;
        int count=n;
        serial(n,count);
    }
}
