// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes https://leetcode.com/problems/sort-colors
// Any problem you faced while coding this :


// Use 2 pointer approach and move pointers w.r.t mid value
class SortColors{
    public static void sortColors(int[] nums) {
        int low = 0, mid = 0, high = nums.length -1;
        while(mid<=high){
            if(nums[mid] == 0){
                swap(nums,mid, low);
                low++;
                mid++;
            } else if(nums[mid] ==2){
                swap(nums,mid, high);
                high--;
            } else
                mid++;

        }
    }
    public static void swap(int[] in, int i, int j) {
        int temp;
        temp = in[i];
        in[i]=in[j];
        in[j]=temp;
    }

    public static void main(String ar[]) {
        int[] in = new int[]{2,0,2,1,1,0};
        sortColors(in);
    }
}