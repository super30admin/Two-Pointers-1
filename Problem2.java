//space complexity : o(1)
//time complexity :o(n2)
public class Problem2 {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null ||nums.length==0){
            return new ArrayList<>();
        }  
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i>0 &&  nums[i]==nums[i-1]){continue;}

            int low=i+1;
            int high= nums.length-1;
            while(low<high){
                int sum = nums[i]+nums[low]+nums[high];
                
                if(sum==0){
                    List<Integer> list =Arrays.asList(nums[low],nums[i],nums[high]);
                    result.add(list);
                    low++;
                    high--;
                    while(low<high && nums[low]==nums[low-1]){
                        low++;    
                    }
                     while(low<high && nums[high]==nums[high+1]){
                        high--;    
                    }
                    
                }else if(sum>0){
                    
                    high--;
                    
                }else{
                    low++;
                }
            }
        }
        return result;
    }
}
