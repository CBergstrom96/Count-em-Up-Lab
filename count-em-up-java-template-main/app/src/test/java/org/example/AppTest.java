package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

  @Test
  void tenHundredthsEquals0010() {
    GroceryCounter testGroceryCounter = new GroceryCounter();
    testGroceryCounter.hundredths();
    testGroceryCounter.hundredths();
    testGroceryCounter.hundredths();
    testGroceryCounter.hundredths();
    testGroceryCounter.hundredths();
    testGroceryCounter.hundredths();
    testGroceryCounter.hundredths();
    testGroceryCounter.hundredths();
    testGroceryCounter.hundredths();
    testGroceryCounter.hundredths();
    assertArrayEquals(new int[]{0, 0, 1, 0}, testGroceryCounter.counter);
  }
  @Test
  void tententhsEquals0100() {
    GroceryCounter testGroceryCounter = new GroceryCounter();
    testGroceryCounter.tenths();
    testGroceryCounter.tenths();
    testGroceryCounter.tenths();
    testGroceryCounter.tenths();
    testGroceryCounter.tenths();
    testGroceryCounter.tenths();
    testGroceryCounter.tenths();
    testGroceryCounter.tenths();
    testGroceryCounter.tenths();
    testGroceryCounter.tenths();
    assertArrayEquals(new int[]{0, 1, 0, 0}, testGroceryCounter.counter);
  }
  @Test
  void tenOnesEquals1000() {
    GroceryCounter testGroceryCounter = new GroceryCounter();
    testGroceryCounter.ones();
    testGroceryCounter.ones();
    testGroceryCounter.ones();
    testGroceryCounter.ones();
    testGroceryCounter.ones();
    testGroceryCounter.ones();
    testGroceryCounter.ones();
    testGroceryCounter.ones();
    testGroceryCounter.ones();
    testGroceryCounter.ones();
    assertArrayEquals(new int[]{1, 0, 0, 0}, testGroceryCounter.counter);
  }
  @Test
  void tenTensEquals0000() {
    GroceryCounter testGroceryCounter = new GroceryCounter();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    assertArrayEquals(new int[]{0, 0, 0, 0}, testGroceryCounter.counter);
  }
  @Test
  void tenTensEquals1Overflow() {
    GroceryCounter testGroceryCounter = new GroceryCounter();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    testGroceryCounter.tens();
    assertEquals(1,testGroceryCounter.overflow);
  }
}
