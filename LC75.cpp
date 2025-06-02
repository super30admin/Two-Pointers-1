// Time complexity O(n)
// Space complexity O(1)

class Solution {
public:
    void sortColors(vector<int>& nums) {
        int red = 0;
        int blue = nums.size()-1;
        for (int white = 0; white <= blue;) {
            int color = nums[white];
            if (color == 0) {
                swap(nums[red], nums[white]);
                red++;
                white++;
            } else if (color == 2) {
                swap(nums[blue], nums[white]);
                blue--;
            } else {
                white++;
            }

        }
    }
};