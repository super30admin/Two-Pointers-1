// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach

/*
    1. Create 3 pointers to handle 0, 1, 2. 
    2. Iterate through the array checking if input is 0, 1 or 2
    3. If input is 0, add 2 and 1 to the array vice versa since 0, 1, 2 will be in equal numbers as per requirements.
*/

#include <iostream>
#include <algorithm>

using namespace std;

class Solution{
    public:
        void sortColors(int A[], int n) {
            int n0 = -1, n1 = -1, n2 = -1;

            for (int i = 0; i < n; ++i) 
            {
                if (A[i] == 0) 
                {
                    A[++n2] = 2; A[++n1] = 1; A[++n0] = 0;
                }
                else if (A[i] == 1) 
                {
                    A[++n2] = 2; A[++n1] = 1;
                }
                else if (A[i] == 2) 
                {
                    A[++n2] = 2;
                }
            }
        }
};

