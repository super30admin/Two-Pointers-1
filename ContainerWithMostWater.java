public class ContainerWithMostWater {

  public int maxAmountOfWater(int[] height) {
    if (height == null || height.length == 0) {
      return 0;
    }
    int leftPtr = 0, rightPtr = height.length - 1, maxWater = 0;
    while (leftPtr < rightPtr) {
      maxWater = Math.max(maxWater, (rightPtr - leftPtr) * Math.min(height[leftPtr], height[rightPtr]));
      if (height[leftPtr] < height[rightPtr]) {
        leftPtr++;
      } else {
        rightPtr--;
      }
    }
    return maxWater;
  }

  public static void main(String[] args) {
    ContainerWithMostWater cWMW = new ContainerWithMostWater();
    int[] height1 = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
    System.out.println(cWMW.maxAmountOfWater(height1));

    int[] height2 = { 1, 1 };
    System.out.println(cWMW.maxAmountOfWater(height2));
  }

}
