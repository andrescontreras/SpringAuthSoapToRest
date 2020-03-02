package springsoaptorest.springusercards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringUserCardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringUserCardsApplication.class, args);
		

// https://howtodoinjava.com/spring-boot/spring-soap-client-webservicetemplate/
		
//		<plugin>
//		<groupId>org.jvnet.jaxb2.maven2</groupId>
//		<artifactId>maven-jaxb2-plugin</artifactId>
//		<version>0.13.2</version>
//		<executions>
//			<execution>
//				<goals>
//					<goal>generate</goal>
//				</goals>
//			</execution>
//		</executions>
//		<configuration>
//			<generatePackage>springsoaptorest.springusercards.schemas.checkoutwsweb</generatePackage>
//			<generateDirectory>${project.basedir}/src/main/java</generateDirectory>
//			<schemaDirectory>${project.basedir}/src/main/resources/wsdl</schemaDirectory>
//			<schemaIncludes>
//				<include>*.wsdl</include>
//			</schemaIncludes>
//			<forceRegenerate>true</forceRegenerate>
//		</configuration>
//	</plugin>
	
	}

}
