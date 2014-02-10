package com.mb;

import org.neo4j.kernel.impl.util.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.io.File;
import java.io.IOException;

@Configuration
@ComponentScan
@EnableAutoConfiguration
public class Boot {

    public static void main(String[] args) throws IOException {
        FileUtils.deleteRecursively(new File("var/graphd"));
        SpringApplication.run(Boot.class, args);
    }

}
