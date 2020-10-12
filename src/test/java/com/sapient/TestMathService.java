package com.sapient;

import java.util.Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.sapient.service.MathService;

public class TestMathService {
	MathService service;
	
	@BeforeEach
	public void init() {
		service =new MathService();
	}
	
	@Test
	public void testFibonacci() {
		int actualans=34;
		int result=service.fibonacci(9);
		Assertions.assertEquals(actualans,result);
	}
	@Test
	public void testFibonacci1() {
		int actualans=5;
		int result=service.fibonacci(5);
		Assertions.assertEquals(actualans,result);
	}
	
	@Test
	public void testprimeArray() {
		int[] actualans=new int[] {5,7};
		int[] result=service.primeArray(5,10);
		Assertions.assertTrue(Arrays.equals(actualans, result));
	}
	
	

	@Test
	public void testPrime() {
		boolean actualans=true;
		boolean result=service.isPrime(13);
		Assertions.assertEquals(actualans,result);
	}
	@Test
	public void testfactorial() {
		long actualans=120;
		long result=service.factorial(5);
		Assertions.assertEquals(actualans,result);
	}
	@Test
	public void testPrime1() {
		boolean actualans=false;
		boolean result=service.isPrime(-3);
		Assertions.assertEquals(actualans,result);
	}
	@Test
	public void testPrime2() {
		boolean actualans=true;
		boolean result=service.isPrime(2);
		Assertions.assertEquals(actualans,result);
	}

}
