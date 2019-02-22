package threesum;

import java.util.Arrays;

public class ThreeSumTwoPointer implements ThreeSum {
    public int count(int[] nums) {
        Arrays.sort(nums);
        int N=nums.length;
        int cnt=0;
        for (int i=0;i<N-2;i++){
            int l=i+1,h=N-1,target=-nums[i];
            if(i>0&&nums[i]==nums[i+1])continue;
            while (l<h){
                int sum=nums[l]+nums[h];
                if(sum==target){
                    cnt++;
                    while (l<h&&nums[l]==nums[l+1]) l++;
                    while (l<h&&nums[h]==nums[h-1]) h--;
                    l++;
                    h--;
                }else if (target>sum){
                    l++;
                }else {
                    h--;
                }
            }

        }
        return cnt;
    }
}
