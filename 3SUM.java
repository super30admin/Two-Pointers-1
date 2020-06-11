/*
    Brute Force Complexity :
        Time Complexity : O(N^3)
        Space Complexity :O(N)
        is worked on leetcode  : NO Time limit Exceeded
    Efficient Approahc:
        Time Complexity : O(N^2)
        space complexity : O(1)
        is worked on leetcode : YES

*/

/*
    Brute Force Solution for 3SUM
*/

public class 3SUM{
    
    public List<List<Integer>> threeSum(int[] nums) {
        if  (nums == null || nums.length == 0){
            return new ArrayList<List<Integer>>();
        }
        int n = nums.length;
        Set<List<Integer>> al = new HashSet<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0;i < n-2;i++){
            for( int j=i+1;j < n-1; j++){
                for(int k = j+1; k< n;k++){
                    if( (nums[i]+nums[j]+nums[k] )== 0){
                         List<Integer> ala = new ArrayList<Integer>();
                         ala.add(nums[i]);
                         ala.add(nums[j]);
                         ala.add(nums[k]);
                         Collections.sort(ala);
                         al.add(ala);
                    }
                }
            }
        }
        return  new ArrayList<List<Integer>>(al);
    }


    /*
        Two pointer Approach

    */
    public List<List<Integer>> threeSum(int[] nums) {
        if  (nums == null || nums.length == 0){
            return new ArrayList<List<Integer>>();
        }
       
        HashSet<List<Integer>> set = new HashSet<>();
        int n = nums.length;
        Arrays.sort(nums);
        for(int i=0;i<n-2;i++){
            int low = i+1;
            int high = n-1;
        
            if(i >0 && nums[i] == nums[i-1]) continue;
            
            if(nums[i] > 0) break;
            
            while(low <high){
                int sum = nums[i] + nums[low] +  nums[high];
                if(sum == 0){
                    ArrayList<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[low]);
                    list.add(nums[high]);
                    Collections.sort(list);
                    set.add(list);
                    low++;
                    high--;
                    while(low < high && nums[low-1] == nums[low]) low++;
                    while(high > 0 && nums[high+1] == nums[high]) high--;
                }else if(sum < 0){
                    low++;
                    while(low < high && nums[low-1] == nums[low]) low++;
                }else{
                    high--;
                while(high > 0 && nums[high+1] == nums[high]) high--;
                }
            }
            
        }
        return new ArrayList<>(set);
    }
}


