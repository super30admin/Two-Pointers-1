/*
Time: O(N)
Space: O(1)
*/
class SortColors{
    private void sortColors(int[] colors){
        int start = 0;
        int end = colors.length-1;
        int index = 0;
        while(index <= end){
             if(colors[index] == 0){
                colors[index++] = colors[start];
                colors[start++] = 0;
            }
            else if(colors[index] == 2){
                colors[index] = colors[end];
                colors[end--] = 2;
            }
            else index++;
        }
        return ;
    }
    public static void main(String[] args) {
        SortColors sc = new SortColors();
        int[] colors = new int[]{2,2,0,0,1,2,0,2,1};
        sc.sortColors(colors);
        for(int i: colors) System.out.print(" "+i);
    }
}