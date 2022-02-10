package mr.fadeevmaxim.springCalculator.service;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

@Configuration
@EnableWebMvc
public class MvcConfig implements WebMvcConfigurer {
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry
					.addResourceHandler("/static/css/**")
					.addResourceLocations("classpath:/static/css/");
		
	}
	
}
