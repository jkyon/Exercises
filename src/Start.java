import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args){

        Exercises ex = new Exercises();

        int [] result = ex.getProductsOfAllIntsExceptAtIndex(new int[] {1,2});

        for (int item: result) {
            System.out.println(item);
        }


    }

}

