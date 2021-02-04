class Solution {
    
    
    public int maxArea(int[] height) {
        
        int x = 0;
        int y = height.length-1;

        int area = 0;
        
        while (x < y) {
            area = calcArea(x, y, height, area);
            
            if(height[x] < height[y]) {
                x++;
            } else 
                y--;
        }
        
        return area;
        
    }
    
    public int calcArea(int i, int j, int[] height, int area) {
        int length = height.length;
        int area1 = height[i] > height[j] ? height[j] * (j-i) : height[i] * (j-i);
        // System.out.println(i + " : " + j + " : " + area);
        if(area < area1) {
            area = area1;
        }
        return area;
    }
}
