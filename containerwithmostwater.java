public class containerwithmostwater {

    // Idea is to use two pointers method to eliminate all low area forming pairs
    // Pointers are placed at ends to make sure the width is maximum and
    // and pointer is moved strategically after making sure that area it makes is the maximum
    // compare all the areas and pick the maximum from them
    
    //Time Complexity : O(n)
    //Space Complexity : O(1)
       public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxArea=Integer.MIN_VALUE;
        while(i<j){
            int area=(Math.abs(i-j)*Math.min(height[i],height[j]));
            maxArea=Math.max(maxArea,area);
            if(height[i]<height[j])
                i++;
            else
                j--;
        }
        return maxArea;
    }
}
