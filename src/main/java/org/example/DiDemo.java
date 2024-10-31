package org.example;

import java.util.List;

public class DiDemo {
    //JobListingService jobListingService=new JobListingService();
   // List<String> jobs =jobListingService.getAllJobsByKeyword("java");
    //JobDetailService jobDetailService=new JobDetailService();
    //String details=jobDetailService.getJobByDetails(1234L);
    TranslateService translateService= new TranslateService();
    JobListingService jobListingService=new JobListingService(translateService);
    List<String> jobs =jobListingService.getAllJobsByKeyword("java");
    JobDetailService jobDetailService=new JobDetailService(translateService);
    String details=jobDetailService.getJobByDetails(1234L);
    //here we are creating obj but now i will give metadata to spring framework and it will create obj for me
}
