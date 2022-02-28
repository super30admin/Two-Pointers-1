1)Sort Colors
class Solution {
   
    public void sortColors(int[] nums) {
    int a=0;
    int b=0;
    int c=nums.length-1;
        while(b<=c){
            if(nums[b]==2){
                swap(nums,b,c);
                c=c-1;
            }
            else if(nums[b]==1){
                b=b+1;
            }
            else{
                swap(nums,a,b);
                    a=a+1;
                    b=b+1;
            }
        }
    }
        public void swap(int[] nums,int x, int y){
            int z=nums[x];
            nums[x]=nums[y];
            nums[y]=z;
        }
        
    }
