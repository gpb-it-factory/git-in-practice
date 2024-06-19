package com.example.work;

public class VeryImportantService {

    public void chooseFlow(String flow) {
        switch (flow) {
            default: new DefaultFlow().invoke();
        }
    }
}
