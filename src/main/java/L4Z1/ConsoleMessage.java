package L4Z1;

public class ConsoleMessage extends Message{

    public ConsoleMessage(String windowName) {
        super(windowName);
    }

    public void getMessage(){
        System.out.println(this.getClass().getName());
    }
}
