package org.example;

import org.example.model.House;
import org.example.model.HouseSizeType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<House> houseList = Arrays.asList(new House(HouseSizeType.SMALL, 250000),
                new House(HouseSizeType.SMALL, 213000),
                new House(HouseSizeType.LARGE, 22000));
    }
}