=========create docker image========
docker build -t spring-boot-docker.jar .

======docker image list=======
docker image ls

========run the dockert=========

docker run -p 9090:8080 spring-boot-docker.jar


netstat -ano | findstr :<PORT>

taskkill /PID <PID> /F


===========push and pull images into docker hub==========

======step 1======
login to docker hub

https://hub.docker.com/choose-plan?ref=signup

======step 2======

open the docker terminal

a. enter the cmd "docker login"
b. enter the username "abhiskek"
c. enter the pwd

=====step 3=====
docker image ls

=====step 4 ========

add the tag with docker image 
docker tag <jar name> <dockerid>/<jar name>
(e.g. docker tag spring-boot-docker.jar abhiskek11/spring-boot-docker.jar)

=====step 5=========
push the image into docker hub
docker push <dockerid>/<jar name>
(e.g. docker push abhiskek11/spring-boot-docker.jar)

=======step 6======
pull the docker image
docker pull <dockerid>/<jar name>

=======step 7==========
run the docker image
docker run -p 9090:8080 <dockerid>/<jar name>

========step 8=========
after successfully running of docker image
run below url in your browser
<docker_ip>:<port>/<endpoint>

http://192.168.99.100:9090/api/docker/deploy


