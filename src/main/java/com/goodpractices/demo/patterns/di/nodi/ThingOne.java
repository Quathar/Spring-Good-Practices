package com.goodpractices.demo.patterns.di.nodi;

public class ThingOne {
    // <<-FIELDS->>
    private final ThingTwo thingTwo;
    private final ThingThree thingThree;

    // <<-CONSTRUCTOR->>
    public ThingOne() {
        this.thingTwo = new ThingTwo();
        this.thingThree = new ThingThree();
    }

    // <<-METHOD->>
    public void somethingCool() {
        this.thingTwo.m1();
        this.thingThree.m2();
    }

    // <<-MAIN->>
    public static void main(String[] args) {
        ThingOne thingOne = new ThingOne();
        thingOne.somethingCool();
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
