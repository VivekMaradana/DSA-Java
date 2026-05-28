class Solution {
    // leet code problem no:1920
    public int[] buildArray(int[] nums) {
        int[] a=new int[nums.length];
        int count=0;
        for(int i=0;i<nums.length;i++){
            a[count]=nums[nums[i]];
                count++;
        }
        return a;
    }
}