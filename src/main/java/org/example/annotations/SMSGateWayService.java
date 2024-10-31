package org.example.annotations;

import org.springframework.stereotype.Component;

@Component
public class SMSGateWayService {
    public void sendMsg(String msg){
        System.out.println("sent msg is : "+msg);
    }

}
