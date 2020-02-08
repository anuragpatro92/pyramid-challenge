package com.Test;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;

public class PyramidTest extends TestCase {

	PyramidController pc;

	@Before
	public void setUp() {
		pc = new PyramidController();
	}

	@Test
	public void test1() {
		Boolean value = pc.getTestService("banana");
		assertTrue(value);
	}

	@Test
	public void test2() {
		Boolean value = pc.getTestService("bandana");
		assertTrue(!value);
	}

	@Test
	public void test3() {
		Boolean value = pc.getTestService("");
		assertTrue(!value);
	}

	@Test
	public void test4() {
		Boolean value = pc.getTestService("ebananagegegegef");
		assertTrue(!value);
	}

	@Test
	public void test5() {
		Boolean value = pc.getTestService("ebananagegegege");
		assertTrue(value);
	}

	@Test
	public void test6() {
		Boolean value = pc.getTestService("BananA");
		assertTrue(!value);
	}

}
