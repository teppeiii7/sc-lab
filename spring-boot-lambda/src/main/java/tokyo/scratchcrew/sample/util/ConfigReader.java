package tokyo.scratchcrew.sample.util;

import java.util.Map;

import org.springframework.stereotype.Component;

import tokyo.scratchcrew.sample.Application;

@Component
public class ConfigReader {

    private Settings settings;

    public String getRegion(){
        return getSettings().getRegion();
    }
      
    public String getBucket(){
        Map<String, String> map = getSettings().getS3();
        return map.get("bucket");
    }
      
    public String getFile(){
        Map<String, String> map = getSettings().getS3();
        return map.get("file");
    }
     
    /**
     * コンストラクタでの処理集中を防ぐため
     * @return
     */
    private Settings getSettings(){
        if(settings == null){
            settings = Application.getBean(Settings.class);
        }
        return settings;
    }
    
}
