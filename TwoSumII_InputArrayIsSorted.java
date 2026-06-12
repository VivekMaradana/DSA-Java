public class TwoSumII_InputArrayIsSorted {
    public int[] twoSum(int[] numbers, int target) {
        // Leet code problem number: 167
        // int[] b=new int [2];
        // for(int i=0;i<numbers.length;i++){
        //     for(int j=0;j<numbers.length&& j!=i;j++){
        //         int a=numbers[i]+numbers[j];
        //             if(a==target){
        //                 b[0]=j+1;
        //                 b[1]=i+1;
        //             }
        //     }
        // }
        // return b;
        int start=0;
        int end=numbers.length-1;
        while(start<end){
            int sum=numbers[start]+numbers[end];
            if(sum==target){
                return new int[]{start+1,end+1};
            }
            else if(sum<target){
                start++;
            }
            else{
                end--;
            }
        }
        return new int[]{-1,-1};
    }
}
