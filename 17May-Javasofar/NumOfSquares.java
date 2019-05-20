import java.util.Map;

import java.util.HashMap;

import java.util.Set;

import java.util.Map.Entry;



class NumOfSquares	
{

	public static void main(String args[])	
	{

		Integer intArr[] = {1,2,3,4,5,6,7,8,9,10};



		HashMap<Integer, Integer> hMap = NumOfSquares.getSquares(intArr);

		Set set = hMap.entrySet();



		for(Object obj: set)	
		{

			Map.Entry mapEntry = (Map.Entry)obj;

			System.out.println(mapEntry.getKey() + ": " + mapEntry.getValue());

		}

	}



	public static HashMap getSquares(Integer[] intArr)	
	{

		HashMap<Integer, Integer> hMap = new HashMap<>();



		for(Integer i: intArr)	hMap.put(i, i*i);

		return hMap;

	}

}