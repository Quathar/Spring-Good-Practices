package com.goodpractices.demo.patterns.di.nodi2;

public class ThingOne {
    // <<-FIELDS->>
    private final ThingTwo thingTwo;
    private final ThingThree thingThree;

    // <<-CONSTRUCTOR->>
    public ThingOne() {
        String  param1 = "this is the first param";
        Integer param2 = 2;
        this.thingTwo = new ThingTwo(param1, param2);

        int param1OfThingThree = 1;
        this.thingThree = new ThingThree(param1OfThingThree);
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
    public ThingTwo(String param1, Integer param2, String... otherParams) {
        // Logic here...
        // Logic here...
        // Logic here...
    }

    public void m1() {
    }
}

class ThingThree {
    public ThingThree(int param1, int... otherParams) {
        // Logic here...
        // Logic here...
        // Logic here...
    }

    public void m2() {
    }
}
