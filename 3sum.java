//Time Complexity: O(n^2)
//Space Complexity: O(log n) for sorting

import java.util.*;


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ret=new ArrayList<List<Integer>>();
        for(int i=0;i<nums.length-2;i++){
            int main=nums[i]*-1;
            int low=i+1;
            int high=nums.length-1;
            int temp;
            while(high>low){
                if(nums[high]+nums[low]<main){
                    temp=low;
                    while(temp < high && nums[temp]==nums[low])
                        temp++;
                    low=temp;
                }
                else if(nums[high]+nums[low]>main){
                    temp=high;
                    while(temp > i && nums[temp]==nums[high])
                        temp--;
                    high=temp;
                }
                else{
                    List<Integer> l=new ArrayList<>();
                    l.add(main*-1);
                    l.add(nums[low]);
                    l.add(nums[high]);
                    ret.add(l);
                    temp=high;
                    while(temp > i && nums[temp]==nums[high])

                        temp--;
                    high=temp;
                    temp=low;
                    while(temp < high && nums[temp]==nums[low])
                        temp++;
                    low=temp;
                }
            }
            temp=i;
            while(temp < nums.length && nums[temp]==nums[i])
                temp++;
            i=temp-1;
        }
        return ret;
    }
}