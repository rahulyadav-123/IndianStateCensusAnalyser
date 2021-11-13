package com.census.analyser;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IndianStateCensusAnalyser {
	File file=new File("D:\\Bridgelabz\\java\\IndianStatesCensus\\src\\main\\java\\Indianstatecode.csv");
    public void readFile() throws FileNotFoundException {
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()) {
            String stateDetails=scanner.nextLine();
            if(stateDetails.contains("Bihar")) {
                System.out.println(stateDetails);
            }
        }
    }
	        

	public static void main(String[] args) throws FileNotFoundException {
		System.out.println(" Welcome to Indian State Census Analyser");
	    IndianStateCensusAnalyser analyser = new IndianStateCensusAnalyser();
	    analyser.readFile();
	}
}

