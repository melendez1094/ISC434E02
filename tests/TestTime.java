import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;


public class TestTime {

	MyTime test = new MyTime();
	
	@Test
	public void testEarlier() {
		
		ArrayList<Integer> t1 =  new ArrayList<Integer>();
		ArrayList<Integer> t2 = new ArrayList<Integer>();
		
		t1.add(3);
		t1.add(40);
		t2.add(3);
		t2.add(41);
				
		assertTrue("t1 < t2", test.earlier(t1, t2));
		
		t1.clear();
		t2.clear();
		
		t1.add(2);
		t1.add(40);
		t2.add(3);
		t2.add(40);
		
		assertTrue("t1 < t2", test.earlier(t1, t2));
		
		t1.clear();
		t2.clear();
		
		t1.add(3);
		t1.add(40);
		t2.add(4);
		t2.add(40);
		
		assertTrue("t1 < t2", test.earlier(t1, t2));
		
		t1.clear();
		t2.clear();
		
		t1.add(3);
		t1.add(40);
		t2.add(3);
		t2.add(40);
		
		assertFalse("t1 no es menor que t2", test.earlier(t1, t2));
		
		t1.clear();
		t2.clear();
		
		t1.add(3);
		t1.add(41);
		t2.add(3);
		t2.add(40);
		
		assertFalse("t1 > t2", test.earlier(t1, t2));
		
		t1.clear();
		t2.clear();
		
		t1.add(3);
		t1.add(41);
		t2.add(2);
		t2.add(40);
		
		assertFalse("t1 > t2", test.earlier(t1, t2));
		
		t1.clear();
		t2.clear();
		
		t1.add(3);
		t1.add(39);
		t2.add(2);
		t2.add(40);
		
		assertFalse("t1 > t2", test.earlier(t1, t2));
		
		t1.clear();
		t2.clear();
		
		t1.add(2);
		t1.add(41);
		t2.add(3);
		t2.add(40);
		
		assertTrue("t1 < t2", test.earlier(t1, t2));
		
		t1.clear();
		t2.clear();
		
		t1.add(3);
		t1.add(39);
		t2.add(4);
		t2.add(40);
		
		assertTrue("t1 < t2", test.earlier(t1, t2));
		
	}

	@Test
	public void testNextSecond() {
		fail("Not yet implemented");
	}

}
