import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//TC On2 SC O(1)
class threeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> list=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }
            int l=i+1;
            int h=nums.length-1;
            if(nums[i]>0){
                break;
            }
            while(l<h){
                int curSum=nums[i]+nums[l]+nums[h];
                if(curSum==0){
                    list.add(Arrays.asList(nums[i],nums[l],nums[h]));
                    // System.out.println(list);
                    l++;
                    h--;
                    while(l<h && nums[l]==nums[l-1]){
                        l++;
                    }  while(l<h && nums[h]==nums[h+1]){
                        h--;
                    }
                }else if(curSum>0){
                    h--;
                }else{
                    l++;
                }
            }

        }

        return list;
    }
}