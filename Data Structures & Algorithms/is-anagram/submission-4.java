class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> letters = new HashMap<>();

        if (s.length() != t.length()) return false;
        
        for (char letter : s.toCharArray()) letters.put(letter, letters.getOrDefault(letter, 0) + 1); 

        for (char letter : t.toCharArray()) letters.put(letter, letters.getOrDefault(letter, 0) - 1); 

        for (Map.Entry<Character, Integer> entry : letters.entrySet()) {
            int value = entry.getValue();
            if (value != 0) return false; 
        }
        return true;
    }
}
