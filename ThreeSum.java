import java.util.*;
class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> result = new ArrayList<>();
        if(nums==null || nums.length<3)
        return result;
        Arrays.sort(nums);
        int l=0;
        int r=n-1;
        int target=0;
        for(int i=0;i<n-2;i++)
        {
            if(nums[i] > 0)
            break;
            l=i+1;
            r=n-1;
            if(i-1>=0)
            {
                if(nums[i]==nums[i-1])
                {
                    continue;
                }
            }
            while(l<r)
            {
                int cur =nums[i]+nums[l]+nums[r];
                if(cur ==0){
                    List<Integer> res = Arrays.asList(nums[i],nums[l],nums[r]);
                    result.add(res);
                    l++;
                    r--;
                    while(l < r && nums[l] == nums[l-1])
                    l++;
                    while(l < r && nums[r] == nums[r+1])
                    r--;
                }
                else if(cur > 0){
                    r--;
                }
                else{
                    l++;
                }
            }
        }
        return result;
    }
}

//tc: O(n^2)
//sc: O(1)