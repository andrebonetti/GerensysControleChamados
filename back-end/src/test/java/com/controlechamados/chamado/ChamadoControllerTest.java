package com.controlechamados.chamado;

import com.controlechamados.chamado.dto.ChamadoDTO;
import com.controlechamados.chamado.dto.ChamadoMock;
import config.RestMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;

import static org.hamcrest.Matchers.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(controllers = ChamadoController.class)
public class ChamadoControllerTest {

    @Autowired
    private ChamadoController controller;

    @Autowired
    private RestMockMvc mockMvc;

    @BeforeEach
    void before() {
        mockMvc.standaloneSetup(controller);
    }

    @Test
    void should_list_chamados() throws Exception {
        ChamadoDTO chamadoDTO = ChamadoMock.correctChamado() ;

//        when(userService.findAll(any( Pageable.class)))
//                .thenReturn(new PageImpl( Arrays.asList(simpleUserDTO), PageRequest.of(1, 10), 1));

        mockMvc.perform(get("/chmados?page=0&size=10")
                .contentType( MediaType.APPLICATION_JSON))
                .andDo(print())
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.content", hasSize(1)))
                .andExpect(jsonPath("$.content[*].name", hasItem("Leandro")));
    }

}