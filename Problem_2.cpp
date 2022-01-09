//Time complxity is O(n^2)
//The space complexity varies from O(1)

/*Approach: 
We can use brute force method. The time complexity for that solution will be O(n^3).
We can modify that solution to take care of the duplicates by using the hashset and it
will the reduce the time complexity to O(n^2) but at the same time space complexity
will be increased.

To reduce the space complexity also we are using two pointer approach here. But for that
we need the array to be sorted and fixing a negative number, so
that we can find two positive numbers after that whose sum produces
zero if added to the negative number. If the sum is negative we can
increase the low pointer and if sum is greater than zero we can
decrease the high pointer. If we are getting zero, then we are just adding
it to the resultant vector and incrementing low by one and
decrementing the high by 1.

Taking care of the duplicacy: there will be two duplicacies. One outside
the two pointer range and one inside the two pointer range. In both cases we
increment and decrement our pointers accordingly if the current element
is equivalent to the previous one.

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
            if(i>0 && nums[i] == nums[i-1]) continue; //Takjes care of the outer duplicacy
            int left = i+1, right = nums.size() -1;
            int sum = 0;
            //We have fixated the outer number.
            //Now we will look for its complement in the rest of the array with two pointer approach.
            while(left<right){
                sum = nums[left] + nums[right] + nums[i];
                if(sum >0) right--;
                else if(sum <0) left++;
                else {
                    result.push_back({nums[i], nums[left], nums[right]});
                    left++;
                    right--;
                    //But we have to take care of the internal duplicacy too
                    //Which means that as our array has number of duplicates, there could be another combination
                    //which can produce the same result. This will result in duplicate triplets.
                    while(left<right && nums[left] == nums[left-1]){  
                        left++;
                    }
                    while(left<right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
            }
        }
        return result;
    }
};
