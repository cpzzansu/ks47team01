package ks47team01.common.config;

import ks47team01.common.interceptor.CommonInterceptor;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@AllArgsConstructor
public class WebConfig implements WebMvcConfigurer {

    private final CommonInterceptor commonInterceptor;

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(commonInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns("/admin/**")
                .excludePathPatterns("/user/**");

        WebMvcConfigurer.super.addInterceptors(registry);
    }
}
