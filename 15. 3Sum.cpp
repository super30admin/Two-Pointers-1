/*
Time Complexity: O(N^2)
Space Complexity: O(1) (not considering output matrix)

For each element at i, find 2sum from i+1 and avoid duplicates
*/
class Solution {
public:
    vector<vector<int>> threeSum(vector<int>& v) {
      //set< vector<int> > s;
      vector<vector<int>> ret;
      sort(v.begin(),v.end());

      //For each element at i, find 2sum from i+1
      for(int i=0;i<v.size();i++){
        int target = 0-v[i];
        if(i>0 && v[i]==v[i-1])  continue; //avoid duplicates

        //2 sum
        int lo = i+1, hi = v.size()-1;

        while(lo<hi){
          int sum = v[lo]+v[hi];
          if(sum == target)  {
            ret.push_back({v[i],v[lo],v[hi]}); 
            lo++;
            hi--;

            while(lo<hi && v[lo]==v[lo-1])  lo++; //skip equal values
            while(lo<hi && v[hi]==v[hi+1]) hi--; //skip equal values
            }
          else if(sum < target){
            lo++;
            while(lo<hi && v[lo]==v[lo-1])  lo++; //skip equal values
          }
          else{
            hi--;
            while(lo<hi && v[hi]==v[hi+1]) hi--; //skip equal values
          }
        }
      }

      return ret;
    }
};
