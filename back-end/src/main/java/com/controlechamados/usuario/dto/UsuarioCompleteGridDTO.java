package com.controlechamados.usuario.dto;

import com.controlechamados.models.BuilderEntityGridDTO;
import com.controlechamados.models.AbstractEntity;
import com.controlechamados.models.dto.EntityGridDTO;
import com.controlechamados.usuario.perfil.dto.PerfilGridDTO;

public class UsuarioCompleteGridDTO extends EntityGridDTO {

    private String nome;
    private String email;
    private String imagem;
    private PerfilGridDTO perfilGridDTO;

    public UsuarioCompleteGridDTO() {
        // to serialize
    }

    public UsuarioCompleteGridDTO(Builder builder) {
        this.nome = builder.nome;
        this.email = builder.email;
        this.imagem = builder.imagem;
        this.perfilGridDTO = builder.perfilGridDTO;

        this.construct(builder);
    }

    public static Builder builder() {
        return new Builder();
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getImagem() {
        return imagem;
    }

    public PerfilGridDTO getPerfilGridDTO() {
        return perfilGridDTO;
    }

    public static final class Builder extends BuilderEntityGridDTO {

        private String nome;
        private String email;
        private String imagem;
        private PerfilGridDTO perfilGridDTO;
        
        public Builder withNome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder withImagem(String imagem) {
            this.imagem = imagem;
            return this;
        }

        public Builder withPerfilGridDTO(PerfilGridDTO perfilGridDTO) {
            this.perfilGridDTO = perfilGridDTO;
            return this;
        }

        public Builder withPropertiesGridDto(AbstractEntity abstractEntity) {
            super.setCompletePropertiesGridDto( abstractEntity );
            return this;
        }

        public Builder withId(String id){
            this.withId( id );
            return this;
        }


        public UsuarioCompleteGridDTO build() {
            return new UsuarioCompleteGridDTO( this );
        }

    }

    @Override
    public String toString() {
        return "UsuarioGridDTO{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", imagem='" + imagem + '\'' +
                ", perfilGridDTO=" + perfilGridDTO +
                '}';
    }
}
