import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main{
    public static void main( String[] args )
    {
        int[] arr = { 45, 87, 39, 32, 93, 86, 12, 44, 75, 50 };

        StringBuilder stringBuilder = new StringBuilder();

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(45);
        arrayList.add(87);
        arrayList.add(39);
        arrayList.add(32);
        arrayList.add(93);
        arrayList.add(86);
        arrayList.add(12);
        arrayList.add(44);
        arrayList.add(75);
        arrayList.add(50);

        // Display the original (unsorted values)
        System.out.print("before: ");
        for ( int i=0; i<arr.length; i++ )
            System.out.print( arr[i] + " " );
        System.out.println();

        // Swap the values around to put them ascending order.
		/*
		for ( ; ; )
		{
			for ( ; ; )
			{
				if ( )
				{
					// swap the values in two slots
				}
			}
		}
		*/

		//Used to Sort Values in ArrayList
        Collections.sort(arrayList);
        // Display the values again, now (hopefully) sorted.
        System.out.print("after : ");
        for ( int i=0; i<arr.length; i++ )
           System.out.print( arr[i] + " " );

        //Use of Arraylist with Sorted Values from Collections on Line 44
        for (Integer strings:arrayList
             ) {
            System.out.println(strings);
        }


    }
}

