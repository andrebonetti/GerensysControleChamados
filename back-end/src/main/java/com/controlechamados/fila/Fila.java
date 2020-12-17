package com.controlechamados.fila;

import com.controlechamados.models.AbstractEntity;

import javax.persistence.Entity;

@Entity
public class Fila extends AbstractEntity {

    private String nome;
    private String colorStyle;
    private Integer ordem;

    public Fila() {
        //to serialize
    }

    private Fila(BuilderCreate builder) {
        this.nome = builder.nome;
        this.ordem = builder.ordem;
        this.colorStyle = builder.colorStyle;
    }

    private void update(BuilderUpdate builderUpdate){
        this.nome = builderUpdate.nome;
        this.ordem = builderUpdate.ordem;
        this.colorStyle = builderUpdate.colorStyle;
    }

    public static BuilderCreate builderCreate() {
        return new BuilderCreate();
    }

    public BuilderUpdate builderUpdate(){
        return new BuilderUpdate(this);
    }

    public static final class BuilderUpdate {

        private Fila fila;

        private String nome;
        private String colorStyle;
        private Integer ordem;

        public BuilderUpdate(Fila fila) {
            this.fila = fila;
        }

        public BuilderUpdate withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public BuilderUpdate withColorStyle(String colorStyle) {
            this.colorStyle = colorStyle;
            return this;
        }

        public BuilderUpdate withOrdem(Integer ordem) {
            this.ordem = ordem;
            return this;
        }

        public Fila build(){
            fila.update( this );
            return fila;
        }
    }

    public static final class BuilderCreate {

        private String nome;
        private String colorStyle;
        private Integer ordem;

        public BuilderCreate withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public BuilderCreate withColorStyle(String colorStyle) {
            this.colorStyle = colorStyle;
            return this;
        }

        public BuilderCreate withOrdem(Integer ordem) {
            this.ordem = ordem;
            return this;
        }

        public Fila build(){
            return new Fila(this);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getColorStyle() {
        return colorStyle;
    }

    public Integer getOrdem() {
        return ordem;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", colorStyle='" + colorStyle + '\'' +
                ", ordem=" + ordem +
                ", id=" + id +
                ", ativo=" + ativo +
                ", usuarioCriacao=" + usuarioCriacao +
                ", usuarioModificacao=" + usuarioModificacao +
                ", dataCriacao=" + dataCriacao +
                ", dataModificacao=" + dataModificacao +
                ", version=" + version +
                '}';
    }
}
