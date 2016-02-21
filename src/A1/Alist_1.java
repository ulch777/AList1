package A1;

import java.util.Iterator;

public class Alist_1 implements AListEx, Iterable 
<Integer>
{
	int[] ar = new int[10];

	int count = 0;

	@Override
	public void init(int[] ini) {
		if (ar == null) {
			throw new NullPointerException("Incorrect");
		}
		for (int i = 0; i < ini.length; i++) {
			ar[i] = ini[i];
		}
		count = ini.length;
	}

	@Override
	public void clear() {
		count = 0;
	}

	@Override
	public void addEnd(int val) {
		ar[count++] = val;
	}

	@Override
	public void delEnd() {
		if (count == 0) {
			throw new ListEmptyExeption();
		}
		count--;
	}

	@Override
	public void addStart(int val) {
		for (int i = count; i > 0; i--) {
			ar[i] = ar[i - 1];
		}
		ar[0] = val;
		count++;
	}

	@Override
	public void addPos(int pos, int val) {
		if (pos > count) {
			return;
		}
		if (ar.length == 0) {
			throw new NegativeArraySizeException("Incorrect");
		}
		for (int i = count; i > pos; i--) {
			ar[i] = ar[i - 1];
		}
		ar[pos] = val;
		count++;
	}

	@Override
	public void delStart() {
		if (ar.length == 0) {
			throw new NegativeArraySizeException("Incorrect");
		}
		for (int i = 0; i < count; i++) {
			ar[i] = ar[i + 1];
		}
		count--;
	}

	@Override
	public void delPos(int pos) 
	{
		if (pos > count||pos<0||count==0) 
		{
			throw new NegativeArraySizeException();
		}

		for (int i = pos; i < count; i++) 
		{
			ar[i] = ar[i + 1];
		}
		count--;
	}


	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < count; i++)
			str = str + ar[i] + ", ";
		return str;
	}

	@Override
	public int[] toArray() {
		int[] arr = new int[count];
		for (int i = 0; i < count; i++) {
			arr[i] = ar[i];
		}
		return arr;

	}

	@Override
	public int size() {
		return count;
	}

	@Override
	public int get(int pos) {
		if (pos > count) {
			throw new IllegalArgumentException("Out of Array");
		}
		int a = ar[pos];
		return a;
	}

	@Override
	public void set(int pos, int val) {
		if (pos > count || count == 0) {
			throw new ArrayIndexOutOfBoundsException("Out of Array");
		}
		ar[pos] = val;
	}

	@Override
	public int max() {
		if (count == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int max = ar[0];
		for (int i = 1; i < count; i++)
			if (ar[i] >= max) {
				max = ar[i];
			}
		return max;

	}

	@Override
	public int min() {
		if (count == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int min = ar[0];
		for (int i = 1; i < count; i++) {
			if (ar[i] <= min) {
				min = ar[i];
			}
		}
		return min;
	}

	@Override
	public int maxIndex() {
		if (count == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int max = ar[0];
		int imax = 0;
		for (int i = 1; i < count; i++)
			if (ar[i] > max) {
				max = ar[i];
				imax = i;
			}
		return imax;
	}

	@Override
	public int minIndex() {
		if (count == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int min = ar[0];
		int imin = 0;
		for (int i = 1; i < count; i++)
			if (ar[i] < min) {
				min = ar[i];
				imin = i;
			}
		return imin;
	}

	@Override
	public void reverse() {
		for (int i = 0; i < count / 2; i++) {
			int tmp = ar[i];
			ar[i] = ar[count - 1 - i];
			ar[count - 1 - i] = tmp;
		}
	}

	@Override
	public void sortBubble() 
	{
		int tmp = 0;
		for (int i = 0; i < count; i++) {

			for (int j = 0; j < count - i - 1; j++) {
				if (ar[j] > ar[j + 1]) {
					tmp = ar[j + 1];
					ar[j + 1] = ar[j];
					ar[j] = tmp;
				}
			}
		}
	}

	@Override
	public Iterator<Integer> iterator() 
	{
		return new Iter(ar, count);
	}
	class Iter implements Iterator<Integer>
	{
		int[] rr = null;
		int i = 0,index;
		public Iter(int[] a, int j)
		{
			rr=a;
			index=j;
		}

		@Override
		public boolean hasNext() 
		{
			return i<index;
		}

		@Override
		public Integer next() {
			return rr[i++];
		}

		@Override
		public void remove() {

		}
	}

}
