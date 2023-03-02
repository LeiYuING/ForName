package com.leiyu.Config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.sql.DataSource;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {

    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource dataSource(){
        return new DruidDataSource();
    }

    @Bean
    public ServletRegistrationBean druidServlet() {

        ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();

        servletRegistrationBean.setServlet(new StatViewServlet());

        servletRegistrationBean.addUrlMappings("/druid/*");

        Map<String, String> initParameters = new HashMap<>();

        initParameters.put("loginUsername", "admin"); //++监控页面登录用户名

        initParameters.put("loginPassword", "123.admin"); //++监控页面登录用户密码

        initParameters.put("deny", ""); //ip黑名单

//如果某个ip同时存在，deny优先于allow

        servletRegistrationBean.setInitParameters(initParameters);

        return servletRegistrationBean;

    }


    @Bean
    public FilterRegistrationBean filterRegistrationBean(){
        FilterRegistrationBean<Filter> bean = new FilterRegistrationBean<>();

        bean.setFilter(new WebStatFilter());

        HashMap<String,String> initParameters = new HashMap<>();
        initParameters.put("excusions","*.js,*.css,/druid/*");//设置过滤请求

        bean.setInitParameters(initParameters);

        return bean;

    }
}
