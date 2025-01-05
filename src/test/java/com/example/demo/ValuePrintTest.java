package com.example.demo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ValuePrintTest {

    @Autowired
    private ValuePrint valuePrint;

    @Test
    @DisplayName("환경변수 테스트")
    void test() {
        valuePrint.getValue();
    }
}