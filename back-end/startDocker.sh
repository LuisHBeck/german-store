#!/bin/bash

mvn_command="mvn clean package -DskipTests"
services=("server" "gateway" "user" "marketplace" "transport")

for service in "${services[@]}"
do
  cd ./$service
  $mvn_command
  cd ..
done

docker-compose down
docker-compose up --build