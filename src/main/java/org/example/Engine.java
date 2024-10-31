package org.example;

public class Engine {
    private String name;
    private Integer cc;

    @Override
    public String toString() {
        return "Engine{" +
                "name='" + name + '\'' +
                ", cc=" + cc +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCc() {
        return cc;
    }

    public void setCc(Integer cc) {
        this.cc = cc;
    }

    public Engine() {
    }

    public Engine(String name, Integer cc) {
        this.name = name;
        this.cc = cc;
    }
    public void engineInit(){
        System.out.println("execting engineinit for : "+this.getName());
    }
    public void engineDestroy(){
        System.out.println("execting engineDestroy for : "+this.getName());
    }
}
