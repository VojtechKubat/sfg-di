package cz.vojtechkubat.sfgdi.controllers;

import cz.vojtechkubat.sfgdi.serivces.ConstructorGreetingSerivce;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SetterInjectedControllerTest {

    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller = new SetterInjectedController();
        controller.setGreetingService(new ConstructorGreetingSerivce());
    }

    @Test
    void getGreeting() {
        System.out.println(controller.getGreeting());
    }
}