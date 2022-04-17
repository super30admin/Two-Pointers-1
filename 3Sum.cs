using System;
using System.Collections.Generic;
using System.Text;

namespace ConsoleApp1
{
    public class The3Sum
    {
        /*
         * T.C: O(N2) : sorting contribute nLogn and the two pointers with outer element contribute n*n which is N2, so higher order terms matter so N2
         * S.c: O(1) no extra space
         */
        public IList<IList<int>> ThreeSum(int[] nums)
        {
            IList<IList<int>> Result = new List<IList<int>>();
            Array.Sort(nums);

            for (int i = 0; i < nums.Length; i++)
            {
                //if left element as same as next element then skip loop
                if (i > 0 && nums[i] == nums[i - 1])
                    continue;

                int left = i + 1;
                int right = nums.Length - 1;

                while (left < right)
                {
                    int sum = nums[left] + nums[right] + nums[i];
                    if (sum == 0)
                    {
                        List<int> triplet = new List<int>();
                        triplet.Add(nums[i]);
                        triplet.Add(nums[left]);
                        triplet.Add(nums[right]);
                        Result.Add(triplet);
                        left++;
                        right--;

                        while (left < right && nums[left] == nums[left - 1])
                        {
                            left++;
                        }

                        while (left < right && nums[right] == nums[right + 1])
                        {
                            right--;
                        }



                    }
                    else if (sum < 0)
                    {
                        left++;
                    }
                    else
                    {
                        right--;
                    }


                }

            }

            return Result;
        }
    }
}
