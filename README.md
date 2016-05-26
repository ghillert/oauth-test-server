Oauth Test Server
=================

Simple oauth server using Spring Security OAuth. Uses the following 2 annotations:

- @EnableAuthorizationServer
- @EnableResourceServer

## Configuration

The main configuration is in `application.yml`. By default a user with username `user` and password `secret9` is configured. The server is running on port `9999`. The oauth security details are:

- Client Id `myclient`
- Client Secret `mysecret`

## Building

	$ mvn clean package

## Running

	java -jar target/oauthserver-0.0.1-SNAPSHOT.jar

