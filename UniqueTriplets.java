//Problem 35 : Unique Triples : 3Sum 
// Time Complexity : O(n^2)
// Space Complexity : O(1);
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :No


// Your code here along with comments explaining your approach
/*
  Optimized : Using Two pointers(Note: Think when array is sorted and two pointers used for finding pairs equivalent to target sum). Here, if sum==target, move both low and high pointers. If sum<target, increment low pointer. Otherwise, if sum>target decrement the high pointer.
  Here instead of two pointers we can implement Hashing or Binary Search. Hashing Compexity will be same as two pointers i.e O(n^2), but will be using extra space which is O(n). In case of binary search the time complexity is going to be n * nlogn=> n^2*logn.
  For binary search also we will not be using extra space, but its time complexity is more in comparison to two pointers+  
  Brute Force: As sum needs to be calculated from 3 elements, so just iterated over i+(i+1)+(i+2) and if sum equals to zero then just added it to the result list.
  Note: As there are duplicate elements and result should be unique, so first I sorted the array and then if (i>0 and nums[i]==nums[i-1]), which means current element is similar to the previous one, then I skipped iteration for that index. Similar logic I wrote for j and k as well 
   
*/

import java.util.*;
class Solution35 {
    public List<List<Integer>> threeSum(int[] nums) {
        
        List<List<Integer>> res = new ArrayList<>(); 
        if(nums==null || nums.length==0){
               return res;
        }

        //Optimized
        //TC-> nLogn+n*n=>n^2 | SC-O(1)
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length-2;i++){
            
            if(nums[i]>0) break; // because array is sorted and thus sum will never be 0 when element is +ve
            
            if(i>0 && nums[i]==nums[i-1]) continue;//duplicates outside
            
            int low  = i+1;
            int high = nums.length-1;
                 
             while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                 
                if(sum==0){
                    List<Integer> li = Arrays.asList(nums[i],nums[low],nums[high]);
                    res.add(li);
                    low++;
                    high--;
                    
                    while(low<high && nums[low]==nums[low-1]) low++;//for ignoring duplicate values while calculating sum
                    while(low<high && nums[high]==nums[high+1]) high--;//for ignoring duplicate values while calculating sum
                    
                }else if(sum<0){
                    low++;
                }else{//sum>0
                    high--;
                } 
                 
             }
        }
        
        return res;
        

        //Brute Force- Without Sorting
        /* TC-O(n^3), SC-O(N) for creating set
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if((nums[i]+nums[j]+nums[k])==0){
                        
                        List<Integer> li = Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(li);//as it is of 3 numbers always it is fixed.will not add this for calculating complexity 
                        if(!set.contains(li)){
                           res.add(li);
                           set.add(li); 
                        }
                        
                    }
                    
                }
            }
            return res;
        }*/

        //Brute Force- With Sorting
        /* TC- O(nLogn) + O(n^3) => O(n^3) | SC- O(1)
        Arrays.sort(nums);
        
        for(int i=0;i<nums.length;i++){
             if(i>0 && nums[i]==nums[i-1]) continue;
            for(int j=i+1;j<nums.length;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;
                for(int k=j+1;k<nums.length;k++){
                    if(k>j+1 && nums[k]==nums[k-1]) continue;
                    if((nums[i]+nums[j]+nums[k])==0){
                        res.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    }
                    
                }
            }
        }*/
        
        return res;
    }
}