public class searchinsert {
    public int searchInsert(int[] nums, int target) {
       for(int i=0;i<nums.length;i++){
        if(nums[i]>=target){
            return i;
        }
       }
        return nums.length;
    }
    


public static void main(String[] args) {
    searchinsert s=new searchinsert();
    int arr[]={1,3,5,6};
    int target=5;
    System.out.println(s.searchInsert(arr, target));
}
}