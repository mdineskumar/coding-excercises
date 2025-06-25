package core_java_udemy.arrays;

public class TwoDimensionalDemo {
    public static void main(String[] args) {
        int[][] matrix = new int[3][3];
        int[][] matrix2 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println(matrix[0][0]);

        for(int i = 0; i < matrix.length; i++){
            for(int j =0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
