package com.test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

import java.util.ArrayList;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionTest {

	@Test(expected = IndexOutOfBoundsException.class)
	public void empty() {
		new ArrayList<Object>().get(0);
	}


	 @Rule public ExpectedException thrown = ExpectedException.none();
	 
	  @Test public void shouldTestExceptionMessage() throws
	 IndexOutOfBoundsException { 
		  
		  ArrayList<Object> list = new ArrayList<Object>();
	 
	  thrown.expect(IndexOutOfBoundsException.class);
	 thrown.expectMessage("Index: 0, Size: 0"); 
	  list.get(0); 
	  }


	@SuppressWarnings("deprecation")
	@Test
	public void testExceptionMessage() {
		try {
			new ArrayList<Object>().get(0);
			fail("Esperado que IndexOutOfBoundsException seja lançada");
		} catch (IndexOutOfBoundsException ex) {
			assertThat(ex.getMessage(), is("Index: 0, Size: 0"));
		}

	}
}
