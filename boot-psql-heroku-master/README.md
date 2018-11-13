## Spring Boot Web Application with PostgreSQL
This is a basic Spring Boot application with PostgreSQL database to perform following operations:
1. Add user into a table
2. Get list of users

### Application Tech Stack
- Spring Boot 2.0.3
- Java 1.8
- Maven 3.5.4
- PostgreSQL 10

### Clone the application
Clone the source code using `git clone` command and switch to the application's directory using following command.
```
$ git clone https://github.com/rohitjain01/boot-psql-heroku
$ cd boot-psql-heroku boot-psql-heroku-master
```
Alternatively you can create a new Spring Boot Web Application from [Spring Initializer](http://start.spring.io/)

### Make changes and push to git
Make necessary changes in the application (if needed) and push them to the repository using following command.

```
$ git commit -m "<Commit_Message>"
$ git push 
```

### Heroku Deployment
Download and install Heroku CLI from [Heroku Dev Center](https://devcenter.heroku.com/articles/heroku-cli#download-and-install)

Use following commands to deploy the application to heroku
```
$ heroku login
heroku: Enter your login credentials
Email: <ENTER YOUR HEROKU USERNAME HERE>
Password: <ENTER YOUR PASSWORD HERE>
Logged in as <YOUR HEROKU USERNAME>

$ heroku create
$ git push heroku master
```
The application will be deployed on heroku but table is yet to be created. Use following command to create table.
```
$ heroku pg:psql
--> Connecting to <DATABASE_URL>
psql (10.1, server 10.4 ...)
SSL connection (protocol: TLSv1.2, ... bits: 256, compression: off)
Type "help" for help.
```
Execute the following command on psql prompt to create the table.
```
create table application_user(
	id bigserial PRIMARY KEY not null,
	full_name text not null,
	email text not null
);
```

### Open the application in Heroku
`$ heroku open`
