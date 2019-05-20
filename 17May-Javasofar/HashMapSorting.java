import java.util.Map;

import java.util.HashMap;

import java.util.List;

import java.util.ArrayList;

import java.util.Set;

import java.util.Map.Entry;

import java.util.Collections;

import java.util.Iterator;



class HashMapSorting	{

	public static void main(String[] args) {

		HashMap hMap = new HashMap();



		hMap.put("Abc", 1234);

		hMap.put("Def", 114);

		hMap.put("Ghi", 334);

		hMap.put("Jkl", 14);

		hMap.put("Mno", 164);

		hMap.put("Pqr", 132);



		List aList = HashMapSorting.getValues(hMap);

		Iterator iter = aList.iterator();

		while (iter.hasNext())	System.out.println("value: " + iter.next());

	}



	public static List getValues(HashMap hMap)	{

		Set set = hMap.entrySet();

		ArrayList list = new ArrayList();



		for(Object obj: set)	{

			Map.Entry mapEntry = (Map.Entry)obj;

			list.add(mapEntry.getValue());

		}



		Collections.sort(list);

		return list;

	}

}