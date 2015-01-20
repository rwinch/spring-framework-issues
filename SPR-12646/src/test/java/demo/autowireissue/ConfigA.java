package demo.autowireissue;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigA {

    @Bean
    public ToAutoWire a() {
        return new ToAutoWire("a");
    }
}
