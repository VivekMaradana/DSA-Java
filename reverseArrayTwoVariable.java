public class reverseArrayTwoVariable {
    static void reverseArray(int a,int b, int[] c){
        if(a>=b){
            return;
        }
        int temp = c[a];
        c[a] = c[b];
        c[b] = temp;
        reverseArray(a+1, b-1, c);
    }
    static void printArray(int[]c){
         for (int i : c) {
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        int[] a={1,3,4,5,6};
        int b=a.length-1;
        int c=0;
        reverseArray(c,b,a);
        printArray(a);
    }
}
