package com.lipeng.javase.multithread;

import lombok.Getter;

public enum CountryEnum {

    ONE(1, "齐"),
    TWO(2, "楚"),
    THREE(3, "燕"),
    FOUR(4, "赵"),
    FIVE(5, "魏"),
    SIX(6, "韩");

    @Getter private Integer countryCode;
    @Getter private String countryName;

    CountryEnum(Integer countryCode, String countryName) {
        this.countryCode = countryCode;
        this.countryName = countryName;
    }

    public static CountryEnum getCountry(int countryCode){
        CountryEnum[] values = CountryEnum.values();
        for (CountryEnum country : values){
            if (countryCode == country.getCountryCode()){
                return country;
            }
        }
        return null;
    }

}
