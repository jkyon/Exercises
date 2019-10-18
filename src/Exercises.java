
import java.util.stream.IntStream;

public class Exercises {

    public int [] getProductsOfAllIntsExceptAtIndex(int[] inputArray){
        if (inputArray.length < 2) {
            throw new IllegalArgumentException("Getting the product of numbers at other indices requires at least 2 numbers");
        }
        int [] productBefore = productBeforeIndex(inputArray);
        int [] productAfter = productBeforeIndex(IntStream.rangeClosed(1, inputArray.length).map(i -> inputArray[inputArray.length-i]).toArray());
        return productIndex(productBefore, IntStream.rangeClosed(1, productAfter.length).map(i -> productAfter[productAfter.length-i]).toArray());
    }

    private int [] productBeforeIndex(int[] arrayBeforeIndex){
        int [] productBefore = new int[arrayBeforeIndex.length];
        int product = 1;
        productBefore[0] = 1;
        for(int i = 1; i < arrayBeforeIndex.length; i++){
            product *= arrayBeforeIndex[i-1];

            productBefore[i] = product;
        }

        return productBefore;
    }

    private int [] productIndex(int [] productBefore,int [] productAfter){
        int [] productResult = new int[productBefore.length];
        for(int i = 0; i < productBefore.length; i++){
            productResult[i] = productBefore[i] * productAfter[i];
        }
        return productResult;
    }
}
