package GoogleRandInt;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
public class RandInt {
    public int randInt(int n, List<Integer> l){
        int out = ThreadLocalRandom.current().nextInt(0, n-1);
        if(l.contains(out)){
            return randInt(n, l);
        }else return out;
    }
}
