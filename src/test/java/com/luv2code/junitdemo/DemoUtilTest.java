package com.luv2code.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import java.time.Duration;
import java.util.List;

import org.junit.jupiter.api.*;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
@TestMethodOrder(MethodOrderer.MethodName.class)
class DemoUtilTest {

	DemoUtils demoUtils;

	@BeforeEach
	void setupBeforeEach() {
		demoUtils = new DemoUtils();
		System.out.println("@BeforeEach excutes before the excution of each test method");
	}

	@AfterEach
	void setupAfterEach() {
		System.out.println("Running @AfterEach method\n");
	}

	@BeforeAll
	static void setupBeforeEachClass() {
		System.out.println("@BeforeAll excutes only once before all test methods excution in the class\n");
	}

	@AfterAll
	static void setupAfterEachClass() {
		System.out.println("@AfterAll excutes only once After all test methods excution in the class");
	}

	@Test
	void test_Equals_And_Not_Equals_With_Add() {

		System.out.println("Running test: testEqualsAndNotEqualsWithAdd");

		assertEquals(6, demoUtils.add(2, 4), "2 + 4 must be 6");
		assertNotEquals(6, demoUtils.add(1, 9), "1 + 9 must not be 6");

	}
	
	@Test
	void test_Equals_And_Not_Equals_With_Multiply() {

		System.out.println("Running test: testEqualsAndNotEqualsWithMultiply");

		assertEquals(6, demoUtils.multiply(2, 4), "2 * 4 must be 8");
		assertNotEquals(6, demoUtils.multiply(1, 9), "1 * 9 must not be 6");

	}

	@Test
	void test_Null_And_Not_Null() {

		System.out.println("Running test: testNullAndNotNull");

		String str1 = null;
		String str2 = "Ahmed";

		assertNull(demoUtils.checkNull(str1), "Object should be null");
		assertNotNull(demoUtils.checkNull(str2), "Object should not be null");
	}

	@Test
	void test_Same_And_Not_Same() {

		System.out.println("Running test: testSameAndNotSame");

		String str = "luv2Code";

		assertSame(demoUtils.getAcademy(), demoUtils.getAcademyDuplicate(), "Object should refer to same Object");
		assertNotSame(str, demoUtils.getAcademyDuplicate(), "Object should not refer to same Object");
	}

	@Test
	void test_True_And_False() {

		System.out.println("Running test: testTrueAndFalse");

		int n1 = 10;
		int n2 = 5;

		assertTrue(demoUtils.isGreater(n1, n2), "this should return true");
		assertFalse(demoUtils.isGreater(n2, n1), "this should return false");
	}

	@Test
	void test_Array_Equals() {

		System.out.println("Running test: testArrayEquals");

		String[] arr = { "A", "B", "C" };

		assertArrayEquals(arr, demoUtils.getFirstThreeLettersOfAlphabet(), "Arrays should be the same");
	}

	@Test
	void test_Iterable_Equals() {

		System.out.println("Running test: testIterableEquals");

		List<String> theList = List.of("luv", "2", "code");

		assertIterableEquals(theList, demoUtils.getAcademyInList(), "Expected List should be same as actual list");
	}

	@Test
	void test_Lines_Match() {

		System.out.println("Running test: testLineMatch");

		List<String> theList = List.of("luv", "2", "code");

		assertLinesMatch(theList, demoUtils.getAcademyInList(), "Lines Should Match");
	}

	@Test
	void test_Throws_And_Does_Not_Throws() {

		System.out.println("Running test: testThrowsAndDoesNotThrows");

		assertThrows(Exception.class, ()->{ demoUtils.throwException(-1); } ,"Should Throw Exception");
		assertDoesNotThrow(()->{ demoUtils.throwException(9); } ,"Should Not Throw Exception");
	}
	
	@Test
	void test_Timeout() {

		System.out.println("Running test: testTimeout");

		assertTimeout(Duration.ofSeconds(3), ()->{demoUtils.checkTimeout();}, "Method Should Excutes in 3 seconds");
	}
}
