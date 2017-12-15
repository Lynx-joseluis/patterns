package com.jlac.designpatterns.decorator.io;

import static org.junit.Assert.*;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UpperCaseInputStreamTest {

	private static final char EMPTY_SPACE = ' ';
	private static final String TEST_FILE = "./src/test/resources/UpperCaseInputStreamTest.txt";

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testRead() throws IOException {
		
		
		FilterInputStream filterInputStream = new BufferedInputStream(new FileInputStream(TEST_FILE));
		
		showContentWithRead(filterInputStream);
		
		UpperCaseInputStream upperCaseInputStream = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream(TEST_FILE)));
				
		showContentWithRead(upperCaseInputStream);
		
	}

	private void showContentWithRead(FilterInputStream filterInputStream) throws IOException {
		
		System.out.println("\n************ Using read with class=" + filterInputStream.getClass());
		
		int c;
		InputStream in = filterInputStream;
		while ((c = in.read()) >= 0) {
			System.out.print((char) c);
			
			if (filterInputStream instanceof UpperCaseInputStream) {
				if (Character.isAlphabetic(c)) {
					assertTrue(Character.isUpperCase(c));
				}
			}
			
		}
		in.close();		
	}

	@Test
	public void testReadByteArrayIntInt() throws IOException {
		
		FilterInputStream filterInputStream = new BufferedInputStream(new FileInputStream(TEST_FILE));
		
		showContentWithReadArray(filterInputStream);
		
		UpperCaseInputStream upperCaseInputStream = new UpperCaseInputStream(new BufferedInputStream(new FileInputStream(TEST_FILE)));
		
		showContentWithReadArray(upperCaseInputStream);
	}
	
	private void showContentWithReadArray(FilterInputStream filterInputStream) throws IOException {
		
		System.out.println("\n************ Using read(byte[] b, int offset, int len) with class=" + filterInputStream.getClass());
		
		int c;
		InputStream in = filterInputStream;
		byte[] arr = new byte[8]; // the buffer's size is small on purpose as the test file is not big enough for a bigger size.
		
		while ((c = in.read(arr,0,8)) >= 0) {
//			System.out.print(String.format("%s[%d]", new String(arr,0,c), c));
			System.out.print(String.format("%s", new String(arr,0,c)));
			
			if (filterInputStream instanceof UpperCaseInputStream) {
				if (Character.isAlphabetic(arr[0])) {
					assertTrue(Character.isUpperCase(arr[0]));
				}
			}
			
		}
		in.close();		
	}

}
