package br.com.ifpe.oxefood.api.entregador;

import java.time.LocalDate;

import com.fasterxml.jackson.annotation.JsonFormat;

import br.com.ifpe.oxefood.modelo.entregador.Entregador;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EntregadorRequest {

   private String nome;

   @JsonFormat(pattern = "dd/MM/yyyy")
   private LocalDate dataNascimento;

   private String cpf;

   private String rg;

   private String foneCelular;

   private String foneFixo;

   private Integer entregasRealizadas;

   private Double valorFrete;

   private String enderecoRua;

   private String enderecoNumero;

   private String enderecoBairro;

   private String enderecoCidade;

   private String enderecoCep;

   private String enderecoUf;

   private String enderecoComplemento;

   private boolean ativo;

   public Entregador build() {

      return Entregador.builder()
            .nome(nome)
            .cpf(cpf)
            .rg(rg)
            .dataNascimento(dataNascimento)
            .foneCelular(foneCelular)
            .foneFixo(foneFixo)
            .entregasRealizadas(entregasRealizadas)
            .valorFrete(valorFrete)
            .enderecoRua(enderecoRua)
            .enderecoNumero(enderecoNumero)
            .enderecoBairro(enderecoBairro)
            .enderecoCidade(enderecoCidade)
            .enderecoCep(enderecoCep)
            .enderecoUf(enderecoUf)
            .enderecoComplemento(enderecoComplemento)
            .ativo(ativo)
            .build();
   }
}
