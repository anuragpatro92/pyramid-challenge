package com.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

// TODO: Auto-generated Javadoc
/**
 * The Class PyramidController.
 */
@Path("/service")
public class PyramidController {

	/**
	 * Gets the test service.
	 *
	 * @param str the str
	 * @return the test service
	 */
	@GET
	@Path("/checkPyramid")
	public Boolean getTestService(@QueryParam(value = "str") String str) {
		if(str.length() == 0)
			return false;
		
		return checkPyramid(str);
	}

	/**
	 * Check pyramid.
	 *
	 * @param str the str
	 * @return the boolean
	 */
	@SuppressWarnings("rawtypes")
	public Boolean checkPyramid(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		//Adding elements in a hashMap
		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		Set<Integer> set = new HashSet<Integer>();

		//checking if a set contains a same value 
		Iterator it = map.entrySet().iterator();
		int size = map.size();
		while (it.hasNext()) {

			Map.Entry val = (Entry) it.next();
			if (set.contains(val.getValue()) || (Integer) val.getValue() > size) {
				return false;
			}
			set.add((Integer) val.getValue());

		}
	
		return true;
	}

}
