// Time Complexity : O(NLogN)+O(N^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        int N = nums.length;
        int outerPointer = 0;
        int left;
        int right;
        //sorting given array
        Arrays.sort(nums);
        // iterate over each element and perform two pointers from that index + 1
        while(outerPointer<N-2) {
            // if prev element and curr same, we keep incrementing outerPointer until new number is found,
            // so that we won't end up with duplicate pairs
            while(outerPointer>0 && outerPointer<N-2 && nums[outerPointer-1] == nums[outerPointer]) {
                outerPointer++;
            }
            // if the outerPointer itself is pointing to an element greater than zero,
            // we can skip the comparison for the rest as they are definitely going to be greater than zer0
            if(nums[outerPointer] > 0) break;

            left = outerPointer+1;
            right = N-1;
            while(left<right){
                int curr = nums[outerPointer]+nums[left]+nums[right];
                // when current sum is zero, we create a pair
                if(curr == 0) {
                    List<Integer> currPair = Arrays.asList(nums[outerPointer], nums[left], nums[right]);
                    result.add(currPair);
                    left++;
                    right--;
                    // if duplicate element is present after that with left pointer,
                    // increment till find a number other than the current element
                    while(left<right && nums[left-1] == nums[left]) {
                        left++;
                    }
                    // same goes here as above, but from the right hand side
                    while(left<right && nums[right]== nums[right+1]) {
                        right--;
                    }
                    // if current sum is left than zero,
                    //since it is sorted array, we should increment the left index by 1
                    // to attain the zero sum
                } else if(curr < 0) {
                    left++;
                } else {
                    right--;
                }

            }
            outerPointer++;
        }
        return result;
    }
}

// time complexity: O(N^3)*O(NLogN) for sorting inside
// space complexity: O(N), to maintain a unique pairs
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> set = new HashSet<>();
        for(int i=0;i<n-2;i++) {
            for(int j=i+1;j<n-1;j++) {
                for(int k=j+1;k<n;k++) {
                    if(nums[i]+nums[j]+nums[k] == 0) {
                        List<Integer> currPair = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(currPair);
                        set.add(currPair);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }
}