
public class Start {

    public static void main(String[] args){

        SolveProductExceptIndexProblem();

        SolveSocketMerchantProblem();

        SolveJumpingCloudsProblem();
    }

    public static void SolveProductExceptIndexProblem(){
        ProductExceptIndexProblem ex = new ProductExceptIndexProblem();

        int [] result = ex.getProductsOfAllIntsExceptAtIndex(new int[] {1,2,3,4});

        for (int item: result) {
            System.out.println(item);
        }
    }

    public static void SolveSocketMerchantProblem(){
        SocketMerchantProblem ex = new SocketMerchantProblem();
        int result = ex.sockMerchant(7, new int[] {1,2,1,2,1,3,2});
        System.out.println(result);
    }

    public static void SolveJumpingCloudsProblem(){
        JumpingClouds ex = new JumpingClouds();
        int result = ex.jumpingOnClouds(new int[] {0, 0, 1, 0, 0, 0, 0, 1, 0, 0});
        System.out.println(result);
    }
}

