package gateway.routes;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.URI;
import java.net.URISyntaxException;

@Configuration
public class ServiceRouteConfiguration {
    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) throws URISyntaxException {
        String pathForFirst = "/first/**";
        URI uriForFirst = new URI("http://localhost:8081/");
        String pathForSecond = "/second";
        return builder.routes()
                .route("1", r -> r
                        .path("/start/**")
                        .filters(f -> f.rewritePath("/start(?<segment>.*)", "/${segment}"))
                        .uri(uriForFirst))
                .route("2", r -> r
                        .path(pathForSecond + "/**")
                        // .filters(f -> f.rewritePath("/second(?<segment>/?.*)", "$\\{segment}"))
                        .uri("http://localhost:8082"))
                .build();
    }
}
