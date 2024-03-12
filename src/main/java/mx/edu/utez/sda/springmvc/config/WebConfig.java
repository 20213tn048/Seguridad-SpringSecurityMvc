package mx.edu.utez.sda.springmvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration @EnableWebMvc
public class WebConfig implements WebMvcConfigurer {

    @Override 
    public void addViewControllers(@SuppressWarnings("null") ViewControllerRegistry registry){
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/pokemon").setViewName("pokemon");
        registry.addViewController("/login").setViewName("login");
    }
}
