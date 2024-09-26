// Time Complexity : O(n^2)n=number of elements in  array . 
// Space Complexity : O(n) n elements stored in hashset .  
// Did this code successfully run on Leetcode :yes. 

// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//just taking the property a[i]+a[k]+a[j]=0 so a[k]=0-a[i]-a[j]  , it means existe one a[k] so that a[k]+a[j]+a[i]=0;
 //   increment c when value is 1.
//Success
//Details 
   public List<List<Integer>> threeSum(int[] nums) {
      Arrays.sort(nums);
      HashSet<List<Integer>> resp = new HashSet<>();
      HashSet<Integer> hSet;
      List<Integer> list;
      for (int i = 0; i < nums.length; i++) {
        hSet = new HashSet();
        for (int j = i + 1; j < nums.length; j++) {
          if (hSet.contains(0 - nums[i] - nums[j])) {
            list = new ArrayList<>();
            list.add(nums[i]);
            list.add(0 - nums[i] - nums[j]);
            list.add(nums[j]);
            resp.add(list);
          }
          hSet.add(nums[j]);
        }
       }
       return new ArrayList(resp);
     }
	 
	 



// Time Complexity : O(n^2)n=number of elements in  array . 
// Space Complexity : O(1) no extra space used.
// Did this code successfully run on Leetcode :yes. 

// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
//Success
//Details 
//Runtime: 18 ms, faster than 89.09% of Java online submissions for 3Sum.
//Memory Usage: 43.6 MB, less than 100.00% of Java online submissions for 3Sum.
public List<List<Integer>> threeSum(int[] nums) {
	if (nums==null || nums.length<=2)
		return new ArrayList<>();
	Arrays.sort(nums);//O(n*log(n)
	int l=0;
	int r=nums.length-1;
	List<List<Integer>> resp= new ArrayList<>();
	for (int i=0;i<nums.length-1;i++){ O(n)
		l=i+1;
        r=nums.length-1;
        if (i>0 && nums[i]==nums[i-1])
            continue;
		while (l<r){ O(n)
			int sum=nums[i]+nums[l]+nums[r];
			if (sum==0){
			   List<Integer> tmpList= Arrays.asList(nums[i],nums[l],nums[r]);
			   resp.add(tmpList);
			   l++;
			   r--;
              while(l<r && nums[l]==nums[l-1])
                  l++;
              
              while(l<r && nums[r]==nums[r+1])
                  r--;
			}else if (sum<0)
				l++;
			else 
				r--;
				
		}
	}
	return resp;
}