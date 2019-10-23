class Solution {
    public void sortColors(int[] nums) {
        
    Map<Integer,Integer> map = new HashMap<>();
    
    for(int i : nums){
        map.put(i,map.getOrDefault(i,0)+1);
    }
    int index=0;
 
    for(int j : map.keySet()){
        for(int i=0;i<map.get(j);i++ ){
            nums[index]=j;
            index++;
        }
    }
    }
}
