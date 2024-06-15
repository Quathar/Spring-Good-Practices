package com.goodpractices.demo.patterns.di.baddi;

public class ThingOne {
    // <<-FIELDS->>
    private final ThingTwo thingTwo;
    private final ThingThree thingThree;

    // <<-CONSTRUCTOR->>
    public ThingOne(ThingTwo thingTwo, ThingThree thingThree) {
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
        ThingTwo thingTwo = new ThingTwo();
        ThingThree thingThree = new ThingThree();

        ThingOne thingOne = new ThingOne(thingTwo, thingThree);
    }
}

class ThingTwo {
    public void m1() {
    }
}

class ThingThree {
    public void m2() {
    }
}
