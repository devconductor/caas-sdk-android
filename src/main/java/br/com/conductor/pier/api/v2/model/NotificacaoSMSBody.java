package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Notifica\u00E7\u00E3o
 **/
@ApiModel(description = "Objeto Notifica\u00E7\u00E3o")
public class NotificacaoSMSBody  {
  
  @SerializedName("nsu")
  private Long nsu = null;
  @SerializedName("idPessoa")
  private Long idPessoa = null;
  @SerializedName("idConta")
  private Long idConta = null;
  @SerializedName("celular")
  private String celular = null;
  @SerializedName("conteudo")
  private String conteudo = null;
  @SerializedName("dataAgendamento")
  private String dataAgendamento = null;
  public enum TipoEventoEnum {
     RISCO_FRAUDE,  CODIGO_SEGURANCA,  OUTROS,  OTP_3D_SECURE,  PAGAMENTO,  TRANSACAO_COMPRA_AUTORIZADO,  TRANSACAO_COMPRA_NAO_AUTORIZADO,  TRANSACAO_SAQUE_AUTORIZADO,  TRANSACAO_SAQUE_NAO_AUTORIZADO,  TRANSACAO_PAGAMENTO_AUTORIZADO,  TRANSACAO_PAGAMENTO_NAO_AUTORIZADO,  TRANSACAO_ADVICE,  TRANSACAO_ADVICE_NAO_AUTORIZADO,  TRANSACAO_ERRO,  TRANSACAO_ERRO_NAO_AUTORIZADO,  TRANSACAO_SIMULACAO,  TRANSACAO_SIMULACAO_NAO_AUTORIZADO,  TRANSACAO_SENHA_CHIP,  TRANSACAO_SENHA_CHIP_NAO_AUTORIZADO,  TRANSACAO_CONSULTA_SALDO,  TRANSACAO_CONSULTA_SALDO_NAO_AUTORIZADO,  TRANSACAO_CONSULTA_STATUS_CONTA,  TRANSACAO_CONSULTA_STATUS_CONTA_NAO_AUTORIZADO,  TRANSACAO_DESFAZIMENTO,  TRANSACAO_DESFAZIMENTO_NAO_AUTORIZADO,  TRANSACAO_CANCELAMENTO,  TRANSACAO_CANCELAMENTO_NAO_AUTORIZADO,  TRANSACAO_RESPOSTA_SONDA,  TRANSACAO_RESPOSTA_SONDA_NAO_AUTORIZADO,  TRANSACAO_TOKEN,  TRANSACAO_TOKEN_NAO_AUTORIZADO, 
  };
  @SerializedName("tipoEvento")
  private TipoEventoEnum tipoEvento = null;

  
  /**
   * N\u00FAmero sequencial \u00FAnico
   **/
  @ApiModelProperty(value = "N\u00FAmero sequencial \u00FAnico")
  public Long getNsu() {
    return nsu;
  }
  public void setNsu(Long nsu) {
    this.nsu = nsu;
  }

  
  /**
   * C\u00F3digo identificado da pessoa
   **/
  @ApiModelProperty(value = "C\u00F3digo identificado da pessoa")
  public Long getIdPessoa() {
    return idPessoa;
  }
  public void setIdPessoa(Long idPessoa) {
    this.idPessoa = idPessoa;
  }

  
  /**
   * C\u00F3digo identificador da conta
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da conta")
  public Long getIdConta() {
    return idConta;
  }
  public void setIdConta(Long idConta) {
    this.idConta = idConta;
  }

  
  /**
   * Apresenta o celular a ser eviado o SMS no formato 5588999999999 ou 5588999999999
   **/
  @ApiModelProperty(required = true, value = "Apresenta o celular a ser eviado o SMS no formato 5588999999999 ou 5588999999999")
  public String getCelular() {
    return celular;
  }
  public void setCelular(String celular) {
    this.celular = celular;
  }

  
  /**
   * Apresenta o texto do SMS a ser enviado
   **/
  @ApiModelProperty(required = true, value = "Apresenta o texto do SMS a ser enviado")
  public String getConteudo() {
    return conteudo;
  }
  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  
  /**
   * Apresenta a data e hora em que ser\u00E1 enviado a notifica\u00E7\u00E3o
   **/
  @ApiModelProperty(value = "Apresenta a data e hora em que ser\u00E1 enviado a notifica\u00E7\u00E3o")
  public String getDataAgendamento() {
    return dataAgendamento;
  }
  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
  }

  
  /**
   * Apresenta o tipoEvento a qual pertence a notifica\u00E7\u00E3o
   **/
  @ApiModelProperty(required = true, value = "Apresenta o tipoEvento a qual pertence a notifica\u00E7\u00E3o")
  public TipoEventoEnum getTipoEvento() {
    return tipoEvento;
  }
  public void setTipoEvento(TipoEventoEnum tipoEvento) {
    this.tipoEvento = tipoEvento;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NotificacaoSMSBody {\n");
    
    sb.append("  nsu: ").append(nsu).append("\n");
    sb.append("  idPessoa: ").append(idPessoa).append("\n");
    sb.append("  idConta: ").append(idConta).append("\n");
    sb.append("  celular: ").append(celular).append("\n");
    sb.append("  conteudo: ").append(conteudo).append("\n");
    sb.append("  dataAgendamento: ").append(dataAgendamento).append("\n");
    sb.append("  tipoEvento: ").append(tipoEvento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
