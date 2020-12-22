package com.controlechamados.historico.dto;

import com.controlechamados.usuario.dto.UsuarioSimpleGridDTO;

public class HistoricoGridDTO {

    private Long id;
    private String tabela;
    private Long idRegistro;
    private String tipoAcao;
    private String dataAcao;
    private UsuarioSimpleGridDTO usuarioAcaoGRID;
    private String dados;
    private Long version;

    public HistoricoGridDTO() {
    }

    public HistoricoGridDTO(Builder builder){
        this.id = builder.id;
        this.tabela = builder.tabela;
        this.idRegistro = builder.idRegistro;
        this.tipoAcao = builder.tipoAcao;
        this.usuarioAcaoGRID = builder.usuarioAcaoGRID;
        this.dados = builder.dados;
        this.version = builder.version;
    }

    public static Builder builder(){return new Builder();}

    public final static class Builder{

        private Long id;
        private String tabela;
        private Long idRegistro;
        private String tipoAcao;
        private String dataAcao;
        private UsuarioSimpleGridDTO usuarioAcaoGRID;
        private String dados;
        private Long version;

        public Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Builder withTabela(String tabela) {
            this.tabela = tabela;
            return this;
        }

        public Builder withIdRegistro(Long idRegistro) {
            this.idRegistro = idRegistro;
            return this;
        }

        public Builder withTipoAcao(String tipoAcao) {
            this.tipoAcao = tipoAcao;
            return this;
        }

        public Builder withDataAcao(String dataAcao) {
            this.dataAcao = dataAcao;
            return this;
        }

        public Builder withUsuarioAcaoGRID(UsuarioSimpleGridDTO usuarioAcaoGRID) {
            this.usuarioAcaoGRID = usuarioAcaoGRID;
            return this;
        }

        public Builder withDados(String dados) {
            this.dados = dados;
            return this;
        }

        public Builder withVersion(Long version) {
            this.version = version;
            return this;
        }

        public HistoricoGridDTO build(){return new HistoricoGridDTO(this);}
    }

    public Long getId() {
        return id;
    }

    public String getTabela() {
        return tabela;
    }

    public Long getIdRegistro() {
        return idRegistro;
    }

    public String getTipoAcao() {
        return tipoAcao;
    }

    public String getDataAcao() {
        return dataAcao;
    }

    public UsuarioSimpleGridDTO getUsuarioAcaoGRID() {
        return usuarioAcaoGRID;
    }

    public String getDados() {
        return dados;
    }

    public Long getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "HistoricoGridDTO{" +
                "id=" + id +
                ", tabela='" + tabela + '\'' +
                ", idRegistro=" + idRegistro +
                ", tipoAcao='" + tipoAcao + '\'' +
                ", dataAcao='" + dataAcao + '\'' +
                ", usuarioAcaoGRID=" + usuarioAcaoGRID +
                ", dados='" + dados + '\'' +
                ", version=" + version +
                '}';
    }
}
