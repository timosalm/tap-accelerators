package com.example.ARTIFACT_NAME;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestPropertySource;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.oauth2.jwt.JwtDecoder;

@TestPropertySource(properties = "management.metrics.export.wavefront.enabled=false")
@SpringBootTest
class ApplicationTests {

	@MockBean
  private JwtDecoder jwtDecoder;


	@Test
	void contextLoads() {
	}

}
