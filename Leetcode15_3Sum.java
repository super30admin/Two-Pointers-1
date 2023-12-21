//b-F three loop approach
//TC - O(n^3)
//sc - O(n) - we use Hashset to determine unique solution


class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums == null || nums.length <3) return new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        
        for(int i =0; i< nums.length -2; i++)
        {
            for( int j= i+1; j< nums.length -1 ; j++)
            {
                for(int k =j+1; k<nums.length; k++)
                {
                    if(nums[i] + nums[j] +nums[k] == 0)
                    {
                         List<Integer> temp  = new ArrayList<>();
                         temp.add(nums[i]);
                         temp.add(nums[j]);
                         temp.add(nums[k]);
                         Collections.sort(temp);
                         if(!set.contains(temp))
                         {
                             set.add(temp);
                             result.add(temp);
                         }
                        
                    }
                        
                }
            }
        }
        return result;
    }
}


//Optimized Approach- 
//sort the array
// Take one loop for nums[i], and for j and k, take two pointer and follow two sum approach. 
//if nums[i-1] == nums[i] , that means we'll get the same solution, so we just move on and dont cosider that. 
//thhis way we dont need set and can save on space. 
// TC- O(n^2)+ O(n log n ) sorting! = O(n^2) bigger term
//SC- O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        if(nums == null || nums.length < 3) return new ArrayList<>();
        
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
		
		int i=0;
		int j,k;
		//outer loop containing one value all time. 
		while(nums[i] < 1 && i < nums.length)
		{
			j = i + 1;
			k = nums.length - 1;
			
			while(j < k)
			{
				if(nums[i]+nums[j]+nums[k] == 0)
				{
					List<Integer> list = new ArrayList<>();
					list.add(i);
					list.add(j);
					list.add(k);
					result.add(list);
					
					j++;
					k--;
					
					while(j <k && num[j-1] = nums[j]) j++;
					while(j <k && num[k+1] = nums[k]) k--;
				}
				else if(nums[i]+nums[j]+nums[k] < 0)
				{
					j++;
					//while(j<k  && nums[j-1] == nums[j]) j++; //we can also use this loop here to optimize more

				}
				else{
					k--;
					//while(j<k  && nums[k] == nums[k+1]) k--; //we can also use this loop here to optimize more
					
				}
			}
			i++;
			while(i < nums.length && num[i-1] = nums[i]) i++; //dont need to put 0 check here as it always will be i++ before coing to this while loop
		}
		return result;
	}
}



