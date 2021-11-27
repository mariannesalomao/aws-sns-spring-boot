package br.mso.awssns.config;

import com.amazonaws.auth.AWSStaticCredentialsProvider;
import com.amazonaws.auth.BasicAWSCredentials;
import com.amazonaws.regions.Regions;
import com.amazonaws.services.sns.AmazonSNSClient;
import com.amazonaws.services.sns.AmazonSNSClientBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class AWSSNSConfig {
  
  public static final String SECRET_KEY = "aTaLjUrDvy899M15xGNqjoNPsnxmJAU+yD/fEO1s";
  public static final String ACCESS_KEY = "AKIA6BZRT7L43UKRJGML";
  
  @Primary
  @Bean
  public AmazonSNSClient getSnsClient() {
    return (AmazonSNSClient) AmazonSNSClientBuilder.standard().withRegion(Regions.US_EAST_1)
        .withCredentials(new AWSStaticCredentialsProvider(new BasicAWSCredentials(ACCESS_KEY, SECRET_KEY))).build();
  }
}
