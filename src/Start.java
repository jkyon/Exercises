import java.math.BigInteger;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Start {

    public static void main(String[] args){

        //SolveProductExceptIndexProblem();

        //*SolveSocketMerchantProblem();

        //SolveJumpingCloudsProblem();

        //SolveRepeatedStringProblem();

        //SolveCountingValleyProblem();
        SolveHourglassProblem();
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


    public static void SolveRepeatedStringProblem(){
        RepeatedStringsFinder ex = new RepeatedStringsFinder();
        long a = 549382313;
        long result = ex.repeatedString("epsxyyflvrrrxzvnoenvpegvuonodjoxfwdmcvwctmekpsnamchznsoxaklzjgrqruyzavshfbmuhdwwmpbkwcuomqhiyvuztwvq", a);
        System.out.println(result);
    }


    public static void  SolveCountingValleyProblem(){
        ValleyCounter ex = new ValleyCounter();
        int result = ex.countingValleys(12, "DDUUDDUDUUUD");
        System.out.println(result);
    }

    public static void SolveHourglassProblem(){
        int[][] arr = {
                {0, -4, -6, 0, -7, -6},
                {-1, -2, -6, -8, -3, -1},
                {-8, -4, -2, -8, -8, -6},
                {-3, -1, -2, -5, -7, -4},
                {-3, -5, -3, -6, -6, -6},
                {-3, -6, 0, -8, -6, -7}
        };
        HourglassProblem h = new HourglassProblem();
        int result = h.hourGlassSum(arr);
        System.out.println(result);
    }
}

