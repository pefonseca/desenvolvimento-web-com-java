package br.edu.infnet.appcar.model.domain;

import br.edu.infnet.appcar.model.exceptions.QuilometragemVeiculoInvalidoException;
import br.edu.infnet.appcar.model.exceptions.ValorZeradoException;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "TVeiculo")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Veiculo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nome;
    private String cor;
    private Integer ano;
    private String marca;
    private String primeiroDono;
    private Double valor;
    private Double quilometragem;
    @ManyToOne
    @JoinColumn(name = "idUsuario")
    private Usuario usuario;
    @ManyToMany(mappedBy = "veiculos")
    private List<Pedido> pedidos;

    public Veiculo(String nome, String cor, Integer ano, String marca, String primeiroDono, Double valor, Double quilometragem) throws ValorZeradoException {
        if(valor == 0) {
            throw new ValorZeradoException("O valor do veículo está zerado!");
        }

        if(valor < 0) {
            throw new ValorZeradoException("O Valor do veículo está negativo!");
        }

        this.nome = nome;
        this.cor = cor;
        this.ano = ano;
        this.marca = marca;
        this.primeiroDono = primeiroDono;
        this.valor = valor;
        this.quilometragem = quilometragem;
    }

    public Veiculo() {

    }

    public abstract Double calcularValorVenda() throws QuilometragemVeiculoInvalidoException;

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append(nome);
        sb.append(" | ");
        sb.append(cor);
        sb.append(" | ");
        sb.append(ano);
        sb.append(" | ");
        sb.append(marca);
        sb.append(" | ");
        sb.append(primeiroDono);
        sb.append(" | ");
        sb.append(valor);
        sb.append(" | ");
        sb.append(quilometragem);

        return sb.toString();
    }
}
