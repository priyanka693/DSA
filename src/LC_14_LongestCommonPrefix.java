public class LC_14_LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};

        if (strs == null || strs.length == 0) {
            System.out.println(""); // handle empty array
            return;
        }

        String prefix = strs[0]; // take first string as prefix

        for (int i = 1; i < strs.length; i++) {
            // reduce prefix until it matches the start of strs[i]
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    System.out.println(""); // no common prefix
                    return;
                }
            }
        }

        System.out.println("Longest Common Prefix: " + prefix);
    }
}
