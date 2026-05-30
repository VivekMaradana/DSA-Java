class Solution {
    // leet code problem no:231
    public boolean isPowerOfTwo(int n) {
        int count=0;
        for(int i=0;i<=31;i++){
            double a=Math.pow(2,i);
            if(a==n){
                count++;
            }
        }
        if(count==1){
            return true;
        }
        else{
            return false;
        }
    }
}
