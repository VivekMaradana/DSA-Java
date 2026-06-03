import java.util.Arrays;
public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        // Leet code problem number:217
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
                if(nums[i]==nums[i+1]){
                     return true;
            }      
        }
        return false;
    }
}

