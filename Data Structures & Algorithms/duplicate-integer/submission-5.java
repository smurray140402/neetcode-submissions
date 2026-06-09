class Solution {
    public boolean hasDuplicate(int[] nums) {
        TreeSet<Integer> set = new TreeSet<>();

        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }

        return false;
    }
}