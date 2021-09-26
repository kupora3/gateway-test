package service.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import service.model.mapper.FirstServiceMapper;

@Configuration
public class FirstServiceMapperConfig {
    @Bean
    public FirstServiceMapper firstServiceMapper() {
        return new FirstServiceMapper();
    }
}
