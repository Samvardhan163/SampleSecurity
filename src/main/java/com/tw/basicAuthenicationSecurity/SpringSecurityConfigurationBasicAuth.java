package com.tw.basicAuthenicationSecurity;


import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class SpringSecurityConfigurationBasicAuth extends WebSecurityConfigurerAdapter
{
    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.csrf().disable().authorizeRequests()
                .antMatchers("/").permitAll()
                .antMatchers(HttpMethod.POST,"/books").permitAll()
                .antMatchers(HttpMethod.GET,"/books").permitAll()
                .antMatchers(HttpMethod.OPTIONS,"**/").permitAll()
                .anyRequest().authenticated()
                .and()
                .httpBasic();

    }

}
