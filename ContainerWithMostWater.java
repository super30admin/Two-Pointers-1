public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] arr = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
        ContainerWithMostWater obj = new ContainerWithMostWater();
        int obj1 = obj.water(arr);
        System.out.println("value of height =" + obj1);

    }

    public int water(int[] height) {

        int max = 0;
        int n = height.length;
        int l = 0;
        int r = n - 1;

        while (l <= r) {
            max = Math.max(max, Math.min(height[l], height[r]) * (r - l));

            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;
    }

}