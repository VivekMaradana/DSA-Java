public class PowerofThree {
    // leet code problem number: 326
    public boolean isPowerOfThree(int n) {
        for(int i=0;i<=31;i++){
            double a=Math.pow(3,i);
            if(a==n){
                return true;
            }
        }
        return false;
    }
}