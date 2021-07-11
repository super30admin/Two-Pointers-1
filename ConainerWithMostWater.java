public class ConainerWithMostWater {
    
    //Two Pointer approach.
    //TC:O(N) - Iterating all the heights only one
    //SC: O(1) - Not using any extra space. Pointers are constant
    public int maxArea(int[] height) {
        if(height == null || height.length == 0) return 0;
        
        int n = height.length;
        int pointerOne = 0; // 2
        int pointerTwo = n-1; // 4
        
        //1,8,6,2,5,4,8,3,7
        int result = 0; //7
        while(pointerOne<=pointerTwo) {
            int currentHeight = Math.min(height[pointerOne], height[pointerTwo]);
            int width = Math.abs(pointerOne - pointerTwo);
            int area = currentHeight * width;
            
            result = Math.max(area, result);
            
            if(height[pointerOne] == height[pointerTwo]) { 
                pointerOne++;
            } else if(height[pointerOne] < height[pointerTwo]) { 
                pointerOne++;
            } else {
                pointerTwo--;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        ConainerWithMostWater conainerWithMostWater = new ConainerWithMostWater();
        int result = conainerWithMostWater.maxArea(new int[]{1,8,6,2,5,4,8,3,7});
        System.out.println("The result: "+ result);
    }
}
