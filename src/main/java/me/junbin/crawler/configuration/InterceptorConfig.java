package me.junbin.crawler.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

/**
 * @author : Zhong Junbin
 * @email : <a href="mailto:rekadowney@gmail.com">发送邮件</a>
 * @createDate : 2018/7/1 22:52
 * @description :
 */
@Configuration
public class InterceptorConfig extends WebMvcConfigurationSupport {

/*
    @Bean
    public LogbackInterceptor logbackInterceptor() {
        return new LogbackInterceptor();
    }

    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(logbackInterceptor())
                .addPathPatterns("/**");
    }
*/

}
