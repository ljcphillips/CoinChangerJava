import java.util.ArrayList;
import java.util.List;

public class CoinChanger {
  public static List<Integer> giveChange(int amount){
    List<Integer> change = new ArrayList<>();

    int[]COINS = {50,20,10,5,2,1};

    for (int i = 0; i < COINS.length; i++){
      while(amount >= COINS[i]){
        change.add(COINS[i]);
        amount -= COINS[i];
      }
    }
    return change;
  }

}
