package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa a requisi\u00E7\u00E3o do recurso de cadastro de dados bancarios para uma conta
 **/
@ApiModel(description = "Representa a requisi\u00E7\u00E3o do recurso de cadastro de dados bancarios para uma conta")
public class DadosBancariosContaPersist  {
  
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("numeroAgencia")
  private Long numeroAgencia = null;
  @SerializedName("numeroContaCorrente")
  private String numeroContaCorrente = null;
  @SerializedName("codigoBanco")
  private Long codigoBanco = null;
  @SerializedName("idTipoContaBancaria")
  private Long idTipoContaBancaria = null;
  @SerializedName("dvContaCorrente")
  private String dvContaCorrente = null;
  @SerializedName("dvAgencia")
  private Integer dvAgencia = null;

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o da conta (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o da conta (id)")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * N\u00FAmero da ag\u00EAncia
   **/
  @ApiModelProperty(value = "N\u00FAmero da ag\u00EAncia")
  public Long getNumeroAgencia() {
    return numeroAgencia;
  }
  public void setNumeroAgencia(Long numeroAgencia) {
    this.numeroAgencia = numeroAgencia;
  }

  
  /**
   * N\u00FAmero da conta corrente
   **/
  @ApiModelProperty(value = "N\u00FAmero da conta corrente")
  public String getNumeroContaCorrente() {
    return numeroContaCorrente;
  }
  public void setNumeroContaCorrente(String numeroContaCorrente) {
    this.numeroContaCorrente = numeroContaCorrente;
  }

  
  /**
   * C\u00F3digo do banco
   **/
  @ApiModelProperty(value = "C\u00F3digo do banco")
  public Long getCodigoBanco() {
    return codigoBanco;
  }
  public void setCodigoBanco(Long codigoBanco) {
    this.codigoBanco = codigoBanco;
  }

  
  /**
   * C\u00F3digo de identifica\u00E7\u00E3o do tipo da conta banc\u00E1ria (id)
   **/
  @ApiModelProperty(value = "C\u00F3digo de identifica\u00E7\u00E3o do tipo da conta banc\u00E1ria (id)")
  public Long getIdTipoContaBancaria() {
    return idTipoContaBancaria;
  }
  public void setIdTipoContaBancaria(Long idTipoContaBancaria) {
    this.idTipoContaBancaria = idTipoContaBancaria;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public String getDvContaCorrente() {
    return dvContaCorrente;
  }
  public void setDvContaCorrente(String dvContaCorrente) {
    this.dvContaCorrente = dvContaCorrente;
  }

  
  /**
   **/
  @ApiModelProperty(value = "")
  public Integer getDvAgencia() {
    return dvAgencia;
  }
  public void setDvAgencia(Integer dvAgencia) {
    this.dvAgencia = dvAgencia;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DadosBancariosContaPersist {\n");
    
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  numeroAgencia: ").append(numeroAgencia).append("\n");
    sb.append("  numeroContaCorrente: ").append(numeroContaCorrente).append("\n");
    sb.append("  codigoBanco: ").append(codigoBanco).append("\n");
    sb.append("  idTipoContaBancaria: ").append(idTipoContaBancaria).append("\n");
    sb.append("  dvContaCorrente: ").append(dvContaCorrente).append("\n");
    sb.append("  dvAgencia: ").append(dvAgencia).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
