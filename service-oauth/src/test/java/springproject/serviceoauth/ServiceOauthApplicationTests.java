package springproject.serviceoauth;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ServiceOauthApplicationTests {

    @Test
    void sum() {
        int expect = 5;
        int num1 = 3;
        int num2 = 2;
        int result = ServiceOauthApplication.sum(num1, num2);
        Assertions.assertEquals(expect, result);
    }

}
