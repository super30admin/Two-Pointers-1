// Time Complexity :o(n^3)
// Space Complexity :O()
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        List<List<Integer>> result=new ArrayList<>();
        HashSet<List<Integer>> mySet=new  HashSet<>();
        for(int i=0;i<n-2;i++){ //O(n)
             for(int j=i+1;j<n-1;j++){//O(n)
             for(int k=j+1;k<n;k++){//O(n)
                int current = nums[i]+nums[j]+nums[k];
                if(current == 0){
                    List<Integer> triplex = Arrays.asList(nums[i],nums[j],nums[k]);
                      Collections.sort(triplex);
                      mySet.add(triplex);
                }
        }
        }
        }
        for(List<Integer> triple:mySet){
            result.add(triple);
        }
        return result;
    }
}


// Time Complexity :o(n^2)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach



class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        int target=0;
        int complement=0;
        HashSet<List<Integer>> result=new HashSet<>();
        if (nums==null || nums.length==0) return new ArrayList<>();
           if(n==3){
                if(nums[0]+nums[1]+nums[2] == 0){
                     List<Integer> triplex = Arrays.asList(nums[0],nums[1],nums[2]);
                      Collections.sort(triplex);
                      result.add(triplex);
                }
                return new ArrayList(result);
            }
        for(int i=0;i<n-2;i++){
           HashSet<Integer> mySet1=new  HashSet<>();
       
             target=0-nums[i];
            for(int j=i+1;j<n;j++){
                 complement = target-nums[j];
                   if(mySet1.contains(complement)){
                    List<Integer> triplex = Arrays.asList(nums[i],complement,nums[j]);
                      Collections.sort(triplex);
                        result.add(triplex);
                }else{
                   mySet1.add(nums[j]);
                }
        }
        }
         
        
        
      return new ArrayList(result);
    }
}



// Time Complexity :o(nlogn)+O(n)=> O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// Your code here along with comments explaining your approach:i have implemented this using sorting and two pointers concept to avoid extra space and to reduce the time complexity.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n=nums.length;
        int target=0;
       HashSet<List<Integer>> result=new HashSet<>();
        Arrays.sort(nums);
        if (nums==null || nums.length==0) return new ArrayList<>();
           if(n==3){
                if(nums[0]+nums[1]+nums[2] == 0){
                     List<Integer> triplex = Arrays.asList(nums[0],nums[1],nums[2]);
                     result.add(triplex);
                }
                return new ArrayList(result);
            }
        for(int i=0;i<n-2;i++){
           int l=i+1;
           int r=n-1;
           if(nums[i] > 0) break;
           if(i> 0 && nums[i] == nums[i-1])continue;
            while(l<r){
                 int current =nums[i]+nums[l]+nums[r];
                 if(current == 0){
                   List<Integer> triplex = Arrays.asList(nums[i],nums[l],nums[r]);
                      result.add(triplex);
                      l++;
                      r--;
                        while(l<r && nums[r] == nums[i+1]){
                     r--;
                    }
                      while(l<r && nums[l] == nums[l-1]){
                        l++;
                    }
                 }else if(current > target){
                    r--;
                 }else{
                    l++;
                      }
        }
        }
         
        
        
      return new ArrayList(result);
    }
}