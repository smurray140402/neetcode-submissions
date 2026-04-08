class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> mappings = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int leftover = target - nums[i];
            if (mappings.containsKey(leftover))  {
                return new int[] { mappings.get(leftover), i };
            }
            mappings.put(nums[i], i);
        }

        return new int[] {};
    }
}
