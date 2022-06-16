//Approach 1 - Not a very space efficient solution. Uses O(n) space and is a two pass algorithm.
// Time Complexity - O(n) - But is a 2-pass algorithm
// Space Complexity - O(n) - Initializing vectors, 'r', 'w' and 'b'. Their size adds up to the size of 'nums' vector.
// Problems Faced - No!
// It runs on leetcode.

class Solution {
public:
    void sortColors(vector<int>& nums) {
        vector<int> r;
        vector<int> w;
        vector<int> b;
        int n = nums.size();
        
        for(int i = 0; i < n; i++){
            if(nums[i] == 0)
                r.push_back(nums[i]);
            else if(nums[i] == 1)
                w.push_back(nums[i]);
            else
                b.push_back(nums[i]);
        }
        
        nums.clear();
        for(int i = 0; i < r.size(); i++){
            nums.push_back(r[i]);
        }
                for(int i = 0; i < w.size(); i++){
            nums.push_back(w[i]);
        }
                for(int i = 0; i < b.size(); i++){
            nums.push_back(b[i]);
        }
        
    }
};

// Approach 2 - 3 pointer solution
// Time Complexity - O(n), since we iterate over the input vector containing 'n' elements.
// Space Complexity - O(1)
// Problems Faced - No!
// It runs on leetcode.

class Solution {
private:
    void swap1(int& a, int& b){
        int temp = a;
        a = b;
        b = temp;
    }
    void swap2(vector<int>& arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
public:
    void sortColors(vector<int>& nums) {
        int n = nums.size();
        int p0 = 0;
        int p1 = 0;
        int p2 = n-1;
        
        while(p1 <= p2){
            if(nums[p1] == 1)
                p1++;
            else if(nums[p1] == 0){
                //swap2(nums, p1, p0);  
                swap1(nums[p1], nums[p0]);
                p0++;
                p1++;
            }
            else if(nums[p1] == 2){
                //swap2(nums, p1, p2);  
                swap1(nums[p1], nums[p2]);
                p2--;
            }
        }
    }
};

