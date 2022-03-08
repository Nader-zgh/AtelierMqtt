import org.eclipse.paho.client.mqttv3.*;

public class Subscriber extends Client  {

    public Subscriber(String topic, int qos, String clientId) {
        super(topic, qos, clientId);
    }

    public void subscribe() throws MqttException {
        MqttClient sampleClient = new MqttClient(broker, clientId, persistence);
        MqttConnectOptions connOpts = new MqttConnectOptions();
        connOpts.setCleanSession(true);
        System.out.println("Connecting to broker: "+broker);
        sampleClient.connect(connOpts);
        System.out.println("Connected");
        sampleClient.subscribe(topic);
        sampleClient.setCallback(new MqttCallback() {
            public void connectionLost(Throwable cause) {
            }

            public void messageArrived(String topic,
                                       MqttMessage message)
                    throws Exception {
                System.out.println(message.toString());
            }

            public void deliveryComplete(IMqttDeliveryToken token) {
            }
        });
    }


}
