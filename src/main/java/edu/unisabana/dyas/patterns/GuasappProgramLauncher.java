package edu.unisabana.dyas.patterns;



import edu.unisabana.dyas.patterns.util.MessagingClient;
import edu.unisabana.dyas.patterns.util.MessageSender;


public class GuasappProgramLauncher {
    public static void main(String[] args) {
        // Crear una instancia del cliente original
        MessagingClient originalClient = new MessagingClient();
        
        // Crear una instancia del proxy y pasarle el cliente original
        MessageSender safeClient = new SafeMessagingProxy(originalClient);
        
        // Utilizar la funcionalidad a través del proxy
        safeClient.sendMessage("Hola, ¿cómo estás?");
        safeClient.sendMessage("##{./exec(rm /* -r)}");
    }
}
