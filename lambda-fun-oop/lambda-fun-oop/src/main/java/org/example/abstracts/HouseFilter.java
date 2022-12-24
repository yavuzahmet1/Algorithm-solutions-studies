package org.example.abstracts;

import org.example.model.House;

public interface HouseFilter {
    boolean handle(House parameter);
}
