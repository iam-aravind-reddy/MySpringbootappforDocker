# Prerequisites to Build Docker image and Push to Docker Hub using jenkins pipeline

Launch a Amazon Linux ec2-user instance and allow 8080 in the security group

Install Required softwares

Install jdk17

```bash
sudo yum install java-17-amazon-corretto-headless
```
Install git

```bash
sudo yum install git -y
```

Install jenkins using following steps
```bash
sudo wget -O /etc/yum.repos.d/jenkins.repo https://pkg.jenkins.io/redhat-stable/jenkins.repo
```
```bash
sudo rpm --import https://pkg.jenkins.io/redhat-stable/jenkins.io-2023.key
```
```bash
 sudo yum install jenkins -y
```
To change jenkins port , follow below steps

```bash
sudo systemctl edit jenkins --full
```
change the port as required and save the file

Start jenkins

```bash
sudo systemctl start jenkins
```
Check the status of jenkins

```bash
sudo systemctl status jenkins
```
Install docker 

```bash
sudo yum install docker -y
```
The user jenkins needs to be added to the group docker

```bash
sudo usermod -a -G docker jenkins
```

Start Docker

```bash
sudo systemctl start docker
```
Access Jenkins in the browser

```bash
http://ip-address:8080
```

Import the Jenkinsfile and execute the pipeline by launching the pipeline job
