package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class WorkintechList extends ArrayList<Object> {
    @Override
    public boolean add(Object obj) {
        if (!this.contains(obj)) { // Prevent duplication
            return super.add(obj);
        }
        return false; // Not added as it's a duplicate
    }

    public void sort() {
        Collections.sort(this, (o1, o2) -> {
            if (o1 instanceof Comparable && o2 instanceof Comparable) {
                return ((Comparable) o1).compareTo(o2);
            }
            return 0;
        });
    }
}