//Time Complexity : O(n)
//Space Complexity : O(1)
/*Approach
-taking three pointers low, mid and high
-if mid is 0 we will swap it with low because we want all 0's to be before low increment both mid andlow 
-if mid is 2 we will swap it with high but only decrement high because we are sure high is 2 but not sure about mid
-if mid is 1 just keep incrementing because low to mid should be 1
 */
public class SortColors {
    public static  void sortColors(int[] nums) {
        int mid = 0;
        int low = 0;
        int high = nums.length-1;
        while(mid <= high){
            if(nums[mid] == 0){
                swap(nums,low++,mid++);
            }
            else if(nums[mid] == 2){
                swap(nums,mid,high--);
            }
            else{
                mid++;
            }
        }
        
    }
    public static void swap(int[] nums,int x,int y){
        int temp= nums[x];
        nums[x] = nums[y];
        nums[y] = temp;
    }

    public static void main(String args[]){
        int nums[] = new int[]{2,0,2,1,1,0};
        sortColors(nums);
        for(int i = 0; i < nums.length;i++){
            System.out.print(nums[i]+" ");
        }
    }
}