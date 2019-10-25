public class JumpingClouds {

    public int jumpingOnClouds(int[] c) {

        int jump = 0;
        int i = 0;
        while(i < c.length - 1){
            if(i + 1 == c.length - 1)
            {
                i++;
                jump++;
                break;
            }
            else if(c[i + 2] == 1){
                i++;
                jump++;
            }
            else{
                i = i + 2;
                jump++;
            }
        }

        return jump;
    }
}
