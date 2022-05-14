//Time Complexity: O(n)
//Space Complexity: O(1)


public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] water = new int[]{1,8,6,2,5,4,8,3,7};
        int result = calculateMaxWater(water);
        System.out.println("Container with Most Water: "+result);
    }

    private static int calculateMaxWater(int[] water){

        //null case

        if(water == null || water.length ==0){
            return 0;
        }

        int left =0;
        int right = water.length-1;
        int max=0;
        int start =0;
        int end=0;

        while(left<=right){

            int curr = Math.min(water[left],water[right])*(right-left);

            if(curr>max){
                start=left;
                end=right;
                max=curr;
            }
            if(water[left]<=water[right]){
                left++;
            }else{
                right--;;
            }
        }
        System.out.println("Start Idnex: "+start);
        System.out.println("End Idnex: "+end);
        return max;
    }
}
