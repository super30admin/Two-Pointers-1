// time complexity = O(N2) + O(NlogN) + O(logN) => O(N2)
// space complexity = O(1)
// compiled properly in leetcode but I'm facing problem with end case scenario, unable to debugg
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
    //[-4,-1,-1,0,1,2]
        for (int i=0;i<nums.length;i++){
            for (int j=i+1 ; j< nums.length ; j++){
                int k = nums[i]+nums[j];
                // I'm facing problem in the below line in i+j+1, I'm unable to understand what is wrong
                int m = binarySearch(nums,i+j+1,nums.length-1, -k);
                if (m != -1){
                    List<Integer> temp = Arrays.asList(nums[i],nums[j],nums[m]);
                    Collections.sort(temp);
                    if (!set.contains(temp)){
                        set.add(temp);
                        result.add(temp);
                    }
                    
                    
                }
                
            } 
        } return result;
         
    }
    private int binarySearch(int[] arr,int l,int h , int x){
        //index of low [0], index of high[nums.length], value of x
        // [-1,0,1,2,-1,-4]
        if(h>=l){
            int mid = l + (h-l)/2;
        if ( arr[mid]==x){
            return mid;
        }else if (  x < arr[mid]  ){
            
            return binarySearch(arr,l,mid-1,x);
        }else return binarySearch(arr,mid+1,h,x);
        
        }return -1;
        
        
    }
}
