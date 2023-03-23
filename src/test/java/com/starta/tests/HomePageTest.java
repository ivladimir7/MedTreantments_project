package com.starta.tests;

import com.github.javafaker.Faker;

public class HomePageTest extends TestBase {

    public static void main(String[] args) {
        Faker faker = new Faker();
        System.out.println(faker.number().numberBetween(1,999));
        System.out.println(faker.number().randomDouble(1,10,99));
    }
}
