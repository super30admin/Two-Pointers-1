

/**
    Approach: Two Pointinter

        Working:
        Declare
        variable maxArea = 0
        2 pointers
        i -> 0 //starting of the
        j -> length of the array - 1
        when i < j
        calculate area with
                length = minimum of value in i and j
                breadth = j - i
                area = length * breadth

                calculate maxArea = max(maxArea , area)

                if value in i <= j
                decrement i pointer
                else
                decrement j pointer

                return maxArea

    Time Complexity: O(n)
    Space Complexity: O(1)

*/


class ContainerWithMostWater {
    public int maxArea(int[] height) {

        if(height == null || height.length == 0) {
            return 0;
        }

        int maxArea = 0;
        int i=0;
        int j=height.length-1;

        while(i<j) {

            int length =  Math.min(height[i], height[j]);
            int breadth = j-i;
            int area = length * breadth;

            maxArea = Math.max(maxArea, area);

            if(height[i]<=height[j]) {
                i++;
            } else{
                j--;
            }
        }

        return maxArea;
    }
}
