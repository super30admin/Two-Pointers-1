// Brute Force
// Time COmplexity - O(n^3)
// Space Complexity - O(n), since I am using a set that may have its size equal to the number of elements in the input vector.
// Problems Faced - No!
// It runs on Leetcode
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> answer;
        set<vector<int>> set1;
        int n = nums.size();
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n ; j++){
                for(int k = j+1; k < n; k++){
                    if(nums[i] + nums[j] + nums[k] == 0){
                        vector<int> temp;
                        temp.push_back(nums[i]);
                        temp.push_back(nums[j]);
                        temp.push_back(nums[k]);
                        sort(temp.begin(), temp.end());
                        
                        if(!set1.count(temp)){
                            set1.insert(temp);
                            answer.push_back(temp);
                        }
                    }
                }
            }
        }
        return answer;
    }
};

// Approach 2 - Fix an iterator on an element inside 'nums' vector. The problem is reduced to 2Sum for all the elements after nums[i]. Maintain a set
//              to see if the desired sum is already achieved or not.

// Time COmplexity - O(n^2)
// Space Complexity - O(n), since I am using a set that may have its size equal to the number of elements in the input vector.
// Problems Faced - No!
// Leetcode - Gives 'TLE'
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> answer;
        int n = nums.size();
        if(n < 3)
            return answer;
        bool flag = false;
        for(int i = 0 ; i < n; i++){
            if(nums[i] != 0){
                flag = false;
                break;   
            }
            flag = true;
        }
        cout << "Flag: " << flag << endl;
        if(flag == true){
            answer.push_back({0, 0, 0});
            return answer;
        }
            
        set<vector<int>> s1;
        for(int i = 0; i < n; i++){
            int target = -nums[i];
            set<int> s;
            for(int j = i+1; j < n; j++){
                int n = target - nums[j];
                if(!s.count(n))
                    s.insert(nums[j]);
                else{
                    vector<int> temp;
                    temp.push_back(nums[i]);
                    temp.push_back(nums[j]);
                    temp.push_back(n);
                    sort(temp.begin(), temp.end());
                    
                    if(!s1.count(temp)){
                        s1.insert(temp);
                        answer.push_back(temp);
                    }
                }
            }
        }
        return answer;
    }
};

// Approach 3 - Two pointer technique
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> answer;
        int n = nums.size();
        if(n < 3)
            return answer;
        bool flag = false;
        for(int i = 0 ; i < n; i++){
            if(nums[i] != 0){
                flag = false;
                break;   
            }
            flag = true;
        }
        cout << "Flag: " << flag << endl;
        if(flag == true){
            answer.push_back({0, 0, 0});
            return answer;
        }
        set<vector<int>> s;
        sort(nums.begin(), nums.end());
        
        for(int i = 0; i < n; i++){
            int low = i+1;
            int high = n-1;
            while(low < high){
               if((nums[i] + nums[low] + nums[high]) == 0){
                vector<int> temp;
                temp.push_back(nums[i]);
                temp.push_back(nums[low]);
                temp.push_back(nums[high]);
                sort(temp.begin(), temp.end());
                
                if(!s.count(temp)){
                    s.insert(temp);
                    answer.push_back(temp);
                }
                   low++;
                   high--;
            }
            else if((nums[i] + nums[low] + nums[high]) < 0)
                low++;
            else
                high--; 
            }
        }
        return answer;
    }
};

// Most optimized solution - Not using the HashSet to prevent duplicacy, instead, moving my low and high pointers until a find a different element when I encounter a trio that makes the same zero.
// Time COmplexity - O(n^2)
// Space Complexity - O(1)
// Problems Faced - No!
// It runs on Leetcode
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> answer;
        int n = nums.size();
        sort(nums.begin(), nums.end());
        
        for(int i = 0; i < n; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int low = i+1;
            int high = n-1;
            while(low < high){
               if((nums[i] + nums[low] + nums[high]) == 0){
                vector<int> temp;
                temp.push_back(nums[i]);
                temp.push_back(nums[low]);
                temp.push_back(nums[high]);
                
                answer.push_back(temp);
                low++;
                high--;
                while(low < high && nums[low] == nums[low-1])
                    low++;
                while(low < high && nums[high] == nums[high+1])
                    high--;
            }
            else if((nums[i] + nums[low] + nums[high]) < 0)
                low++;
            else
                high--; 
            }
        }
        return answer;
    }
};
