package com.controlechamados.entity.chains;

import com.controlechamados.entity.Entity;
import com.controlechamados.entity.enums.AcaoEnum;
import com.controlechamados.usuario.UsuarioMock;

import java.time.LocalDate;
import java.util.UUID;

public class PropriedadePorAcaoChain {

    public static void validar(Entity entity, AcaoEnum acaoEnum){

        PropriedadesCriacao propriedadesCriacao = new PropriedadesCriacao();
        PropriedadesAtualizacao propriedadesAtualizacao = new PropriedadesAtualizacao();
        PropriedadesInativacao propriedadesInativacao = new PropriedadesInativacao();
        PropriedadesMock propriedadesMock = new PropriedadesMock();
        PropriedadePorAcaoSemRegra propriedadePorAcaoSemRegra = new PropriedadePorAcaoSemRegra();

        propriedadesCriacao.setNext( propriedadesAtualizacao );
        propriedadesAtualizacao.setNext( propriedadesInativacao );
        propriedadesInativacao.setNext( propriedadesMock );
        propriedadesMock.setNext( propriedadePorAcaoSemRegra );

        propriedadesCriacao.set( entity, acaoEnum);
    }

    private interface PropriedadePorAcao{

        void set(Entity entity, AcaoEnum acaoEnum);

        void setNext(PropriedadePorAcao propriedadePorAcao);

    }

    private static class PropriedadesCriacao implements PropriedadePorAcao{

        private PropriedadePorAcao proximo;

        @Override
        public void set(Entity entity, AcaoEnum acaoEnum) {
            if(AcaoEnum.CRIACAO.equals( acaoEnum )){
                entity.id = UUID.randomUUID();
                entity.ativo = Boolean.TRUE;
                entity.usuarioCriacao = UsuarioMock.usuarioMock();
                entity.dataCriacao = LocalDate.now();
            }else{
                proximo.set( entity, acaoEnum );
            }
        }

        @Override
        public void setNext(PropriedadePorAcao proximo) {
            this.proximo = proximo;
        }
    }

    private static class PropriedadesAtualizacao implements PropriedadePorAcao{

        private PropriedadePorAcao proximo;

        @Override
        public void set(Entity entity, AcaoEnum acaoEnum) {
            if(AcaoEnum.ATUALIZACAO.equals( acaoEnum )){
                entity.usuarioModificacao = UsuarioMock.usuarioMock();
                entity.dataModificacao = LocalDate.now();
            }else{
                proximo.set( entity, acaoEnum );
            }
        }

        @Override
        public void setNext(PropriedadePorAcao proximo) {
            this.proximo = proximo;
        }
    }

    private static class PropriedadesInativacao implements PropriedadePorAcao{

        private PropriedadePorAcao proximo;

        @Override
        public void set(Entity entity, AcaoEnum acaoEnum) {
            if(AcaoEnum.INATIVACAO.equals( acaoEnum )){
                entity.ativo = Boolean.FALSE;
                entity.usuarioModificacao = UsuarioMock.usuarioModificacao();
                entity.dataModificacao = LocalDate.now();
            }else{
                proximo.set( entity, acaoEnum );
            }
        }

        @Override
        public void setNext(PropriedadePorAcao proximo) {
            this.proximo = proximo;
        }
    }

    private static class PropriedadesMock implements PropriedadePorAcao{

        private PropriedadePorAcao proximo;

        @Override
        public void set(Entity entity, AcaoEnum acaoEnum) {
            if(AcaoEnum.MOCK.equals( acaoEnum )){
                entity.id = UUID.randomUUID();
            }else{
                proximo.set( entity, acaoEnum );
            }
        }

        @Override
        public void setNext(PropriedadePorAcao proximo) {
            this.proximo = proximo;
        }
    }

    private static class PropriedadePorAcaoSemRegra implements PropriedadePorAcao{

        @Override
        public void set(Entity entity, AcaoEnum acaoEnum) {

        }

        @Override
        public void setNext(PropriedadePorAcao propriedadePorAcao) {

        }
    }

}
