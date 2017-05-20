package programs;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class SheepCombinationFinderTest {

    private SheepCombinationFinder sheepCombinationFinder = new SheepCombinationFinder();

    @Test
    public void shouldConvertStringLinesToGrassArray() {
        boolean[][] expectedGrassMatrix = new boolean[][]{
                {true, true, false, false},
                {true, false, false, true},
                {false, false, true, false},
                {false, true, true, false}};

        sheepCombinationFinder.setGrassMatrixFromRows(
                "YYNN",
                "YNNY",
                "NNYN",
                "NYYN");

        assertThat(sheepCombinationFinder.getGrassMatrix()).isEqualTo(expectedGrassMatrix);
    }

    @Test
    public void shouldFindFieldsInSquaredGrassMatrix() {
        sheepCombinationFinder.setGrassMatrixFromRows(
                "YYNN",
                "YNNY",
                "NNYN",
                "NYYN");
        assertThat(sheepCombinationFinder.getFieldsCount()).isEqualTo(3);
    }

    @Test
    public void shouldFindFieldInRectangularGrassMatrix() {
        sheepCombinationFinder.setGrassMatrixFromRows(
                "YYNNNNNNYYNN",
                "YNNYYNNNNYYN",
                "NNYNNNYNNNNN",
                "NYYNNNNYYYYN");
        assertThat(sheepCombinationFinder.getFieldsCount()).isEqualTo(6);
    }

    @Test
    public void shouldCalculateArrangmentsInSquaredField() {
        int arrangementCount = sheepCombinationFinder.getSheepArrangmentsInField(
                "YYNN",
                "YNNY",
                "NNYN",
                "NYYN");
        assertThat(arrangementCount).isEqualTo(4);
    }

    @Test
    public void shouldCalculateArrangmentsInRectangleField() {
        int arrangementCount = sheepCombinationFinder.getSheepArrangmentsInField(
                "YYNNNNNNYYNN",
                "YNNYYNNNNYYN",
                "NNYNNNYNNNNN",
                "NYYNNNNYYYYN");
        assertThat(arrangementCount).isEqualTo(32);
    }
}
