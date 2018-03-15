package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Resposta da requisi\u00E7\u00E3o de listagem de cart\u00E3o
 **/
@ApiModel(description = "Resposta da requisi\u00E7\u00E3o de listagem de cart\u00E3o")
public class CartaoPayResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("numeroCartao")
  private String numeroCartao = null;
  @SerializedName("dataValidadeCartao")
  private String dataValidadeCartao = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("idEntidade")
  private Long idEntidade = null;
  @SerializedName("nomeEntidade")
  private String nomeEntidade = null;
  public enum StatusEnum {
     ATIVO,  INATIVO,  BLOQUEADO, 
  };
  @SerializedName("status")
  private StatusEnum status = null;
  @SerializedName("dataValidadeChaveCriptograma")
  private String dataValidadeChaveCriptograma = null;

  
  /**
   * Id do cart\u00E3o
   **/
  @ApiModelProperty(value = "Id do cart\u00E3o")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * N\u00FAmero do cart\u00E3o real criptografado
   **/
  @ApiModelProperty(value = "N\u00FAmero do cart\u00E3o real criptografado")
  public String getNumeroCartao() {
    return numeroCartao;
  }
  public void setNumeroCartao(String numeroCartao) {
    this.numeroCartao = numeroCartao;
  }

  
  /**
   * Data de validade do cart\u00E3o
   **/
  @ApiModelProperty(value = "Data de validade do cart\u00E3o")
  public String getDataValidadeCartao() {
    return dataValidadeCartao;
  }
  public void setDataValidadeCartao(String dataValidadeCartao) {
    this.dataValidadeCartao = dataValidadeCartao;
  }

  
  /**
   * Nome impresso no cart\u00E3o criptografado
   **/
  @ApiModelProperty(value = "Nome impresso no cart\u00E3o criptografado")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * Identificador do emissor do cart\u00E3o
   **/
  @ApiModelProperty(value = "Identificador do emissor do cart\u00E3o")
  public Long getIdEntidade() {
    return idEntidade;
  }
  public void setIdEntidade(Long idEntidade) {
    this.idEntidade = idEntidade;
  }

  
  /**
   * Nome do emissor do cart\u00E3o
   **/
  @ApiModelProperty(value = "Nome do emissor do cart\u00E3o")
  public String getNomeEntidade() {
    return nomeEntidade;
  }
  public void setNomeEntidade(String nomeEntidade) {
    this.nomeEntidade = nomeEntidade;
  }

  
  /**
   * Status do cart\u00E3o
   **/
  @ApiModelProperty(value = "Status do cart\u00E3o")
  public StatusEnum getStatus() {
    return status;
  }
  public void setStatus(StatusEnum status) {
    this.status = status;
  }

  
  /**
   * Data de validade da chave do criptograma
   **/
  @ApiModelProperty(value = "Data de validade da chave do criptograma")
  public String getDataValidadeChaveCriptograma() {
    return dataValidadeChaveCriptograma;
  }
  public void setDataValidadeChaveCriptograma(String dataValidadeChaveCriptograma) {
    this.dataValidadeChaveCriptograma = dataValidadeChaveCriptograma;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class CartaoPayResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  numeroCartao: ").append(numeroCartao).append("\n");
    sb.append("  dataValidadeCartao: ").append(dataValidadeCartao).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  idEntidade: ").append(idEntidade).append("\n");
    sb.append("  nomeEntidade: ").append(nomeEntidade).append("\n");
    sb.append("  status: ").append(status).append("\n");
    sb.append("  dataValidadeChaveCriptograma: ").append(dataValidadeChaveCriptograma).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
