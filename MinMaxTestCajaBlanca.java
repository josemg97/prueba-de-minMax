package MinMaxTestCajaBlanca;


import org.junit.Test;

import practicaTDD.MinMax;

public class MinMaxTestCajaBlanca {
	
	@Test
	public void statementCoverage(){
		MinMax m = new MinMax();
		int array [] = {8,2,9,4};
	    MinMax.minMax(array);
	}
	
	@Test
	public void decisionCoverage(){
		MinMax m = new MinMax();
		int array [] = {8,2,9,4};
	    MinMax.minMax(array);
		int arrayVacio[]={};
		MinMax.minMax(arrayVacio);
	}
	
	@Test
	public void conditionCoverage(){
		MinMax m = new MinMax();
		int array [] = {8,2,9,4};
	    MinMax.minMax(array);
		int arraynull[] =null;
		MinMax.minMax(arraynull);
		int arrayVacio[]={};
		MinMax.minMax(arrayVacio);
	}
	
	@Test
	public void decisionConditionCoverage(){
		MinMax m = new MinMax();
		int array [] = {8,2,9,4};
	    MinMax.minMax(array);
		int arraynull[] =null;
		MinMax.minMax(arraynull);
		int arrayVacio[]={};
		MinMax.minMax(arrayVacio);
		
	}
	
}
