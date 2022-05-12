package com.company;

public class Singer extends Person{
    private  String bandName;

    public Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    public String getBandName() {
        return bandName;
    }

    public void setBandName(String bandName) {
        this.bandName = bandName;
    }
    void playGuitar(){
        System.out.println("* "+getName()+" is master of playing guitar");
    }

    void singing(){
        System.out.println("* "+getName()+" is manager of "+bandName+" group");
    }

    @Override
    public void eat() {
        super.eat();
    }

    @Override
    public void walk() {
        super.walk();
    }

    @Override
    public void learn() {
        super.learn();
    }

    @Override
    public String toString() {
        return super.toString() +
                ", bandName='" + bandName + '\'';
    }
}
