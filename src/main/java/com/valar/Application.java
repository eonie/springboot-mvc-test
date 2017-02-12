/**
* @Title: SpringBootConfigration.java
* @Package com.docpot.config
* @Description: TODO
* Copyright: Copyright (c) 2017年1月20日
* Company:北京通铭派瑞科技有限公司
*
* @author jiawei
* @date 2017年1月20日 下午9:02:47
* @version V1.0
*/
package com.valar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
* @ClassName: SpringBootConfigration
* @Description: TODO
* @author Comsys-jiawei
* @date 2017年1月20日 下午9:02:47
*/
@ComponentScan
@ServletComponentScan
@SpringBootApplication
@EnableScheduling
public class Application {

    
    
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        SpringApplication.run(Application.class, args);
    }

}
