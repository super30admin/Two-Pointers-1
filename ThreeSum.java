import java.util.*;

class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        /*
        
        TC: O(nlogn + n^2) -> n^2  n is the length of nums
        SC: O(1)
        
        */
        if(nums==null || nums.length==0) return new ArrayList<>();

        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int low=i+1;
            int high=n-1;

            //eliminating duplicates
            if(i>0 && nums[i]==nums[i-1]) continue;

            // since a+b+c=0 since array is sorted the numbers will be in increasing order so a<b<c so if a > 0 
            //then b & c will also be greater than 0 and we cannot have their sum as 0 therefore we break the loop 
            if(nums[i]>0) break;

            while(low<high){
                int sum=nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer> l=Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(l);
                    low++;
                    high--;

                    while(low<high && nums[low]==nums[low-1]){
                        low++;
                    }
                    while(low<high && nums[high]==nums[high+1]){
                        high--;
                    }
                }
                else if(sum<0){
                    low++;
                }
                else{
                    high--;
                }
            }
        }
        return result;
    }
}