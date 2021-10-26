//Time Complexity = O(N*N)
//Space Complexity = O(1)
//where N is the size of the vector height
//here time limit will exceed.
class Solution {
public:
    int maxArea(vector<int>& height) {
        int i,j,Max=INT_MIN;
        for(i=0;i<height.size()-1;i++)
            for(j=i+1;j<height.size();j++)
            {
                Max=max(Max,min(height[i],height[j])*(j-i));                  //here we are calculating the area of the container formed by the ith index element and jth index element. By taking the height of the minimum element and finding the width by the difference btw the index of the two element. 
            }
        return Max;
    }
};

//Time Complexity = O(N)
//Space Complexity = O(1)
//where N is the size of the vector height.
class Solution {
public:
    int maxArea(vector<int>& height) {
        int low=0,high=height.size()-1,Max=INT_MIN;
        while(low<high)
        {
            Max=max(Max,min(height[low],height[high])*(high-low));            //here we are calculating the area of the container formed by the low index element and high index element. By taking the height of the minimum element and finding the width by the difference btw the index of the two element.
            if(height[low]<height[high])                                      //we will increase or decrease that pointer which has minimum height element.
                low++;
            else
                high--;
        }
        return Max;
    }
};
