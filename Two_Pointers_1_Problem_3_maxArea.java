//Time Complexity : O(n)
//Space Complexity : O(1)
//Run successfully on the leetcode
//No problems

//In the beginning we will have our two pointers on the boundries
//In each turn we will try to move to the greater height as we need to have greater height in order to get maximum area

public class Two_Pointers_1_Problem_3_maxArea {
    public int maxArea(int[] height) {
        if(height== null || height.length == 0) return 0;

        int left =0;
        int right = height.length - 1;
        int maxArea = 0;
        while(left<right)
        {
            int area = (right-left) * Math.min(height[left],height[right]);
            maxArea = Math.max(maxArea, area);
            if(height[left]<height[right])
            {
                left++;
            }
            else
            {
                right--;
            }
        }
        return maxArea;
    }
}
