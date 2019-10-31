public class ValleyCounter {

    public int countingValleys(int n, String s) {
        int valleyCounter = 0;
        int level = 0;
        int stepsDown = 0;
        for(int i = 0; i < n; i++){
            if(s.charAt(i) == 'D' ){
                if(level <= 0)
                    stepsDown++;
                level--;
            }
            else{
                if(level < 0){
                    boolean isValley = (level + stepsDown) == 0;
                    if(isValley)
                        valleyCounter++;
                }
                level++;
                stepsDown = 0;
            }
        }
        return valleyCounter;
    }
}
