// Time Complexity :O(n^3)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : time limit exceeded

// Your code here along with comments explaining your approach




//Bruteforce

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        HashSet<List<Integer>> set = new HashSet<>();
        List<Integer> arrayList = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++){
            for(int j = i +1; j < nums.length -1 ; j++){
                for( int k = j+1; k < nums.length; k++){
                    if(nums[i] + nums[j] + nums[k] == 0)
                    {
                      List<Integer> list = Arrays.asList(nums[i],nums[j],nums[k]);
                      Collections.sort(list);
                      set.add(list)  ;  
                    }
                    
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}


// Time Complexity :O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : yes

//using sorting and two pointers


int n = nums.length;
        if(nums == null ||n < 3)
            return new ArrayList<>();
        List<List<Integer>> list = new ArrayList<>();
       
        Arrays.sort(nums);
        for(int i = 0; i < n-2; i++){
            
            if(nums[i] > 0)
                break;
            if(i > 0 && nums[i] == nums[i-1]) continue;
            int low = i + 1;
            int high = n - 1;     
            while(low < high){
                int sum = nums[low] + nums[high] + nums[i];
                if(sum == 0){
                    List<Integer> arrayList = Arrays.asList(nums[i],nums[low],nums[high]);
                    list.add(arrayList);
                    low++;high--;
                    while(low < high && nums[low] == nums[low-1]) {
                        low++;
                    }
                    while(low < high && nums[high] == nums[high+1]){
                        high--;
                    }
                }    
               else if(low < high && sum < 0)
                   low++;
               else
                   high--;
            }
             
        }
        
        return list;
		
		
// Time Complexity :O(n^2)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : yes	
//Using Hashset
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int n = nums.length;
        if(nums == null || n < 3)
            return new ArrayList<>();
       
        HashSet<List<Integer>> list = new HashSet<>();
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i = 0; i < n - 2; i++){
            if(i > 0 && nums[i] == nums[i-1])
                continue;
            int target = 0 - nums[i];
            set = new HashSet<>();
            
           for(int j = i+1; j < nums.length; j++){
               int compliment = target - nums[j];
               if(set.contains(compliment))
               {
                   List<Integer> li = Arrays.asList(nums[i],nums[j],compliment);
                   Collections.sort(li);
                   list.add(li);
                   
               }
               set.add(nums[j]);
           }    
        }
        
        return new ArrayList<>(list);
    }
}		
		
