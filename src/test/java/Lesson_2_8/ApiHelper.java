package Lesson_2_8;

import io.restassured.http.ContentType;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.equalTo;

public class ApiHelper {

    private static final Log log = LogFactory.getLog(ApiHelper.class);

    public void get() {
        given().baseUri("https://postman-echo.com")            //Базовый URL
                .queryParam("foo1", "bar1")           //Параметр запроса
                .queryParam("foo2", "bar2")           //Параметр запроса
                .when().get("/get")                            //Метод GET отправляется на эндпоинт /get
                .then().statusCode(200)                        //Проверяем полученный ответ, что статус 200
                .body("args.foo1", equalTo("bar1"))    //Проверяем, что в ответе есть поле 'args.foo1' со значением 'bar1'
                .body("args.foo2", equalTo("bar2"));   //И проверяем, что есть поле 'args.foo2' со значением 'bar2'
        //.log().all();                                           //Если необходимо посмотреть логи
    }

    public void postRaw() {
        given().baseUri("https://postman-echo.com")                                  //Базовый URL
                .header("Content-Type", "text/plain")                             //Указываем в headers, что передаем простой текст
                .body("This is expected to be sent back as part of response body.")  //Содержание тела запроса 'This is expected to be sent back as part of response body.'
                .when().post("/post")                                                //Метод POST отправляется на эндпоинт /post
                .then().statusCode(200)                                              //Проверяем полученный ответ, что статус 200
                .body("data", equalTo("This is expected to be sent back as part of response body.")); //Проверяем, что в ответе есть поле 'data' со значением 'This is expected to be sent back as part of response body.'
        //.log().all();                                                                 //Если необходимо посмотреть логи
    }

    public void postForm() {
        given()
                .baseUri("https://httpbin.org")  //не понимаю почему, но запросы на 'https://postman-echo.com' не проходят, получаю ошибку 'Expected status code <200> but was <500>' поэтому взял другой сервер https://httpbin.org
                .contentType("application/x-www-form-urlencoded")
                .formParam("foo1", "bar1")  // Вместо raw body
                .formParam("foo2", "bar2")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("form.foo1", equalTo("bar1"))  // Теперь проверяем form
                .body("form.foo2", equalTo("bar2"))
                .log().all();
    }

    public void put() {
        given().baseUri("https://postman-echo.com")                                  //Базовый URL
                .header("Content-Type", "text/plain")                             //Указываем в headers, что передаем простой текст
                .body("This is expected to be sent back as part of response body.")  //Содержание тела запроса 'This is expected to be sent back as part of response body.'
                .when().put("/put")                                                  //Метод PUT отправляется на эндпоинт /put
                .then().statusCode(200)                                              //Проверяем полученный ответ, что статус 200
                .body("data", equalTo("This is expected to be sent back as part of response body.")); //Проверяем, что в ответе есть поле 'data' со значением 'This is expected to be sent back as part of response body.'
        //.log().all();                                                                 //Если необходимо посмотреть логи
    }

    public void patch() {
        given().baseUri("https://postman-echo.com")                                  //Базовый URL
                .header("Content-Type", "text/plain")                             //Указываем в headers, что передаем простой текст
                .body("This is expected to be sent back as part of response body.")  //Содержание тела запроса 'This is expected to be sent back as part of response body.'
                .when().patch("/patch")                                              //Метод PATCH отправляется на эндпоинт /patch
                .then().statusCode(200)                                              //Проверяем полученный ответ, что статус 200
                .body("data", equalTo("This is expected to be sent back as part of response body.")); //Проверяем, что в ответе есть поле 'data' со значением 'This is expected to be sent back as part of response body.'
        //.log().all();                                                                 //Если необходимо посмотреть логи
    }

    public void delete() {
        given().baseUri("https://postman-echo.com")                                  //Базовый URL
                .header("Content-Type", "text/plain")                             //Указываем в headers, что передаем простой текст
                .body("This is expected to be sent back as part of response body.")  //Содержание тела запроса 'This is expected to be sent back as part of response body.'
                .when().delete("/delete")                                            //Метод DELETE отправляется на эндпоинт /delete
                .then().statusCode(200)                                              //Проверяем полученный ответ, что статус 200
                .body("data", equalTo("This is expected to be sent back as part of response body.")); //Проверяем, что в ответе есть поле 'data' со значением 'This is expected to be sent back as part of response body.'
        //.log().all();                                                                 //Если необходимо посмотреть логи
    }
}