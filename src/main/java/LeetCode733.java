public class LeetCode733 {

    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int targetColor = image[sr][sc];
        fill(image, sr, sc, targetColor, newColor);
        return image;
    }

    private void fill(int[][] image, int sr, int sc, int targetColor, int newColor) {
        if (sr < 0 || sr >= image.length) {
            return;
        }
        if (sc < 0 || sc >= image[0].length) {
            return;
        }
        if (targetColor != image[sr][sc]) {
            return;
        }
        if (newColor == image[sr][sc]) {
            return;
        }
        image[sr][sc] = newColor;
        fill(image, sr - 1, sc, targetColor, newColor);
        fill(image, sr + 1, sc, targetColor, newColor);
        fill(image, sr, sc - 1, targetColor, newColor);
        fill(image, sr, sc + 1, targetColor, newColor);
    }

    public static void main(String[] args) {
        LeetCode733 solution = new LeetCode733();
        solution.floodFill(new int[][]{{0, 0, 0}, {0, 1, 1}}, 1, 1, 1);
    }
}
