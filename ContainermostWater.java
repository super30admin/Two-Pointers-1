class Solution {
    /* Time Complexity: O(n);
    Space Complexity : O(1);

    Executed in leetcode;
    */
    public int maxArea(int[] height) {
        int n = height.length;
        int l = 0;
        int h = n-1;
        int max = 0;
        //int st =0;
        //int end = n-1;
        while (l < h){
            int curr = (h - l) * Math.min(height[l], height[h]);
            max = Math.max(max, curr);
            /*if (max < curr){
                max = curr;
                st = l;
                end = h;
            }*/
            

            if (height[l] < height[h]){
                l ++;
            } else{
                h--;
            }

        }
        //System.out.println(st);
        //System.out.println(end);
        return max;
        
    }
}