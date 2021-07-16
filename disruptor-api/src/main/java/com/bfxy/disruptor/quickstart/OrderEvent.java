package com.bfxy.disruptor.quickstart;
import lombok.Data;
/**
 * disruptor 的 Event对象
 * @author mzk
 */
@Data
public class OrderEvent {
	/**
	 * 订单的价格
	 */
	private long value;
}
