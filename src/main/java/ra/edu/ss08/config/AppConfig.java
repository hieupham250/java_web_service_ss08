package ra.edu.ss08.config;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {
        "ra.edu.ss08.controller",
        "ra.edu.ss08.service",
        "ra.edu.ss08.repository",
})
public class AppConfig {
    private String HOST_NAME = "dlnpapflp";
    private String API_KEY = "137312587761991";
    private String API_SECRET = "jyOeddX7K6YunyJ-5MwUZrM1SXA";

    @Bean
    public Cloudinary cloudinary() {
        return new Cloudinary(ObjectUtils.asMap(
                "cloud_name", HOST_NAME,
                "api_key", API_KEY,
                "api_secret", API_SECRET,
                "secure", true
        ));
    }
}

