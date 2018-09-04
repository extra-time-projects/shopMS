# shop
[![Build Status](https://travis-ci.org/extra-time-projects/shops.svg?branch=master)](https://travis-ci.org/extra-time-projects/shops)

Petshop Micro Service


### Build and Run:
`mvn package && java -jar target/shops-0.0.1-SNAPSHOT.jar`

#### To access service :

`localhost:8080/shops`


### Run Docker

- `sudo docker-compose up --build`

##### OR
- `sudo docker build -t shops .`
- `sudo docker run -p 8080:8080 shops`
