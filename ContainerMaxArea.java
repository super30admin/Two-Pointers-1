// TC: O(n)
// SC: O(1)
//works in leetcode

//assume width of 1 between two elements. Area = (min of two heights) * width
//use two pointer and move left pointer if smaller than right
//move right pointer to left if right pointer is smaller than left pointer.
public class ContainerMaxArea {


    public static int maxArea(int[] height) {
        int n = height.length;
        int maxArea =0;

        int l=0;
        int r=n-1;

        while(l<r){
            int width = r-l;
            int area = Math.min(height[l],height[r]) * width;
            maxArea = Math.max(maxArea, area);

            if(height[l] < height[r])
                l++;
            else
                r--;

        }

        return maxArea;
    }

    public static void main(String [] args){
        int [] height = {1,8,6,2,5,4,8,3,7};
        int [] height1 = {1,1};

        System.out.println(maxArea(height));
        System.out.println(maxArea(height1));

    }
}