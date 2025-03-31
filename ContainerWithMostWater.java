public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        //brute force approach
        //time complexity - O(n)
        //Space complexity - O(1)
        // int n = height.length;
        // //we    will store all areas and return the max_area for
        // int max_area = 1;
        // for(int i = 0; i<n;i++){
        //     for(int j = i+1;j<n;j++){
        //         int min_height = Math.min(height[i],height[j]);
        //         //width will be j-i as i element won't be considered as width
        //         int width = j-i;
        //         int area = width*min_height;
        //         max_area = Math.max(area,max_area); 
        //     }
        // }
        // return max_area;
    
        //Optimal Approach - Two pointer 
        //Time complexity- O(n)
        //Space complexity - O(1)
        int n = height.length;
        int max_area = 0;
        int left=0;
        int right = height.length-1;
        
        //
        while(left < right){
             int min_height = Math.min(height[left],height[right]);
             int width = right - left;
             int area = width*min_height;
             max_area = Math.max(area,max_area);
            
            // Min height is controlling factor for the maxArea hence we shift it 
                if(height[left] <height[right]){left++;}
                else {right--;}     
        }
        return max_area;

    }
}

