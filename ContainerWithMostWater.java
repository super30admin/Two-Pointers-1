// Approach: Two Pointer Approach and move the pointer that gives the effective height so we can get max container area.
// Time : O(n)
// Space: O(1)
class Solution {
    public int maxArea(int[] height) {
       int n = height.length;
       // Two pointers
       int l=0;
       int r = n-1;
       int max =0;
       int start = 0;
       int end =0;
       while(l<r){
            int h=0; // initial height
            int w = r-l; // initial width
            if(height[l]<height[r]){
                // effective height
                h=height[l];
                if(max<h*w){
                    max = h*w;
                    start=l;
                    end=r;
                }
                l++;
            } else{
                h=height[r];
                if(max<h*w){
                    max=h*w;
                    start=l;
                    end=r;
                }
                r--;
            }
            max = Math.max(max,h*w);
       }
       System.out.println(start +" " +end);
       return max;
    }
}


// Approach: Form all the containers that can store water and get max
// Time:O(n^2)
// Space: O(1)
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;
        int max =0;
        for(int i=0;i<n;i++){
            for (int j=1;j<n;j++){
                int h = Math.min(height[i],height[j]); // lowest height
                int w = j-i;
                max = Math.max(max,h*w);
            }
        }
        return max;
    }
}