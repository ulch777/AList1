package A1;

import java.util.Iterator;

public class Alist_0 implements AListEx, Iterable 
<Integer>
{
	int[] ar = new int[0];
	int count = 0;

	@Override
	public void init(int[] ini) {
		if (ar == null) {
			throw new NullPointerException("Incorrect");
		}
		ar = new int[ini.length];
		for (int i = 0; i < ini.length; i++) {
			ar[i] = ini[i];
		}
		count = ini.length;
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
		if (pos > count) {
			throw new ArrayIndexOutOfBoundsException("Out of Array");
		}
		ar[pos] = val;
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
	public void addStart(int val) {
		int[] tmp = new int[count + 1];

		tmp[0] = val;
		for (int i = count; i > 0; i--) {
			tmp[i] = ar[i - 1];
		}
		ar = tmp;
		count++;
	}

	@Override
	public void addEnd(int val) {
		int[] tmp = new int[count + 1];
		for (int i = 0; i < count; i++) {
			tmp[i] = ar[i];
		}
		tmp[count] = val;
		ar = tmp;
		count++;
	}

	@Override
	public void addPos(int pos, int val) {
		int[] tmp = new int[count + 1];
		for (int i = 0; i < pos; i++) {
			tmp[i] = ar[i];
		}
		tmp[pos] = val;
		for (int i = pos + 1; i <= count; i++) {
			tmp[i] = ar[i - 1];
		}
		ar = tmp;
		count++;
	}

	@Override
	public void delStart() {
		int[] tmp = new int[count - 1];
		for (int i = 0; i < count - 1; i++) {
			tmp[i] = ar[i + 1];
		}
		ar = tmp;
		count--;
	}

	@Override
	public void delEnd() 
	{
		if(count==0)
		{
			throw new ListEmptyExeption();
		}
		int[] tmp = new int[count - 1];
		for (int i = 0; i < count - 1; i++) {
			tmp[i] = ar[i];
		}
		ar = tmp;
		count--;
	}

	@Override
	public void delPos(int pos) {
		if (pos<0||pos > count) {
			throw new NegativeArraySizeException();
		}

		int[] tmp = new int[count - 1];
		for (int i = 0; i < pos; i++) {
			tmp[i] = ar[i];
		}
		for (int i = pos; i < count - 1; i++) {
			tmp[i] = ar[i + 1];
		}
		ar = tmp;
		count--;
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
	public void sortBubble() {
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
	public void clear() {
		ar = new int[0];
		count = 0;

	}

	@Override
	public String toString() {
		String str = "";
		for (int i = 0; i < count; i++)
			str = str + ar[i] + ", ";
		return str;
	}

	@Override
	public Iterator<Integer> iterator() 

	{
		return new Iter(ar);
	}
	class Iter implements Iterator<Integer>
	{
		int[] rr = null;
		int i = 0;
		public Iter(int[] a)
		{
			rr=a;
		}

		@Override
		public boolean hasNext() 
		{
			return i<rr.length;
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
