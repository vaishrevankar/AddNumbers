package com.wipro.sub;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestSub {

	@Test
	void test() {
		Sub test = new Sub();
		int result = test.sub(6,5);
		assertEquals(1,result);
	}

}
