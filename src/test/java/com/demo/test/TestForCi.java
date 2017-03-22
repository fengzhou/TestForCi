package com.demo.test;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 */
public class TestForCi {

	@Test
	public void test_01(){
		Assert.assertEquals(1,1);
	}

	@Test
	public void test_02(){
		Assert.assertEquals(1,2);
	}

}
