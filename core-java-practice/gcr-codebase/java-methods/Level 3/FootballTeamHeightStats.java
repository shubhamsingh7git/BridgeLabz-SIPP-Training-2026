public class FootballTeamHeightStats {

    public static int[] generateHeights(int size) {
        int[] heights = new int[size];

        for (int i = 0; i < size; i++) {
            heights[i] = 150 + (int) (Math.random() * 101);
        }

        return heights;
    }

    public static int findSum(int[] heights) {
        int sum = 0;

        for (int height : heights) {
            sum += height;
        }

        return sum;
    }

    public static double findMeanHeight(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] < shortest) {
                shortest = heights[i];
            }
        }

        return shortest;
    }

    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > tallest) {
                tallest = heights[i];
            }
        }

        return tallest;
    }

    public static void displayHeights(int[] heights) {
        System.out.println("Player Heights (cm)");
        for (int i = 0; i < heights.length; i++) {
            System.out.println("Player " + (i + 1) + " : " + heights[i]);
        }
    }

    public static void main(String[] args) {
        int teamSize = 11;

        int[] heights = generateHeights(teamSize);

        displayHeights(heights);

        int totalHeight = findSum(heights);
        double meanHeight = findMeanHeight(heights);
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);

        System.out.println("\\nResults");
        System.out.println("Total Height : " + totalHeight + " cm");
        System.out.printf("Mean Height : %.2f cm%n", meanHeight);
        System.out.println("Shortest Height : " + shortestHeight + " cm");
        System.out.println("Tallest Height : " + tallestHeight + " cm");
    }
}