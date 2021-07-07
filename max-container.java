// Time Complexity : O(N)
// Space Complexity :   O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


class Main{
  public static void main(String []args){
    int []height={1,8,6,2,5,4,8,3,7};
    System.out.println("The max container could hold is : "+findMax(height));
  }
  private static int findMax(int []height){
    if(height==null || height.length<2){
      return 0;
    }
    int n=height.length; int low=0; int high=n-1; int max=0;
    while(low<high){
      int current=(high - low) * Math.min(height[low], height[high]);
      max=Math.max(max, current);
      if(height[low]<=height[high]){
        low++;
      }else{
        high--;
      }
    }
    return max;
  }
}