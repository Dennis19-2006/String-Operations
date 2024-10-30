public class StringOperations {

    // Concatenate two strings
    public String concatenate(String str1, String str2) {
        return str1 + str2;
    }

    // Extract substring
    public String substring(String str, int start, int end) {
        if (start < 0 || end > str.length() || start > end) {
            throw new IndexOutOfBoundsException("Invalid start or end index");
        }
        return str.substring(start, end);
    }

    // Compare two strings
    public boolean compare(String str1, String str2) {
        return str1.equals(str2);
    }

    // Character frequency in a string
    public java.util.Map<Character, Integer> characterFrequency(String str) {
        java.util.Map<Character, Integer> frequencyMap = new java.util.HashMap<>();
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }
}
