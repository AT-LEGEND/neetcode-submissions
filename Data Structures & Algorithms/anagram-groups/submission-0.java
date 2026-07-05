class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            // 1. Create the sorted key
            char[] st = s.toCharArray();
            Arrays.sort(st);
            String key = new String(st);

            // 2. If the key doesn't exist, put an empty list there
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            
            // 3. Add the current string to the list belonging to this key
            map.get(key).add(s); 
        }
        
        // 4. map.values() grabs all the lists! Just wrap it in an ArrayList to return.
        return new ArrayList<>(map.values());
    }
}