//Accepted on LT
//Fix a index and run 2 sum on left over array by using 2 pointer
//Time is not sure but looks like O(n2) space is O(n)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i==0 || nums[i]!=nums[i-1]){
                
            
                int low=i+1;
                int high = nums.length-1;
                while(low<high){
                    int diff = -nums[i];//+1
                    int sum = nums[low] + nums[high];//0
                    int check = sum-diff;//-1
                    if(check==0){
                        List<Integer> l = new ArrayList<>();
                        l.add(nums[i]);
                        l.add(nums[low]);
                        l.add(nums[high]);
                        li.add(l);
                        low++;
                        high--;
                        while(low<high && nums[low]==nums[low-1]){
                            low++;
                        }
                        while(low<high && nums[high]==nums[high+1]){
                            high--;
                        }
                      
                    }   
                    else if(check<0){
                        low++;
                    }
                    else{
                        high--;
                    }

                }
            }
            

            

        }
        return li;

        
    }
}