package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


@ApiModel(description = "")
public class PessoaJuridicaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("contato")
  private String contato = null;
  @SerializedName("razaoSocial")
  private String razaoSocial = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("inscricaoEstadual")
  private String inscricaoEstadual = null;
  @SerializedName("banco")
  private Integer banco = null;
  @SerializedName("agencia")
  private Integer agencia = null;
  @SerializedName("digitoAgencia")
  private String digitoAgencia = null;
  @SerializedName("contaCorrente")
  private String contaCorrente = null;
  @SerializedName("digitoContaCorrente")
  private String digitoContaCorrente = null;

  
  /**
   * Identificador da pessoa jur\u00EDdica
   **/
  @ApiModelProperty(value = "Identificador da pessoa jur\u00EDdica")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Contato da pessoa jur\u00EDdica
   **/
  @ApiModelProperty(value = "Contato da pessoa jur\u00EDdica")
  public String getContato() {
    return contato;
  }
  public void setContato(String contato) {
    this.contato = contato;
  }

  
  /**
   * Raz\u00E3o social da pessoa jur\u00EDdica
   **/
  @ApiModelProperty(value = "Raz\u00E3o social da pessoa jur\u00EDdica")
  public String getRazaoSocial() {
    return razaoSocial;
  }
  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  
  /**
   * CGC(CNPJ) da pessoa jur\u00EDdica
   **/
  @ApiModelProperty(value = "CGC(CNPJ) da pessoa jur\u00EDdica")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Inscri\u00E7\u00E3o estadual da pessoa jur\u00EDdica
   **/
  @ApiModelProperty(value = "Inscri\u00E7\u00E3o estadual da pessoa jur\u00EDdica")
  public String getInscricaoEstadual() {
    return inscricaoEstadual;
  }
  public void setInscricaoEstadual(String inscricaoEstadual) {
    this.inscricaoEstadual = inscricaoEstadual;
  }

  
  /**
   * Banco da pessoa jur\u00EDdica
   **/
  @ApiModelProperty(value = "Banco da pessoa jur\u00EDdica")
  public Integer getBanco() {
    return banco;
  }
  public void setBanco(Integer banco) {
    this.banco = banco;
  }

  
  /**
   * Ag\u00EAncia da pessoa jur\u00EDdica
   **/
  @ApiModelProperty(value = "Ag\u00EAncia da pessoa jur\u00EDdica")
  public Integer getAgencia() {
    return agencia;
  }
  public void setAgencia(Integer agencia) {
    this.agencia = agencia;
  }

  
  /**
   * D\u00EDgito da agencia
   **/
  @ApiModelProperty(value = "D\u00EDgito da agencia")
  public String getDigitoAgencia() {
    return digitoAgencia;
  }
  public void setDigitoAgencia(String digitoAgencia) {
    this.digitoAgencia = digitoAgencia;
  }

  
  /**
   * Conta corrente da pessoa jur\u00EDdica
   **/
  @ApiModelProperty(value = "Conta corrente da pessoa jur\u00EDdica")
  public String getContaCorrente() {
    return contaCorrente;
  }
  public void setContaCorrente(String contaCorrente) {
    this.contaCorrente = contaCorrente;
  }

  
  /**
   * D\u00EDgito da conta corrente
   **/
  @ApiModelProperty(value = "D\u00EDgito da conta corrente")
  public String getDigitoContaCorrente() {
    return digitoContaCorrente;
  }
  public void setDigitoContaCorrente(String digitoContaCorrente) {
    this.digitoContaCorrente = digitoContaCorrente;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PessoaJuridicaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  contato: ").append(contato).append("\n");
    sb.append("  razaoSocial: ").append(razaoSocial).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  inscricaoEstadual: ").append(inscricaoEstadual).append("\n");
    sb.append("  banco: ").append(banco).append("\n");
    sb.append("  agencia: ").append(agencia).append("\n");
    sb.append("  digitoAgencia: ").append(digitoAgencia).append("\n");
    sb.append("  contaCorrente: ").append(contaCorrente).append("\n");
    sb.append("  digitoContaCorrente: ").append(digitoContaCorrente).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
