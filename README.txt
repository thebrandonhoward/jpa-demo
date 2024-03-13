docker ps -a
docker pull postgres
docker run --name pg1 -p 5432:5432 -e POSTGRES_USER=test -e POSTGRES_PASSWORD=test -e POSTGRES_DB=mydb -d postgres