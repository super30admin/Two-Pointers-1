class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        ArrayList<List<Integer>> ll= new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        int i; int j;
        for(int k=0;k<nums.length-2;k++){
            if(k!=0 && nums[k]==nums[k-1]) continue;
            i=k+1;  j=nums.length-1;
           while(i<j){
            if(nums[i]+nums[j]+nums[k]==0 && i!=j && j!=k && i!=k ){
            List<Integer> l= Arrays.asList(nums[i],nums[j], nums[k]);
                ll.add(l);
                j--; i++;
                while(i<j && nums[i]== nums[i-1]) i++;
                while(i<j && nums[j]== nums[j+1]) j--;
            }
             else if(i<j && nums[i]+nums[j]+nums[k]<0) i++;
             else j--;
        } 
        }
        
       return ll; 
    }
}

