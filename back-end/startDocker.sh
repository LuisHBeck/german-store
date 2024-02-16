#!/bin/bash

cd ./server
mvn clean package -DskipTests

cd ../gateway
mvn clean package -DskipTests

cd ../user
mvn clean package -DskipTests

cd ../marketplace
mvn clean package -DskipTests

cd ../transport
mvn clean package -DskipTests

cd ..
docker-compose down
docker-compose up --build