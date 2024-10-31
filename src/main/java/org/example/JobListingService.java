package org.example;

import java.util.ArrayList;
import java.util.List;

public class JobListingService {
    private TranslateService translateService;

    public JobListingService(TranslateService translateService) {
        //this is tight coupling
        this.translateService = new TranslateService();

    }

    List<String> getAllJobsByKeyword(String key){
        List<String> result=new ArrayList<>();
        //call the db
        //translate the data
        result=translateService.translate(result);
        return result;
    }
}
