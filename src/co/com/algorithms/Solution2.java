package co.com.algorithms;

import java.util.Scanner;

public class Solution2 {
	// The first line of the input contains two decimal integers separated by space: the maximum weight ('W') that can be delivered in a single trip and the quantity of packages ('P') to be delivered.
    // The following 'P' lines contain a decimal integer representing the weight of each package.

//    static int minimumNumberOfTrips(int tripMaxWeight, int[] packagesWeight) {
//
//
//    }
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int tripMaxWeight = in.nextInt();
        int numberOfPackages = in.nextInt();

        int[] packagesWeight = new int[numberOfPackages];

        for (int i = 0; i < numberOfPackages; i++) {
            packagesWeight[i] = in.nextInt();
        }

        //int minimumNumberOfTrips = minimumNumberOfTrips(tripMaxWeight, packagesWeight);

      //  System.out.println(minimumNumberOfTrips);
    }
}

