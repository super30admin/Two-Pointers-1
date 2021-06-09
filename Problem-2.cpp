//3sum

//T.C: O(n^2)
//SC = O(1)
//Sort + 2 pointer,
//we can use hashmap for same purpose as in K-sum at expense of space
class Solution{
public:
vector<vector<int>> threeSum(vector<int>& nums) {
    vector<vector<int>> triples;
    sort(nums.begin(), nums.end());
    int i = 0, last = nums.size() - 1;
    while (i < last) {
        int a = nums[i], j = i+1, k = last;
        while (j < k) {
            int b = nums[j], c = nums[k], sum = a+b+c;
            if (sum == 0) triples.push_back({a, b, c});
            if (sum <= 0) while (nums[j] == b && j < k) j++;
            if (sum >= 0) while (nums[k] == c && j < k) k--;
        }
        while (nums[i] == a && i < last) i++;
    }
    return triples;
}
};