public class PowerofFour {
    // leet code problem number: 342
    public boolean isPowerOfFour(int n) {
        if(n<=0){
            return false;
        }
        while(n%4==0){
            n=n/4;
        }
        return n==1;
    }
}

