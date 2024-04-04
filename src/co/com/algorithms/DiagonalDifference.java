package co.com.algorithms;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DiagonalDifference {
    Integer n;
    Integer[][] matrix = {{1,2,3}, 
    		{4,5,6}, 
    		{3,4,5}};
    
    public DiagonalDifference() {}
    
    public static void main(String args[]) {
    	DiagonalDifference d = new DiagonalDifference();
    	readData(d);

    }

	private static void readData(DiagonalDifference d) {
		List<String> matriz = new ArrayList<>();
    	Scanner sc = new Scanner(System.in);
    	Scanner sc2 = new Scanner(System.in);
    	d.n = sc.nextInt();
    	
    	while(matriz.size() < d.n) {
    		matriz.add(sc2.nextLine());
    	}
    	
    	
    	
	}

}
