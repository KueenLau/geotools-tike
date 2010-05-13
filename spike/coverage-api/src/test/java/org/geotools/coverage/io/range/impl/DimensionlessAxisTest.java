//package org.geotools.coverage.io.range.impl;
//
//import javax.measure.Measure;
//import javax.measure.quantity.Dimensionless;
//import javax.measure.unit.Unit;
//
//import junit.framework.Assert;
//
//import org.geotools.coverage.io.impl.range.BandIndexMeasure;
//import org.geotools.coverage.io.impl.range.DimensionlessAxis;
//import org.geotools.coverage.io.range.RangeAxis;
//import org.geotools.feature.NameImpl;
//import org.geotools.util.SimpleInternationalString;
//import org.junit.Test;
//
//public class DimensionlessAxisTest extends Assert {
//
//	/**
//	 * Toy RangeAxis consisting of three bands named A, B and C.
//	 * <p>
//	 * This really is a toy example; if you have a formal
//	 * fixed data dictionary consider the use of a Java Enumeration
//	 * (and EnumMeasure), if you have an open ended data dictionary
//	 * consider a CodeList (and CodeMeasure).
//	 */
//	@Test
//	public void testTOY(){
//		DimensionlessAxis TOY = new DimensionlessAxis(
//				new String[]{"A","B","C"},
//				new NameImpl("Color"),
//				new SimpleInternationalString("Toy Example"));		
//		
//		assertEquals( Unit.ONE, TOY.getUnitOfMeasure() );
//		Measure<String, Dimensionless> key = TOY.getKey(0);
//		assertEquals( "A", key.getValue() );		
//		assertTrue(key instanceof BandIndexMeasure );
//		assertNull( TOY.getCoordinateReferenceSystem() );
//	}
//	
//	/**
//	 * Depth represented as an axis of one band
//	 */
//	@Test
//	public void testElevation(){
//		DimensionlessAxis HEIGHT = new DimensionlessAxis(1, new NameImpl("height"), new SimpleInternationalString("Height from sealevel"));
//		assertEquals( Unit.ONE, HEIGHT.getUnitOfMeasure() );
//		Measure<String, Dimensionless> key = HEIGHT.getKey(0);
//		assertTrue(key instanceof BandIndexMeasure );
//		assertEquals( "0", key.getValue() );
//		
//		// Make sure we can discover everything we need via the RangeAxis API
//		RangeAxis<String, Dimensionless> axis = HEIGHT; 
//		assertEquals( Unit.ONE, axis.getUnitOfMeasure() );
//		Measure<String, Dimensionless> measure = axis.getKey(0);
//		assertEquals( Unit.ONE, measure.getUnit() );
//		assertEquals( "0", key.getValue() );
//	}
//
//}
