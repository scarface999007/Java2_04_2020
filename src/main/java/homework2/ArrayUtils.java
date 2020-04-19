package homework2;

public class ArrayUtils {

    public long arraySum(Object [][] array) throws ArraySizeException, ArrayDataException {
        int sum = 0;
        if(array.length != 4){
            throw new ArraySizeException();
        } else {
            for (int i = 0; i < array.length; i++) {
                if(array[i].length != 4){
                    throw new ArraySizeException();
                }
            }
        }

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if(!array[i][j].toString().matches("\\d+")){
                    throw new ArrayDataException("Wrong data in " + "[" + i + "]" + "[" + j + "]. " + "Value = " + array[i][j]);
                }
                sum += Integer.parseInt(array[i][j].toString());
            }
        }
        return sum;
    }

}
