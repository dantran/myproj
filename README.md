# myproj

This test project demonstrates a few with thin boot packaging

  * thin:resolve does not work on windows ( with or without flatten poms). It only populates  spring-boot-thin-launcher-xxx-exec.jar
  * with flatten pom, thin:classpath produces more artifacts than thin:properties

Using flatten-maven-plugin is a must for us for CI/CD style build purpose