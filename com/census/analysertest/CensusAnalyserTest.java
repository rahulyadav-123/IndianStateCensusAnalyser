package com.census.analysertest;

import org.junit.Assert;
import org.junit.Test;

import com.census.analyser.IndianStateCensusAnalyser;

public class CensusAnalyserTest {
	private String  csv_file_path = "./src/main/resources/IndiaStateCensusData.csv";

    @Test
    public void givenIndianCensusCSVFile_WhenLoad_ShouldReturnCorrectRecords() {
    	IndianStateCensusAnalyser censusAnalyser = new IndianStateCensusAnalyser();
        int count = IndianStateCensusAnalyser.load_data(csv_file_path);
        Assert.assertEquals(29,count);
    }

}