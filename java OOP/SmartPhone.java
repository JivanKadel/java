class Phone{
    public void call(){
        System.out.println("Calling...");
    }
    public void sms(){
        System.out.println("Sending message...");
    }
    public void radio(){
        System.out.println("Searching for a channel...");
    }
}
interface IMusicPlayer{
    void play();
    void pause();
    void loop();
}
interface ICamera{
    void click();
    void record();
}
public class SmartPhone extends  Phone implements  ICamera, IMusicPlayer{
    public void play(){
        System.out.println("Playing Music...");
    }
    public void pause(){
        System.out.println("Pausing...");
    }
    public void loop(){
        System.out.println("Looping the current song...");
    }
    public void click(){
        System.out.println("Photo clicked!");
    }
    public void record(){
        System.out.println("Video recording. Click to stop!");
    }

    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone();
        sp.call();
        sp.sms();
        sp.radio();
        sp.play();
        sp.pause();
        sp.loop();
        sp.click();
        sp.record();
    }
}
