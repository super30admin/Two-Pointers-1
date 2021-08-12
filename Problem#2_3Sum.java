class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        //base case
        if(nums==null || nums.length ==0){
            return new ArrayList<>();
        }
        
        //Logic
        List<List<Integer>> result = new ArrayList();
        Arrays.sort(nums);
        int sum = 0;
        int n = nums.length;

        // Loop with every point as pivot - 0 to n-2
        // Collections.sort(numss);
        for(int i=0; i<nums.length; i++){
            if(i!=0 && nums[i]==nums[i-1]) continue;
            int low = i+1, high = nums.length-1;
            while(low<high){
                sum = nums[i]+nums[low]+nums[high];
                if(sum==0){
                    List<Integer> li = Arrays.asList(nums[i], nums[low], nums[high]);
                    result.add(li);
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
