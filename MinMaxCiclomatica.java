package MinMaxCiclomatica;

import org.junit.Test;

import practicaTDD.MinMax;

public class MinMaxCiclomatica {
	@Test
	public void caminoabi(){
		int arraynull[] =null;
		MinMax.minMax(arraynull);
	}
	
	@Test
	public void caminoabchi(){
		int array[]={2};
		MinMax.minMax(array);
		
	}
	
	@Test
	public void caminoabcdfghi(){
		int array[]={9,6,4,3};
		MinMax.minMax(array);
	}
	
	@Test
	public void caminoabcdehi(){
		int array[]={3,4,6,9};
		MinMax.minMax(array);
	}

	@Test
	public void caminoabcdfhi(){
		int array[]={4,4,4,4};
		MinMax.minMax(array);
	}
}
