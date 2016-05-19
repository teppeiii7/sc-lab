package tokyo.scratchcrew.sample.util;

import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@ConfigurationProperties(prefix = "settings")
@Data
public class Settings {
    public String region;
    public Map<String, String> s3;
}
