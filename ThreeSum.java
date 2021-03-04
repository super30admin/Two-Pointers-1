//Time Complexity: O(n^2)
//Space complexity: (1)
//executed on leet code.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums.length<3) return new ArrayList<List<Integer>>();
        
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++)
        {
            if(nums[i]>0) break;
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int l = i+1, h = nums.length-1;                  //After sorting checking all possible sums that are equal to 0.
            while(l<h)
            {
                int sum = nums[i]+nums[l]+nums[h];          // For every element we take a 2 pointers one from the next of that element and other from last of the array. on finding sum adds three elements to the list.
                if(sum==0)
                {
                    List<Integer> list = Arrays.asList(nums[i],nums[l],nums[h]);
                    result.add(list);
                    l++;
                    h--;
                    while(l<h && nums[l-1]==nums[l]) l++;       //if sum is less than 0 increment first pointer untill a new element is found. If sum is over 0 decrement second pointer.
                    while(l<h && nums[h]==nums[h+1]) h--; 
                    
                }
                else if(sum<0)
                {
                    l++;
                    
                }
                else
                {
                    h--;
                    //while(l<h && nums[h+1]==nums[h]) h--;
                }
            }
        }
        return result;
    }
}