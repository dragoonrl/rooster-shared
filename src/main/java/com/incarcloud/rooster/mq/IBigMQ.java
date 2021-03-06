package com.incarcloud.rooster.mq;

import java.util.List;


/** 
* @ClassName: IBigMQ 
* @Description: 操作消息队列的接口
* @author Xiong Guanghua
* @date 2017年6月2日 下午3:55:17 
*/
public interface IBigMQ {


	/**
	 * 发送单个消息
	 *
	 * @param msg 消息
	 * @return 发送结果
	 */
	MqSendResult post(MQMsg msg);

	/**
	 * 批量发送消息
	 * @param listMsgs 消息列表
	 * @return 发送结果
	 */
	List<MqSendResult> post(List<MQMsg> listMsgs);


	/**
	 * 批量接收消息
	 *
	 * @param size 消息数量
	 *
	 * @return
	 */
	List<MQMsg> batchReceive(int size);


	/**
	 * 释放当前连接（线程安全的客户端无需实现此方法，有些客户端不是线程安全，比如kafka的消费者）
	 */
	public void releaseCurrentConn();


	/**
	 * 关闭
	 */
	public void close();
}
