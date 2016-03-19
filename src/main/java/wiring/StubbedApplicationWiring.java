package wiring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import stubadapter.StubFingeringsAdapter;
import web.port.FingeringsPort;

@Configuration
public class StubbedApplicationWiring {

    @Bean
    public FingeringsPort fingeringsPort() {
        return new StubFingeringsAdapter();
    }
}
