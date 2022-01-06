//Time complexity is O(n)
//Space complexity is O(1)

/*Approach: We are using Dutch Flag Algorithm
According to the algorithm we maintain three pointers
low pointer, mid pointer and high pointer
At the start low and mid pointer are equivalent to the
first element of the array and the high pointer is equal to
the last element of the array. We analyse the value of array[mid]
There are three cases in it:
    i>  if array[mid] == 0 swap the values of array[low] and array[mid]
        and increment the values of low and mid by 1
   ii>  if array[mid] == 1 increment the value of mid by 1
  iii>  if array[mid] == 2 swap the values of array[mid] and array[high] and decrement
        the value of high by 1
Following this algorithm our array will be sorted.
*/

class Solution {
public:
    void sortColors(vector<int>& nums) {
       int left = 0,  mid = 0,  right = nums.size()-1;
        while(mid<=right){
            if(nums[mid] == 0){
                 swap(nums[left], nums[mid]);
            left++; 
                mid++;
            }
            else if (nums[mid] == 1){
                mid++;
            }
            else{
                 swap(nums[mid], nums[right]);
            right--;
            }
        }    
    }
};