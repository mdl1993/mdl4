package div;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@SpringBootApplication
public class CrmServiceApplication extends SpringBootServletInitializer {

	/**
	 * Deploy as JAR
	 */
	public static void main(String[] args) {

		SpringApplication.run(CrmServiceApplication.class, args);
	}

	/**
	 * Deploy as WAR
	 */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {

		return application.sources(CrmServiceApplication.class);
	}

	@Bean
	public MessageSource messageSource() {

		ReloadableResourceBundleMessageSource messageSource = new ReloadableResourceBundleMessageSource();
	    messageSource.setBasename("classpath:application-resource");
	    messageSource.setCacheSeconds(10);

	    return messageSource;
	}
}