package com.systemsinmotion.petrescue.entity;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AgeTypeTest {

	@Test
	public void typeBaby() {
		assertEquals(AgeType.BABY, AgeType.byDescription("baby"));
		assertEquals(AgeType.BABY, AgeType.byDescription("BaBy"));
	}

	@Test
	public void typeYoung() {
		assertEquals(AgeType.YOUNG, AgeType.byDescription("YOUNG"));
	}

	@Test
	public void typeAdult() {
		assertEquals(AgeType.ADULT, AgeType.byDescription("AduLt"));
	}

	@Test
	public void typeSenior() {
		assertEquals(AgeType.SENIOR, AgeType.byDescription("sEnIoR"));
	}
}
