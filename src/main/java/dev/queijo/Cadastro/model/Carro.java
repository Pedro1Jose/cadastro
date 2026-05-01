package dev.queijo.Cadastro.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity // Anotacao para indicar que esta classe representa uma entidade do banco de dados
@Table(name = "tb_carro") // Anotacao para definir o nome da tabela no banco de dados
@Data // Anotacao do Lombok para gerar automaticamente os metodos getters, setters, equals, hashCode e toString
@NoArgsConstructor // Anotacao do Lombok para gerar um construtor sem argumentos
@AllArgsConstructor // Anotacao do Lombok para gerar um construtor com todos os argumentos

public class Carro {
    
    @Id // Anotacao para indicar que este campo é a chave primaria da tabela
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Anotacao para indicar que o valor deste campo sera gerado automaticamente pelo banco de dados, usando a estrategia de auto-incremento
    private Long id;
    
    private String marca;
    
    private String modelo;
    
    private int ano;
    
    @ManyToOne
    private Usuario proprietario; // Relacao de muitos para um com UsuarioModel

    
}
