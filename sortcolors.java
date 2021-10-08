//Time Complexity : O(N);
//Space Complexity :O(1);




// class Solution {
//     public void sortColors(int[] nums) {
//         inserstion(nums);
//     }

//     public void inserstion(int[] nums){

//         for(int i = 0 ; i<nums.length - 1 ; i++){
//             for(int j = i+1 ; j>0 ; j--){
//                 if(nums[j-1] > nums[j]){
//                     swap(nums,j-1,j);
//                 }
//             }
//         }
//     }

//     public void swap(int[] arr ,int e1 , int e2){
//         int temp = arr[e1];
//         arr[e1] = arr[e2];
//         arr[e2] = temp ;
//     }
// }

// class Solution {
//     public void sortColors(int[] nums) {
//         if (nums == null || nums.length <= 1) return;

//         int redIdx = 0,
//             whiteIdx = 0,
//             blueIdx = nums.length;

//         while (whiteIdx < blueIdx) {
//             int compare = Integer.compare(nums[whiteIdx], 1);
//             if (compare < 0) {
//                 swap(nums, redIdx++, whiteIdx++);
//             } else if (compare == 0) {
//                 whiteIdx++;
//             } else {
//                 swap(nums, whiteIdx, --blueIdx);
//             }
//         }
//     }

//     private void swap(int[] nums, int i, int j) {
//         int temp = nums[i];
//         nums[i] = nums[j];
//         nums[j] = temp;
//     }
// }

class Solution {
    public void sortColors(int[] a) {
        int n=a.length;
        int zeroPos=0,twoPos=n-1,i=0;
        while(i<=twoPos)
        {
            if(a[i]==0)
            {
                int temp=a[zeroPos];
                a[zeroPos]=0;
                a[i]=temp;
                zeroPos++;
                i++;
            }
            else if(a[i]==2)
            {
                int temp=a[twoPos];
                a[twoPos]=2;
                a[i]=temp;
                twoPos--;
            }
            else
                i++;
        }
    }
}

