//way1:
//Hold one value; Perform hashing on remaing values to get two elements such that the sum of holded value and another two elements from hashing =0.
//tc: o(n^2); sc: o(n)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> ans = new HashSet<>();
        List<String> ansStr=new ArrayList<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int req=0-nums[i];

            helper(nums,i+1,req,ans,nums[i],ansStr);
        }

        return new ArrayList<>(ans);  
    }

    private void helper(int[] nums,int i,int req,Set<List<Integer>> ans,int val,List<String> ansStr){
        // Map<Integer,Integer> map=new HashMap<>();
        Set<Integer> set=new HashSet<>();

        for(int j=i;j<nums.length;j++){
            if(set.contains(req-nums[j])){
                List<Integer> curr=new ArrayList<>();
                int need=req-nums[j];

               // StringBuilder sb=new StringBuilder();
                curr.add(val);
                curr.add(nums[j]);
                curr.add(req-nums[j]);
                Collections.sort(curr);

                // for(int v:curr){
                //      sb.append(v);
                // sb.append(v);
                // sb.append(v);
                // }
                // StringBuilder sb=new StringBuilder();
               

                // System.out.println(sb.toString());
                // System.out.println(curr);

                // if(!(ansStr.contains(sb.toString()))){
                //     ans.add(curr);
                //     ansStr.add(sb.toString());
                // }
                ans.add(curr);
            }else{
                set.add(nums[j]);
            }
        }
    }
}

//way2:
//Sort arrays.. Hold one value and apply two pointer on remaining values to get desired sum
//tc: o(n^2); sc: o(1)
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        int n=nums.length;

        for(int i=0;i<n;i++){
            if(i!=0 && nums[i]==nums[i-1]){
                continue;
            }

            int l=i+1,h=n-1;

            while(l<h){
                int sum=nums[l]+nums[h]+nums[i];

                if(sum==0){
                    List<Integer> curr=new ArrayList<>();
                    //Array is sorted. Need not perform sorting again
                    curr.add(nums[i]);
                    curr.add(nums[l]);
                    curr.add(nums[h]);
                    ans.add(curr);
                    l++;
                    h--;

                    while(l<h && nums[l]==nums[l-1]){
                        l++;
                    }

                    while(l<h && nums[h]==nums[h+1]){
                        h--;
                    }
                }else if(sum<0){
                    l++;
                }else{
                    h--;
                }
            }
        }

        return ans;
    }
}
