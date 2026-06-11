import java.util.Arrays;

public class FindMinimuminRotatedSortedArrayII {
    // Leet code problem number: 154
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}

