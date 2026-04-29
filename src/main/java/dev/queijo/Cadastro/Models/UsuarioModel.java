package dev.queijo.Cadastro.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity // Anotacao para indicar que esta classe representa uma entidade do banco de dados
@Table(name = "tb_usuario") // Anotacao para definir o nome da tabela no banco de dados
public class UsuarioModel {
    
    @Id // Anotacao para indicar que este campo é a chave primaria da tabela
    @GeneratedValue(strategy =GenerationType.IDENTITY) // Anotacao para indicar que o valor deste campo sera gerado automaticamente pelo banco de dados, usando a estrategia de auto-incremento
    private Long id;
    private String nome;
    private String email;
    private int idade;

    /*  O Lombok pode ser usado para substituir os contrutores, getters e setters 
        com anotacoes como @NoArgsConstructor, @AllArgsConstructor, @Getter e @Setter*/
    public UsuarioModel() {
    }

    public UsuarioModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }
}
