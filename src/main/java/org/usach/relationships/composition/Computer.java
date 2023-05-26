package org.usach.relationships.composition;

public class Computer {
    private String name;
    private CPU cpu;  // Computer has a CPU

    public Computer(String name, String cpuModel) {
        this.name = name;
        this.cpu = new CPU(cpuModel);  // CPU is composed in Computer
    }

    public String getName() {
        return this.name;
    }

    public CPU getCPU() {
        return this.cpu;
    }

    // Main.java
/*    public class Main {
        public static void main(String[] args) {
            // create computer object with CPU
            Computer computer = new Computer("Alienware", "Intel Core i7");

            // print computer's name and CPU model
            System.out.println("Computer: " + computer.getName());
            System.out.println("CPU: " + computer.getCPU().getModel());
        }
    }*/

}

