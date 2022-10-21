// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this : no

public class Container {
        public int maxArea(int[] height) {
            int n = height.length -1;
            int p1 = 0;
            int p2 = n;
            int area= 0;
            while(p1 < p2){
                int minH = Math.min(height[p1], height[p2]);
                int dist = p2 - p1;
                area = Math.max(area, minH * dist);

                if (height[p2] > height[p1]){
                    p1++;
                }
                else{
                    p2--;
                }
            }
            return area;
        }

        public static void main(String[] args){
            int[] nums=  {1,8,6,2,5,4,8,3,7};
            Container obj = new Container();
            obj.maxArea(nums);
        }

}
