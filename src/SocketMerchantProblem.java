import java.util.*;

public class SocketMerchantProblem {

    public int sockMerchantBruteForce(int n, int[] ar){
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++){
            for (int j = i + 1 ; j < n; j++){
                if(ar[i] == ar[j] && !map.containsKey(i)){
                    result.add(ar[i]);
                    map.put(j, ar[j]);
                    break;
                }
            }
        }

        return result.size();
    }

    public int sockMerchant(int n, int[] ar){
        Arrays.sort(ar);
        List<Integer> result = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        int index = 1;
        for (int i = 0; i <= n - 1; i++){
            if(index == n){
                break;
            }
            else if(ar[i] == ar[i+1] && !map.containsKey(i)){
                result.add(ar[i]);
                map.put(i+1, ar[i]);
                index++;
                continue;
            }
            index++;
        }

        return result.size();
    }
}
