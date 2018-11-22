# myproj

This test project demonstrates thin boot with share mvnrepo

  * thin.classpath=path has more artifacts than thin:properties

  * thin:resolve does not work on windows ( with or without flatten poms). It only populates  spring-boot-thin-launcher-xxx-exec.jar

To reproduce the problem

  1. Build the project

  3. at app folder run

       java -jar target/myproj-app-1.0-SNAPSHOT.jar  --thin.classpath=path

       and compare with the generated thin.properties under target/classes/META-INF

       the classpath has slf4j-log4j12 and it is not under thin.property


To produce windows resolve issue, build on windows and view mvnrepo/target/staging's content