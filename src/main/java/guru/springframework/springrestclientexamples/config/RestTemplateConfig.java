package guru.springframework.springrestclientexamples.config;

import guru.springframework.springrestclientexamples.services.ApiServiceImpl;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfig {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public ApiServiceImpl apiServiceImpl(RestTemplate restTemplate) {
        return new ApiServiceImpl(restTemplate);
    }
}
