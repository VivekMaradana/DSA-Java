public class SearchinRotatedSortedArrayII {
    public boolean search(int[] nums, int target) {
        // leet code problem number:81
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return true;
            }
        }
        return false;
    }
}
