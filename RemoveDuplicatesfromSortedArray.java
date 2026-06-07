public class RemoveDuplicatesfromSortedArray {
    // leet code problem number: 26
     public int removeDuplicates(int[] nums) {
        int a=1;
            for(int i=1;i<nums.length;i++){
                if(nums[i]!=nums[a-1]){
                    nums[a]=nums[i];
                     a++;
                }
            }
            return a;
    }
}
