package guru.springframework.sfgdi.config;

import guru.springframework.sfgdi.examplebean.FakeDataSource;
import guru.springframework.sfgdi.examplebean.FakeJsmSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {

    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jsm.username}")
    String jsm_user;
    @Value("${guru.jsm.password}")
    String jsm_password;
    @Value("${guru.jsm.url}")
    String jsm_url;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUsername(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setDburl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJsmSource fakeJsmSource() {
        FakeJsmSource fakeJsmSource = new FakeJsmSource();
        fakeJsmSource.setUsername(jsm_user);
        fakeJsmSource.setPassword(jsm_password);
        fakeJsmSource.setUrl(jsm_url);
        return fakeJsmSource;
    }

}
