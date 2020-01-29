package com.maven.kamal;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.MethodSorters;

//import com.maven.examples.LuckyNumber;

public class TestPrimeNo {
	
	
	//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
	//@FixMethodOrder(MethodSorters.NAME_ASCENDING)
	//@Ignore
	//@After
	@Test
	public void testPrimeNo() {
		assertEquals(true, PrimeNo.checkPrime(8));
	
	}
	//@Before
	@Test
	public void testEven() {
		assertEquals(true, PrimeNo.checkEven(10));
	
	}
}
