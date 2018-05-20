import com.wang.learn.consumer.Application;
import com.wang.learn.consumer.HelloSender1;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * Created with IDEA
 * author:wangcan
 * Date:5/20/2018
 * Time:5:04 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class RabbitMqHelloTest {
    @Resource
    private HelloSender1 send;


    @Test
    public void hello() throws Exception {
        send.send("test");
    }

}
