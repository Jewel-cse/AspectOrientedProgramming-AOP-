package com.jewel.learnspringAOP.AOPExamples.Bussines;

import com.jewel.learnspringAOP.AOPExamples.Data.DataService1;
import com.jewel.learnspringAOP.AOPExamples.annotations.TrackTime;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class BussinesService1 {
    private DataService1 dataService;

    public BussinesService1(DataService1 dataService) {
        this.dataService = dataService;
    }

    @TrackTime
    public int calculateMax(){
        int[] data = dataService.retrieveData();
        //throw  new RuntimeException("Some thing went wrong");
        return Arrays.stream(data).max().orElse(0);
    }
}
