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

  @Test
  public void changeFor2(){
      assertEquals(coins(2), CoinChanger.giveChange(2));
  }

  @Test
  public void changeFor3(){
      assertEquals(coins(2,1), CoinChanger.giveChange(3));
  }

  @Test
  public void changeFor5(){
      assertEquals(coins(5), CoinChanger.giveChange(5));
  }

  @Test
  public void changeFor7(){
      assertEquals(coins(5,2), CoinChanger.giveChange(7));
  }

  @Test
  public void changeFor10(){
      assertEquals(coins(10), CoinChanger.giveChange(10));

  }
  @Test
  public void changeFor20(){
      assertEquals(coins(20), CoinChanger.giveChange(20));

  }
  @Test
  public void changeFor50(){
      assertEquals(coins(50), CoinChanger.giveChange(50));

  }
  @Test
  public void changeFor99(){
      assertEquals(coins(50,20,20,5,2,2), CoinChanger.giveChange(99));

  }
}
