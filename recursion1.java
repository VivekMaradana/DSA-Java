// Print the name 5 times.
public class recursion1 {
    static void name (String a,int count){
        if(count==5){
            return;
        }
        System.out.println(a);
        count++;
        name(a,count);
    }
    public static void main(String[] args){
        String a="Vivek";
        int count=0;
       name(a,count); 
    }
}
