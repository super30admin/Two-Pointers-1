//TIme Complexity: O(N^2)+O(nlog(n))==> O(N^2)
//Space Complexity:O(1)

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null || nums.length==0 ||nums.length<3){
            return new ArrayList<>();
        }
        List<List<Integer>> result=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0)
                break;
            if((i!=0) && (nums[i]==nums[i-1]))
                continue; 
            int low=i+1;
            int high=nums.length-1;
            while(low<high){
                int a=nums[i];
                int b=nums[low];
                int c=nums[high];
                if(a+b+c==0){
                    List<Integer> temp =Arrays.asList(a,b,c);
                    result.add(temp);
                    low++;high--;
                    while(low<high && nums[low]==nums[low-1]) low++;
                    while(low<high && nums[high]==nums[high+1]) high--;
                }
                else if(a+b+c>0){
                    high--;
                }
                else{
                    low++;
                }
            }
        }
        return result;
    }
}
//TIme Complexity: O(N^3)
//Space Complexity:O(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums==null|| nums.length<3){
            return new ArrayList<>();
        }
        HashSet<List<Integer>> set=new HashSet<List<Integer>>();
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                for(int k=j+1;k<nums.length;k++){
                    if(nums[i]+nums[j]+nums[k]==0){
                        List<Integer> ar=Arrays.asList(nums[i],nums[j],nums[k]);
                        Collections.sort(ar);
                        set.add(ar);
                    }
                }
            }
        }
        return new ArrayList<List<Integer>>(set);
         
    }
}