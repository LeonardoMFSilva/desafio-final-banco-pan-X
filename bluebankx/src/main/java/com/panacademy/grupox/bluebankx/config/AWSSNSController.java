package com.panacademy.grupox.bluebankx.config;

import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.model.SubscribeRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AWSSNSController {

    @Autowired
    private AmazonSNSClient snsClient;

    String TOPIC_ARN = "arn:aws:sns:us-east-2:965934840569:SQ10T2";

    public  String addSubscription(@PathVariable String email) {
        SubscribeRequest request = new SubscribeRequest(TOPIC_ARN, "email", email);
        snsClient.subscribe(request);
        return "Subscription request está pendente. Para confirmar, verifique seu email:" + email;
    }
}
