package com.controlechamados.models.chains;

import com.controlechamados.models.AbstractEntity;
import com.controlechamados.models.enums.AcaoEnum;

public class PropriedadePorAcaoChain {

    public static void validar(AbstractEntity abstractEntity, AcaoEnum acaoEnum){

        PropriedadesCriacao propriedadesCriacao = new PropriedadesCriacao();
        PropriedadesAtualizacao propriedadesAtualizacao = new PropriedadesAtualizacao();
        PropriedadesInativacao propriedadesInativacao = new PropriedadesInativacao();
        PropriedadesMock propriedadesMock = new PropriedadesMock();
        PropriedadePorAcaoSemRegra propriedadePorAcaoSemRegra = new PropriedadePorAcaoSemRegra();

        propriedadesCriacao.setNext( propriedadesAtualizacao );
        propriedadesAtualizacao.setNext( propriedadesInativacao );
        propriedadesInativacao.setNext( propriedadesMock );
        propriedadesMock.setNext( propriedadePorAcaoSemRegra );

        propriedadesCriacao.set( abstractEntity, acaoEnum);
    }

    private interface PropriedadePorAcao{

        void set(AbstractEntity abstractEntity, AcaoEnum acaoEnum);

        void setNext(PropriedadePorAcao propriedadePorAcao);

    }

    private static class PropriedadesCriacao implements PropriedadePorAcao{

        private PropriedadePorAcao proximo;

        @Override
        public void set(AbstractEntity abstractEntity, AcaoEnum acaoEnum) {
            if(AcaoEnum.CRIACAO.equals( acaoEnum )){
//TODO RETURN                abstractEntity.usuarioCriacao = UsuarioMock.usuarioMock();
            }else{
                proximo.set( abstractEntity, acaoEnum );
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
        public void set(AbstractEntity abstractEntity, AcaoEnum acaoEnum) {
            if(AcaoEnum.ATUALIZACAO.equals( acaoEnum )){
//TODO RETURN                abstractEntity.usuarioModificacao = UsuarioMock.usuarioMock();
            }else{
                proximo.set( abstractEntity, acaoEnum );
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
        public void set(AbstractEntity abstractEntity, AcaoEnum acaoEnum) {
            if(AcaoEnum.INATIVACAO.equals( acaoEnum )){
                abstractEntity.inativar();
//TODO RETURN                abstractEntity.usuarioModificacao = UsuarioMock.usuarioModificacao();
            }else{
                proximo.set( abstractEntity, acaoEnum );
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
        public void set(AbstractEntity abstractEntity, AcaoEnum acaoEnum) {
            if(AcaoEnum.MOCK.equals( acaoEnum )){
//TODO RETURN                abstractEntity.id = UUID.randomUUID();
//                abstractEntity.id = 99999L;
            }else{
                proximo.set( abstractEntity, acaoEnum );
            }
        }

        @Override
        public void setNext(PropriedadePorAcao proximo) {
            this.proximo = proximo;
        }
    }

    private static class PropriedadePorAcaoSemRegra implements PropriedadePorAcao{

        @Override
        public void set(AbstractEntity abstractEntity, AcaoEnum acaoEnum) {

        }

        @Override
        public void setNext(PropriedadePorAcao propriedadePorAcao) {

        }
    }

}
