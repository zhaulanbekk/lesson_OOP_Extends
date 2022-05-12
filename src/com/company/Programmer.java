package com.company;

public class Programmer extends Person{
    String companyName;

    public Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }
    public  void coding(){
        System.out.println("* "+getName()+"is working in "+companyName);
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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
                ", companyName='" + companyName + '\'';
    }
}
