

import java.util.Scanner;

public class firstBadVersion {

	public static void main(String[] args) {
		
//		Leet code problem Number : 278 
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int start=0;
		int end=n;
        int ans=0;
		while(start<=end) {
			int mid=start+(end-start)/2;
            if(isBadVersion(mid)){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
            if(!isBadVersion(mid)){
                ans=mid+1;
            }
			
		}
		System.out.println(ans);
	}

}
