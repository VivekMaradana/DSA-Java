public class rotateArray {
    // Leet code problem number:189
    public void rotate(int[] nums, int k) {
        int[] a=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            int newIndex=(i+k)%nums.length;
            a[newIndex]=nums[i];
        }
        int count=0;
        for(int b:a){
            nums[count]=b;
            count++;
        }
    }
}

