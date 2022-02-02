Spring boot REST microservices using H2 database with slf4j logger

To start the service

DEPARTMENT SERVICE

-cd departmentapi
-mvn clean install
-java -jar target/*.jar

[POST]
http://localhost:9002/department/
{
    "departmentId": 101,
    "departmentName": "IT",
    "departmentAddress": "India"
}

[GET]
http://localhost:9002/department/101
{
    "departmentId": 101,
    "departmentName": "IT",
    "departmentAddress": "India"
}


USER SERVICE

-cd userapi
-mvn clean install
-java -jar target/*.jar

[POST]
http://localhost:9001/user/
{
    "userId": 1,
    "userName": "IT",
    "userDepartment": 101
}

[GET]
http://localhost:9001/user/1
{
    "user": {
        "userId": 1,
        "userName": "IT",
        "userDepartment": 101
    },
    "department": {
        "departmentId": 101,
        "departmentName": "IT",
        "departmentAddress": "India"
    }
}
