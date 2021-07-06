public class Sort_Colors{

    /*
        Approach 1: Counting Sort

            Time Complexity : O(N)
            Space Complexity : O(1)
            is worked on leetcode : YES

    */
    public void sortColors(int[] nums) {
        //             
        if (nums == null || nums.length == 0) return ;
        int ones = 0;
        int twos = 0;
        int zeros = 0;
        // count all the zeros onesand twos and then put it in array in second pass
        for(int num : nums){
            if(num == 0){
                zeros++;
            }else if(num == 1){
                ones++;
            }else{
                twos++;
            }
        }
        
        int j=0;
        for(int i=0;i<zeros;i++){
            nums[j] = 0;
            j++;
        }
        for(int i=0;i<ones;i++){
            nums[j] = 1;
            j++;
        }
        for(int i=0;i<twos;i++){
            nums[j] = 2;
            j++;
        }        
    }

    public void sortColors_Using_auxArray(int[] nums) {
        //             
        if (nums == null || nums.length == 0) return ;
        int [] res =  new int[nums.length];
        // initialize result array with -1 for handling 1 case later
        for(int i=0;i<res.length;i++){
            res[i] =-1;
        }
        // put all zeros from left end and all 2s from right end 
        //  and then put all the ones in next iteration 
        int low = 0;
        int high = nums.length -1;
        for(int i=0;i< nums.length;i++){
            if(nums[i] > 1){
                res[high] = nums[i];
                high--;
            }
            if(nums[i] < 1){
                res[low] = nums[i];
                low++;
            }
        }
        
        for(int i=0;i<nums.length;i++){
            if(res[i] == -1) res[i] = 1;
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = res[i];
        }
    }

    public void swap(int []arr, int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp; 
    }
    /*
        Three pointer Approach
        Leetcode completed :  YES
        Time complexity : O(n)
        Space Complexity : O(1)
    */
    public void sortColors_using_Three_pointer(int[] nums) {
//             
        if (nums == null || nums.length == 0) return ;
        int mid = 0;
        int start  = 0;
        int end = nums.length -1;
        
        while(mid <= end){

            //  if element is zero swap 
            if(nums[mid] == 0 ){
                swap(nums,start,mid); 
                start++;
                mid++;
            }
            else if(nums[mid] == 2){
                swap(nums,mid,end);
                end--;
            }else{
                mid++;
            }
        }
    }
    
}

