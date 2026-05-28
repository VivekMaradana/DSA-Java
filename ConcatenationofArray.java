public class ConcatenationofArray {
    // leet code problem no:1929
    public int[] getConcatenation(int[] nums) {
        int n=2;
        int count=0;
        int [] a= new int[nums.length*2];
        for(int i=0;i<n;i++){
            for(int j=0;j<nums.length;j++){
                    a[count]=nums[j];
                    count++;
                }
        }
        return a;
    }
}

