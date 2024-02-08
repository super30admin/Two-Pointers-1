// ## Problem2 (https://leetcode.com/problems/3sum/)

// Time Complexity : Sorting+Two Pointers - O(N^2), where N is the number of elements in input array
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    //1. Brute force 
    // Time - O(N^3): Generate all triplets and check
    // Space - O(1)
    private List<List<Integer>> bruteForce(int[] nums){
        // Set of solutions to avoid duplicates
        Set<List<Integer>>  solSet = new HashSet<>();
        int len=nums.length;

        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                for(int k=j+1;k<len;k++){
                    if((nums[i]+nums[j]+nums[k])==0){
                        // Triplet found, sort and add in solution set
                        List<Integer> triplet=Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet);

                        solSet.add(triplet);
                    }
                }
            }
        }

        return new ArrayList<>(solSet);
    }

    //2. Optimized Brute force 
    // Time O(N^2): Generate all triplets and use hashing for linear search
    // Space O(N): Hashset takes space
    private List<List<Integer>> optimizedBruteForce(int[] nums){
        // For each given nums[i]:
        // We can optimize search for nums[j]+nums[k] by hashing nums[k]

        // Set of solutions to avoid duplicates
        Set<List<Integer>>  solSet = new HashSet<>();
        int len=nums.length;

        for(int i=0;i<len;i++){
            Set<Integer> valsSeenTillNow=new HashSet<>();
            for(int j=i+1;j<len;j++){
                int currSum=-nums[i]-nums[j];
                if(valsSeenTillNow.contains(currSum)){
                    // Triplet found
                    List<Integer> triplet = Arrays.asList(nums[i], nums[j], -nums[i]-nums[j]);

                    Collections.sort(triplet);
                    solSet.add(triplet);
                }else{
                    // Add current element to set
                    valsSeenTillNow.add(nums[j]);
                }
            }
        }

        return new ArrayList<>(solSet);
    }

    //3. Sorting + Two Pointers
    // Time - O(NlogN + N^2) --> O(N^2): Sort the input and use two pointers for linear search time
    // Space - O(1)
    private List<List<Integer>> sortingTwoPointer(int[] nums){
        List<List<Integer>> sol=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;

        for(int i=0;i<len;i++){
            // Check if already seen to avoid duplicates
            if(i!=0 && nums[i-1]==nums[i])  continue;

            // Check if nums[i]>target, in this case we will only encounter larger elements than target
            // So skip
            if(nums[i]>0)   continue;

            // Two Pointers to search for sum=-nums[i]
            int target=-nums[i];
            int low=i+1;
            int high=len-1;

            while(low<high){
                int currSum=nums[low]+nums[high];

                if(currSum==target){
                    // Triplet found
                    // Add to solution
                    sol.add(Arrays.asList(nums[i], nums[low], nums[high]));

                    // Move both high and low pointers
                    low++;
                    while(low<high && nums[low-1]==nums[low])   low++;
                    while(high>low && high!=(len-1) && nums[high+1]==nums[high]) high--;
                }else if(currSum<target){
                    // Sum less than target, inc low to increase sum
                    low++;
                }else{
                    // Sum greater than target, dec high to decrease sum
                    high--;
                }
            }
        }

        return sol;
    }

    //4. Sorting + Binary Search
    // Time - O(NlogN + N^2*logN) --> O(N^2*logN): Sort the input and use binary search
    // Space - O(1)
    private List<List<Integer>> sortingBinarySearch(int[] nums){
        List<List<Integer>> sol=new ArrayList<>();
        Arrays.sort(nums);
        int len=nums.length;

        for(int i=0;i<len;i++){
            // Check if already seen to avoid duplicates
            if(i!=0 && nums[i-1]==nums[i])  continue;

            // Check if nums[i]>target, in this case we will only encounter larger elements than target
            // So skip
            if(nums[i]>0)   continue;

            // Binary search to search for (-nums[i]-nums[j])
            for(int j=i+1;j<len;j++){

                // Check if already seen to avoid duplicates
                if(j!=(i+1) && nums[j-1]==nums[j])  continue;

                int target=-nums[i]-nums[j];
                int low=j+1;
                int high=len-1;

                while(low<=high){
                    int mid=low+(high-low)/2;

                    if(nums[mid]==target){
                        // Triplet found
                        // Add to solution
                        sol.add(Arrays.asList(nums[i], nums[j], target));
                        break;
                    }else if(nums[mid]<target){
                        // Target greater than mid
                        // Search in right
                        low=mid+1;
                    }else{
                        // Target less than mid
                        // Search in left
                        high=mid-1;
                    }
                }
            }
            
        }

        return sol;
    }

    public List<List<Integer>> threeSum(int[] nums) {
        //return bruteForce(nums);
        //return optimizedBruteForce(nums);
        //return sortingTwoPointer(nums);
        return sortingBinarySearch(nums); 
    }
}