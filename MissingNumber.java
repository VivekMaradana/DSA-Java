import java.util.Arrays;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        // leet code problem number:268
        Arrays.sort(nums);
        if(nums[0]==1){
            return 0;
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]+1!=nums[i]){
                return nums[i-1]+1;
            }
        }
        return nums[nums.length-1]+1;
        
    }
}
