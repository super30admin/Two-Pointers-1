// we have two pointers on either end, left and right
// the pointers move inward based on the condition that while we are decreasing the width
//that is the length between two indexes, the obtained result, is greater 
//thus, the time complexity: O(n) 
//space complexity: O(1)

public class MostWater {
    //2 pointers on left and right
    //both increase or decrease based on which is bigger 
    //this way we avoid repeated subproblems
    public static void main(String[] args)
    {
        int nums[] = {1,8,6,2,5,4,8,3,7};
        int result = maxArea(nums);
        System.out.println("The maximum area is " + result);
    }

    public static int maxArea(int[] height) {
        int max = 0;
        int n = height.length;

        int l=0;
        int r = n-1;

        while(l<r)
        {

            int currAr = Math.min(height[l],height[r]) * (r-l);

            max = Math.max(currAr,max);

            if(height[l]<height[r])
            {
                l++;
            }
            else
            {
                r--;
            }

        }
        return max;
    }
}
