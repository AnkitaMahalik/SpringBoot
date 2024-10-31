package org.example.didemo;

import java.util.ArrayList;
import java.util.List;

public class JobDetailService {
    private TranslateService translateService;

    public JobDetailService() {
        //this is tight coupling
        translateService = new TranslateService();
    }

    public JobDetailService(TranslateService translateService) {
        this.translateService = translateService;
    }

    String getJobByDetails(long jobId){
        List<String> result=new ArrayList<>();
        //call the db
        //translate the data
        result=translateService.translate(result);
        return result.get(1);
    }
}
