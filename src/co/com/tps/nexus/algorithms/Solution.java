package co.com.tps.nexus.algorithms;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {

	
	public static void main (String args[]) {
		
		/*
		int[] arr = {1,2,3,4,5};
		System.out.println(findNumber(arr, 5));
		*/
	}
	
	public static List<Integer> greatestFlightRangeDrones(int numberOfRequiredDrones, List<Drone> drones, List<Integer> inMaintenanceDrones){
		List<Integer> listDrones = new ArrayList<>();
		
		List<Drone> d = drones.stream().filter(p -> !p.equals(inMaintenanceDrones.containsAll(inMaintenanceDrones))).collect(Collectors.toList());
//		d.stream().sorted(Comparator.reverseOrder());
		drones.sort(Comparator.reverseOrder());
		//d.sort(Comparator.naturalOrder());
		List<Drone> result = d.stream().sorted().collect(Collectors.toList()); 
		System.out.println(result.get(0));
		return listDrones;
		
	}
	
	/*
	   static String findNumber(int[] arr, int k) {
		   //System.out.println(arr);
		   String var = ""+k;
		   if(Arrays.toString(arr).contains(var)) {
			   return "YES";
		   } else {
			   return "NO";
		   }
	    }
	*/
}

