

public class pivotindex {
    public static void main(String[] args){
        int nums[]={1,7,3,6,5,6};
        System.out.print(pivotIndex(nums));
    }
    public static int pivotIndex(int[] nums) {
    int total=0;
    for(int i=0;i<nums.length;i++){
        total=total+nums[i];
    }
    int leftsum=0;
    for(int i=0;i<nums.length;i++){
        total=total-nums[i];
        if(leftsum==total) return i;
        leftsum=leftsum+nums[i];
        }
        return -1;
    }
    
}
