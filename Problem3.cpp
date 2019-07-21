//
// Created by shazm on 7/21/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

class Solution{
public:
    int maxArea(vector<int>& height) {
        int low = 0; int high = height.size()-1;
        int minVal; int target =0; int temp;
        while(low<high){ //1,8,6,2,5,4,8,3,7
            minVal = min(height[low],height[high]);
            temp = target;
            target = minVal*(high-low);
            if(target<temp){target = temp;}
            if(minVal == height[high]){
                high--;
            }else{
                low++;
            }
        }
        return target;
    }
//    int maxArea(vector<int>& height) {
//        int retVal = 0; int low; int high;
//        vector<int> temp = height;
//        sort(temp.begin(),temp.end()); //O(nlogn)
//        if(height.size()>1){
//            int x = 1;
//            high = temp[height.size()-1];
//            low = high;
//            while(high==low && x<height.size()){
//                x++;
//                low =  temp[temp.size()-x];
//            }
//        }
//        int lower = (lower_bound(height.begin(),height.end(),high)-height.begin()) ;
//        int higher = (upper_bound(height.begin(),height.end(),high)-height.begin());
//        cout<<lower<<" lower "<<higher<<" higher\n";
//        return 0;
//    }
};

int main(){
    Solution s;
    vector<int> vec{1,8,6,2,5,4,8,3,7}; // {1,2,3,4,5,6,7,8,8]
    cout<<s.maxArea(vec)<<endl;
    return 0;
}