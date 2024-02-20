docker stop $(docker ps -a -q)

docker rm $(docker ps -a -q)

docke rmi $(docker images -q | grep -v postgres)