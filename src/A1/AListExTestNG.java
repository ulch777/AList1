package A1;
import java.util.Iterator;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class AListExTestNG extends Assert 
{
	AListEx aa = null;

	@DataProvider
	public Object[][] dp() 
	{
		return new Object[][] 
				{
				{ new Alist_0() },
				{ new Alist_1() },
				{ new Alist_2() },
				{ new LList1() },
				{ new LList2() }
				};
	}
	public AListExTestNG(AListEx aa) 
	{
		this.aa = aa;
	}
	public AListExTestNG() {}

	@Test(dataProvider = "dp")
	public void testinit_many(AListEx aa) {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 2, 3 };
		aa.init(ar);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testinit_2(AListEx aa) {
		int[] ar = { 1, 2 };
		int[] arr = { 1, 2 };
		aa.init(ar);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testinit_1(AListEx aa) {
		int[] ar = { 1 };
		int[] arr = { 1 };
		aa.init(ar);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testinit_0(AListEx aa) {
		int[] ar = {};
		int[] arr = {};
		aa.init(ar);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testinit_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
	}

	@Test(dataProvider = "dp")
	public void testAddEnd_many(AListEx aa) {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 2, 3, 155 };
		int val = 155;
		aa.init(ar);
		aa.addEnd(val);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testAddEnd_2(AListEx aa) {
		int[] ar = { 1, 2 };
		int[] arr = { 1, 2, 155 };
		int val = 155;
		aa.init(ar);
		aa.addEnd(val);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testAddEnd_1(AListEx aa) {
		int[] ar = { 1 };
		int[] arr = { 1, 155 };
		int val = 155;
		aa.init(ar);
		aa.addEnd(val);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testAddEnd_0(AListEx aa) throws Exception {
		int[] ar = {};
		int[] arr = { 155 };
		int val = 155;
		aa.init(ar);
		aa.addEnd(val);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testAddEnd_null(AListEx aa) {
		int[] ar = null;
		int val = 155;
		aa.init(ar);
		aa.addEnd(val);
	}

	@Test(dataProvider = "dp")
	public void testDelEnd_many(AListEx aa) {

		int[] ar = { 1, 2, 3, 4 };
		int[] arr = { 1, 2, 3 };
		aa.init(ar);
		aa.delEnd();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testDelEnd_2(AListEx aa) {

		int[] ar = { 1, 2 };
		int[] arr = { 1 };
		aa.init(ar);
		aa.delEnd();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testDelEnd_1(AListEx aa) {

		int[] ar = { 1 };
		int[] arr = {};
		aa.init(ar);
		aa.delEnd();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = ListEmptyExeption.class)
	public void testDelEnd_0(AListEx aa) {
		int[] ar = {};
		int[] arr = {};
		aa.init(ar);
		aa.delEnd();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testDelEnd_null(AListEx aa) {

		int[] ar = null;
		aa.init(ar);
		aa.delEnd();
	}

	@Test(dataProvider = "dp")
	public void testAddStart_many(AListEx aa) {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 0, 1, 2, 3 };
		int val = 0;
		aa.init(ar);
		aa.addStart(val);
		Assert.assertEquals(aa.toArray(), arr);

	}

	@Test(dataProvider = "dp")
	public void testAddStart_2(AListEx aa) {
		int[] ar = { 1, 2 };
		int[] arr = { 0, 1, 2 };
		int val = 0;
		aa.init(ar);
		aa.addStart(val);
		Assert.assertEquals(aa.toArray(), arr);

	}

	@Test(dataProvider = "dp")
	public void testAddStart_1(AListEx aa) {
		int[] ar = { 2 };
		int[] arr = { 0, 2 };
		int val = 0;
		aa.init(ar);
		aa.addStart(val);
		Assert.assertEquals(aa.toArray(), arr);

	}

	@Test(dataProvider = "dp")
	public void testAddStart_0(AListEx aa) {
		int[] ar = {};
		int[] arr = { 0 };
		int val = 0;
		aa.init(ar);
		aa.addStart(val);
		Assert.assertEquals(aa.toArray(), arr);

	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testAddStart_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
	}

	@Test(dataProvider = "dp")
	public void testDelStart_many(AListEx aa) {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 2, 3 };
		aa.init(ar);
		aa.delStart();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testDelStart_2(AListEx aa) {
		int[] ar = { 1, 2 };
		int[] arr = { 2 };
		aa.init(ar);
		aa.delStart();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testDelStart_1(AListEx aa) {
		int[] ar = { 1 };
		int[] arr = {};
		aa.init(ar);
		aa.delStart();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NegativeArraySizeException.class)
	public void testDelStart_0(AListEx aa) {
		int[] ar = {};
		int[] arr = {};
		aa.init(ar);
		aa.delStart();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testDelStart_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.delStart();
	}

	@Test(dataProvider = "dp")
	public void testDelPos_many(AListEx aa) {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 3 };
		int pos = 1;
		aa.init(ar);
		aa.delPos(pos);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testDelPos_2(AListEx aa) {
		int[] ar = { 1, 2 };
		int[] arr = { 1 };
		int pos = 1;
		aa.init(ar);
		aa.delPos(pos);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testDelPos_1(AListEx aa) {
		int[] ar = { 1 };
		int[] arr = {};
		int pos = 0;
		aa.init(ar);
		aa.delPos(pos);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NegativeArraySizeException.class)
	public void testDelPos_0(AListEx aa) {
		int[] ar = {};
		int[] arr = {};
		int pos = 0;
		aa.init(ar);
		aa.delPos(pos);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testDelPos_null(AListEx aa) {
		int[] ar = null;
		int pos = 2;
		aa.init(ar);
		aa.delPos(pos);

	}

	@Test(dataProvider = "dp",expectedExceptions = NegativeArraySizeException.class)
	public void testDelPos_pos(AListEx aa) {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 2, 3 };
		int pos = 4;
		aa.init(ar);
		aa.delPos(pos);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testAddPos_many(AListEx aa) {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 2, 122, 3 };
		int pos = 2;
		int val = 122;
		aa.init(ar);
		aa.addPos(pos, val);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testAddPos_2(AListEx aa) {
		int[] ar = { 1, 2 };
		int[] arr = { 1, 2, 122 };
		int pos = 2;
		int val = 122;
		aa.init(ar);
		aa.addPos(pos, val);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testAddPos_1(AListEx aa) {
		int[] ar = { 1 };
		int[] arr = { 1, 122 };
		int pos = 1;
		int val = 122;
		aa.init(ar);
		aa.addPos(pos, val);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testAddPos_0(AListEx aa) {
		int[] ar = {};
		int[] arr = { 122 };
		int pos = 0;
		int val = 122;
		aa.init(ar);
		aa.addPos(pos, val);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testAddPos_null(AListEx aa) {
		int[] ar = null;
		int pos = 0;
		int val = 122;
		aa.init(ar);
		aa.addPos(pos, val);
	}

	@Test(dataProvider = "dp")
	public void testAddPos_pos(AListEx aa) {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 2, 3, 122 };
		int pos = 3;
		int val = 122;
		aa.init(ar);
		aa.addPos(pos, val);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testToString_many(AListEx aa) {
		int[] ar = { 1, 2, 3 };
		String str = "1, 2, 3, ";
		aa.init(ar);
		Assert.assertEquals(str, aa.toString());
	}

	@Test(dataProvider = "dp")
	public void testToString_2(AListEx aa) {
		int[] ar = { 1, 2 };
		String str = "1, 2, ";
		aa.init(ar);
		Assert.assertEquals(str, aa.toString());
	}

	@Test(dataProvider = "dp")
	public void testToString_1(AListEx aa) {
		int[] ar = { 1 };
		String str = "1, ";
		aa.init(ar);
		Assert.assertEquals(str, aa.toString());
	}

	@Test(dataProvider = "dp")
	public void testToString_0(AListEx aa) {
		int[] ar = {};
		String str = "";
		aa.init(ar);
		Assert.assertEquals(str, aa.toString());
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testToString_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.toString();
	}

	@Test(dataProvider = "dp")
	public void testToArray_many(AListEx aa) {
		int[] ar = { 1, 2, 3 };
		int[] arr = { 1, 2, 3 };
		aa.init(ar);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testToArray_0(AListEx aa) {
		int[] ar = {};
		int[] arr = {};
		aa.init(ar);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testToArray_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.toArray();
	}

	@Test(dataProvider = "dp")
	public void testClear_many(AListEx aa) {
		int[] ar = { 23, 12, 4, 7, 22 };
		int[] arr = {};
		aa.init(ar);
		aa.clear();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testClear_2(AListEx aa) {
		int[] ar = { 23, 12 };
		int[] arr = {};
		aa.init(ar);
		aa.clear();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testClear_1(AListEx aa) {
		int[] ar = { 23 };
		int[] arr = {};
		aa.init(ar);
		aa.clear();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testClear_0(AListEx aa) {
		int[] ar = {};
		int[] arr = {};
		aa.init(ar);
		aa.clear();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testClear_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.clear();
	}

	@Test(dataProvider = "dp")
	public void testSize_many(AListEx aa) {
		int[] ar = { 23, 12, 4, 7, 22 };
		aa.init(ar);
		Assert.assertEquals(5, aa.size());
	}

	@Test(dataProvider = "dp")
	public void testSize_2(AListEx aa) {
		int[] ar = { 23, 12 };
		aa.init(ar);
		Assert.assertEquals(2, aa.size());
	}

	@Test(dataProvider = "dp")
	public void testSize_1(AListEx aa) {
		int[] ar = { 23 };
		aa.init(ar);
		Assert.assertEquals(1, aa.size());
	}

	@Test(dataProvider = "dp")
	public void testSize_0(AListEx aa) {
		int[] ar = {};
		aa.init(ar);
		Assert.assertEquals(aa.size(), 0);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testSize_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.size();
	}

	@Test(dataProvider = "dp")
	public void testGet_many(AListEx aa) {
		int[] ar = { 23, 12, 4, 7, 22 };
		aa.init(ar);
		Assert.assertEquals(22, aa.get(4));
	}

	@Test(dataProvider = "dp")
	public void testGet_2(AListEx aa) {
		int[] ar = { 23, 12 };
		aa.init(ar);
		Assert.assertEquals(12, aa.get(1));
	}

	@Test(dataProvider = "dp",expectedExceptions = IllegalArgumentException.class)
	public void testGet_1(AListEx aa) {
		int[] ar = { 23 };
		aa.init(ar);
		aa.get(5);
	}

	@Test(dataProvider = "dp",expectedExceptions = IllegalArgumentException.class)
	public void testGet_0(AListEx aa) {
		int[] ar = {};
		aa.init(ar);
		aa.get(5);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testGet_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.get(1);
	}

	@Test(dataProvider = "dp")
	public void testSet_many(AListEx aa) {
		int[] ar = { 23, 12, 4, 7, 22 };
		int[] arr = { 23, 0, 4, 7, 22 };
		aa.init(ar);
		aa.set(1, 0);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void testSet_many1(AListEx aa) {
		int[] ar = { 23, 12, 4, 7, 22 };
		aa.init(ar);
		aa.set(6, 0);
	}

	@Test(dataProvider = "dp")
	public void testSet_2(AListEx aa) {
		int[] ar = { 23, 12 };
		int[] arr = { 0, 12 };
		aa.init(ar);
		aa.set(0, 0);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testSet_1(AListEx aa) {
		int[] ar = { 23 };
		int[] arr = { 0 };
		aa.init(ar);
		aa.set(0, 0);
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = ArrayIndexOutOfBoundsException.class)
	public void testSet_0(AListEx aa) {
		int[] ar = {};
		aa.init(ar);
		aa.set(0, 0);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testSet_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.set(0, 0);
	}

	@Test(dataProvider = "dp")
	public void testMax_many(AListEx aa) {
		int[] ar = { 23, 12, 4, 7, 22 };
		aa.init(ar);
		Assert.assertEquals(23, aa.max());
	}

	@Test(dataProvider = "dp")
	public void testMax_2(AListEx aa) {
		int[] ar = { 7, 22 };
		aa.init(ar);
		Assert.assertEquals(22, aa.max());
	}

	@Test(dataProvider = "dp")
	public void testMax_1(AListEx aa) {
		int[] ar = { 7 };
		aa.init(ar);
		Assert.assertEquals(7, aa.max());
	}

	@Test(dataProvider = "dp",expectedExceptions = IllegalArgumentException.class)
	public void testMax_0(AListEx aa) {
		int[] ar = {};
		aa.init(ar);
		aa.max();
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testMax_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.max();
	}

	@Test(dataProvider = "dp")
	public void testMin_many(AListEx aa) {
		int[] ar = { 23, 12, 4, 7, 22 };
		aa.init(ar);
		Assert.assertEquals(4, aa.min());
	}

	@Test(dataProvider = "dp")
	public void testMin_2(AListEx aa) {
		int[] ar = { 7, 22 };
		aa.init(ar);
		Assert.assertEquals(7, aa.min());
	}

	@Test(dataProvider = "dp")
	public void testMin_1(AListEx aa) {
		int[] ar = { 7 };
		aa.init(ar);
		Assert.assertEquals(7, aa.min());
	}

	@Test(dataProvider = "dp",expectedExceptions = IllegalArgumentException.class)
	public void testMin_0(AListEx aa) {
		int[] ar = {};
		aa.init(ar);
		aa.min();
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testMin_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.min();
	}

	@Test(dataProvider = "dp")
	public void testMaxIndex_many(AListEx aa) {
		int[] ar = { 23, 12, 4, 7, 22 };
		aa.init(ar);
		Assert.assertEquals(0, aa.maxIndex());
	}

	@Test(dataProvider = "dp")
	public void testMaxIndex_2(AListEx aa) {
		int[] ar = { 7, 22 };
		aa.init(ar);
		Assert.assertEquals(1, aa.maxIndex());
	}

	@Test(dataProvider = "dp")
	public void testMaxIndex_1(AListEx aa) {
		int[] ar = { 7 };
		aa.init(ar);
		Assert.assertEquals(0, aa.maxIndex());
	}

	@Test(dataProvider = "dp",expectedExceptions = IllegalArgumentException.class)
	public void testMaxIndex_0(AListEx aa) {
		int[] ar = {};
		aa.init(ar);
		aa.maxIndex();
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testMaxIndex_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.maxIndex();
	}

	@Test(dataProvider = "dp")
	public void testMinIndex_many(AListEx aa) {
		int[] ar = { 23, 12, 4, 7, 22 };
		aa.init(ar);
		Assert.assertEquals(2, aa.minIndex());
	}

	@Test(dataProvider = "dp")
	public void testMinIndex_2(AListEx aa) {
		int[] ar = { 7, 22 };
		aa.init(ar);
		Assert.assertEquals(0, aa.minIndex());
	}

	@Test(dataProvider = "dp")
	public void testMinIndex_1(AListEx aa) {
		int[] ar = { 7 };
		aa.init(ar);
		Assert.assertEquals(0, aa.minIndex());
	}

	@Test(dataProvider = "dp",expectedExceptions = IllegalArgumentException.class)
	public void testMinIndex_0(AListEx aa) {
		int[] ar = {};
		aa.init(ar);
		aa.minIndex();
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testMinIndex_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.minIndex();
	}

	@Test(dataProvider = "dp")
	public void testReverse_many(AListEx aa) {
		int[] ar = { 23, 12, 4, 7, 22 };
		int[] arr = { 22, 7, 4, 12, 23 };
		aa.init(ar);
		aa.reverse();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testReverse_2(AListEx aa) {
		int[] ar = { 23, 12 };
		int[] arr = { 12, 23 };
		aa.init(ar);
		aa.reverse();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testReverse_1(AListEx aa) {
		int[] ar = { 23 };
		int[] arr = { 23 };
		aa.init(ar);
		aa.reverse();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testReverse_0(AListEx aa) {
		int[] ar = {};
		int[] arr = {};
		aa.init(ar);
		aa.reverse();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testReverse_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.reverse();
	}

	@Test(dataProvider = "dp")
	public void testSortBubble_many(AListEx aa) {
		int[] ar = { 23, 12, 4, 7, 22 };
		int[] arr = { 4, 7, 12, 22, 23 };
		aa.init(ar);
		aa.sortBubble();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testSortBubble_2(AListEx aa) {
		int[] ar = { 23, 12 };
		int[] arr = { 12, 23 };
		aa.init(ar);
		aa.sortBubble();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testSortBubble_1(AListEx aa) {
		int[] ar = { 23 };
		int[] arr = { 23 };
		aa.init(ar);
		aa.sortBubble();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp")
	public void testSortBubble_0(AListEx aa) {
		int[] ar = {};
		int[] arr = {};
		aa.init(ar);
		aa.sortBubble();
		Assert.assertEquals(aa.toArray(), arr);
	}

	@Test(dataProvider = "dp",expectedExceptions = NullPointerException.class)
	public void testSortBubble_null(AListEx aa) {
		int[] ar = null;
		aa.init(ar);
		aa.sortBubble();
	}
	@Test(dataProvider = "dp")
	public void iter_hasNext_false(AListEx aa) {
		int[] ar = {1,2,3};
		aa.init(ar);
		Iterator<Integer> i1=aa.iterator();
		Assert.assertTrue(i1.hasNext());
	}
	@Test(dataProvider = "dp")
	public void iter_hasNext_true(AListEx aa) 
	{
		int[] ar = {1,2,3};
		aa.init(ar);
		Iterator<Integer> i1=aa.iterator();
		Assert.assertTrue(i1.hasNext());

	}

	@Test(dataProvider = "dp")
	public void iter_Next(AListEx aa) 
	{
		int[] ar = {1};
		aa.init(ar);
		Iterator<Integer> i1=aa.iterator();
		assertTrue(i1.hasNext());
		int a=i1.next();
		Assert.assertEquals(a,1);

	}
	@Test(dataProvider = "dp")
	public void iter_Next_2(AListEx aa) 
	{
		int[] ar = {1,2};
		aa.init(ar);
		Iterator<Integer> i1=aa.iterator();
		assertTrue(i1.hasNext());
		int a=i1.next();
		Assert.assertEquals(a,1);

	}
}

