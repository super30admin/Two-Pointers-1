//  75_Sort_Colors
/*Two Pointer approach
Maintain two pointers one at beginning and another at end of array. Iterate through array, if 0 is encountered swap it with left and increment left and current pointers. if 2 is encountered swap it with right and increment right pointer. if 1 is encountered keep incrementing current pointer. Break out condition is current pointer > right pointer. (In-place and one-pass)

TC: O(N), N = length of array
SC: O(1)

*/

#include <iostream>
#include <vector>

using namespace std;


class Solution {
public:
    void sortColors(vector<int>& nums) {
        int N=nums.size();
        int start = 0, curr = 0;
        int end = N-1;
        while(curr <= end){
            int temp=0;
            if(nums[curr] == 0){
                temp=nums[start];
                nums[start++] = nums[curr];
                nums[curr++]=temp;
            }
            else if(nums[curr] == 2)
            {
                temp=nums[end];
                nums[end--] = nums[curr];
                nums[curr]=temp;
            }
            else
              curr++;
        }
    }
    
/* Two pass

    Iterate over array and keep count of number of 0's, 1' and 2's. Fill the array starting with number of 0's followed by 1's and 2's.
    TC: O(N) , N = size of array
    SC: O(1)
 
*/
        void sortColors1(vector<int>& nums) {
            int ones = 0, twos = 0, zeros = 0;
            for(int i = 0; i < nums.size(); i++){
                if(nums[i] == 0){
                    zeros++;
                }
                else if(nums[i] == 1){
                    ones++;
                }
                else twos++;
            }
            int j = 0;
            while(zeros>0){
                nums[j++]=0;
                zeros--;
            }
            while(ones>0){
                nums[j++]=1;
                ones--;
            }
            while(twos>0){
                nums[j++]=2;
                twos--;
            }
        }
};


int main(int argc, const char * argv[]) {
    vector<int> nums{2,0,2,1,1,0};
    Solution s;
    s.sortColors(nums);
    for(int i:nums){
        cout<<i<<"\t";
    }
    return 0;
}
