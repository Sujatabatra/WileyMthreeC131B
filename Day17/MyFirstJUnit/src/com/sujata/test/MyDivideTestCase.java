package com.sujata.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.sujata.demo.MyDivideClass;
import com.sujata.demo.NegativeNumberException;

public class MyDivideTestCase {

	private MyDivideClass myDivide;
	
	@Before
	public void setUp() throws Exception {
		myDivide=new MyDivideClass();
	}

	@After
	public void tearDown() throws Exception {
		myDivide=null;
	}

	@Test
	public void testDivide1() {
		assertEquals(2, myDivide.divide(20, 10));
	}

	@Test(expected = NegativeNumberException.class)
	public void testDivide2() {
		assertEquals(0, myDivide.divide(-20, 10));
	}

	@Test(expected = NegativeNumberException.class)
	public void testDivide3() {
		assertEquals(0, myDivide.divide(20, -10));
	}

	@Test
	public void testDivide4() {
		assertEquals(0, myDivide.divide(0, 10));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivide5() {
		assertEquals(2, myDivide.divide(20, 0));
	}
}
