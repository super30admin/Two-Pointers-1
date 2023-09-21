import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

class Sample{
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null||nums.length<3){
            return new ArrayList<>();
        }
        HashSet<List<Integer>> set=new HashSet<>();
        List<List<Integer>>result=new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int k=j+1;k<n;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer>temp=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(temp);
                        if(!set.contains(temp)){
                            set.add(temp);
                            result.add(temp);
                        }
                    }
                }
            }
        }
        return result;
    }
}