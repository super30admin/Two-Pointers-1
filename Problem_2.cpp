//Time complxity is O(n)
//The space complexity varies from O(logn) and O(n)

/*Approach: We are using two pointer approach here. But for that
we need the array to be sorted and fixing a negative number, so
that we can find two positive numbers after that whose sum produces
zero if added to the negative number. If the sum is negative we can
increase the low pointer and if sum is greater than zero we can
decrease the high pointer.

We have to take care of the cases like what if our number which we are trying to fix
is positive, then we will end the loop over there because then we cannot make zero
in any case as all the numbers after that will be positive as we sorted the array in the
beginning. The second case is when the number we are trying to fix is equivalent to the
previous number, then we have to end the current iteration as we can not use the same
number again.
*/

//the code ran perfectly on the leetcode



class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        sort(nums.begin(), nums.end());
        vector<vector<int>> result;
        for(int i =0; i<nums.size();++i){
            if(nums[i]>0) break;
            if(i>0 && nums[i] == nums[i-1]) continue; 
            int left = i+1, right = nums.size() -1;
            int sum = 0;
            while(left<right){
                sum = nums[left] + nums[right] + nums[i];
                if(sum >0) right--;
                else if(sum <0) left++;
                else {
                    result.push_back({nums[i], nums[left], nums[right]});
                int last_left_occurence = nums[left] , last_right_occurence = nums[right];  
                    while(left<right && nums[left] == last_left_occurence){  
                        left++;
                    }
                    while(left<right && nums[right] == last_right_occurence){
                        right--;
                    }
                }
            }
        }
        return result;
    }
};