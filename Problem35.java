//Time Complexity: O(n)
//Space Complexity: O(1)
//Did it run on leetcode: yes
//Problems faced any: No

public class Problem35 {
    public int maxArea(int[] height) {
        if(height==null || height.length==0)
            return 0;

        int maxArea = 0;
        int low = 0;
        int high = height.length-1;

        while(low<high){
            int area = (high-low) * Math.min(height[low],height[high]);
            if(area>maxArea)
                maxArea = area;
            if(height[low]<height[high])
                low++;
            else
                high--;
        }

        return maxArea;
    }
}
