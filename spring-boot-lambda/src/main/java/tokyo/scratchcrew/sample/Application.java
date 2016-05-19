package tokyo.scratchcrew.sample;

import org.joda.time.DateTime;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Application {

    private static ConfigurableApplicationContext context;

    public static void main(String[] args) {
        System.out.println("main- start.:" + DateTime.now().toString("yyyy/MM/dd HH:mm:ss SSS"));
        SpringApplication.run(Application.class, args);
        System.out.println("main- end.:" + DateTime.now().toString("yyyy/MM/dd HH:mm:ss SSS"));
    }

    public static <T> T getBean(Class<T> clazz) {
        return getContext().getBean(clazz);
    }

    private static ConfigurableApplicationContext getContext() {
        if (context == null) {
            context = SpringApplication.run(Application.class, "dummy");
        }
        return context;
    }
}
