version: "3"
services:
  mysqldb:
    image: mysql:8
    environment:
      - MYSQL_DATABASE=IssaouiAzizDB
      - MYSQL_ALLOW_EMPTY_PASSWORD=yes

  devopsproject:
    image: AzizImage
    ports:
      - "5052:8080"
