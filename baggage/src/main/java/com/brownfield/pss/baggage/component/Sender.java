package com.brownfield.pss.baggage.component;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@EnableBinding(BaggageSource.class)
@Component
public class Sender {
	public Sender() {
	}

	/**
	 * RabbitMessagingTemplate template;
	 * 
	 * @Autowired Sender(RabbitMessagingTemplate template){ this.template =
	 *            template; }
	 * @Bean Queue queue() { return new Queue("BaggageQ", false); }
	 * 
	 **/

	@Output(BaggageSource.BAGGAGEQ)
	@Autowired
	private MessageChannel messageChannel;

	public void send(Object message) {
		System.out.println("Output BaggageQ");
		Boolean result = messageChannel.send(MessageBuilder.withPayload(message).build());
		System.out.println("Result:" + result);
	}
}

interface BaggageSource {
	public static String BAGGAGEQ = "baggageQ";

	@Output(BaggageSource.BAGGAGEQ)
	public MessageChannel baggageQ();

}