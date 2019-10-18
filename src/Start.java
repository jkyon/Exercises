import java.util.ArrayList;
import java.util.List;

public class Start {

    public static void main(String[] args){

        SolveProductExceptIndexProblem();


    }

    public static void SolveProductExceptIndexProblem(){
        ProductExceptIndexProblem ex = new ProductExceptIndexProblem();

        int [] result = ex.getProductsOfAllIntsExceptAtIndex(new int[] {1,2,3,4});

        for (int item: result) {
            System.out.println(item);
        }
    }
}

