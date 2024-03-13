docker ps -a
docker pull postgres
docker run --name pg1 -p 5432:5432 -e POSTGRES_USER=test -e POSTGRES_PASSWORD=test -e POSTGRES_DB=mydb -d postgres

/*
Attempt to recreate a file for type com.example.jpademo.QBook

If querydsl and not mapstruct then remove output directory
If querydsl and mapstruct then there is no error
*/
