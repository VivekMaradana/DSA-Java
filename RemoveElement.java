public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        // leet code problem number:27
        int count=0;
        int max=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
            }
        }
        int[] a=new int[count];
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                a[max]=nums[i];
                max++;
            }
        }
        for(int b:a){
                nums[c]=b;
                c++;
        }
        return max;
    }
}

