// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach
// This uses the two-pointer approach:
// Start with one pointer at the beginning and one at the end of the array.
// Calculate the area between the two lines and update the max area.
// Move the pointer pointing to the shorter line inward (hoping for a taller line).
// Repeat until both pointers meet.



public class ContainerWithMostWater {
    public int solve(int[] height){
        int i=0, j=height.length-1, max=0;

        while(i<j){
            int le = j-i;
            int wi = Math.min(height[i], height[j]);
            int a = le * wi;
            max = Math.max(max, a);

            if(height[i] < height[j]){
                i++;
            }
            else{
                j--;
            }
        }
        return max;
    }
    public static void main(String[]args){
        ContainerWithMostWater ob = new ContainerWithMostWater();
        int[] height1 = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1,1};
        System.out.println("Max amount of water container can store is: "+ob.solve(height1));
        System.out.println("Max amount of water container can store is: "+ob.solve(height2));

    }
    
}
