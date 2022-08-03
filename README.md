**Run project from command line:**

To install and add maven to environment variable visit Install maven if you are under a proxy check out add proxy to maven

Navigate to the root of the project via command line and execute the command

mvn spring-boot:run

**Run project from IntelliJ IDEA:**

File -> New -> Project from existing sources -> select project folder
Hit play button on Demo88888888Application class

**Making requests to app**

Open Postman and set Body to RAW and select JSON instead of TEXT and paste:
`{
"date": "2021-01-01",
"amount": "100.00",
"currency": "EUR",
"client_id": 42
}`
and send a POST request to `localhost:8081/transaction/`
 