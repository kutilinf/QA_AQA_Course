package Lesson_2_8;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

public class Test {

    private static ApiHelper testApi;

    @BeforeAll
    public static void before() {
        testApi = new ApiHelper();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Тест метода GET")
    public void apiGetTest() {
        testApi.get();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Тест метода POST")
    public void apiPostTest() {
        testApi.post();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Тест метода PUT")
    public void apiPutTest() {
        testApi.put();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Тест метода PATCH")
    public void apiPatchTest() {
        testApi.patch();
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Тест метода DELETE")
    public void apiDeleteTest() {
        testApi.delete();
    }
}