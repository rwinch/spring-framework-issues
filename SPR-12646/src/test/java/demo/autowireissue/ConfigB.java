package demo.autowireissue;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigB {
    List<ToAutoWire> values;

    @Bean
    public ToAutoWire b() {
        return new ToAutoWire("b");
    }

    @Autowired
    public void setValues(List<ToAutoWire> values) {
        this.values = values;
    }
}
