class Solution {
// TC - O(n^2);
// SC - O(n)   
public:
    vector<vector<int>> threeSum(vector<int>& nums) {
        vector<vector<int>> resultTriplets;
        set<vector<int>> resultTripletsSet;
        unordered_set<int> outerSet;
        unordered_map<int, int> umap ;

        for(int i =0; i<nums.size()-2;i++){
            if(outerSet.find(nums[i]) == outerSet.end()){
            for(int j =i+1; j<nums.size();j++){
                if(umap.find(-(nums[i]+nums[j]))!= umap.end() && umap.find(-(nums[i]+nums[j]))->second == i){
                    vector<int> triplets;
                     triplets.push_back(nums[i]);
                     triplets.push_back(nums[j]);
                     triplets.push_back(-(nums[i]+nums[j]));
                     sort(begin(triplets),end(triplets));
                     resultTripletsSet.insert(triplets);
                }
                umap[nums[j]] = i;
            }
             outerSet.insert(nums[i]);
        }
        }
        for(auto it =resultTripletsSet.begin(); it!=resultTripletsSet.end();it++ ){
            resultTriplets.push_back(*it);
        }
        return resultTriplets;
        
    }
};