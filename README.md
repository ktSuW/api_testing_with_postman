# API, API Testing with Postman and Automation

This repo contains the study notes for API, API testing with Postman and Automation.

```
  Lesson - 1

      What is API?
      Web URL, protocol, Domain, Port, resourcePath, stringQuery
      json language - syntax, rules, objects, how to access them
      HTTP methods
      Postman

  Lesson - 2

      CRUD Operations
        Create - POST
        React - GET
        Update - PUT/PATCH
        Delete - DELETE
        Environments : Development, QA, Pre-Prod, Prod
        Authorisation
          - Basic Auth
          - Bearer Token
          - API Key and value
          - OAuth 1.0

  Lesson - 3
      Java OOP
      Java Collections Framework
        - ArrayList, List
        - Map, Hashmap, etc

  Lesson - 4
      Set up Maven Project
      Add dependencies from Maven repository
      TestNG concept & Annotation in TestNG
      CRUD operations
      Report


  Lesson - 5



```

<details>
  <summary>Lesson - 1 </summary>

- <img src=".\img\l1_1_web_url.PNG">
- <img src=".\img\l1_2_web_url.PNG">
- <img src=".\img\l1_3_web_url.PNG">
- <img src=".\img\l1_4_web_url.PNG">

## What is API?

- Application Programming Interface. It is a way for any two applications to communicate with each other.

  - app1 <--->(API) app2
    - Username :
    - Password :
  - Use facebook or google authentication

- Three Layers architecture of API

  - Presentation layer (frontend)
  - Business logic layer (backend) : Developer write logic
    - e.g. customer should be able to add item to the cart
    - customer should be able to check out
    -
  - Data layer : Database
    - Whatever actions you perform (e.g. create a new customer, registration of a new product), the information will be saved/updated in the database layer.

- API testing is testing the business logic of the application and get for responses and validate the responses
- Presentation layer testing : Do manually or use selenium
- (send request) ---> with help of end point(========)
- (receive )<--- (=========)
  - Use json to send and receive the data

## What is Web URL?

-

- Web URL - web uniform resource location : Uniquely identify the specific web resource inside the web application

  - every web application should have its unique address in the form of URL
  - URL is one and only way to access web application via browser
  - Max number of character in the URL is 200, otherwise, server will reject it.
  - Syntax is below.

  ```
    protocol://<domainName>:port/resourcePath?queryString#fragmentId

    http://localhost:8080/index.php
    http://google.com/search?q=swedish
    http://172.217.160.142/search?q=iphone11
  ```

- www.facebook.com

  - www.69.63.176.13.69.63.com
  - http://69.63.176.13/
  - different page : module or feature or in API called resource

- To get IP address of any website, enter the following into command prompt.

  ```
    ping facebook.com

    You will see the following responses.
    Reply from 157.240.8.35: bytes=32 time=43ms TTL=57
    Reply from 157.240.8.35: bytes=32 time=34ms TTL=57
    Reply from 157.240.8.35: bytes=32 time=27ms TTL=57
    Reply from 157.240.8.35: bytes=32 time=26ms TTL=57
  ```

