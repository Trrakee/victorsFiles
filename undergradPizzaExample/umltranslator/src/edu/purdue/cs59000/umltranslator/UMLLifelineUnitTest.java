package edu.purdue.cs59000.umltranslator;

import org.junit.Test;

import static org.junit.Assert.*;


public class UMLLifelineUnitTest{
	
	
	@Test
	public void equalsTest() throws Exception {
		
		UMLLifeline umlLifeline1 = new UMLLifeline( new UMLClass("1"));		
		UMLLifeline umlLifeline2 = new UMLLifeline(new UMLClass("2"));
		UMLLifeline umlLifeline3 = new UMLLifeline( new UMLClass("1"));
		
		assertFalse(umlLifeline1.equals(umlLifeline2));
		assertTrue(umlLifeline3.equals(umlLifeline1));
		
		UMLLifeline umlLifeline4 = new UMLLifeline(new UMLActor("4"));
		UMLLifeline umlLifeline5 = new UMLLifeline(new UMLActor("5"));	
		UMLLifeline umlLifeline6 = new UMLLifeline(new UMLActor("4"));
		
		assertFalse(umlLifeline4.equals(umlLifeline5));
		assertTrue(umlLifeline6.equals(umlLifeline4));
	}
	
	@Test
	public void exceptionTest() throws Exception {
		
		UMLLifeline umlLifeline1 = new UMLLifeline(new UMLClass("") {

			@Override
			public boolean equals(Object other) {
				return false;
			}},
				new UMLSequenceDiagram());
		
		Object o = new Object();
		Exception ee = null; 
		try {
			assertFalse(umlLifeline1.equals(o));
		}catch(Exception e) {
			ee = e;
		}
		
		assertNull(ee);
		
		UMLLifeline umlLifeline3 = new UMLLifeline(new UMLActor("","") {

			@Override
			public boolean equals(Object other) {
				return false;
			}},
				new UMLSequenceDiagram());
		
		Object o1 = new Object();
		Exception ee1 = null; 
		try {
			assertFalse(umlLifeline3.equals(o1));
		}catch(Exception e) {
			ee1 = e;
		}
		
		assertNull(ee1);
	
	}
	
	
	
	
	
}
