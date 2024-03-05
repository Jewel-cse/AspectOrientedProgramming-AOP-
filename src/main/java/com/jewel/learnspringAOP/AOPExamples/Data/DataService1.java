package com.jewel.learnspringAOP.AOPExamples.Data;

import com.jewel.learnspringAOP.AOPExamples.annotations.TrackTime;
import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
    @TrackTime
    public int[] retrieveData(){
        return new int[]{10,20,300,40,50};
    }
}
