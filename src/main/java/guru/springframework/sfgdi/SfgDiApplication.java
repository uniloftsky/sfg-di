package guru.springframework.sfgdi;

import guru.springframework.sfgdi.examplebean.FakeDataSource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {

        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        FakeDataSource fakeDataSource = (FakeDataSource) ctx.getBean("fakeDataSource");
        System.out.println(fakeDataSource.getUsername() + " " + fakeDataSource.getDburl());

    }

}
