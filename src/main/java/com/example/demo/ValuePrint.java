package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@RequiredArgsConstructor
public class ValuePrint {

    @Value("${value.test}")
    String value;

    public String getValue() {
        System.out.println("value = " + value);
        return value;
    }
}
