// Time Complexity:           O(n)
// Space Complexity:          O(1)
// where n is length of array
// Yes, this code ran successfully
// No, I didn't face any problem in this problem statement

public class ContainerWithMostWater {
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater cwmw = new ContainerWithMostWater();
        System.out.println("Maximum water contained: "+cwmw.maxArea(nums));
    }
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;

        int area = Math.min(height[i],height[j])*(j-i);

        while(i<j)
        {
            area = Math.max(area,Math.min(height[i],height[j])*(j-i));              // Updating area along with maximizing it

            if(height[i]<height[j])                                                 // reducing scope on lower height side
                i++;
            else
                j--;
        }
        return area;
    }
}
