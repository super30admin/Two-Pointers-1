//3 Steps : 
	// Time Complexity : 2 pass more than it will be O(N^2)
	// Space Complexity : O(no of colors)
	// Did this code successfully run on Leetcode : Y
	// Any problem you faced while coding this : No



class Solution {
    public void sortColors(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap<>();
	        for(int i:nums) {
	            map.put(i,map.getOrDefault(i,0)+1);
	        }
	        int ind = 0;
	        for (Integer value : map.keySet()) {
	            
	             if(map.containsKey(0) && map.get(0) != 0){
	                 while(map.get(0) != 0){
		            	 nums[ind++] = 0;
		                 map.put(0,map.get(0)-1);
	                 }
	             }else if(map.containsKey(1) && map.get(1) != 0){
	            	 while(map.get(1) != 0){
		            	 nums[ind++] = 1;
		                 map.put(1,map.get(1)-1);
	                 }
	             }else if(map.containsKey(2) && map.get(2) != 0){
	            	 while(map.get(2) != 0){
		            	 nums[ind++] = 2;
		                 map.put(2,map.get(2)-1);
	                 }
	             }
	        }
    }
}
