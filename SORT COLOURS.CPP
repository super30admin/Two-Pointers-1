//tc-O(n)
//sc-O(1)
class Solution {
public:
    void sortColors(vector<int>& arr) {
        //dutch national flag algorithm
        int n=arr.size();
        int low=0;
        int high=n-1;
       int runner=0;
        while(runner<=high){
            if(arr[runner]==1)runner++;
           else if(arr[runner]==2)swap(arr[high--],arr[runner]);//SWAPPED ELEMETS NOT PROCESSED
          else  if(arr[runner]==0)swap(arr[low++],arr[runner++]);
        }
    }
};