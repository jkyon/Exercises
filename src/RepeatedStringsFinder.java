public class RepeatedStringsFinder {

    public long repeatedString(String s, long n){
        long aproxLength = n / s.length();
        long rest = n % s.length();
        long output;

        long resultOnS = s.chars().filter(x -> x == 'a').count();
        output = resultOnS * aproxLength;

        String subRest = s.substring(0, (int)rest);
        output += subRest.chars().filter(x -> x == 'a').count();

        return output;
    }
}
