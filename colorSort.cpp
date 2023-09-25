//TC: O(n)
//Sc: O(1)

//Approach : use 3 pointers to positions colors 0,1,2
//idea here is that if we encounter 2 we push it back to the right of the array and decrement right ptr
//if we find 0 we push it to the left of array and oncrement left ptr AND mid cause they can overlap
//if it is 1 we simly mobe our mid pointer ahead

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int left=0, right=nums.size()-1, mid=0;
        while(mid<=right)
        {
                 if(nums[mid]==2)
                 {
                     swap(nums[mid], nums[right]);
                     right--;
                 }       
                 else if(nums[mid]==0)
                 {
                     swap(nums[mid],nums[left]);
                     left++;
                     mid++;
                 }         
                 else{
                     mid++;
                 }                                                                                                                                                                                                                            
        }
    }
};