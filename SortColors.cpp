// given an array [2,0,1,2,0,1]
// we need to sort the given array such that all the numbers in [0,1,2] order

//the first brute force would be we can iterate through the array .
// if we find 2 we swap that to the end of the array
// [2,0,1,2,0,1]
//  ^
//        ~
// [0,1,1,2,0,2]
//    ^     ^
// as we know the end is 2 and it is max we keep a pointer to track that and decrement the pointer
//if we find 0 we move that to first and increament the first pointer
// []
// if we find 1 just increment 

class Solution {
private:
    void swap(int &num1,int &num2)
    {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }
public:
    void sortColors(vector<int>& nums) {
        //we need three pointers
        int low = 0;
        int high = nums.size()-1;
        int curr = 0;

        while(curr <= high)
        {
            //case 1
            if(nums[curr] == 2)
            {
                swap(nums[curr],nums[high]);
                high--;
            }
            else if(nums[curr] == 0)
            {
                swap(nums[curr],nums[low]);
                low++;
                curr++;
            }
            else
            {
                curr++;
            }
        }
    }
};
//Time complexity would be O(N)
//space complexity O(1)