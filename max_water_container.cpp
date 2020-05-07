//Time comlpexity - Fine below
//Space complexity - Find below
//Ran successfully on leetcode
//3 point approach is the following -
//1.We assign 2 pointers i.e. low and high
//2.We calculate the area of the boundary formed by the two pointers.
//3.We compare the lengths of the two pointers and move away from the low one.

class Solution {
public:
    int maxArea(vector<int>& height) {
        if(height.size()==0)
            return 0;
        /*Using brute force O(n^2) time and O(1) space
        int m=0;
        for(int i=0;i<height.size()-1;i++)
            for(int j=i+1;j<height.size();j++)
            {
                m=max(m,(j-i)*min(height[i],height[j]));
            }
        return m;*/
        
        //Using two pointers with O(n) time and O(1) space
        int l=0;
        int h=height.size()-1;
        int m=0; //max
        while(l<h)
        {
            int current_area= min(height[l],height[h])*(h-l);
            if(current_area>m)
                m=current_area;
            if(height[l]<height[h])
                l++;
            else
                h--;
        }
        return m;
    }
};