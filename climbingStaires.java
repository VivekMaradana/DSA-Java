class Solution {
    // leet code problelm no:70
    public int climbStairs(int n) {
        if(n==0||n==1){
            return 1;
        }
        int prevStep=1;int finalStep=1;
        for(int i=2;i<=n;i++){
            int temp=finalStep;
            finalStep+=prevStep;
            prevStep=temp;
        }
        return finalStep;
    }
}