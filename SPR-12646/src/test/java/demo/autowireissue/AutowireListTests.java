package demo.autowireissue;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {ConfigA.class, ConfigB.class})
public class AutowireListTests {
    @Autowired
    ConfigB b;

    @Test
    public void run() {
        assertEquals(2,b.values.size());
    }
}
