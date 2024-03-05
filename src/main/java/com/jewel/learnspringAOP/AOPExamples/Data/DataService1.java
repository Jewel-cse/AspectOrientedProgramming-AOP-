package com.jewel.learnspringAOP.AOPExamples.Data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService1 {
    public int[] retrieveData(){
        return new int[]{10,20,300,40,50};
    }
}
