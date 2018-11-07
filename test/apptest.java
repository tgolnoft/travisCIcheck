package travisCItest;

import org.junit.Test;

public class apptest{
  @Test
  public void testapp(){
    testCI a = new testCI(5);
    assert a.getn() == 5;
    a.setN(4);
    assert a.getn() == 4;
  }
}
