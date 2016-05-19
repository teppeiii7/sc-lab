package tokyo.scratchcrew.sample.api.v1.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import tokyo.scratchcrew.sample.Application;
import tokyo.scratchcrew.sample.service.ReceivedQueueService;
import tokyo.scratchcrew.sample.util.ConfigReader;

public class MessageHandler implements RequestHandler<Object, Object>{
    
    private ReceivedQueueService receivedQueueService;
    private ConfigReader configReader;
     
    @Override
    public Object handleRequest(Object input, Context context) {
        context.getLogger().log("-----start.-----");
         
        receivedQueueService = Application.getBean(ReceivedQueueService.class);
        boolean queued = receivedQueueService.enqueueMessage(input.toString());
        context.getLogger().log("queued:" + Boolean.toString(queued));
         
        context.getLogger().log("-----end.-----");
        return "success.";
    }

}
