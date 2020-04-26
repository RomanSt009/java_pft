package ru.stqa.pft.sandbox;

import org.testng.annotations.Test;

/**
 * Created by ghost on 26.04.2020.
 */
public class SquareTests {

  @Test
  public void testArea(){
    Square s = new Square(5);
    assert s.area() ==25;
  }
}
