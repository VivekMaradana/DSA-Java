import java.util.Arrays;

public class MaximumGap {
    public int maximumGap(int[] nums) {
        // Leet code problem number:164
        int max=0;
        if(nums.length<2){
            return 0;
        }
        // for(int i=0;i<nums.length;i++){
        //     for(int j=0;j<nums.length-i-1;j++){
        //         if(nums[j]>nums[j+1]){
        //              int temp=nums[j];
        //                 nums[j]=nums[j+1];
        //                 nums[j+1]=temp;
        //         }
        //     }
        // }
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++){
            int a=nums[i]-nums[i-1];
            if(max<a){
                max=a;
            }
        }
        return max;
    }
}
