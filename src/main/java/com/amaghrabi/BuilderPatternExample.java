package com.amaghrabi;

import com.amaghrabi.builder.Computer;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Computer computer = Computer.builder()
                .setCPU("AMD Rayzen 5600")
                .setRAM("16")
                .setGraphicsCard("Nvidia GeForce GTX 1080")
                .setStorage("SSD 256GB")
                .setBluetoothEnabled(true)
                .setWiFiEnabled(true)
                .build();

        System.out.println(computer);
    }
}