// time complexity:O(n)
//space complexity:O(1)
public class sort {
        public void sortColors(int[] nums)
        {
            if(nums==null || nums.length==0)
            {
                return;
            }
            int n=nums.length;
            int left=0;     // considering left will hold 0 right will 2 and mid will 1
            int right=n-1;
            int mid=0;
            while(mid<=right)
            {
                if(nums[mid]==2)
                {
                    swap(nums,mid,right);
                    right--;
                }
                else if(nums[mid]==0)
                {
                    swap(nums,mid,left);
                    left++;
                    mid++;
                }
                else
                {
                    mid++;
                }
            }
        }
        public void swap(int[]nums,int i, int j) {
            int temp;
            temp = nums[i];
            nums[i] = nums[j];
            nums[j] = temp;
        }
        public static void main(String[] args)
        {
            sort s= new sort();
            int[] nums={2,0,2,1,1,0};
            s.sortColors(nums);
            for(int i=0;i<nums.length;i++)
            {
                System.out.print(nums[i]);
            }
        }
    }

