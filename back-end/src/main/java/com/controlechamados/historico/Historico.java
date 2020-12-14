package com.controlechamados.historico;

import com.controlechamados.models.enums.AcaoEnum;
import com.controlechamados.models.enums.TabelaEnum;
import com.controlechamados.usuario.Usuario;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

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

    public Historico() {
    }

    public Historico(Builder builder){
        this.tabela = builder.tabela;
        this.idRegistro = builder.idRegistro;
        this.tipoAcao = builder.tipoAcao;
        this.dataAcao = builder.dataAcao;
        this.usuarioAcao = builder.usuarioAcao;
        this.dados = builder.dados;
    }

    public static Builder builder(){return new Builder();}

    public final static class Builder{

        private TabelaEnum tabela;
        private Long idRegistro;
        private AcaoEnum tipoAcao;
        private LocalDateTime dataAcao;
        private Usuario usuarioAcao;
        private String dados;

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

        public Builder withDataAcao(LocalDateTime dataAcao) {
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
                '}';
    }
}
