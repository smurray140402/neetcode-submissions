class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            int leftover = target - nums[i];
            
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    continue;
                }
                else if (nums[j] == leftover){
                    int[] result = { i, j };
                    return result;
                }
            }
        }
        return null;
    }
}
