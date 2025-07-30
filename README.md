# Tools
    - https://start.spring.io/
    - https://editor.swagger.io/
# Dependencies
````xml
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webmvc-ui</artifactId>
    <version>2.8.9</version>
</dependency>
<dependency>
<groupId>org.openapitools</groupId>
<artifactId>jackson-databind-nullable</artifactId>
<version>0.2.6</version>
</dependency>
````

# Plugin
````xml
			<plugin>
				<groupId>org.openapitools</groupId>
				<artifactId>openapi-generator-maven-plugin</artifactId>
				<version>6.6.0</version>
				<executions>
					<execution>
						<goals>
							<goal>generate</goal>
						</goals>
						<configuration>
							<inputSpec>
								${project.basedir}/src/main/resources/swagger.yaml
							</inputSpec>
							<generatorName>spring</generatorName>
							<apiPackage>com.example.swagger_openapi.api</apiPackage>
							<modelPackage>com.example.swagger_openapi.dto</modelPackage>
							<supportingFilesToGenerate>
								ApiUtil.java
							</supportingFilesToGenerate>
							<configOptions>
								<sourceFolder>src/main/java/</sourceFolder>
								<delegatePattern>true</delegatePattern>
								<interfaceOnly>true</interfaceOnly>
								<useJakartaEe>true</useJakartaEe>
								<useJakartaEe>true</useJakartaEe>
							</configOptions>
						</configuration>
					</execution>
				</executions>
			</plugin>
````