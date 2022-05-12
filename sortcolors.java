class Solution {
    public void sortColors(int[] nums) {
        HashMap<Integer,Integer>map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }
            else{
                map.put(nums[i],1);
            }
        }
        int j=0;
        for(int i=0;i<3;i++){
            if(map.containsKey(i)){
                int count = map.get(i);
                while(count>0){
                    nums[j] = i;
                    j++;count--;
                }
            }
        }
    }
}