package tokyo.scratchcrew.sample.api.v1.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class CallBackApiHandler implements RequestHandler<Object, Object>{
    
    @Override
    public Object handleRequest(Object input, Context context) {
        context.getLogger().log("-----start.-----");
        
        context.getLogger().log("-----end.-----");

        return "https://hoge.jp/success";
    }

}
