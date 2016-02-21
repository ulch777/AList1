package A1;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class Alist_1Test {
	AListEx aa = null;

	@Parameterized.Parameters
	public static Collection<Object[]> primeNumbers() {
		return Arrays.asList(new Object[][] { { new Alist_0() },
				{ new Alist_1() }, { new Alist_2() }, { new LList1() }, { new LList2() } });
	}

	@Before
	public void setUp() {
		aa.clear();
	}

	public Alist_1Test(AListEx aa) {
		this.aa = aa;
	}

	@Test
	public void testinit_many() {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 2, 3 };

		aa.init(ar);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testinit_2() {
		int[] ar = { 1, 2 };
		int[] arr = { 1, 2 };

		aa.init(ar);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testinit_1() {
		int[] ar = { 1 };
		int[] arr = { 1 };

		aa.init(ar);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testinit_0() {
		int[] ar = {};
		int[] arr = {};

		aa.init(ar);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = NullPointerException.class)
	public void testinit_null() {
		int[] ar = null;

		aa.init(ar);
	}

	@Test
	public void testAddEnd_many() {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 2, 3, 155 };
		int val = 155;

		aa.init(ar);
		aa.addEnd(val);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testAddEnd_2() {
		int[] ar = { 1, 2 };
		int[] arr = { 1, 2, 155 };
		int val = 155;

		aa.init(ar);
		aa.addEnd(val);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testAddEnd_1() {
		int[] ar = { 1 };
		int[] arr = { 1, 155 };
		int val = 155;

		aa.init(ar);
		aa.addEnd(val);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testAddEnd_0() {
		int[] ar = {};
		int[] arr = { 155 };
		int val = 155;

		aa.init(ar);
		aa.addEnd(val);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = NullPointerException.class)
	public void testAddEnd_null() {
		int[] ar = null;
		int val = 155;

		aa.init(ar);
		aa.addEnd(val);
	}

	@Test
	public void testDelEnd_many() {

		int[] ar = { 1, 2, 3, 4 };
		int[] arr = { 1, 2, 3 };

		aa.init(ar);
		aa.delEnd();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testDelEnd_2() {

		int[] ar = { 1, 2 };
		int[] arr = { 1 };

		aa.init(ar);
		aa.delEnd();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testDelEnd_1() {

		int[] ar = { 1 };
		int[] arr = {};

		aa.init(ar);
		aa.delEnd();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = ListEmptyExeption.class)
	public void testDelEnd_0() {
		int[] ar = {};
		aa.init(ar);
		aa.delEnd();
	}

	@Test(expected = NullPointerException.class)
	public void testDelEnd_null() {

		int[] ar = null;

		aa.init(ar);
		aa.delEnd();
	}

	@Test
	public void testAddStart_many() {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 0, 1, 2, 3 };
		int val = 0;

		aa.init(ar);
		aa.addStart(val);
		assertArrayEquals(arr, aa.toArray());

	}

	@Test
	public void testAddStart_2() {
		int[] ar = { 1, 2 };
		int[] arr = { 0, 1, 2 };
		int val = 0;

		aa.init(ar);
		aa.addStart(val);
		assertArrayEquals(arr, aa.toArray());

	}

	@Test
	public void testAddStart_1() {
		int[] ar = { 2 };
		int[] arr = { 0, 2 };
		int val = 0;

		aa.init(ar);
		aa.addStart(val);
		assertArrayEquals(arr, aa.toArray());

	}

	@Test
	public void testAddStart_0() {
		int[] ar = {};
		int[] arr = { 0 };
		int val = 0;

		aa.init(ar);
		aa.addStart(val);
		assertArrayEquals(arr, aa.toArray());

	}

	@Test(expected = NullPointerException.class)
	public void testAddStart_null() {
		int[] ar = null;

		aa.init(ar);
	}

	@Test
	public void testDelStart_many() {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 2, 3 };

		aa.init(ar);
		aa.delStart();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testDelStart_2() {
		int[] ar = { 1, 2 };
		int[] arr = { 2 };

		aa.init(ar);
		aa.delStart();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testDelStart_1() {
		int[] ar = { 1 };
		int[] arr = {};

		aa.init(ar);
		aa.delStart();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = NegativeArraySizeException.class)
	public void testDelStart_0() {
		int[] ar = {};
		int[] arr = {};

		aa.init(ar);
		aa.delStart();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = NullPointerException.class)
	public void testDelStart_null() {
		int[] ar = null;

		aa.init(ar);
		aa.delStart();
	}

	@Test
	public void testDelPos_many() {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 3 };
		int pos = 1;

		aa.init(ar);
		aa.delPos(pos);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testDelPos_2() {
		int[] ar = { 1, 2 };
		int[] arr = { 1 };
		int pos = 1;

		aa.init(ar);
		aa.delPos(pos);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testDelPos_1() {
		int[] ar = { 1 };
		int[] arr = {};
		int pos = 0;

		aa.init(ar);
		aa.delPos(pos);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = NegativeArraySizeException.class)
	public void testDelPos_0() {
		int[] ar = {};
		int pos = 0;
		aa.init(ar);
		aa.delPos(pos);
	}

	@Test(expected = NullPointerException.class)
	public void testDelPos_null() {
		int[] ar = null;
		int pos = 2;

		aa.init(ar);
		aa.delPos(pos);

	}

	@Test(expected=NegativeArraySizeException.class)
	public void testDelPos_pos() {
		int[] ar = { 1, 2, 3 };
		int pos = 4;
		aa.init(ar);
		aa.delPos(pos);
	}

	@Test
	public void testAddPos_many() {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 2, 122, 3 };
		int pos = 2;
		int val = 122;

		aa.init(ar);
		aa.addPos(pos, val);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testAddPos_2() {
		int[] ar = { 1, 2 };
		int[] arr = { 1, 2, 122 };
		int pos = 2;
		int val = 122;

		aa.init(ar);
		aa.addPos(pos, val);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testAddPos_1() {
		int[] ar = { 1 };
		int[] arr = { 1, 122 };
		int pos = 1;
		int val = 122;

		aa.init(ar);
		aa.addPos(pos, val);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testAddPos_0() {
		int[] ar = {};
		int[] arr = { 122 };
		int pos = 0;
		int val = 122;

		aa.init(ar);
		aa.addPos(pos, val);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = NullPointerException.class)
	public void testAddPos_null() {
		int[] ar = null;
		int pos = 0;
		int val = 122;

		aa.init(ar);
		aa.addPos(pos, val);
	}

	@Test
	public void testAddPos_pos() {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 2, 3, 122 };
		int pos = 3;
		int val = 122;

		aa.init(ar);
		aa.addPos(pos, val);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testToString_many() {
		int[] ar = { 1, 2, 3 };
		String str = "1, 2, 3, ";

		aa.init(ar);
		assertEquals(str, aa.toString());
	}

	@Test
	public void testToString_2() {
		int[] ar = { 1, 2 };
		String str = "1, 2, ";

		aa.init(ar);
		assertEquals(str, aa.toString());
	}

	@Test
	public void testToString_1() {
		int[] ar = { 1 };
		String str = "1, ";

		aa.init(ar);
		assertEquals(str, aa.toString());
	}

	@Test
	public void testToString_0() {
		int[] ar = {};
		String str = "";

		aa.init(ar);
		assertEquals(str, aa.toString());
	}

	@Test(expected = NullPointerException.class)
	public void testToString_null() {
		int[] ar = null;

		aa.init(ar);
		aa.toString();
	}

	@Test
	public void testToArray_many() {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 2, 3 };

		aa.init(ar);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testToArray_0() {
		int[] ar = {};
		int[] arr = {};

		aa.init(ar);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = NullPointerException.class)
	public void testToArray_null() {
		int[] ar = null;

		aa.init(ar);
		aa.toArray();
	}

	@Test
	public void testClear_many() {
		int[] ar = { 23, 12, 4, 7, 22 };
		int[] arr = {};

		aa.init(ar);
		aa.clear();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testClear_2() {
		int[] ar = { 23, 12 };
		int[] arr = {};

		aa.init(ar);
		aa.clear();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testClear_1() {
		int[] ar = { 23 };
		int[] arr = {};

		aa.init(ar);
		aa.clear();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testClear_0() {
		int[] ar = {};
		int[] arr = {};

		aa.init(ar);
		aa.clear();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = NullPointerException.class)
	public void testClear_null() {
		int[] ar = null;

		aa.init(ar);
		aa.clear();
	}

	@Test
	public void testSize_many() {
		int[] ar = { 23, 12, 4, 7, 22 };

		aa.init(ar);
		assertEquals(5, aa.size());
	}

	@Test
	public void testSize_2() {
		int[] ar = { 23, 12 };

		aa.init(ar);
		assertEquals(2, aa.size());
	}

	@Test
	public void testSize_1() {
		int[] ar = { 23 };

		aa.init(ar);
		assertEquals(1, aa.size());
	}

	@Test
	public void testSize_0() {
		int[] ar = {};

		aa.init(ar);
		assertEquals(0, aa.size());
	}

	@Test(expected = NullPointerException.class)
	public void testSize_null() {
		int[] ar = null;

		aa.init(ar);
		aa.size();
	}

	@Test
	public void testGet_many() {
		int[] ar = { 23, 12, 4, 7, 22 };

		aa.init(ar);
		assertEquals(22, aa.get(4));
	}

	@Test
	public void testGet_2() {
		int[] ar = { 23, 12 };

		aa.init(ar);
		assertEquals(12, aa.get(1));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGet_1() {
		int[] ar = { 23 };

		aa.init(ar);
		aa.get(5);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testGet_0() {
		int[] ar = {};

		aa.init(ar);
		aa.get(5);
	}

	@Test(expected = NullPointerException.class)
	public void testGet_null() {
		int[] ar = null;

		aa.init(ar);
		aa.get(1);
	}

	@Test
	public void testSet_many() {
		int[] ar = { 23, 12, 4, 7, 22 };
		int[] arr = { 23, 0, 4, 7, 22 };

		aa.init(ar);
		aa.set(1, 0);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testSet_many1() {
		int[] ar = { 23, 12, 4, 7, 22 };

		aa.init(ar);
		aa.set(6, 0);
	}

	@Test
	public void testSet_2() {
		int[] ar = { 23, 12 };
		int[] arr = { 0, 12 };

		aa.init(ar);
		aa.set(0, 0);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testSet_1() {
		int[] ar = { 23 };
		int[] arr = { 0 };

		aa.init(ar);
		aa.set(0, 0);
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = ArrayIndexOutOfBoundsException.class)
	public void testSet_0() {
		int[] ar = {};
		aa.init(ar);
		aa.set(0, 0);
	}

	@Test(expected = NullPointerException.class)
	public void testSet_null() {
		int[] ar = null;

		aa.init(ar);
		aa.set(0, 0);
	}

	@Test
	public void testMax_many() {
		int[] ar = { 23, 12, 4, 7, 22 };

		aa.init(ar);
		assertEquals(23, aa.max());
	}

	@Test
	public void testMax_2() {
		int[] ar = { 7, 22 };

		aa.init(ar);
		assertEquals(22, aa.max());
	}

	@Test
	public void testMax_1() {
		int[] ar = { 7 };

		aa.init(ar);
		assertEquals(7, aa.max());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMax_0() {
		int[] ar = {};

		aa.init(ar);
		aa.max();
	}

	@Test(expected = NullPointerException.class)
	public void testMax_null() {
		int[] ar = null;

		aa.init(ar);
		aa.max();
	}

	@Test
	public void testMin_many() {
		int[] ar = { 23, 12, 4, 7, 22 };

		aa.init(ar);
		assertEquals(4, aa.min());
	}

	@Test
	public void testMin_2() {
		int[] ar = { 7, 22 };

		aa.init(ar);
		assertEquals(7, aa.min());
	}

	@Test
	public void testMin_1() {
		int[] ar = { 7 };

		aa.init(ar);
		assertEquals(7, aa.min());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMin_0() {
		int[] ar = {};

		aa.init(ar);
		aa.min();
	}

	@Test(expected = NullPointerException.class)
	public void testMin_null() {
		int[] ar = null;

		aa.init(ar);
		aa.min();
	}

	@Test
	public void testMaxIndex_many() {
		int[] ar = { 23, 12, 4, 7, 22 };

		aa.init(ar);
		assertEquals(0, aa.maxIndex());
	}

	@Test
	public void testMaxIndex_2() {
		int[] ar = { 7, 22 };

		aa.init(ar);
		assertEquals(1, aa.maxIndex());
	}

	@Test
	public void testMaxIndex_1() {
		int[] ar = { 7 };

		aa.init(ar);
		assertEquals(0, aa.maxIndex());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMaxIndex_0() {
		int[] ar = {};

		aa.init(ar);
		aa.maxIndex();
	}

	@Test(expected = NullPointerException.class)
	public void testMaxIndex_null() {
		int[] ar = null;

		aa.init(ar);
		aa.maxIndex();
	}

	@Test
	public void testMinIndex_many() {
		int[] ar = { 23, 12, 4, 7, 22 };

		aa.init(ar);
		assertEquals(2, aa.minIndex());
	}

	@Test
	public void testMinIndex_2() {
		int[] ar = { 7, 22 };

		aa.init(ar);
		assertEquals(0, aa.minIndex());
	}

	@Test
	public void testMinIndex_1() {
		int[] ar = { 7 };

		aa.init(ar);
		assertEquals(0, aa.minIndex());
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMinIndex_0() {
		int[] ar = {};

		aa.init(ar);
		aa.minIndex();
	}

	@Test(expected = NullPointerException.class)
	public void testMinIndex_null() {
		int[] ar = null;

		aa.init(ar);
		aa.minIndex();
	}

	@Test
	public void testReverse_many() {
		int[] ar = { 23, 12, 4, 7, 22 };
		int[] arr = { 22, 7, 4, 12, 23 };

		aa.init(ar);
		aa.reverse();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testReverse_2() {
		int[] ar = { 23, 12 };
		int[] arr = { 12, 23 };

		aa.init(ar);
		aa.reverse();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testReverse_1() {
		int[] ar = { 23 };
		int[] arr = { 23 };

		aa.init(ar);
		aa.reverse();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testReverse_0() {
		int[] ar = {};
		int[] arr = {};

		aa.init(ar);
		aa.reverse();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = NullPointerException.class)
	public void testReverse_null() {
		int[] ar = null;

		aa.init(ar);
		aa.reverse();
	}

	@Test
	public void testSortBubble_many() {
		int[] ar = { 23, 12, 4, 7, 22 };
		int[] arr = { 4, 7, 12, 22, 23 };

		aa.init(ar);
		aa.sortBubble();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testSortBubble_2() {
		int[] ar = { 23, 12 };
		int[] arr = { 12, 23 };

		aa.init(ar);
		aa.sortBubble();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testSortBubble_1() {
		int[] ar = { 23 };
		int[] arr = { 23 };

		aa.init(ar);
		aa.sortBubble();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test
	public void testSortBubble_0() {
		int[] ar = {};
		int[] arr = {};

		aa.init(ar);
		aa.sortBubble();
		assertArrayEquals(arr, aa.toArray());
	}

	@Test(expected = NullPointerException.class)
	public void testSortBubble_null() {
		int[] ar = null;

		aa.init(ar);
		aa.sortBubble();
	}
	@Test
	public void iter_hasNext_false() {
		Iterator<Integer> i1=aa.iterator();
		assertFalse(i1.hasNext());
		
	}
	@Test
	public void iter_hasNext_true() 
	{
		int[] ar = {1,2,3};
		aa.init(ar);
		Iterator<Integer> i1=aa.iterator();
		assertTrue(i1.hasNext());
		
	}
	
	@Test
	public void iter_Next() 
	{
		int[] ar = {1};
		aa.init(ar);
		Iterator<Integer> i1=aa.iterator();
		assertTrue(i1.hasNext());
		int a=i1.next();
		assertEquals(1,a);
		
	}
	@Test
	public void iter_Next_2() 
	{
		int[] ar = {1,2};
		aa.init(ar);
		Iterator<Integer> i1=aa.iterator();
		assertTrue(i1.hasNext());
		int a=i1.next();
		assertEquals(1,a);
		
	}
}
