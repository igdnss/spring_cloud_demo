package com.research.eureka.config;

/**
 * @author ：cn406c0
 * @date ：Created in 2021/3/11 22:31
 * @description：${description}
 */
@EnableWebSecurity
class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().ignoringAntMatchers("/eureka/**");
        super.configure(http);
    }
}
