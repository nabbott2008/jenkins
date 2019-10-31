FROM ubuntu:bionic

RUN apt-get update && apt-get install -y gnupg2 && apt-get install openjdk-8-jdk wget -y && wget -q -O - https://pkg.jenkins.io/debian/jenkins.io.key | apt-key add - && sh -c 'echo deb http://pkg.jenkins.io/debian-stable binary/ > /etc/apt/sources.list.d/jenkins.list' && apt-get update && apt-get install jenkins -y

COPY run.sh /root/run.sh

RUN chmod +x /root/run.sh

CMD [ "/root/run.sh" ]
