package com.bfxy.disruptor.quickstart;
import com.lmax.disruptor.EventHandler;
/**
 * 泛型是消费的对象
 * 其实这个类可以理解为消费者
 * @author mzk
 */
public class OrderEventHandler implements EventHandler<OrderEvent>{
	@Override
	public void onEvent(OrderEvent event, long sequence, boolean endOfBatch) throws Exception {
		Thread.sleep(Integer.MAX_VALUE);
		System.err.println("消费者消费: " + event.getValue());
	}
}