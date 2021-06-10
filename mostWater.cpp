
/*
idea here is to make use of two pointers one starting at the 0th index and another at the end
calculate the current area - that would be the height of smallest container and the distance between two pointers
move the pointer with lesser height
parallely keep track of the maximum area along 
*/
class Solution {
public:
    int maxArea(vector<int>& height) {
     
        int maxx=0;
        int i=0; 
        int area;
        int min1;
        int j=height.size()-1;
        while(i<j)
        {
           if(height[i]<height[j])
           {
               min1=height[i];
                 area=min1*(j-i);
               i++;
           }
            else
            {
                min1=height[j];
                  area=min1*(j-i);
                j--;
            }
          
            
           maxx=max(area,maxx);
        }
    return maxx;    
    }
};

/*
Time Complexity : O(number of containers)
Space complexity: O(1)
*/
