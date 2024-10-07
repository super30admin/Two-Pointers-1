

// first brute force we will check every combination in 2 for loops like if
// j starts from 1 i starts from 0
// (height[i] < height[j]) max(max,height[i]* j-1)
//TC O(n^2)

// with 2 pointer approach
//we will keep 2 pointers and keep track for max TC-O(n) SC -O(1)

// if we have nested loops we can go with 2 pointers

public class ContainerWithMostWater {
    public int MaxArea(int[] height) {
        int maxArea = 0;
        int first = 0;
        int last = height.length - 1;

        while(first < last)
        {
            if(height[first] < height[last])
            {
                maxArea = Math.max(maxArea, height[first]*(last - first));
                first += 1;
            }
            else
            {
                maxArea = Math.max(maxArea, height[last]*(last - first));
                last -= 1;   
            }
        }
        return maxArea;
    }


    public static void main(String[] args) {
        ContainerWithMostWater p = new ContainerWithMostWater();
        int[] arr = new int[]{1,8,6,2,5,4,8,3,7};
        int ans = p.MaxArea(arr);
        System.out.println(ans);
    }
}