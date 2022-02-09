package L4Z1;

public class WindowMessage extends Message{

    public WindowMessage(String windowName) {
        super(windowName);
    }
    public void getMessage(){
        System.out.println(this.getClass().getName());
    }
}
