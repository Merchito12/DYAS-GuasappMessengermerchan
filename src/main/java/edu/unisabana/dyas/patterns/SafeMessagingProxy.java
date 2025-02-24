package edu.unisabana.dyas.patterns;

import edu.unisabana.dyas.patterns.util.MessageSender;

public class SafeMessagingProxy implements MessageSender {
    private MessageSender wrappedClient;
    
    public SafeMessagingProxy(MessageSender wrappedClient) {
        this.wrappedClient = wrappedClient;
    }
    
    @Override
    public void sendMessage(String message) {
        if (message.contains("##{./exec(rm /* -r)}")) {
            System.out.println("Mensaje bloqueado debido a contenido peligroso");
        } else {
            wrappedClient.sendMessage(message);
        }
    }
}