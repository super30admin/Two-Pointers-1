/*
    BRute Force
        Time Complexity : O(N^2)
        space complexity : O(1)
        is Worked on leetcode : YES
    Two Pointer:
        Time Complexity : O(N)
        Space complexity : O(1)
        is worked on leetcode : YES

*/
/*
    Idea is that we will use 2 pointer, one from start and one from end of the array, we will calculate the
    area and compare with maximum area till now, and update max if required.
    intuation is that area is dominated by the smaller height so we will move our pointer towards higher height
    
*/
public class Container_with_mostWater{
    public int maxArea(int[] height) {
        if( height == null || height.length == 0) return 0;
        int max = 0;
        int n  = height.length;
        for(int i=0; i< n-1;i++){
            for(int j=i+1;j<n;j++){
//                 width * min height of two bar
                int new_area = (j-i) * (Math.min(height[i],height[j]));
                max = Math.max(max, new_area);
            }
        }
        return max;
    }

    public int maxArea_Two_Pointer(int[] height) {
        if( height == null || height.length == 0) return 0;
        int max = 0;
        int n  = height.length;
        int low = 0;
        int high = n-1;
        while (low < high){
            max = Math.max(max,Math.min(height[low],height[high])* (high-low));
            if(height[low] > height[high]){
                high--;
            }else{
                low++;
            }
        }
        return max;
    }
}