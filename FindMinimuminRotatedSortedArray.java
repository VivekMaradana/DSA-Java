import java.util.Arrays;

public class FindMinimuminRotatedSortedArray {
    // Leet code problem number:153
    public int findMin(int[] nums) {
        Arrays.sort(nums);
        return nums[0];
    }
}
