// Time Complexity :O(N)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :YES
// Any problem you faced while coding this :NO


// Your code here along with comments explaining your approach
public class SortColors {
    public void sortColors(int[] nums) {
        int low=0;int mid=0;
        int high=nums.length-1;
        while( low<=high && mid<=high){
            if(nums[mid]==0){
                swap(nums,mid,low);
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }
            else{
                mid++;
            }
        }
    }
    void swap(int nums[],int mid,int x){
        int temp=nums[mid];
        nums[mid]=nums[x];
        nums[x]=temp;
    }
    public static void main(String args[]){
        SortColors obj=new SortColors();
        int nums[]={2,0,2,1,1,0};
        obj.sortColors(nums);
    }
}
