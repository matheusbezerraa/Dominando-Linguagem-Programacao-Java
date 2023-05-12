import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Random random = new Random();

        int[][] m = new int[4][4];

        for(int i =0; i < m.length; i++){
            for(int j = 0; j< m[i].length; j++){
                m[i][j] = random.nextInt(9);
            }
        }

        System.out.println("matriz: ");
        for (int[] linha : m) {
            for (int coluna : linha) {
                System.out.print(coluna+" ");   
            }
            System.out.println();     
        }
    }
}
