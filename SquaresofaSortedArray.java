import java.util.Arrays;

public class SquaresofaSortedArray {
    public int[] sortedSquares(int[] nums) {
        // leet code problem number: 977
        int count=0;
        for(int i=0;i<nums.length;i++){
                nums[count]=nums[i]*nums[i];
                count++;
        }
        Arrays.sort(nums);
        return nums;
    }
}
