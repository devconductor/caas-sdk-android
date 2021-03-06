package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.FaturaFechadaResponse;
import br.com.conductor.pier.api.v2.model.TransacoesCorrentesResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto contendo os detalhes de uma fatura
 **/
@ApiModel(description = "Objeto contendo os detalhes de uma fatura")
public class DetalhesFaturaResponse  {
  
  @SerializedName("fatura")
  private FaturaFechadaResponse fatura = null;
  @SerializedName("transacoes")
  private List<TransacoesCorrentesResponse> transacoes = null;

  
  /**
   * Apresenta os detalhes da fatura
   **/
  @ApiModelProperty(value = "Apresenta os detalhes da fatura")
  public FaturaFechadaResponse getFatura() {
    return fatura;
  }
  public void setFatura(FaturaFechadaResponse fatura) {
    this.fatura = fatura;
  }

  
  /**
   * Apresenta as transa\u00E7\u00F5es relacionadas a fatura
   **/
  @ApiModelProperty(value = "Apresenta as transa\u00E7\u00F5es relacionadas a fatura")
  public List<TransacoesCorrentesResponse> getTransacoes() {
    return transacoes;
  }
  public void setTransacoes(List<TransacoesCorrentesResponse> transacoes) {
    this.transacoes = transacoes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DetalhesFaturaResponse {\n");
    
    sb.append("  fatura: ").append(fatura).append("\n");
    sb.append("  transacoes: ").append(transacoes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
