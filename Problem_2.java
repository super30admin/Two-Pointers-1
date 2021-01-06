// Time Complexity :O(n^3)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :NO(TLE)
// Any problem you faced while coding this :


// Below is the brute force solution for the the three sum.In this we take the the hashset of list to ignore the duolicate the values.

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<List<Integer>> hash=new HashSet<List<Integer>>();
        if(nums.length==0 || nums==null){return list;};
        // Arrays.sort(nums);
        // System.out.println(Arrays.toString(nums));
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> li=new ArrayList<>();
                        li.add(nums[i]);
                        li.add(nums[j]);
                        li.add(nums[k]);
                        Collections.sort(li);
                        hash.add(li);
                        //System.out.println(li);
                    }
                }
            }
        }
        for(List<Integer> inter:hash){
            list.add(inter);
        }
        return list;
        
    }
}

// Time Complexity :O(nlogn)
// Space Complexity :O(n)
// Did this code successfully run on Leetcode :Yes
// Any problem you faced while coding this :


// In this we use the three pointer approach.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        HashSet<List<Integer>> hash=new HashSet<List<Integer>>();
		int j=0;
		int k=0;
        Arrays.sort(nums);
		for(int i=0;i<nums.length-2;i++) {
			j=i+1;
			k=nums.length-1;
			while(j<k) {
				if(nums[i]+nums[j]+nums[k]<0) {
					j=j+1;
				}else if(nums[i]+nums[j]+nums[k]>0) {
					k=k-1;
				}else {
					//System.out.println(nums[i]+","+nums[j]+","+nums[k]);
                    List<Integer> li=new ArrayList<>();
                    li.add(nums[i]);
                    li.add(nums[j]);
                    li.add(nums[k]);
                    Collections.sort(li);
                    hash.add(li);
					j=j+1;
					k=k-1;
				}
			}
		}
        for(List<Integer> value:hash){
            list.add(value);
        }
		return list;
        
    }
}

