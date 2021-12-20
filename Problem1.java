//spacecomplexity: o(1)
//timecomplexity : o(n)
public class Problem1 {
    public void sortColors(int[] nums) {
        if(nums==null || nums.length==0){
            return;
        }
        int low=0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else{
                mid++;
            }
        }
    }
    
    private void swap(int[] nums,int i, int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}
