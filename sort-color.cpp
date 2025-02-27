/*This algorithm works by maintaining three pointers: low points to the end of the sorted 0's, mid is the current element being processed, 
and high points to the beginning of the sorted 2's. The algorithm iterates through the array, swapping elements accordingly.

Time Complexity: O(n) - The algorithm makes a single pass through the array.

Space Complexity: O(1) - The algorithm sorts the array in-place, using only a constant amount of extra space.*/
#include<bits/stdc++.h>
using namespace std;
void sortColors(vector<int>& nums) {
    int low = 0, mid = 0, high = nums.size() - 1;

    while (mid <= high) {
        if (nums[mid] == 0) {
            swap(nums[low], nums[mid]);
            low++;
            mid++;
        } else if (nums[mid] == 1) {
            mid++;
        } else {
            swap(nums[mid], nums[high]);
            high--;
        }
    }
}
