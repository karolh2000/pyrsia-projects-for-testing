package example;

public class Messenger {

    private String message;

    public void setMessage(String message) {
        if (message == null || message.length() == 0) {
            throw new IllegalStateException("No empty messages! Go to hell!");
        }
        System.out.println(message);
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}