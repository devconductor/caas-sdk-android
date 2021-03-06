package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto de resposta para ades\u00E3o servi\u00E7os
 **/
@ApiModel(description = "Objeto de resposta para ades\u00E3o servi\u00E7os")
public class AdesaoServicoResponse  {
  
  @SerializedName("canal")
  private String canal = null;
  @SerializedName("cobrancaLimiteCredito")
  private Boolean cobrancaLimiteCredito = null;
  @SerializedName("estabelecimento")
  private Integer estabelecimento = null;
  @SerializedName("flagAdesaoCompraProgramada")
  private Boolean flagAdesaoCompraProgramada = null;
  @SerializedName("flagAdesaoInvestimento")
  private Boolean flagAdesaoInvestimento = null;
  @SerializedName("flagCobrancaLimiteCredito")
  private Boolean flagCobrancaLimiteCredito = null;
  @SerializedName("flagOfertasPromocoes")
  private Boolean flagOfertasPromocoes = null;
  @SerializedName("flagPromocoes")
  private Boolean flagPromocoes = null;
  @SerializedName("flagTipoEnvioFatura")
  private Boolean flagTipoEnvioFatura = null;
  @SerializedName("flagTipoSms")
  private Boolean flagTipoSms = null;
  @SerializedName("id")
  private Long id = null;
  @SerializedName("responsavel")
  private String responsavel = null;
  @SerializedName("tipoEnvioFatura")
  private Integer tipoEnvioFatura = null;
  public enum TipoSmsEnum {
     CONTROLE,  NOTIFICACAO,  ALERTA, 
  };
  @SerializedName("tipoSms")
  private TipoSmsEnum tipoSms = null;

  
  /**
   * Canal de entrada
   **/
  @ApiModelProperty(value = "Canal de entrada")
  public String getCanal() {
    return canal;
  }
  public void setCanal(String canal) {
    this.canal = canal;
  }

  
  /**
   * Cobranca do Limite de cr\u00E9dito
   **/
  @ApiModelProperty(value = "Cobranca do Limite de cr\u00E9dito")
  public Boolean getCobrancaLimiteCredito() {
    return cobrancaLimiteCredito;
  }
  public void setCobrancaLimiteCredito(Boolean cobrancaLimiteCredito) {
    this.cobrancaLimiteCredito = cobrancaLimiteCredito;
  }

  
  /**
   * Estabelecimento
   **/
  @ApiModelProperty(value = "Estabelecimento")
  public Integer getEstabelecimento() {
    return estabelecimento;
  }
  public void setEstabelecimento(Integer estabelecimento) {
    this.estabelecimento = estabelecimento;
  }

  
  /**
   * Permite ades\u00E3o da compra programada
   **/
  @ApiModelProperty(value = "Permite ades\u00E3o da compra programada")
  public Boolean getFlagAdesaoCompraProgramada() {
    return flagAdesaoCompraProgramada;
  }
  public void setFlagAdesaoCompraProgramada(Boolean flagAdesaoCompraProgramada) {
    this.flagAdesaoCompraProgramada = flagAdesaoCompraProgramada;
  }

  
  /**
   * Permite adesao do investimentos
   **/
  @ApiModelProperty(value = "Permite adesao do investimentos")
  public Boolean getFlagAdesaoInvestimento() {
    return flagAdesaoInvestimento;
  }
  public void setFlagAdesaoInvestimento(Boolean flagAdesaoInvestimento) {
    this.flagAdesaoInvestimento = flagAdesaoInvestimento;
  }

  
  /**
   * Oferecer cobran\u00E7a no limite de cr\u00E9dito
   **/
  @ApiModelProperty(value = "Oferecer cobran\u00E7a no limite de cr\u00E9dito")
  public Boolean getFlagCobrancaLimiteCredito() {
    return flagCobrancaLimiteCredito;
  }
  public void setFlagCobrancaLimiteCredito(Boolean flagCobrancaLimiteCredito) {
    this.flagCobrancaLimiteCredito = flagCobrancaLimiteCredito;
  }

  
  /**
   * Oferecer promo\u00E7\u00F5es disponiveis
   **/
  @ApiModelProperty(value = "Oferecer promo\u00E7\u00F5es disponiveis")
  public Boolean getFlagOfertasPromocoes() {
    return flagOfertasPromocoes;
  }
  public void setFlagOfertasPromocoes(Boolean flagOfertasPromocoes) {
    this.flagOfertasPromocoes = flagOfertasPromocoes;
  }

  
  /**
   * Ofertar promo\u00E7\u00F5es
   **/
  @ApiModelProperty(value = "Ofertar promo\u00E7\u00F5es")
  public Boolean getFlagPromocoes() {
    return flagPromocoes;
  }
  public void setFlagPromocoes(Boolean flagPromocoes) {
    this.flagPromocoes = flagPromocoes;
  }

  
  /**
   * Oferecer tipo de envio da fatura
   **/
  @ApiModelProperty(value = "Oferecer tipo de envio da fatura")
  public Boolean getFlagTipoEnvioFatura() {
    return flagTipoEnvioFatura;
  }
  public void setFlagTipoEnvioFatura(Boolean flagTipoEnvioFatura) {
    this.flagTipoEnvioFatura = flagTipoEnvioFatura;
  }

  
  /**
   * Oferecer tipo do sms
   **/
  @ApiModelProperty(value = "Oferecer tipo do sms")
  public Boolean getFlagTipoSms() {
    return flagTipoSms;
  }
  public void setFlagTipoSms(Boolean flagTipoSms) {
    this.flagTipoSms = flagTipoSms;
  }

  
  /**
   * Identificador da conta
   **/
  @ApiModelProperty(value = "Identificador da conta")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Respons\u00E1vel
   **/
  @ApiModelProperty(value = "Respons\u00E1vel")
  public String getResponsavel() {
    return responsavel;
  }
  public void setResponsavel(String responsavel) {
    this.responsavel = responsavel;
  }

  
  /**
   * Tipo do envio da fatura
   **/
  @ApiModelProperty(value = "Tipo do envio da fatura")
  public Integer getTipoEnvioFatura() {
    return tipoEnvioFatura;
  }
  public void setTipoEnvioFatura(Integer tipoEnvioFatura) {
    this.tipoEnvioFatura = tipoEnvioFatura;
  }

  
  /**
   * Tipo do sms
   **/
  @ApiModelProperty(value = "Tipo do sms")
  public TipoSmsEnum getTipoSms() {
    return tipoSms;
  }
  public void setTipoSms(TipoSmsEnum tipoSms) {
    this.tipoSms = tipoSms;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdesaoServicoResponse {\n");
    
    sb.append("  canal: ").append(canal).append("\n");
    sb.append("  cobrancaLimiteCredito: ").append(cobrancaLimiteCredito).append("\n");
    sb.append("  estabelecimento: ").append(estabelecimento).append("\n");
    sb.append("  flagAdesaoCompraProgramada: ").append(flagAdesaoCompraProgramada).append("\n");
    sb.append("  flagAdesaoInvestimento: ").append(flagAdesaoInvestimento).append("\n");
    sb.append("  flagCobrancaLimiteCredito: ").append(flagCobrancaLimiteCredito).append("\n");
    sb.append("  flagOfertasPromocoes: ").append(flagOfertasPromocoes).append("\n");
    sb.append("  flagPromocoes: ").append(flagPromocoes).append("\n");
    sb.append("  flagTipoEnvioFatura: ").append(flagTipoEnvioFatura).append("\n");
    sb.append("  flagTipoSms: ").append(flagTipoSms).append("\n");
    sb.append("  id: ").append(id).append("\n");
    sb.append("  responsavel: ").append(responsavel).append("\n");
    sb.append("  tipoEnvioFatura: ").append(tipoEnvioFatura).append("\n");
    sb.append("  tipoSms: ").append(tipoSms).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
