// Time Complexity : O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //Approach3 
        // List<List<Integer>> result = new ArrayList<>();
        // HashMap<Integer,Integer> hm = new HashMap<>();
        // HashSet<List<Integer>> hs = new HashSet<>();
        // int n = nums.length;
        // for(int i=0;i<n-2;i++){
        //     int target = nums[i];
        //     for(int j = i+1;j<n;j++){
        //         int sum = -(target+nums[j]);
        //         if(hm.containsKey(sum) && j!=hm.get(sum)){
        //             List<Integer> tmp = Arrays.asList(nums[i],nums[j],nums[hm.get(sum)]); 
        //             Collections.sort(tmp);
        //             if(!hs.contains(tmp)){
        //                 result.add(tmp);
        //             }
        //             hs.add(tmp);
        //         }
        //         hm.put(nums[j],j);
        //     } 
        //     hm.clear();
        // }
        // return result; 
        
        //Approach2 TC: O(n^2)=O(nlogn+n^2) SC: O(1)
        List<List<Integer>> result = new ArrayList<>();
        if(nums == null || nums.length == 0)return result;
        int n = nums.length;
        Arrays.sort(nums);
        
        for(int i=0;i<n-2;i++){
            if(i!=0 && nums[i]==nums[i-1])continue;
            int low = i+1;
            int high = n-1;
            while(low<high){
                int sum = nums[low]+nums[high]+nums[i];
                if(sum==0){
                    List<Integer> tmp = Arrays.asList(nums[i],nums[low],nums[high]);
                    result.add(tmp);
                    low++;
                    high--;
                    while(low<high && low!=0 && nums[low] == nums[low-1])low++;
                    while(low<high && high!=n-1 &&  nums[high]==nums[high+1])high--;
                }
                else if(sum<0){
                    low++;
                }else{
                    high--;
                }
                
                
            }
        }
        return result;
        
        //Approach1 TLE TC:O(n^3) SC:O(n)
        // List<List<Integer>> result = new ArrayList<>();
        // HashSet<List<Integer>> hs = new HashSet<>();
        // if(nums == null || nums.length == 0)return result;
        // int n = nums.length;
        // for(int i = 0; i<n-2; i++){
        //     for( int j = i+1; j<n-1; j++){
        //         for( int k = j+1; k<n; k++){
        //             if(nums[i]+nums[j]+nums[k]==0){
        //                 List<Integer> tmp = Arrays.asList(nums[i],nums[j],nums[k]);
        //                 Collections.sort(tmp);
        //                 if(!hs.contains(tmp)){
        //                     result.add(tmp);
        //                 }
        //                 hs.add(tmp);
        //             }
        //         }
        //     }
        // }
        // return result;
    }
}