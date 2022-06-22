package com.techleads.app;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "yaml")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Config {
    private String name;

    private List<String> aliases;
    @Value("${ignoreFilenames}")
    List<String> ignoreFilenames;

}
