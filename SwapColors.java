
// Time Complexity :O(n)
// Space Complexity :O(1)
class SwapColors {
     
    public void sortColors(int a[]) {
        
        int size = a.length;
        int low = 0;
        int mid = 0;
        int high = size - 1;
        
        while(mid <= high){
            switch(a[mid]){
                case 0 : swap(a, low++, mid++);
                            break;
                case 1 : mid++;
                            break;
                case 2 : swap(a, mid, high--);
                            break;
            }
        }
    }
    
      void swap(int a[], int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    
}
 