package com.liqiju.config;


import org.apache.catalina.Context;
import org.springframework.boot.web.embedded.tomcat.TomcatContextCustomizer;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

@Configuration
public class GlobalConfig {
    @Bean
    public WebServerFactoryCustomizer<TomcatServletWebServerFactory> customizer() {
        return new WebServerFactoryCustomizer<TomcatServletWebServerFactory>() {
            @Override
            public void customize(TomcatServletWebServerFactory factory) {
                factory.addContextCustomizers(new TomcatContextCustomizer() {
                    @Override
                    public void customize(Context context) {
                        String relativePath = "demo4/src/main/webapp";  //注意这里改成springboot5项目名
                        File docBaseFile = new File(relativePath); // 如果路径不存在，则把这个路径加入进去
                        if (docBaseFile.exists()) {
                            context.setDocBase(docBaseFile.getAbsolutePath());
                        }
                    }
                });
            }
        };
    }

}