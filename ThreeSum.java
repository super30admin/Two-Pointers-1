// optimal solution
// The time complexity for this solution is O(nlogn + n) and space complexity is O(1)
class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> al = new ArrayList<>();
    if(nums.length == 0)
      return al;
    Arrays.sort(nums);
    for(int i=0;i<nums.length-2;i++){
      int low = i+1;int high = nums.length-1;
      if(i > 0 && nums[i] == nums[i-1]) continue;
      if(nums[i] > 0) break;
      while(low<high){
        if(nums[i]+nums[low]+nums[high] < 0){
          low++;
        }
        else if(nums[i]+nums[low]+nums[high] > 0)
          high--;
        else{
          List<Integer> al1 = new ArrayList<>();
          al1.add(nums[i]);
          al1.add(nums[low]);
          al1.add(nums[high]);
          al.add(al1);
          low++;
          high--;
          while(nums[low] == nums[low-1] && low < nums.length-1) low++;
          while(nums[high] == nums[high+1] && high+1 < nums.length-1) high--;
        }
      }

    }
    return al;
  }
}


// bruteforce solution
// The time complexity for this solution is O(n*n*n) and space complexity is O(1)
class Solution {
  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> al = new ArrayList<>();
    if(nums.length == 0)
      return al;
    for(int i=0;i<nums.length-2;i++){
      for(int j=i+1;j<nums.length-1;j++){
        for(int k=j+1;k<nums.length;k++){
          if(nums[i]+nums[j]+nums[k] == 0){
            List<Integer> al1 = new ArrayList<>();
            al1.add(nums[i]);
            al1.add(nums[j]);
            al1.add(nums[k]);
            Collections.sort(al1);
            if(!al.contains(al1)){
              al.add(al1);
            }
          }

        }
      }
    }
    return al;
  }
}