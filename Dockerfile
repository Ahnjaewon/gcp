FROM openjdk:17
# 프로젝트를 복사해서 Dockerfile 안에서 Build후 jar실행
RUN ["mkdir", "project"]
COPY . ./project
RUN ["chmod", "744", "./project.gradlew"]
RUN ["./project/gradlew", "clean", "build"]
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "project/build/lib/*T.jar"]