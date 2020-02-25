//time complxity : O(n)
//space complexity : O(1)
//leet code execution : successful
//steps: intialise three ponters ow,mid and high, ensure mid also starts with low at 0. as mid is moved towards the high,the eleements right to mid gets sorted. for incplace element change used swapping that ensures inplace update.
class SortColors75{

    public static void sortColors(int[] nums) {

        int low = 0,mid =0,high = nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if (nums[mid]==1){
                mid++;
            }
            else {
                swap(nums,mid,high);
                high--;
            }

        }
    for(int i : nums){
        System.out.println(i);
    }
    
    }


    private static void swap(int[] nums, int mid, int low) {
        int temp = nums[mid];
        nums[mid] = nums[low];
        nums[low] = temp;
    }

    public static void main(String[] args) {
        int arr[] = {2,0,2,1,1,0};
        sortColors(arr);
        
    }
}