- **protocol**

  - It is a common language where two application exchange information to each other.
    - When Swedish wants to communicate with someone from Korea at a cafe shop, she/he needs to use English to communicate with a cafe waiter
  - When one application want to communicate with another app (in this case browser and server), there is a requirement to have a common language which both applications can understand.
  - This language is known as protocol, where protocol as set of rules and instructions.
  - Browsers always send a request and receive a response via HTTP protocol. Hence it is called HTTP request/response.
  - Types of Protocols
    - http
    - https
    - ftp
    - smtp
  - When to use http vs https
    - Example. login - Enter username and password which are private and sensitive. They should be stored in a secure format. Therefore use https
  - SMTP - e.g. Outlook within one organisation
    - It is mainly for internal email communication
  - **domain**
    - name of the computer or IP address of the computer
    - In the network, there are so many servers available. By looking into the domain name, it will identify the specific computer
  - **port number**
    - We cannot install 2 applications in one port number.
    - All application should be running in different port number
    - What happens if you use same port number for two different applications?
      - Every appliation will be associated with one specific unique port number when it is installed.
      - Port number is used to identify the specific application inside the computer.
      - e.g. Jenkins/jira software installation -> they will be stored at different port numbers
  - **resourcePath**
  - **stringQuery**

    ```
      https://example.com/over/there?name=ferret
      https://upload.wikimedia.org/wikipedia/commons/0/06/Query_string.png

      https://en.wikipedia.org/w/index.php?title=Query_string&action=edit
    ```

  - (What is url?)[https://quick-adviser.com/what-is-resource-path-in-url/]

## JSON

- JSON stands for JavaScript Object Notation.
- JSON objects are used for transferring data between server and client. XML serves the same purpose. However, JSON objects have several advantages over XML.
- JSON values must have the following data types:
  - string
  - number
  - object
  - aray
  - boolean
  - null
- Syntax Rules

  - data is in name/value pairs
  - data is separated by comma
  - {} hold objects
  - [] brackets hold arrays

  ```
      var person - {
        "firstName" : Lee,
        "lastName" : Kim,
        "age"   : 65
      }
  ```

- Features of JSON
  - light weight
  - langauage independent
  - Easy to read and write
  - Text-based, human readable data exchange format
- Why use JSON?

  - **_Standard Structure_** : As we have seen so far that JSON objects are having a standard structure that makes developers job easy to read and write code, because they know what to expect from JSON.
  - **_Light weight_** : When working with AJAX, it is important to load the data quickly and asynchronously without requesting the page re-load. Since JSON is light
  - **_Scalable_** : It is langauge independent. It means it can work well with most programming languages. If you need to change the server side langauge, in that case, it would be easier to go ahead with the change as JSON structure is same for all the languages

  - JSON vs XML

    - example: Records of 4 students in text based format for later retrival if needed

    - JSON style
      - It is much more light weight compared to XML.
      - Can take advantage of arrays that is not available in XML

    ```
        {
          "students" : [
            {"name": "Lila", "age" : "23", "city" : "Seoul"},
            {"name": "Sam", "age" : "32", "city" : "Busan"},
            {"name": "Lee", "age" : "19", "city" : "Jeju"},
            {"name": "Chen", "age" : "29", "city" : "Incheon"},
          ]
        }
    ```

    - (XML style code)[https://www.convertjson.com/json-to-xml.htm]

    ```
        <?xml version="1.0" encoding="UTF-8" ?>
        <root>
          <students>
            <name>Lila</name>
            <age>23</age>
            <city>Seoul</city>
          </students>
          <students>
            <name>Sam</name>
            <age>32</age>
            <city>Busan</city>
          </students>
          <students>
            <name>Lee</name>
            <age>19</age>
            <city>Jeju</city>
          </students>
          <students>
            <name>Chen</name>
            <age>29</age>
            <city>Incheon</city>
          </students>
        </root>
    ```

- JSON data structures and how to read them

  - JSON objects
  - JSON objects in array
  - Nesting of JSON objects

- **JSON objects** : Below text creates an object that we can access using teh variable called person. Inside an object, there can be any number of key-value pairs.

  ```
      var person = {
        "name" : "Lee Kim",
        "age"   : "65",
        "website" : "myportfolio.com"
      }

      You can access the information out of a JSON object like this.

      document.writeln("The name is" + person.name);
  ```

  - **JSON objects in array** : Suppose it is required to store the information of more than one person. In this case, you need an array of objects.

    ```
      var students = [
        {
          "name" : "Lee Kim",
          "age"   : 65,
          "website" : "myportfolio.com",
          "subjects" : ["Maths", "physics", "arts", "language"],
          "OnCampusAccommodation" : false,
          "Dependent" : 2,
          "id" : 1
        },
        {
          "name" : "Josh Cameron",
          "age"   : 26,
          "website" : "icecream.com",
          "subjects" : ["Maths", "Pathology", "Creative", "language"],
          "OnCampusAccommodation" : true,
          "Dependent" : null,
          "id" : 2
        }
      ];


      document.writeln(students[0].name); // Lee Kim
      document.writeln(students[1].website); // icecream.com
    ```

  - **Nesting of JSON objects**

    ```
          var students = {
            "Lee Kim" : {
              "age"   : 65,
              "website" : "myportfolio.com",
              "id" : 1
            },
            "Josh Cameron": {
              "age"   : 45,
              "website" : "icecream.com",
              "id" : 2
            }
          };

      document.writeln(students[0].name); // Lee Kim

    ```

## HTTP methods

- <img src=".\img\http_request_methods_from_researchGate.png">
  - Referenced from (Connected Lighting System Interoperability Study: Application Programming Interfaces, Part 1)[https://www.researchgate.net/figure/Definitions-and-characteristics-of-HTTP-11-request-methods_tbl1_334248424]
- GET, POST, PUT, PATCH, DELETE, COPY, HEAD, OPTIONS, LINK, UNLINK, PURGE, LOCK, UNLOCK, etc..
- CRUD Operations
  - Create
  - Read
  - Update
  - Delete
- GET - Get/retrieve/read data from the database/server
  - Example
    - https://xyz.com/students
    - See how many users are available in the system
- POST - Create data in the server
  - Example :
- PUT - Update information
  - Whenever you need to update the entire data
- PATCH - Update information
  - Whenever you need to change only a single information in the data
- DELETE - remove a specified resource

## Postman

- Workspace - Allows you to collaborate with team members
  - can store all the API related to that workspace
- What is Collections?
  - Collection in Postman means a group of API requests that are already saved in the Postman and can be arranged into folders. A number of folders can be created inside a collection.
  - Putting together similar requests into folders and collections helps the client in better organisation and documentation of their requests.
  - All the API requests can be stored and saved within a collection and these collections can be shared amongst the team in the Postman workspace.
  - Hold collections of all types of requests

```
  Create folders in Collections
  GET
  POST

  Use fake API - https://reqres.in/
  use web url syntax
  protocol://domainName:8080//request/queryParamter

  1. Take endpoint /api/users=2
  2. Type this in Postman and use get method :
      https://reqres.in/api/users?page=2
    protocol  domain     endpoint queryParameter
    - Status 200 means get request is successful

  GET request practice

```

- (Do practice for all the queries )[https://reqres.in/] and save each request under folder
  - Make sure the response you get the correct.
  - <img src=".\img\l4_1_postman_queries_exercises.PNG">

```
    ListUsers               https://reqres.in/api/users?page=2
    Single User             https://reqres.in/api/data?id=2
    Single User Not Found   https://reqres.in/api/data?id=23
    List <Resource>         https://reqres.in/api/page?resource=unknown
    Single <Resource>       https://reqres.in/api/data/unknown/data?id=2
```

- POST

  - Create - Since you are creating, you need to add data.
  - Go to Body --> raw --> JSON --> add the information in there
  - If successful, status code should be 201. You should be the following.

    ```
      {
        "name": "morpheus",
        "job": "leader",
        "id": "285",
        "createdAt": "2022-03-24T23:52:27.469Z"
      }

    ```

- PUT
  - If successful, it will be updated and you should see **updatedAt** "updatedAt": "2022-03-25T00:02:39.330Z".
- Variables
- Environment

</details>

<hr>

<details>
  <summary>Lesson - 2 </summary>

- CRUD OPERATIONS- create, read, update, delete
  - [json-server --watch w2_d1_db.json](https://medium.com/codingthesmartway-com-blog/create-a-rest-api-with-json-server-36da8680136d)
  - Resources
    - http://localhost:3000/users
  - Home
  - CRUD Operations and HTTP methods
    - Create => POST
    - Read => GET
    - Update => PUT/PATCH
    - Delete => DELETE
- **Create**

  - POST - In Body, add another user. If successful, you will see 201 code status.

  ```
          {
            "id": 4,
            "firstName": "Su",
            "lastName": "Win",
            "age": 78
          }
  ```

  - **UPDATE**

    - Select PUT, and update the data in the body. You should get 200 status request.
    - POSTMAN <--> Registration page (it exposes API) <--> Database (Registraion table)

  - **DELETE**
    - http://localhost:3000/users/4

- Environments : Environments vary and URL will change depending on each environment and configuration.

  - Development environment
    - Unit testing
  - QA environment
  - Production environment
  - Create Environment
    - Add variable name and value URL
    - In one of the requests, {{URL}}
    - If you change the environment, you will see the change in the URL based on the environment selected.

- [Authorisation/ Authentication](https://learning.postman.com/docs/sending-requests/authorization/)

  - **Basic Auth** - just user name and password

  ```
  Sample API for Basic Auth:
  URL: https://postman-echo.com/basic-auth
  Username: postman
  Password: password
  ```

      - Enter username and password in Authorisation => Basic Auth
      - Authorisation successful => 200 status
      - When you send user name and password, [they get encoded](https://www.base64encode.org/) internally in Headers (key, value) along with the request

  - **API Key Auth**

    - Get request
    - key and value

    ```
      2) API Key Auth
      Get Request: https://api.openweathermap.org/data/2.5/forecast/daily?q=Delhi&cnt=1
      API key   :  appid
      value :  fe9c5cddb7e01d747b4611c3fc9eaf2c
    ```

    - Without API key and value, you will get 401 error - invalid API key.
    - <img src="./img/w2_api_authrisation.jpg">

  - **Bearer Token** - generate the token

    ```
      API reference URL : https://developer.github.com/v3/repos/
      POST request : https://api.github.com/user/repos
    ```

    - Create repo on Github using PostMan
      - [Create a repo using a template](https://docs.github.com/en/rest/reference/repos#create-a-repository-for-the-authenticated-user)
      - ## GitHub Settings
      - Delete repo - what is the end point
      - List all repo
        - GET /users/{username}/repos
        - https://api.github.com/repos/ktSuW/Hello-World-with-Postman_1

  - [**Practise these methods**](https://docs.github.com/en/rest/reference/repos#delete-a-repository)
  - **Two levels authentication**

    - OAuth 1.0 OTP sending - for more complex app

  - **Pre-request Script**
    - Before sending request, you need to add pre-request Script.
    - Add values
  - **Tests** - How to perform validation in Postman? - Postman provides snippets - To validate the response, you need to perform tests through Tests. - <img src=".\img\w2_tests.jpg">
  </details>

<hr>

<details>
  <summary>Lesson - 3 </summary>

- Fragment ID
- URI
- URL
- Java
  - OOP, access modifiers, variables
  - Access modifiers - public, private, protected, final, static
- JavaCollection Framework
  - List Interface
  - Map Interface
- <img src=".\img\">

</details>
<hr>
<details>
  <summary>Lesson - 4 </summary>

- [How to set up REST Assured with TestNG and Maven in IntelliJ IDEA](https://blog.anurut.com/setting-up-restassured-with-testng-in-intellijidea/)

  - REST assured
  - create Maven project
  - Write all the script in src/test/java
  - Testing RestAssured
  - [Download TestNG in Plugin](https://www.testingdocs.com/enable-testng-in-intellij-ide/)
  - Add RestAssured dependencies - [Go to Maven Repository](https://mvnrepository.com/)
    - [Rest Assured](https://mvnrepository.com/artifact/io.rest-assured/rest-assured)
      - https://mvnrepository.com/artifact/io.rest-assured/rest-assured/4.4.0

- Add the code to pom.xml file

```
    <dependencies>
      <!-- https://mvnrepository.com/artifact/io.rest-assured/rest-assured -->
      <dependency>
          <groupId>io.rest-assured</groupId>
          <artifactId>rest-assured</artifactId>
          <version>4.4.0</version>
          <scope>test</scope>
      </dependency>
    </dependencies>

```

- On right, refresh Maven.
- To validate whether we have correct JSON responses, use below.
- [JSON Simple jar](https://mvnrepository.com/artifact/com.googlecode.json-simple/json-simple)
- POM.xml

```
<dependencies>
  <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>json-schema-validator</artifactId>
      <version>4.3.1</version>
  </dependency>
  <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>json-path</artifactId>
      <version>4.3.1</version>
  </dependency>
  <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>xml-path</artifactId>
      <version>4.3.1</version>
  </dependency>
  <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>spring-mock-mvc</artifactId>
      <version>4.3.1</version>
      <scope>test</scope>
  </dependency>
  <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>scala-support</artifactId>
      <version>4.3.1</version>
      <scope>test</scope>
  </dependency>
  <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>rest-assured-common</artifactId>
      <version>4.3.1</version>
  </dependency>
  <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>spring-commons</artifactId>
      <version>4.3.1</version>
  </dependency>
  <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>spring-web-test-client</artifactId>
      <version>4.3.1</version>
  </dependency>
  <dependency>
      <groupId>io.rest-assured</groupId>
      <artifactId>rest-assured-parent</artifactId>
      <version>4.3.1</version>
      <type>pom</type>
  </dependency>
</dependencies>

```

- TestNG concept
- Annoation for TestNG
- <img src=".\img\">

</details>
<hr>
<details>
  <summary>Lesson - 5 </summary>

- <img src=".\img\">

</details>
<hr>
<details>
  <summary>Lesson - 6 </summary>

- <img src=".\img\">

</details>
<hr>
<details>
  <summary>Lesson - 7 </summary>

- <img src=".\img\">

</details>
<hr>
<details>
  <summary>Lesson - 8 </summary>

- <img src=".\img\">

</details>
