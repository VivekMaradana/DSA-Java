public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // leet code problem no:283
        int count=0;
        int max=0;
        int[]a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                a[count]=nums[i];
                count++;
            }
        }
        for(int b:a){
            nums[max]=b;
            max++;
        }
    }
}

