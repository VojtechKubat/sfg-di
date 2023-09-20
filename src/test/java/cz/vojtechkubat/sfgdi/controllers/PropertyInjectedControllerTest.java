package cz.vojtechkubat.sfgdi.controllers;

import cz.vojtechkubat.sfgdi.serivces.ConstructorGreetingSerivce;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PropertyInjectedControllerTest {

    PropertyInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new PropertyInjectedController();

        controller.greetingService = new ConstructorGreetingSerivce();
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}