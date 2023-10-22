# API RestFul Spring-Boot 3 
![GitHub](https://img.shields.io/github/license/dropbox/dropbox-sdk-java)
![Maven Central](https://img.shields.io/maven-central/v/com.dropbox.core/dropbox-core-sdk)
![GitHub Release Date](https://img.shields.io/github/release-date/dropbox/dropbox-sdk-java)


## Setup

### Java Version

The current release supports Java 8+.

### Add a dependency to project

If you're using Maven, then edit your project's "pom.xml" and add this to the `<dependencies>` section:

```xml
<dependency>
  <groupId>org.postgresql</groupId>
	<artifactId>postgresql</artifactId>
	<scope>runtime</scope>
</dependency>
<dependency>
  <groupId>org.projectlombok</groupId>
	<artifactId>lombok</artifactId>
	<optional>true</optional>
</dependency>
```

#### create container docker postgresql

We will create a container to run our postgresql database engine.

```shell
docker run --name some-postgres -e POSTGRES_PASSWORD=postgres  -e POSTGRES_USER=postgres -e POSTGRES_DB=db_countries -d postgres:alpine3.18
```
