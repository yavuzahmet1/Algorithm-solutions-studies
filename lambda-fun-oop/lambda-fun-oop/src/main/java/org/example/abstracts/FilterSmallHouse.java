package org.example.abstracts;

import org.example.model.House;
import org.example.model.HouseSizeType;

public class FilterSmallHouse implements HouseFilter {
    @Override
    public boolean handle(House parameter) {
        return parameter.getSize().equals(HouseSizeType.SMALL);
    }
}
