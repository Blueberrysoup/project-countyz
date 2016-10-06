package com.codebat;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

import com.codebat.CountYZ;

public class TestCountYZ {

	CountYZ yz;
	
	@Before
	public void setUp(){
		yz = new CountYZ();
	}
	
	@Test
	public void testCountYZ1() {
		String str = "fez day";
		assertEquals(2, yz.countYZ(str));
	}

}
