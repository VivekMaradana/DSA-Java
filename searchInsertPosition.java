class Solution {
    public int searchInsert(int[] nums, int target) {
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(target==nums[i]){
                a=i;
            }
            else{
                while(target>nums[i]){
                    a=i+1;
                    break;
                }
            }
        }
        return a;
    }
}