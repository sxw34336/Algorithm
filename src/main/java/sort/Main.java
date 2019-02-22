package sort;

public class Main {
    public static void main(String args[]){
        Integer[] nums={5,11,7,9,2,3,12,8,6,1,4,10};
        Shell shell=new Shell();
        shell.sort(nums);
        for (Integer num :nums){
            System.out.print(num+" ");
        }
    }
}
