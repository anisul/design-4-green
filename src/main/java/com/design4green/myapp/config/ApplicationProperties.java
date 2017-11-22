package com.design4green.myapp.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Properties specific to Design 4 Green.
 * <p>
 * Properties are configured in the application.yml file.
 * See {@link io.github.jhipster.config.JHipsterProperties} for a good example.
 */
@ConfigurationProperties(prefix = "application", ignoreUnknownFields = false)
public class ApplicationProperties {

}
