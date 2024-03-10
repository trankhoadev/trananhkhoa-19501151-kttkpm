package main.java;

import javax.jms.*;

public class Receiver {
	public static void main(String[] args) throws JMSException {
        // URL of the ActiveMQ broker
        String brokerURL = "tcp://localhost:61616";
        
        // Create a ConnectionFactory
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(brokerURL);
        
        // Create a Connection
        Connection connection = connectionFactory.createConnection();
        connection.start();
        
        // Create a Session
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        
        // Create the destination (queue)
        Destination destination = session.createQueue("exampleQueue");
        
        // Create a MessageConsumer from the Session to the Queue
        MessageConsumer consumer = session.createConsumer(destination);
        
        // Wait for a message
        Message message = consumer.receive();
        
        if (message instanceof TextMessage) {
            TextMessage textMessage = (TextMessage) message;
            System.out.println("Received message: " + textMessage.getText());
        } else {
            System.out.println("Received message of unexpected type: " + message.getClass().getName());
        }
        
        // Clean up
        session.close();
        connection.close();
    }S
}
