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

	@Test
	public void testCountYZ2() {
		String str = "day fez";
		assertEquals(2, yz.countYZ(str));
	}
	
	@Test
	public void testCountYZ3() {
		String str = "day fyyyz";
		assertEquals(2, yz.countYZ(str));
	}

	@Test
	public void testCountYZ4() {
		String str = "day yak";
		assertEquals(1, yz.countYZ(str));
	}

	@Test
	public void testCountYZ5() {
		String str = "day:yak";
		assertEquals(1, yz.countYZ(str));
	}

	@Test
	public void testCountYZ6() {
		String str = "!!day--yaz!!";
		assertEquals(2, yz.countYZ(str));
	}
	
	@Test
	public void testCountYZ7() {
		String str = "yak zak";
		assertEquals(0, yz.countYZ(str));
	}

	@Test
	public void testCountYZ8() {
		String str = "DAY abc ZYZ";
		assertEquals(2, yz.countYZ(str));
	}

	@Test
	public void testCountYZ9() {
		String str = "fez day";
		assertEquals(2, yz.countYZ(str));
	}

	@Test
	public void testCountYZ10() {
		String str = "aaz yyz my";
		assertEquals(3, yz.countYZ(str));
	}

	@Test
	public void testCountYZ11() {
		String str = "y2bz";
		assertEquals(2, yz.countYZ(str));
	}

	@Test
	public void testCountYZ12() {
		String str = "zxyx";
		assertEquals(0, yz.countYZ(str));
	}
	
	

}
