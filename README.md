# Demo for https://github.com/spring-projects/spring-boot/issues/29706

Execute the following HTTP call:

````shell
curl --location --request POST 'http://localhost:8080' --form 'data="{\"values\": [{\"value\": \"\"}]}";type=application/json'
````

