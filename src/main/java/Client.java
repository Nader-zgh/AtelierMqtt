
import org.eclipse.paho.client.mqttv3.persist.MemoryPersistence;

public class Client {
    String topic ;
    int qos = 2;
    String broker = "tcp://test.mosquitto.org:1883";
    String clientId ;
    MemoryPersistence persistence = new MemoryPersistence();

    public Client(String topic, int qos, String clientId) {
        this.topic = topic;
        this.qos = qos;
        this.clientId = clientId;
    }


}
