public class SortColors {
    public static void main(String[] args) {
        sortColors(new int[]{2,0,1});
    }

    public static void sortColors(int[] nums) {
        int l=0;
        int h=nums.length-1;
        int m=0;
        while(m<=h){
            if(nums[m]==1){
                m++;
            }
            else if(nums[m]==0){
                swap(nums,m,l);
                m++;
                l++;
            }
            else{
                swap(nums,m,h);
                h--;

            }
        }
    }
    private static void swap(int[] nums,int m,int b){
        int temp=nums[m];
        nums[m]=nums[b];
        nums[b]=temp;

    }

}
