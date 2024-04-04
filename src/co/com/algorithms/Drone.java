package co.com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Drone {
	 public Drone(int nextInt, int nextInt2) {
		// TODO Auto-generated constructor stub
	}

	// The first line of the input contains three decimal integers separated by space: total number of drones ('D'), number of drones to be selected ('G') and number of drones in maintenance ('M').
    // The following 'D' lines each contains two decimal integers separated by space with information about each drone: ID and flight range in kilometers.
    // The following 'M' lines each contains the numeric ID of a drone currently in maintenance.

    // Print the IDs of the 'G' selected drones to the standard output, one per line, sorted by flight range (greater first).
    public static void main(String[] args) {
        int numberOfDrones = 3;
        int numberOfRequiredDrones = 2;
        int numberOfDronesInMaintenance = 1;

        List<Drone> drones = new ArrayList<>();
        List<Integer> inMaintenanceDrones = new ArrayList<>();

        for(int i=0; i< numberOfDrones; i++) {
            drones.add(new Drone(new Random().nextInt(9), new Random().nextInt(9)));
        }

        for(int i=0; i< numberOfDronesInMaintenance; i++) {
            inMaintenanceDrones.add(new Random().nextInt(9));
        }

        List<Integer> greatestFlightRangeDrones = Solution.greatestFlightRangeDrones(numberOfRequiredDrones, drones, inMaintenanceDrones);

        for(int i=0; i < greatestFlightRangeDrones.size(); i++) {
            System.out.println(greatestFlightRangeDrones.get(i));
        }

    }
}
