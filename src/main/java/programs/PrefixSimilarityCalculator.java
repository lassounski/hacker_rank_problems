package programs;

public class PrefixSimilarityCalculator {

    /**
     * Gets the similarity sum of a word.
     * Similarity: The number of letters that are equal between two words starting from the beginning of a word.
     * Ex: ifood and ifoox have similarity 4.
     *
     * The similarity sum is the of the similarities for all possible derivations of a word.
     * Ex:
     * Word:        ababaa    6
     * Derivations: babaa     0
     *              abaa      3
     *              baa       0
     *              aa        1
     *              a         1
     * Similarity Sum:        11
     * @param word
     * @return
     */
    public static int getSimilaritySum(String word) {
        return getSimilarityRecursive(word, word);
    }

    public static int getSimilarityRecursive(final String word, final String suffix) {
        int similarity = 0;
        int controlIndex = 0;
        boolean recursed = false;

        for (int index = 0; index < suffix.length(); index++) {
            char currentChar = suffix.charAt(index);

            if (suffixHasSubPattern(word, controlIndex, recursed, currentChar)) {
                similarity += getSimilarityRecursive(word, suffix.substring(index));
                recursed = true;
            }
            if (word.charAt(controlIndex) == currentChar) {
                similarity += 1;
                controlIndex += 1;
            }
        }
        return similarity;
    }

    private static boolean suffixHasSubPattern(String word, int controlIndex, boolean recursed, char currentChar) {
        return controlIndex > 0 && word.charAt(0) == currentChar && !recursed;
    }
}
