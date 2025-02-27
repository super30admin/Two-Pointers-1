/*The threeSum function aims to find all unique triplets in the array that sum up to zero. It employs a two-pointer approach along with sorting the array. The outer loop iterates through the array, and the inner while loop utilizes two pointers to search for triplets. To handle duplicate elements, it skips identical elements during iteration.

Time Complexity: O(n^2) - The two-pointer approach results in linear time complexity, and sorting the array takes O(n log n).

Space Complexity: O(1) - The algorithm uses a constant amount of extra space regardless of the input size, as it modifies the array in place.*/
#include<bits/stdc++.h>
using namespace std;
vector<vector<int>> threeSum(vector<int>& num) {
        int n = num.size();
        sort(num.begin(), num.end());
        vector<vector<int>> result;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && num[i] == num[i - 1]) continue;
            
            int target = -num[i];
            int low = i + 1;
            int high = n - 1;

            while (low < high) {
                int sum = num[i] + num[low] + num[high];

                if (sum == 0) {
                    result.push_back({num[i], num[low], num[high]});
                    while (low < high && num[low] == num[low + 1]) low++; 
                    while (low < high && num[high] == num[high - 1]) high--; 
                    low++;
                    high--;
                } else if (sum > 0) {
                    high--;
                } else {
                    low++;
                }
            }
        }

        return result;
    }