package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import fixtures.Fixture;

class ServerTest {

    @Test
    void test() {
        assertTrue(new Fixture().evaluate());
    }

}
