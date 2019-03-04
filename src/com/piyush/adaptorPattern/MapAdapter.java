package com.piyush.adaptorPattern;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* * This class is an adapter which allows to create a Map by providing a two * dimensional array of keys and values. 
 * It extends AbstractMap class so that it * become a Map and can be passed around where a Map is needed. 
 * All other method * is implemented in AbstractMap except the adapter functionality which is * implemented in constructor of 
 * this class. */
public class MapAdapter extends AbstractMap {
	private Map map;

	public MapAdapter(Object[][] array) {
		super();
		map = new HashMap<>();

		for (Object[] mapping : array) {
			map.put(mapping[0], mapping[1]);
		}
	}

	@Override
	public Set entrySet() {
		return map.entrySet();
	}

}
