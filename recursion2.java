// Print number from start to end 
public class recursion2 {
    static void serial(int a,int n){
        if(a>n){
            return;
        }
        System.out.println(a);
        a++;
        serial(a,n);
    }
    public static void main(String[] args){
        int a=1;
        int n=10;
        serial(a,n);
    }
}
