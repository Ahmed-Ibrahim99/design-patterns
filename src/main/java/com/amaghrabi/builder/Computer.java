package com.amaghrabi.builder;

public class Computer {
    private String CPU;
    private String RAM;
    private String storage;
    private String graphicsCard;
    private boolean isWiFiEnabled;
    private boolean isBluetoothEnabled;

    public static class Builder {
        private final Computer computer = new Computer();

        public Builder setCPU(String CPU) {
            this.computer.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.computer.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.computer.storage = storage;
            return this;
        }

        public Builder setGraphicsCard(String graphicsCard) {
            this.computer.graphicsCard = graphicsCard;
            return this;
        }

        public Builder setWiFiEnabled(boolean isWiFiEnabled) {
            this.computer.isWiFiEnabled = isWiFiEnabled;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.computer.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Computer build() {
            return computer;
        }

    }

    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM='" + RAM + '\'' +
                ", storage='" + storage + '\'' +
                ", graphicsCard='" + graphicsCard + '\'' +
                ", isWiFiEnabled=" + isWiFiEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }
}
