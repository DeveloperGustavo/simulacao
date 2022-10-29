//package com.api.simulacao.controller;
//
//import com.api.simulacao.controllers.SimulacaoController;
//import com.api.simulacao.mock.SimulacaoMock;
//import com.api.simulacao.models.Simulacao;
//import com.api.simulacao.services.SimulacaoService;
//import io.restassured.RestAssured;
//import io.restassured.http.ContentType;
//import io.restassured.module.mockmvc.RestAssuredMockMvc;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.mockito.Mockito;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
//import org.springframework.boot.test.mock.mockito.MockBean;
//import org.springframework.http.HttpStatus;
//
//import java.time.LocalDateTime;
//import java.time.ZoneId;
//
//@WebMvcTest
//public class SimulacaoControllerTest {
//
//    @Autowired
//    private SimulacaoController simulacaoController;
//
//    @MockBean
//    private SimulacaoService simulacaoService;
//
//    private SimulacaoMock simulacaoMock;
//
//    @BeforeEach
//    public void setup() {
//        RestAssuredMockMvc.standaloneSetup(this.simulacaoController);
//    }
//
//    @Test
//    public void deveRetornarSucesso_QuandoBuscarSimulacao() {
//
//        var simulacao = new Simulacao(simulacaoMock.getSimulacao());
//        Mockito.when(this.simulacaoService.findById(1))
//                .thenReturn(java.util.Optional.of(simulacao));
//
//        RestAssuredMockMvc.given()
//                .accept(ContentType.JSON)
//                .when()
//                .get("/simulacao/{id}", 1)
//                .then().statusCode(HttpStatus.OK.value());
//    }
//
//    @Test
//    public void deveRetornarNaoEncontrado_QuandoBuscarSimulacao() {
//
//        Mockito.when(this.simulacaoService.findById(1))
//                .thenReturn(java.util.Optional.of(new Simulacao(simulacaoMock.getSimulacao())));
//
//        RestAssuredMockMvc.given()
//                .accept(ContentType.JSON)
//                .when()
//                .get("/simulacao/{id}", 2)
//                .then().statusCode(HttpStatus.NOT_FOUND.value());
//    }
//
////    @Test
////    public void deveRetornarSucesso_QuandoCriarSimulacao() {
////
////        Mockito.when(this.simulacaoService.save(new Simulacao(this.simulacaoMock.getSimulacao())))
////                .thenReturn(new Simulacao(simulacaoMock.getSimulacao()));
////
////        RestAssuredMockMvc.given()
////                .accept(ContentType.JSON)
////                .when()
////                .get("/simulacao/{id}", 2)
////                .then().statusCode(HttpStatus.NOT_FOUND.value());
////    }
//}
