package org.example.utilty;

import org.example.model.House;
import org.example.model.HouseSizeType;

import java.util.ArrayList;
import java.util.List;

public class Util {
    public static List<House> filterSmallHouse(List<House> houseList) {
        List<House> result = new ArrayList<>();
        for (House house : houseList) {
            if (house.getSize().equals(HouseSizeType.SMALL)) {
                result.add(house);
            }
        }
        return result;
    }

    public static List<House> filterHouseBySize(List<House> houseList, HouseSizeType sizeType) {
        List<House> result = new ArrayList<>();
        for (House house : houseList) {
            if (house.getSize().equals(sizeType)) {
                result.add(house);
            }
        }
        return result;
    }

    public static List<House> filterHouseByPrice(List<House> houseList, int minPrice) {
        List<House> result = new ArrayList<>();
        for (House house : houseList) {
            if (house.getPrice() > minPrice) {
                result.add(house);
            }
        }
        return result;
    }

}
