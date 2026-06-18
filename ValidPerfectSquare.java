public class ValidPerfectSquare {
    // Leet code problem number :367
     public boolean isPerfectSquare(int num) {
        int start=1;
        int end=num;
        int sum=0;
        while(start<=end){
            int mid=start+(end-start)/2;
                sum=mid*mid;
                if(num==sum){
                    return true;
                }
                else if(sum<num){
                    start=mid+1;
                }
                else{
                    end=mid-1;
                }
        }
        return false;
    }
}
