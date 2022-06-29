package vttp.d6;

public class ArrayMain {
    public static void main(String[] args) {
        // Building Matrix [row][column]
        // Empty Matrix
        float[][] matrix = new float[3][3];
        // Filling matrix with numbers
        float[][] matrix2 = new float[3][];
        for (int i = 0; i < matrix2.length; i++) {
            matrix2[i] = new float[3]; 
            matrix2[i][0] = i; //[0][0] = 0, [1][0] = 1, [2][0] = 2
            matrix2[i][1] = i; //[0][1] = 0, [1][1] = 1, [2][1] = 2
            matrix2[i][2] = i; //[0][2] = 0, [1][2] = 1, [2][2] = 2
        }

        float[][] matrix3 = new float[3][];
        for (int i = 0; i < matrix3.length; i++) {
            matrix3[i] = new float[i+1]; 
            //matrix[0] = float[1]
            //matrix[1] = float[2]
            //matrix[2] = float[3]
        }

        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2[i].length; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.printf("\n");
        }
    }
    
}
