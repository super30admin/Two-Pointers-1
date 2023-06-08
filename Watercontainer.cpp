class Solution {
public:
    int maxArea(vector<int>& height) {

        int n = height.size();
        int maxi = 0;
        int mini = 0;
        int start = 0;
        int end = n-1;
   
    while(start<end){

        
                mini = min(height[start],height[end])*(end-start);
                maxi = max(maxi,mini);

                if(height[start]<height[end]){
                    start++;
                }
                else{
                    end--;
                }

            }

             
        
    return maxi;
    }
};

//// Time complexity: - o(n)