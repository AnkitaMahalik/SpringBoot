package org.example.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//if u want spring to create object of this class the add@component
//spring will create bean in spring conatiner
//@Scope("prototype")
@Component
public class NotificationService {
    //notification we are sending using smsgateway

    @Autowired
    private SMSGateWayService smsGateWayService;
    //this is field injection above
//constructor based dependency injection
//    public NotificationService(SMSGateWayService smsGateWayService) {
//        this.smsGateWayService = smsGateWayService;
//    }
/*   the above commented constructor was helping spring to get the bean injected.
    bean of smsgatewayservice was created using@component but since constructor
   is commented it is not getting injected in notification service*/
 //soln is using @Autowire for setsmsgatewayservice method as it will inject value
    public void sendNotification(String msg){
        smsGateWayService.sendMsg(msg);
    }

    public SMSGateWayService getSmsGateWayService() {
        return smsGateWayService;
    }
    //setterbased dependency injection
//@Autowired
//    public void setSmsGateWayService(SMSGateWayService smsGateWayService) {
//        this.smsGateWayService = smsGateWayService;
//    }
    //we can achieve the same response by autowiring smsgateway obj
    // Now we can comment constructor and setter based injections
}
