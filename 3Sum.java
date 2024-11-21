class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       
       Arrays.sort(nums);
        List<List<Integer>> l = new ArrayList<>();
       int high=0;
       int low=0;
       int d=0;
        for(int i=0;i<nums.length-2;i++){
          if(i>0 && nums[i]==nums[i-1])
          continue;
          
          low=i+1;
          high=nums.length-1;
          d=-1*nums[i];
          while(low<high){
           int sum=nums[low]+nums[high];
          if(sum==d){
             l.add(Arrays.asList(nums[i],nums[low],nums[high]));
          
          while (low < high && nums[low] == nums[low + 1]) low++;
          while (low < high && nums[high] == nums[high - 1]) high--;
                    
          low++;
          high--;
          }
          else if(sum<d){
            low++;
          }else if (sum>d){
            high--;
          } 
          
        }
        }
        return l;
        }
    }
