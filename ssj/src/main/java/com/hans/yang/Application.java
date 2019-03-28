package com.hans.yang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created In. <br/>
 *
 * @author: hj_yang <br/>
 * @date: 2018/11/8 <br/>
 */
/* @Configuration 的注解类表示这个类可以使用Spring IoC 容器作为bean 定义的来源
可理解为用spring的时候xml里面的<beans>标签 */
@Configuration
/* 告诉SpringBoot“猜”你将如何想配置Spring,基于你已经添加jar依赖项。
如果spring-boot-starter-web已经添加Tomcat和Spring MVC,这个注释自动将
假设您正在开发一个web应用程序并添加相应的spring设置
如果发现启用了不想要的自动配置，可以用exclude
*/
@EnableAutoConfiguration
@ComponentScan
/* @SpringbootApplication EmbeddedServletContainerCustomizer
注解  可以解决根类或者配置类（我自己的说法，就是main所在类）头上注解过多
的问题，一个@SpringbootApplication相当于@Configuration,@EnableAutoConfiguration和 @ComponentScan
并具有他们的默认属性值 */
/*如果是要打成war包，需要继承SpringBootServletInitializer 并且重写configure方法*/
public class Application extends SpringBootServletInitializer {
  public static void main(String[] args) {
    SpringApplication.run(Application.class,  args);
  }

  @Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    return application.sources(Application.class);
  }
}
