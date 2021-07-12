import java.util.*;
public class ThreeSum {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            HashSet<List<Integer>> set = new HashSet<>();
            for(int i=0;i<nums.length-2;i++){
                int j=i+1;
                int k=nums.length-1;
                int sum =0;
                while(j<k){
                    sum = nums[i]+nums[j]+nums[k];
                    if(sum==0){
                        set.add(Arrays.asList(nums[i],nums[j],nums[k]));
                        j++;
                        k--;
                    }else if(sum<0){
                        j++;
                    }else{
                        k--;
                    }
                }
            }
            return new ArrayList<>(set);
        }
        public static void main(String[] args){
            ThreeSum t = new ThreeSum();
            int [] nums = {-1,0,1,2,-1,-4};
            List<List<Integer>> outPut = t.threeSum(nums);
            System.out.print(outPut);
        }
}
