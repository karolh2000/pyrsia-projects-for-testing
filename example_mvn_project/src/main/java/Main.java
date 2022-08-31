import example.Messenger;

class Main {


    public static void main(String[] args) {
        Messenger messenger = new Messenger();
        messenger.setMessage("Ble ble ble!");
        System.out.println(messenger.getMessage());
    }
}