//
// Created by shazm on 7/21/2019.
//

#include <iostream>
#include <algorithm>
#include <vector>

using namespace std;

class Solution{
public:
    void sortColors(vector<int>& nums) {
        int low = 0; int mid = 0; int high = nums.size()-1; int temp;
        while(mid<=high){
//            cout<<nums[mid]<<" numsmid "<<nums[high]<<" numshigh "<<nums[low]<<" numslow\n";
            if(nums[mid]==2){
                temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }else if(nums[mid]==0){
                temp = nums[mid];
                nums[mid] = nums[low];
                nums[low] = temp;
                low++; mid++;
            }else{mid++;}
//            cout<<"after "<<nums[mid]<<" numsmid "<<nums[high]<<" numshigh "<<nums[low]<<" numslow\n-----------------\n";

        }
    }
};

int main(){
    Solution s;
    vector<int> vec{2,0,0,1,1,2};
    s.sortColors(vec);
    for(int x : vec){
        cout<<x<<endl;
    }
    return 0;
}