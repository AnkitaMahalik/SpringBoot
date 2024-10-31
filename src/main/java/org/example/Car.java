package org.example;

public class Car {
    private String name;
    private Engine engine;
    public Car(String name, Engine engine) {
        this.name = name;
        this.engine = engine;
    }

    public Car() {
        System.out.println("creating car");
        name="Tata Tiago";
        engine=new Engine("revetron",1200);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public void runcar(){
        System.out.println("running car "+name+" with engine "+engine.getName());
    }



}
