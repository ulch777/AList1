package A1;

import java.lang.reflect.Method;
import java.util.Iterator;

public class AMain 
{

	public static void main(String[] args) 
	{
		Alist_1 aa = new Alist_1();
		Alist_2 a2 = new Alist_2();
		Alist_0 a0 = new Alist_0();
		LList1 ll = new LList1();
		LList2 l2 = new LList2();
		Class c  = aa.getClass();
		Method[] methods = c.getMethods(); 
		for (Method method : methods) { 
		    System.out.println(method.getName()); 
		}
		System.out.println(aa.getClass().getMethods());
		int[] ini = { 10, 20, 11 };
		a0.init(ini);
		aa.init(ini);
		a2.init(ini);
		ll.init(ini);
		l2.init(ini);
		Iterator<Integer> ii=a0.iterator();
		Iterator<Integer> i1=aa.iterator();
		Iterator<Integer> i2=a2.iterator();
		Iterator<Integer> i3=ll.iterator();
		Iterator<Integer> i4=l2.iterator();
		while(i3.hasNext())
			{
				Integer i=i3.next();
				System.out.print(i+", ");
			}
			System.out.println();
			for(Integer i:ll)
			{
				System.out.print("<"+i+">");
			}
			System.out.println();
			while(i4.hasNext())
			{
				Integer i=i4.next();
				System.out.print(i+", ");
			}
			System.out.println();
			for(Integer i:l2)
			{
				System.out.print("<"+i+">");
			}
			System.out.println();
		while(i1.hasNext())
		{
			Integer i=i1.next();
			System.out.print(i+", ");
		}
		System.out.println();
		for(Integer i:aa)
		{
			System.out.print("<"+i+">");
		}
		System.out.println();

		l2.reverse();
		System.out.println(l2.toString());
	}

}
