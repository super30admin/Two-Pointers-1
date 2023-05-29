// Brute Force TLE
// TC: O(n)
// SC: O(1)

// Do a nested iteration exhaustively for each index but time limit exceeds

class Solution {
    public int maxArea(int[] height) {
        int maxAr=0;
        int n=height.length;
        for(int i=0;i<n-1;i++){ //i will be till 2nd last index because j is i+1
            for(int j=i+1;j<n;j++){
                int area=Math.min(height[i],height[j])*(j-i); //min height * width
                maxAr=Math.max(maxAr,area);
            }
        }
        return maxAr;
    }
}


// Two Pointers 
// TC: O(n)
// SC: O(1)

// Start one pointer at index 0, one at the last index 
// Calculate the area and compare with max area.
// If one side is less than the other side in height, move its corresponding pointer until all 
// indices are exhausted


//low cant be <=high because there would be no container if they meet
// if one height is < the other, we move away from the lower height meaning
// increment the lower height index
// left<=right (=) meaning if they are the same height we can move any pointer

//Followup: return area with the exact indices:
// Get 2 additional vars a,b
// Store left and right values only if area is > maxArea
// area keeps changing even after getting maxArea since we need to check further
// until all the indices are exhausted


class Solution {
    public int maxArea(int[] height) {
        int maxAr=0;
        int n=height.length;
        int left=0;
        int right=n-1;
        int a=0;
        int b=0;
        
        while(left<right){ 
            int area=Math.min(height[left],height[right])*(right-left);

            if(area>maxAr){
                a=left;
                b=right;
            }
            maxAr=Math.max(maxAr,area);

            if(height[left]<=height[right]) left++;
            else right--;
        }
        System.out.println(a);
        System.out.println(b);
        return maxAr;
    }
}

