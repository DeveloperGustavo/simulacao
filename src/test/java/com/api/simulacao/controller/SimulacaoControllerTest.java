package com.api.simulacao.controller;

import com.api.simulacao.controllers.SimulacaoController;
import com.api.simulacao.models.Simulacao;
import com.api.simulacao.services.SimulacaoService;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.mockmvc.RestAssuredMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;

@WebMvcTest
public class SimulacaoControllerTest {

//    @Autowired
//    private SimulacaoController simulacaoController;
//
//    @MockBean
//    private SimulacaoService simulacaoService;
//
//    @BeforeEach
//    public void setup() {
//        RestAssuredMockMvc.standaloneSetup(this.simulacaoController);
//    }
//
//    @Test
//    public void deveRetornarSucesso_QuandoBuscarSimulacao() {
//
//        Mockito.when(this.simulacaoService.findById(1)).thenReturn(java.util.Optional.of(new Simulacao()));
//
//        RestAssuredMockMvc.given()
//                .accept(ContentType.JSON)
//                .when()
//                .get("/simulacao/{id}", 2)
//                .then().statusCode(HttpStatus.OK.value());
//    }
}
