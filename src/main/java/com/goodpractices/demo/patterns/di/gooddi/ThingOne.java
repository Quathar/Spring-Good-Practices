package com.goodpractices.demo.patterns.di.gooddi;

public class ThingOne {
    // <<-FIELDS->>
    private final ThingTwoInterface thingTwo;
    private final ThingThreeInterface thingThree;

    // <<-CONSTRUCTOR->>
    public ThingOne(ThingTwoInterface thingTwo, ThingThreeInterface thingThree) {
        this.thingTwo = thingTwo;
        this.thingThree = thingThree;
    }

    // <<-METHOD->>
    public void somethingCool() {
        this.thingTwo.m1();
        this.thingThree.m2();
    }

    // <<-MAIN->>
    public static void main(String[] args) {
        // 1
        ThingTwo thingTwo = new ThingTwo();
        ThingThree thingThree = new ThingThree();

        ThingOne thingOne = new ThingOne(thingTwo, thingThree);

        // 2
        ThingTwoEvenCooler thingTwoEvenCooler = new ThingTwoEvenCooler();

        ThingOne anotherThingOne = new ThingOne(thingTwoEvenCooler, thingThree);
    }
}

// <<-INTERFACES->>
interface ThingTwoInterface {
    void m1();
}

interface ThingThreeInterface {
    void m2();
}

// <<-IMPLEMENTED CLASSES->>
class ThingTwo implements ThingTwoInterface {
    @Override
    public void m1() {
    }
}

class ThingTwoEvenCooler implements ThingTwoInterface {
    @Override
    public void m1() {
    }
}

class ThingThree implements ThingThreeInterface {
    @Override
    public void m2() {
    }
}
