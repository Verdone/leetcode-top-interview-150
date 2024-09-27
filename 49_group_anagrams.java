// 49. Group Anagrams
// Difficulty: Medium
// Category: Hashmap

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> h = new HashMap<>();
        
        for (String word : strs) {
            char[] c = word.toCharArray();
            Arrays.sort(c);
            String sortedWord = new String(c);
            
            if (!h.containsKey(sortedWord)) {
                h.put(sortedWord, new ArrayList<>());
            }
            
            h.get(sortedWord).add(word);
        }
        
        return new ArrayList<>(h.values());
    }
}