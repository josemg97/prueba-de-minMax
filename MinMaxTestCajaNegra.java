package MinMaxTestCajaNegra;

import static org.junit.Assert.*;

import org.junit.Test;

import practicaTDD.MinMax;

public class MinMaxTestCajaNegra {
  @Test
  public void pasarArrayVacioDevuelveArrayNulo() {
    int array [] = null;
    assertEquals(null, array);
  }
  
  @Test 
  public void pasarArrayConUnElementoDevuelveElElemento(){
	  int array[]={5};
	  assertArrayEquals( new int []{5,5} , MinMax.minMax(array));
  }
  
  @Test
  public void MinimoYMaximoCoinciden() {
    int array [] = {3,3,3,3};
    assertArrayEquals( new int []{3,3} , MinMax.minMax(array));
  }
  
  @Test
  public void pasarArrayDevuelveMaximoyMinimoCorrecto(){
	  int array [] ={1,3,6,9};
	  assertArrayEquals( new int []{1,9} , MinMax.minMax(array));
  }
  
  @Test
  public void pasarArrayDevuelveMaximayMinimoNegativoCorrecto(){
	  int array [] ={-1,-3,-6,-9};
	  assertArrayEquals( new int []{-9,-1} , MinMax.minMax(array));
  }
  
}
