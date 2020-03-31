package com.codewithnas.structural.bridge;

public class BridgeDemo {
    public static void main(String[] args) {
        //var remoteControl = new RemoteControl(new SonyTV());
        //var remoteControl = new AdvancedRemoteControl(new SonyTV());
        //var remoteControl = new RemoteControl(new SamsungTV());
        var remoteControl = new AdvancedRemoteControl(new SamsungTV());
        remoteControl.turnOn();
    }
}
