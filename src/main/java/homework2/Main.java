package homework2;

public class Main {

    public static ArrayUtils utils;

    public static void main(String[] args) {
        final int SIZE = 4;
        //final int SIZE = 5;
        utils = new ArrayUtils();
        String[][] array = new String[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                array [i][j] = "10";
            }
        }
        //array [0][0] = "qwe";
        try {
            System.out.println(utils.arraySum(array));
        } catch (ArraySizeException e) {
            e.printStackTrace();
        } catch (ArrayDataException e) {
            e.printStackTrace();
        }
    }
}
