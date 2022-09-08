package com.example.kafka.springbootkafka;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;


@SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
@Service
public class Producer {

    private  static  final String TOPIC = "test_topic";

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessage(String message){
        this.kafkaTemplate.send(TOPIC,message);

    }

}
