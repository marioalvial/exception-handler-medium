package br.com.ms.dtoexample.dto;

import br.com.ms.dtoexample.model.Usuario;
import lombok.Getter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Getter
public class UsuarioDTO {

    @NotBlank(message = "{name.not.blank}")
    private String nome;
    @NotBlank(message = "{email.not.blank}")
    @Email(message = "{email.not.valid}")
    private String email;
    @NotBlank(message = "{senha.not.blank}")
    private String senha;

    public Usuario transformaParaObjeto(){
        return new Usuario(nome, email, senha);
    }
}
