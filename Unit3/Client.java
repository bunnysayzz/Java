// Client.java

// Define the interface
interface InputOutputInterface {
    // Method to take input from the client
    void takeInput(String input);
    
    // Method to output the input
    void outputInput();
}

// Implement the interface
public class Client implements InputOutputInterface {
    private String input;
    
    public void takeInput(String input) {
        this.input = input;
    }
    
    public void outputInput() {
        System.out.println("Output from client: " + input);
    }
    
    // Main method to test the Client class
    public static void main(String[] args) {
        Client client = new Client();
        client.takeInput("Hello, this is the input from the client.");
        client.outputInput();
    }
}
