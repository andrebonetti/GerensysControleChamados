package com.controlechamados.historico;

import com.controlechamados.historico.enums.AcaoEnum;
import com.controlechamados.historico.enums.TabelaEnum;
import com.controlechamados.usuario.Usuario;

import java.time.LocalDate;
import java.util.UUID;

public class Historico {

    private UUID id;
    private TabelaEnum tabela;
    private UUID idRegistro;
    private AcaoEnum tipoAcao;
    private LocalDate dataAcao;
    private Usuario usuarioAcao;
    private String dados;

    public Historico() {
    }

    public Historico(Builder builder){
        this.id = builder.id;
        this.tabela = builder.tabela;
        this.idRegistro = builder.idRegistro;
        this.tipoAcao = builder.tipoAcao;
        this.dataAcao = builder.dataAcao;
        this.usuarioAcao = builder.usuarioAcao;
        this.dados = builder.dados;
    }

    public static Builder builder(){return new Builder();}

    public final static class Builder{

        private UUID id;
        private TabelaEnum tabela;
        private UUID idRegistro;
        private AcaoEnum tipoAcao;
        private LocalDate dataAcao;
        private Usuario usuarioAcao;
        private String dados;

        public Builder withId(UUID id) {
            this.id = id;
            return this;
        }

        public Builder withTabela(TabelaEnum tabela) {
            this.tabela = tabela;
            return this;
        }

        public Builder withIdRegistro(UUID idRegistro) {
            this.idRegistro = idRegistro;
            return this;
        }

        public Builder withTipoAcao(AcaoEnum tipoAcao) {
            this.tipoAcao = tipoAcao;
            return this;
        }

        public Builder withDataAcao(LocalDate dataAcao) {
            this.dataAcao = dataAcao;
            return this;
        }

        public Builder withUsuarioAcao(Usuario usuarioAcao) {
            this.usuarioAcao = usuarioAcao;
            return this;
        }

        public Builder withDados(String dados) {
            this.dados = dados;
            return this;
        }

        public Historico build(){return new Historico(this);}
    }

    public UUID getId() {
        return id;
    }

    public TabelaEnum getTabela() {
        return tabela;
    }

    public UUID getIdRegistro() {
        return idRegistro;
    }

    public AcaoEnum getTipoAcao() {
        return tipoAcao;
    }

    public LocalDate getDataAcao() {
        return dataAcao;
    }

    public Usuario getUsuarioAcao() {
        return usuarioAcao;
    }

    public String getDados() {
        return dados;
    }

}
