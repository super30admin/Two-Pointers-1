class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
      //TC O(n^2)SC:O(n)
       
        Set<List<Integer>> result= new HashSet<>();
        Arrays.sort(nums);  
        for(int low=0; low<nums.length-2;low++) {
        int mid=low+1;
        int high=nums.length-1;
        while(mid<high){
            if(nums[low]+nums[mid]+nums[high]>0)high--;
            else if(nums[low]+nums[mid]+nums[high]<0)mid++;
            else{
                
            List<Integer> temp= new ArrayList<>();
                temp.add(nums[low]);
                temp.add(nums[mid]);
                temp.add(nums[high]);
                mid++;high--;
            result.add(temp);    
            }

        }
       }
        
            return new ArrayList<>(result);
    }
}
