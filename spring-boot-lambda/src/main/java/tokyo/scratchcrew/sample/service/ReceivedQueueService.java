package tokyo.scratchcrew.sample.service;

import org.springframework.cloud.aws.messaging.core.QueueMessagingTemplate;
import org.springframework.messaging.support.MessageBuilder;

import com.amazonaws.services.sqs.AmazonSQS;

/**
 * 
 * @author teppei_shichiri
 *
 */
public class ReceivedQueueService {

    private QueueMessagingTemplate queueMessagingTemplate;

    private void initTemplate(AmazonSQS amazonSqs) {
        this.queueMessagingTemplate = new QueueMessagingTemplate(amazonSqs);
    }

    private QueueMessagingTemplate getQueueMessagingTemplate() {
        return this.queueMessagingTemplate;
    }

    /**
     * 受信したメッセージをエンキューします。
     * 
     * @return success:true, failure:false
     */
    public boolean enqueueMessage(String input) {

        return true;
    }

    public void send(String message) {

        getQueueMessagingTemplate().send("physicalQueueName",
                MessageBuilder.withPayload(message).build());
    }

}
