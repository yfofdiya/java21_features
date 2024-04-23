package com.simform.sequenced_collections;

import java.util.ArrayList;
import java.util.List;

public class SequencedCollectionsDemo {

    void main() {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.addFirst(0);
        list.addLast(2);
        System.out.println(list);
        System.out.println(STR."First Element \{list.getFirst()}");
        System.out.println(STR."Last Element \{list.getLast()}");
        System.out.println(list.reversed());
    }
}
