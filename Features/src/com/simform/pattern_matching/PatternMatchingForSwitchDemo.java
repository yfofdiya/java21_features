package com.simform.pattern_matching;

public class PatternMatchingForSwitchDemo {

    void main() {
        print(new Point(1, 2));
        print("data");
        print(1254.2522);
    }

    public void print(Object o) {
        switch (o) {
            case Point(int x, int y) -> System.out.printf(STR."o is at a position: \{x} \{y}\n");
            case String s -> System.out.printf(STR."o is a string: \{s}\n");
            default -> System.out.printf(STR."\{o} is something else");
        }
    }
}

record Point(int x, int y) {}
