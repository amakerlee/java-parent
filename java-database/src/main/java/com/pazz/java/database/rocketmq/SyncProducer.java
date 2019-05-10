package com.pazz.java.database.rocketmq;

import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;

/**
 * 可靠的同步传输
 */
public class SyncProducer {
    public static void main(String[] args) throws Exception {
        // 实例化一个生产者组名称。
        DefaultMQProducer producer = new DefaultMQProducer("please_rename_unique_group_name");
        producer.setNamesrvAddr("47.101.167.134:9876");
        producer.setVipChannelEnabled(false);
        // 启动实例。
        producer.start();
        for (int i = 0; i < 100; i++) {
            try{
                // 创建一个消息实例，指定主题、标记和消息体。
                Message message = new Message("TopicTest", "TagA", ("Hello RocketMQ " + i).getBytes());
                // 调用发送消息向一个代理传递消息。
                SendResult sendResult = producer.send(message);
                System.out.printf("%s%n", sendResult);
            }catch(Exception e){
                e.printStackTrace();
                Thread.sleep(1000);
            }
        }
        // 当生产者实例不再使用时关闭。
        producer.shutdown();
    }
}
