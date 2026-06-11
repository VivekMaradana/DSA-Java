public class FindPeakElement {
     public int findPeakElement(int[] nums) {
        // Leet number problem number: 162
        int left = 0, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] < nums[mid + 1])
                left = mid + 1;
            else
                right = mid;
        }
        return left;
    }
}
