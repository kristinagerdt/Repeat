package islandOfKnowledge;

public class BoxBlur {
    public static int[][] boxBlur(int[][] image) {
        int rows = image.length;
        int cols = image[0].length;
        int[][] result = new int[rows - 2][cols - 2];

        for (int iRow = 0; iRow < rows - 2; iRow++) {
            for (int iCol = 0; iCol < cols - 2; iCol++) {
                int sum = 0;
                for (int i = iRow; i < iRow + 3; i++) {
                    for (int j = iCol; j < iCol + 3; j++) {
                        sum += image[i][j];
                    }
                }
                result[iRow][iCol] = sum / 9;
            }
        }
        return result;
    }
}