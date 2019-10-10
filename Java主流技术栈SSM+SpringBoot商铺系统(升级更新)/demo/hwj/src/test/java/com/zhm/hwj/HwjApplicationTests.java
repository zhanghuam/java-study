package com.zhm.hwj;

import ch.qos.logback.classic.Logger;
import com.zhm.hwj.util.DESUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.rmi.runtime.Log;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HwjApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Test
    public void base64(){
        String root = DESUtil.getEncryptString("root");
        String pwd = DESUtil.getEncryptString("96965096");
        System.out.print(root+"   --   "+pwd);
    }

}
