package serviceTwo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import serviceTwo.model.mapper.SecondServiceMapper;

@Configuration
public class SecondServiceMapperConfig {
    @Bean
    public SecondServiceMapper firstServiceMapper() {
        return new SecondServiceMapper();
    }
}
