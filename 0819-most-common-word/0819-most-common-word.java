class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String str = paragraph.replaceAll("[^a-zA-Z0-9 ]", " ").toLowerCase();
        String[] spl = str.split("\\s+");

        Set<String> bannedWords = new HashSet();
        for (String ban : banned)
            bannedWords.add(ban);

        Map<String, Integer> count = new HashMap();

        for (String word : spl) {
            if (!bannedWords.contains(word))
                count.put(word, count.getOrDefault(word, 0) + 1);
        }

        return Collections.max(count.entrySet(), Map.Entry.comparingByValue()).getKey();
    }
}