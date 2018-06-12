import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoinChangerTest {

  List<Integer> coins(Integer...ints) {
    return new ArrayList<>(Arrays.asList(ints));
  }

  @Test
  public void changeFor1(){
      assertEquals(coins(1), CoinChanger.giveChange(1));
  }
}
