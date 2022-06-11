# maven-artifact-repo-aws-s3-demo
Demo of using an AWS S3 Bucket as a Maven artifact repository

Here's the Maven settings.xml used to try to deploy the demo library jar to the S3 bucket using the `mvn deploy` command.

```
<?xml version="1.0" encoding="UTF-8"?>
<settings xsi:schemaLocation="http://maven.apache.org/SETTINGS/1.1.0 http://maven.apache.org/xsd/settings-1.1.0.xsd" xmlns="http://maven.apache.org/SETTINGS/1.1.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance">
	<servers>
		<server>
			<id>repo.jeremywall.dev</id>
			<username>*** REDACTED AWS_ACCESS_KEY_ID ***</username>
			<password>*** REDACTED AWS_SECRET_ACCESS_KEY ***</password>
		</server>
	</servers>
	<profiles>
		<profile>
			<id>default</id>
			<repositories>
				<repository>
					<id>repo.jeremywall.dev</id>
					<name>S3 Release Repository</name>
					<url>s3://repo.jeremywall.dev/release</url>
					<releases>
						<enabled>true</enabled>
					</releases>
					<snapshots>
						<enabled>false</enabled>
					</snapshots>
				</repository>
			</repositories>
		</profile>
	</profiles>
	<activeProfiles>
		<activeProfile>default</activeProfile>
	</activeProfiles>
</settings>

```
