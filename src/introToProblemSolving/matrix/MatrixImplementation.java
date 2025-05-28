package introToProblemSolving.matrix;

public class MatrixImplementation {

    public static void main(String[] args) {

        int[][] matrix = {
                {1,2,3},
                {3,4,5},
                {7,8,9}
        };


        printMatirx(matrix);
    }


    public static void printMatirx(int[][] matrix){
        for (int i = 0; i< matrix.length; i++){
            for (int j=0 ; j<matrix[i].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}
