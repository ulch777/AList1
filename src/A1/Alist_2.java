package A1;

import java.util.Iterator;

public class Alist_2 implements AListEx, Iterable <Integer> 
{
	int[] ar = new int[100];

	int start = 50;
	int end = 50;

	@Override
	public void init(int[] ini) {
		if (ar == null) {
			throw new NullPointerException("Incorrect");
		}
		for (int i = 0; i < ini.length; i++) {
			ar[start + i] = ini[i];
		}

		// count = ini.length;
		end = start + ini.length;
	}

	@Override
	public int size() {
		int size = end - start;
		return size;
	}

	@Override
	public int get(int pos) {
		if (pos > end - start) {
			throw new IllegalArgumentException("Out of Array");
		}
		int a = ar[start + pos];
		return a;
	}

	@Override
	public void set(int pos, int val) {
		if (pos > this.size() || (start == end)) {
			throw new ArrayIndexOutOfBoundsException("out of index");
		}

		ar[start + pos] = val;
	}

	@Override
	public int[] toArray() {
		int[] arr = new int[end - start];
		for (int i = 0; i <end - start; i++) {
			arr[i] = ar[start + i];
		}
		return arr;
	}

	@Override
	public void addStart(int val) {
		for (int i = end - start; i > 0; i--) {
			ar[i] = ar[i - 1];
		}
		ar[0] = val;
		start--;
	}

	@Override
	public void addEnd(int val) {
		ar[end++] = val;
	}

	@Override
	public void addPos(int pos, int val) {
		if (pos > end - start) {
			return;
		}

		for (int i = end - start; i >= pos; i--) {
			ar[start + i] = ar[start + i - 1];
		}
		ar[start + pos] = val;
		end++;
	}

	@Override
	public void delStart() {
		if (end - start == 0) {
			throw new NegativeArraySizeException("Incorrect");
		}

		start++;

	}

	@Override
	public void delEnd() 
	{
		if(end-start==0)
		{
		throw new ListEmptyExeption();
		}
		end--;

	}

	@Override
	public void delPos(int pos) {
		if (pos<0||pos >end - start||end - start==0 ) 
		{
			throw new NegativeArraySizeException();
		}

		for (int i = pos; i < end - start; i++) {
			ar[start + i] = ar[start + i + 1];
		}
		end--;
	}

	@Override
	public int max() {
		if (end - start == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int max = ar[start + 0];
		for (int i = 1; i < end - start; i++)
			if (ar[start + i] >= max) {
				max = ar[start + i];
			}
		return max;
	}

	@Override
	public int min() {
		if (end - start == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int min = ar[start + 0];
		for (int i = 1; i < end - start; i++) {
			if (ar[start + i] <= min) {
				min = ar[start + i];
			}
		}
		return min;
	}

	@Override
	public int maxIndex() {
		if (end - start == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int max = ar[start + 0];
		int imax = 0;
		for (int i = 1; i < end - start; i++)
			if (ar[start + i] > max) {
				max = ar[start + i];
				imax = i;
			}
		return imax;
	}

	@Override
	public int minIndex() {
		if (end - start == 0) {
			throw new IllegalArgumentException("Array is empty");
		}
		int min = ar[start + 0];
		int imin = 0;
		for (int i = 1; i < end - start; i++)
			if (ar[start + i] < min) {
				min = ar[start + i];
				imin = i;
			}
		return imin;
	}

	@Override
	public void reverse() {
		for (int i = 0; i < (end - start) / 2; i++) {
			int tmp = ar[start + i];
			ar[start + i] = ar[end - 1 - i];
			ar[end - 1 - i] = tmp;
		}

	}

	@Override
	public void sortBubble() {
		int tmp = 0;
		for (int i = 0; i < end - start; i++) {

			for (int j = 0; j < end - start - i - 1; j++) {
				if (ar[start + j] > ar[start + j + 1]) {
					tmp = ar[start + j + 1];
					ar[start + j + 1] = ar[start + j];
					ar[start + j] = tmp;
				}
			}
		}
	}

	@Override
	public void clear() {
		start = 50;
		end = 50;
	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < end - start; i++)
			str = str + ar[start + i] + ", ";
		return str;
	}

	@Override
	public Iterator<Integer> iterator() 
	{
		return new Iter(ar, start, end);
	}
	class Iter implements Iterator<Integer>
	{
		int[] rr = null;
		int i = 0;
		int x = 0;
		
		public Iter(int[] aa, int a, int b)
		{
			rr= aa;
			i = a;
			x = b;
		}

		@Override
		public boolean hasNext() 
		{
			return i<x;
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
