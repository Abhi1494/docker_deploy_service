=========create docker image========
docker build -t spring-boot-docker.jar .

======docker image list=======
docker image ls

========run the dockert=========

docker run -p 9090:8080 spring-boot-docker.jar


netstat -ano | findstr :<PORT>

taskkill /PID <PID> /F