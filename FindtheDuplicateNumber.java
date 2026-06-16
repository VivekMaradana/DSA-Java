import java.util.Arrays;

public class FindtheDuplicateNumber {
    // leet code problem number:287
    public int findDuplicate(int[] nums) {
        int i=1;
        Arrays.sort(nums);
        for(int j=1;j<nums.length;j++){
            if(nums[j-i]==nums[j]){
                i=nums[j];
                break;
            }
        }
        return i;
    }
}

