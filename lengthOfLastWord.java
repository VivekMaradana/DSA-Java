
import java.util.*;

public class lengthOfLastWord {
// Leet code problem number 58
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        System.out.print("Enter a sentence: ");
        String s = sc.nextLine();             

        String[] a = s.split(" ");            
        int b = a[a.length - 1].length();    
        System.out.println("Length of last word: " + b);

        sc.close(); 
    }
}
