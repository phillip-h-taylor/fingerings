package wiring;

import adaptercsv.FingeringsCsvAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import web.port.FingeringsPort;

@Configuration
public class IntegratedApplicationWiring {

    @Bean
    public FingeringsPort fingeringsPort() {
        return new FingeringsCsvAdapter();
    }
}
