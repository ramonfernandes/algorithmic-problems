import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        int[][] matrix = {{10,9,6,3,7},
                            {6,10,2,9,7},
                            {7,6,3,8,2},
                            {8,9,7,9,9},
                            {6,8,6,8,2}};
        rotateMatrix(matrix);
    }

    private static int[][] rotateMatrix(int[][] a) {
            int[][] newMAtrix = new int[a.length][a.length];

            Map<Integer, Integer> map = new HashMap<>();
            int i = 0;
            int j = a.length - 1;

            while (i < a.length) {
                map.put(i, j);
                i++;
                j--;
            }

            for (int x = 0; x < a.length; x++) {
                for (int y = 0; y < a.length; y++) {
                    //newMatrix[x][y] = a[y][map.get(x)];
                    newMAtrix[y][x] = a[map.get(x)][y];
                    System.out.println("New Matrix: ");
                   printMatrix(newMAtrix);


                    System.out.println("\n\nOld Matrix: ");
                    printMatrix(a);
                }
            }
            a = newMAtrix;
        return a;
    }

    private static void printMatrix(int [][] matrix){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++)
                System.out.print("["+matrix[i][j]+"]");
            System.out.println();
        }
    }

}