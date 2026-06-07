import java.util.Arrays;

public class MedianofTwoSortedArrays {
    // leet code problem no: 4
     public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] a=new int[nums1.length+nums2.length];
        int count=0;
        for(int i=0;i<nums1.length;i++){
            a[count]=nums1[i];
            count++;
        }
        for(int j=0;j<nums2.length;j++){
            a[count]=nums2[j];
            count++;
        }
        Arrays.sort(a);
        int b=a.length;
        double median=0.0;
        if(b%2!=0){
            median=a[b/2];
        return median;
        }
        else{
            median=(a[b/2]+a[b/2-1]);
            return median/2;
        }
    }
}
