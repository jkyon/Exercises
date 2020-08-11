

public class HourglassProblem {

    public int hourGlassSum(int[][] arr){
        int result = 0;
        for (int rows = 1; rows <= arr.length - 2; rows++){
            for (int col = 1; col <= arr.length - 2; col++){
                int sum  = arr[rows-1][col-1] + arr[rows-1][col] + arr[rows-1][col+1] + arr[rows][col] + arr[rows+1][col-1] + arr[rows+1][col] + arr[rows+1][col+1];
                if(rows == 1 && col == 1)
                    result = sum;
                else
                    result = Math.max(result, sum);
            }
        }
        return result;
    }
}
