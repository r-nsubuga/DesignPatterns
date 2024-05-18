package Behavior.CommandPattern;

public class RemoteControlTest {
    public static void main(String[] args){
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light  = new Light();
        LightOffCommand lightOn = new LightOffCommand(light);

        remote.setCommand(lightOn);
        remote.buttonWasPressed();

    }
}
