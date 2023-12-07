package Practic.skills;

public class Solution2 {
    public  int [] twoSum(int []nums, int k){  //          [-4,-3,2,4,8,9,10,15]
        for (int i = 0; i < nums.length; i++) {         //  k = 5;
            int numberToFind = k - nums[i];             // -4 + 9 = 5 x
            int left = i +1, right = nums.length -1;    // -3 + 5 = 5 V
            while (left <= right){                      // result [-3 , 5]
                int mid = left + (right - left)/2;
                if (nums[mid] == numberToFind){
                    return new int [] {nums[i], nums [mid]};
                }
                if (numberToFind < nums[mid]){
                    right = mid - 1;

                }else {
                    left = mid + 1;
                }
            }
        }
        return new int [0];
    }
}
