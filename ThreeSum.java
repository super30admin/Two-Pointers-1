//TC O(n*n)
//SC O(1)
// works in leetcode
public class ThreeSum {

    //Use two pointers by sorting the  nums first
    //left pointer go right if sum left than target
    //right pointer go left if sum is greater than target
    public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int x =0;


        while(x < n){

            int l = x+1;
            int r = n-1;

            while(l < r){
                int sum = nums[x] + nums[l] + nums[r];

                if(sum ==0){
                    result.add(Arrays.asList(nums[x] , nums[l] , nums[r]));
                }

                if(sum <= 0){
                    l++;
                    while(l < r && nums[l]==nums[l-1]) l++;
                }
                else{
                    r--;
                    while(l < r && nums[r]==nums[r+1]) r--;
                }

            }
            x++;
            while(x < n && nums[x]== nums[x-1]) x++;

        }

        return result;

    }

    public static void main(String [] args){
        int [] nums = { -1,0,1,2,-1,-4  };

        List<List<Integer>> result=  threeSum(nums);

        System.out.println( result);

    }
}