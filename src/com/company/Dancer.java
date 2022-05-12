package com.company;

public class Dancer extends Person{
    String groupName;

    public Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
  void dancing(){
      System.out.println("* "+getName()+" is dancing with "+groupName+" dancing group");
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
                " groupName='" + groupName + '\'' ;
    }
}
