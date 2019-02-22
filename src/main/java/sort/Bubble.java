package sort;

public class Bubble<T extends Comparable<T>> extends Sort<T> {
    public void sort(T[] nums) {
        int N=nums.length;
        boolean flag=false;
        for(int i=N-1;i>0&&!flag;i++){
            flag=true;
            for (int j=0;j<i;j++){
                if (less(nums[j+1],nums[j])){
                    flag=false;
                    swap(nums,j,j+1);
                }
            }
        }
    }
}
