package com.ruoyi.web.core.config;

import com.bstek.ureport.console.UReportServlet;
import com.bstek.ureport.definition.datasource.BuildinDatasource;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@ImportResource("classpath:ureport-console-context.xml")//不加项目能够启动但是会导致加载数据源报错或加载不了
@EnableAutoConfiguration
@Configuration
public class UReportConfig implements BuildinDatasource {

    @Resource
    DataSource dataSource;

    /**
     * 返回数据源的名称
     * @return
     */
    @Override
    public String name() {
        return "内置数据源";
    }

    @Override
    public Connection getConnection() {
        try {
            return dataSource.getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("连接数据源失败！");
        }
        return null;
    }

    @Bean
    public ServletRegistrationBean urportServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new UReportServlet());
        bean.addUrlMappings("/ureport/*");
        return bean;
    }
}

