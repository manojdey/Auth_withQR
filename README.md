manoj123

Post  request    http://localhost:5000/api/v1/auth/signin
in  body  pass below  Request Joon

{

     "usernameOrEmail":"manoj@gmail.com",
    "password":"manoj"
}

In response  

{
    "accessToken": "eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYW5vakBnbWFpbC5jb20iLCJpYXQiOjE2NzE5ODk3MjYsImV4cCI6MTY3MjU5NDUyNn0.d4AgXUiwF99lO7lBCNioxGoWdT08k7UK3pXd3rcX2MC3rTMgsvYYjifWjkv4fbYZHDvPrhPNpuNYdD3MfUIU7g",
    "tokenType": "Bearer"
}
------------------------------------------------------------------------------------

POST   http://localhost:5000/api/v1/auth/signup

body

{
    "name":"manoj",
    "username":"manoj",
    "email":"manoj@gmail.com",
    "password":"manoj"
}


RESPONSE

Username is already taken!

---------------------------------------------------------------------------------------------
POST
http://localhost:5000/api/v1/qr-code/123435566

In  AUTHENTICATION  type  barrear token  and pass  the  token

--------------------------------------------------------------------------------------------
GET

http://localhost:5000/api/v1/generate-qr-code-with-url/123435566

In  AUTHENTICATION  type  barrear token  and pass  the  token

----------------------------------------------------------------------------
POST

http://localhost:5000/api/v1/getqrcode/

In  AUTHENTICATION  type  barrear token  and pass  the  token

IN  BODY 

{
  "aapUrl": "http://localhost:8080/validate1/",
  "tokenCode": "PQRWMV",
  "qrCodeString": "MANOJDEYJYOTI"
}
--------------------------------------------------------------------------------------------

# springboot-blog-rest-api
Learn how to build real-time REST APIs with Spring Boot by building a complete Blog App.

# Source code of Popular Building Real-Time REST APIs with Spring Boot Course
Learn how to build real-time REST APIs with Spring Boot by building a complete Blog App.

Udemy Course Link - https://www.udemy.com/course/building-real-time-rest-apis-with-spring-boot/

Link - https://courses.javaguides.net/p/building-rest-api-with-spring-boot

# What you'll learn in this course ?
- Learn how to build great REST API’s for Blog App using Spring Boot, Spring Security, JWT, Spring Data JPA (Hibernate), MySQL database
- Learn REST basics - Resource, Sub-resource, URI, HTTP methods, HTTP status codes
- Learn how to build CRUD REST API's
- Learn how to build REST API’s for Pagination and Sorting
- Learn how to build REST API’s for Login/Signin and Signup
- Learn how to use Lombok
- Learn how to use DTO’s
- Learn Spring boot REST API exception handling 
- Learn Spring boot REST API validation
- Learn how to use Spring security in Spring boot project
- Learn Spring security In-memory and DB authentication and authorization
- Learn how to secure REST API’s ( role based security)
- Learn how to write query methods using Spring Data JPA
- Learn one to many and many to many JPA mappings 
- Learn how to test REST API’s using Postman REST Client
- Learn What is JWT and How it Works
- Learn How to configure JWT ( JSON Web Token) in Spring Security
- Learn how to secure REST API's using JWT
- Learn how to use JWT with Login API
- Learn versioning REST APIs
- Learn Important 4 versioning REST API strategies
- Deploy Spring Boot Blog App on AWS Cloud

POST   http://localhost:5000/api/v1/auth/signup

body

{
    "name":"manoj",
    "username":"manoj",
    "email":"manoj@gmail.com",
    "password":"manoj"
}


RESPONSE

Username is already taken!


POST   http://localhost:5000/api/v1/auth/signin


{
  
    "usernameOrEmail":"manoj@gmail.com",
    "password":"manoj"
}


RESPONSE

{"accessToken":"eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJtYW5vakBnbWFpbC5jb20iLCJpYXQiOjE2NjI0NTYyNjksImV4cCI6MTY2MzA2MTA2OX0.EAfky9c4j315kPoLAslD-wFbGldeFxANXp5L3LUgDA4mBfFpkU4aqUhReTWYc6uqB865dpm3Evnd2u_fdbbHUg","tokenType":"Bearer"}
=======
# Auth_withQR
Auth_withQR  generation  code
>>>>>>> 84b8a89153640a7fda39e5362b635431a3e89fc4
