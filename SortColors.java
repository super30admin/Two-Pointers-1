//Time Complexity: O(n)
//Space Complexity: O(1)

public class SortColors {
    public void sortColors(int[] nums) {
        int x=0;
        int y=0;
        int z=0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==0)
                x++;
            else if(nums[i]==1)
                y++;
            else
                z++;
        }
        
        for(int i=0; i<x; i++){
            nums[i] = 0;
        }
        for(int i=x; i<x+y; i++){
            nums[i] = 1;
        }
        for(int i=x+y; i<x+y+z; i++){
            nums[i] = 2;
        }
        for(int n: nums)
            System.out.println(n);
    }
    public static void main(String[] args) {
        SortColors s = new SortColors();
        int[] nums = {1,2,2,0,1,0,1,2};
        s.sortColors(nums);
    }
}