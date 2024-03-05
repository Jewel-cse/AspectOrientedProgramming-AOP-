package com.jewel.learnspringAOP.AOPExamples.Bussines;

import com.jewel.learnspringAOP.AOPExamples.Data.DataService1;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BussinesService1 {
    private DataService1 dataService;

    public BussinesService1(DataService1 dataService) {
        this.dataService = dataService;
    }

    public int calculateMax(){
        int[] data = dataService.retrieveData();
        return Arrays.stream(data).max().orElse(0);
    }
}
