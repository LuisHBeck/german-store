#!/bin/bash

cd ./server
mvn clean package -DskipTests
cd ..

cd ./gateway
mvn clean package -DskipTests
cd ..

cd ./user
mvn clean package -DskipTests
cd ..

cd ./marketplace
mvn clean package -DskipTests
cd ..

docker-compose down
docker-compose up