package com.controlechamados.historico;

import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.models.enums.TabelaEnum;
import com.controlechamados.usuario.Usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Historico {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private Long id;

    private TabelaEnum tabela;
    private Long idRegistro;
    private AcaoEnum tipoAcao;
    private LocalDateTime dataAcao = LocalDateTime.now();
    private Usuario usuarioAcao;
    private String dados;
    private Long version;

    public Historico() {
    }

    public Historico(Builder builder){
        this.tabela = builder.tabela;
        this.idRegistro = builder.idRegistro;
        this.tipoAcao = builder.tipoAcao;
        this.usuarioAcao = builder.usuarioAcao;
        this.dados = builder.dados;
        this.version = builder.version;
    }

    public static Builder builder(){return new Builder();}

    public final static class Builder{

        private TabelaEnum tabela;
        private Long idRegistro;
        private AcaoEnum tipoAcao;
        private Usuario usuarioAcao;
        private String dados;
        private Long version;

        public Builder withTabela(TabelaEnum tabela) {
            this.tabela = tabela;
            return this;
        }

        public Builder withIdRegistro(Long idRegistro) {
            this.idRegistro = idRegistro;
            return this;
        }

        public Builder withTipoAcao(AcaoEnum tipoAcao) {
            this.tipoAcao = tipoAcao;
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

        public Builder withVersion(Long version) {
            this.version = version;
            return this;
        }

        public Historico build(){return new Historico(this);}
    }

    public Long getId() {
        return id;
    }

    public TabelaEnum getTabela() {
        return tabela;
    }

    public Long getIdRegistro() {
        return idRegistro;
    }

    public AcaoEnum getTipoAcao() {
        return tipoAcao;
    }

    public LocalDateTime getDataAcao() {
        return dataAcao;
    }

    public Usuario getUsuarioAcao() {
        return usuarioAcao;
    }

    public String getDados() {
        return dados;
    }

    public Long getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Historico{" +
                "id=" + id +
                ", tabela=" + tabela +
                ", idRegistro=" + idRegistro +
                ", tipoAcao=" + tipoAcao +
                ", dataAcao=" + dataAcao +
                ", usuarioAcao=" + usuarioAcao +
                ", dados='" + dados + '\'' +
                ", version=" + version +
                '}';
    }
}
