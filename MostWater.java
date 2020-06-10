// Time Complexity : O(n) where n is length of array
// Space Complexity :O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class MostWater {
    public int maxArea(int[] height) {

        int first = 0;
        int last = height.length-1;
        int capacity = 0;
        while(first<last)
        {
			//capacity is max(capacity , (distance between two points * height as min of the two)
            capacity = Math.max(capacity, (last-first)*(Math.min(height[first],height[last])));
            if(height[first]<=height[last])		//move pointer of smaller of the two
                first++;
            else
                last--;
        }
        
        return capacity;
    }
}