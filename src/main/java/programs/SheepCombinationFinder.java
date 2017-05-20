package programs;

import java.util.stream.IntStream;

public class SheepCombinationFinder {

    private boolean[][] visitedMatrix;
    private boolean[][] grassMatrix;

    public int getSheepArrangmentsInField(String... fieldRows) {
        setGrassMatrixFromRows(fieldRows);
        int fieldCount = getFieldsCount();
        return getArrangementCount(fieldCount);
    }

    private int getArrangementCount(int fieldCount) {
        return IntStream.iterate(2, operand -> operand + 2)
                .limit(fieldCount / 2)
                .map(operand -> (int) (factorial(fieldCount) /
                        (factorial(operand) * (factorial(fieldCount - operand)))))
                .sum() + 1;
    }

    private long factorial(int number) {
        int factorial = 1; // this  will be the result
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        return factorial;
    }

    /**
     * Returns a boolean bi-dimensional array
     * where true means that there is grass and flase that there is no grass
     *
     * @param rows a list of strings in the pattern "YNYNYN", where 'Y' stands for grass and 'N' for no grass.
     * @return boolean[number of letters per row][number of rows]
     */
    protected void setGrassMatrixFromRows(String... rows) {
        grassMatrix = new boolean[rows.length][rows[0].length()];
        visitedMatrix = new boolean[rows.length][rows[0].length()];

        for (int rowIndex = 0; rowIndex < rows.length; rowIndex++) {
            String rowContent = rows[rowIndex];
            for (int columnIndex = 0; columnIndex < rowContent.length(); columnIndex++) {
                char cellContent = rowContent.charAt(columnIndex);
                grassMatrix[rowIndex][columnIndex] = cellContent == 'Y';
            }
        }
    }

    protected int getFieldsCount() {
        int fields = 0;

        for (int rowIndex = 0; rowIndex < grassMatrix.length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < grassMatrix[0].length; columnIndex++) {
                if (!visitedMatrix[rowIndex][columnIndex]) {
                    if (grassMatrix[rowIndex][columnIndex]) {
                        visitField(rowIndex, columnIndex);
                        fields += 1;
                    }
                }
            }
        }
        return fields;
    }

    private void visitField(int rowIndex, int columnIndex) {
        visitedMatrix[rowIndex][columnIndex] = true;
        if (grassMatrix[rowIndex][columnIndex]) {
            if (isValidRowInterval(rowIndex + 1) && !visitedMatrix[rowIndex + 1][columnIndex]) {
                visitField(rowIndex + 1, columnIndex);
            }
            if (isValidRowInterval(rowIndex - 1) && !visitedMatrix[rowIndex - 1][columnIndex]) {
                visitField(rowIndex - 1, columnIndex);
            }
            if (isValidColumnInterval(columnIndex + 1) && !visitedMatrix[rowIndex][columnIndex + 1]) {
                visitField(rowIndex, columnIndex + 1);
            }
            if (isValidColumnInterval(columnIndex - 1) && !visitedMatrix[rowIndex][columnIndex - 1]) {
                visitField(rowIndex, columnIndex - 1);
            }
        }
    }

    private boolean isValidColumnInterval(int columnIndex) {
        return 0 <= columnIndex && columnIndex < grassMatrix[0].length;
    }

    private boolean isValidRowInterval(int rowIndex) {
        return 0 <= rowIndex && rowIndex < grassMatrix.length;
    }

    public boolean[][] getVisitedMatrix() {
        return visitedMatrix;
    }

    public boolean[][] getGrassMatrix() {
        return grassMatrix;
    }
}
