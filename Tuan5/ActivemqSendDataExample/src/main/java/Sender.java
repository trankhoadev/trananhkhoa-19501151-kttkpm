package main.java;


import javax.jms.*;

public class Sender {
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
	        
	        // Create a MessageProducer from the Session to the Queue
	        MessageProducer producer = session.createProducer(destination);
	        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
	        
	        // Create a message
	        TextMessage message = session.createTextMessage("Hello, this is a message from the sender!");
	        
	        // Send the message
	        producer.send(message);
	        
	        // Clean up
	        session.close();
	        connection.close();
	    }
}
