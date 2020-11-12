package com.controlechamados.chamado;

import com.controlechamados.chamado.dto.ChamadoGridDTO;
import com.controlechamados.chamado.dto.ChamadoMock;
import config.RestMockMvc;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;

import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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
        mockMvc.standaloneSetup( controller );
    }

    @Test
    void should_list_chamados() throws Exception {
        ChamadoGridDTO chamadoGridDTO = ChamadoMock.correctChamado();

//        when(userService.findAll(any( Pageable.class)))
//                .thenReturn(new PageImpl( Arrays.asList(simpleUserDTO), PageRequest.of(1, 10), 1));

        mockMvc.perform( get( "/chmados?page=0&size=10" )
                .contentType( MediaType.APPLICATION_JSON ) )
                .andDo( print() )
                .andExpect( status().isOk() )
                .andExpect( jsonPath( "$.content", hasSize( 1 ) ) )
                .andExpect( jsonPath( "$.content[*].name", hasItem( "Leandro" ) ) );
    }

}
