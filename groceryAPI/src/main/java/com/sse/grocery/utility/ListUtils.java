package com.sse.grocery.utility;

import java.util.List;

public class ListUtils {
	
	public static boolean hasElements(List list)
	{
		if((list == null) || (list.isEmpty()))
			return false;
		return true;
	}

}
