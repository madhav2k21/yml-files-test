package com.techleads.app;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConfigTest {

	  @Autowired
	    private Config yamlFooProperties;

	    @Test
	    public void whenFactoryProvidedThenYamlPropertiesInjected() {
	        assertThat(yamlFooProperties.getName()).isEqualTo("foo");
//			assertThat(yamlFooProperties.ignoreFilenames[0]).isEqualTo(".DS_Store");
	        assertThat(yamlFooProperties.getAliases()).containsExactly("abc", "xyz");


	    }

}
