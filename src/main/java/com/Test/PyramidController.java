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

@Path("/service")
public class PyramidController {

	@GET
	@Path("/checkPyramid")
	@Produces(MediaType.APPLICATION_JSON)
	public String getTestService(@QueryParam(value = "str") String str) {

		return checkPyramid(str);
	}

	@SuppressWarnings("rawtypes")
	private String checkPyramid(String str) {

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for (char c : str.toCharArray()) {
			map.put(c, map.getOrDefault(c, 0) + 1);
		}

		Set<Integer> set = new HashSet<Integer>();

		Iterator it = map.entrySet().iterator();
		int size = map.size();
		while (it.hasNext()) {

			Map.Entry val = (Entry) it.next();
			if (set.contains(val.getValue()) || (Integer) val.getValue() > size) {
				return "false";
			}
			set.add((Integer) val.getValue());

		}
	
		return "true";
	}

}
