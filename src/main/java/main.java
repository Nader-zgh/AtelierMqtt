import org.eclipse.paho.client.mqttv3.MqttException;
import org.eclipse.paho.client.mqttv3.MqttMessage;

public class main {
    
    public static void main(String[] args) throws Exception  {

        MqttMessage message = new MqttMessage();
       //Publisher publisher =new Publisher("nader",2,"nader");
      // publisher.publish("this is a testing message");

        Subscriber subsciber = new Subscriber("nader", 2, "nader");
        subsciber.subscribe();




    }
}
