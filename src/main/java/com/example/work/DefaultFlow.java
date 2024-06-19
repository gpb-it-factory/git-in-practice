package com.example.work;

public class DefaultFlow implements Flow {
    @Override
    public void invoke() {
        System.out.println("Стандартный режим работы");
    }
}
