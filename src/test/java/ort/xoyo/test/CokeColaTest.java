package ort.xoyo.test;

import org.junit.Assert;
import org.junit.Test;
import org.xoyo.fastjson.CokeCola;

import static org.junit.Assert.*;

public class CokeColaTest {

  @Test
  public void greeting() {
    CokeCola cola = new CokeCola();

    Assert.assertSame("OK1", cola.greeting());
  }
}