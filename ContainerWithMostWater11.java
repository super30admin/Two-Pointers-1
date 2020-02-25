//Time complexity :  O(n)
//space complexity : O(1)
//leetcode execution : successfull
//steps: intialize two pointers low at index 0 and high at last index of array. Now converge those values by calculating max area using (high-low)*min(low,high);
//once loop finishes of return the max variable.
class ContainerWithMostWater11 {

    public static int maxArea(int[] nums) {
    
    int low =0,high= nums.length-1,max=0;
    while(low<high){
        int current = (high-low)* (Math.min(nums[low], nums[high]));
        max = Math.max(max,current);
        if(nums[low]<nums[high]){
            low++;
        }
        else {
            high--;
        }

    }
    return max;
    
    }




    public static void main(String[] args) {
        int nums[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(nums));
    }
}