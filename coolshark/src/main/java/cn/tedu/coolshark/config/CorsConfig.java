package cn.tedu.coolshark.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author sytsnb@gmail.com
 * @Date 2022 2022/9/20 16:35
 */
@Configuration
public class CorsConfig implements WebMvcConfigurer {
        @Override
        public void addCorsMappings(CorsRegistry registry) {
            System.out.println("---CorsConfig---");
            registry.addMapping("/**")
                    .allowCredentials(true)
                    .allowedHeaders("*")
                    .allowedMethods("*")
                    .allowedOriginPatterns("*")
                    .maxAge(3600);
        }

}
