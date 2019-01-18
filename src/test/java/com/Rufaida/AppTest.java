package com.Rufaida;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@ContextConfiguration
public class AppTest {

    @Test
    public void contextLoad() throws IOException {
        App.main(new String[] {});
    }
}
