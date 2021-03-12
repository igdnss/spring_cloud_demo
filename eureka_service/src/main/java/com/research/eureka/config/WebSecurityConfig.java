package com.research.eureka.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * @author ：cn406c0
 * @date ：Created in 2021/3/11 22:31
 * @description：${description}
 */

@Configuration
@EnableWebSecurity
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(http);
    }
}
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable();     //关闭跨域
//        http.authorizeRequests()   //认证请求
//            .anyRequest()      //对任何请求
//            .authenticated()   //都需要认证
//            .and()
//            .httpBasic();      //使用Spring Security提供的登录界面
//    }
//}