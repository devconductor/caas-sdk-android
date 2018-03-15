package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.DetalheOportunidadeResponse;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso Oportunidades
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso Oportunidades")
public class OportunidadeResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoOportunidade")
  private Long idTipoOportunidade = null;
  @SerializedName("idStatusOportunidade")
  private Long idStatusOportunidade = null;
  @SerializedName("dataCadastro")
  private String dataCadastro = null;
  @SerializedName("dataAtualizacao")
  private String dataAtualizacao = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("dataInicioVigencia")
  private String dataInicioVigencia = null;
  @SerializedName("dataFimVigencia")
  private String dataFimVigencia = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;
  @SerializedName("detalhes")
  private List<DetalheOportunidadeResponse> detalhes = null;

  
  /**
   * C\u00F3digo identificador da oportunidade
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador da oportunidade")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * C\u00F3digo identificador do tipo oportunidade
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do tipo oportunidade")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * C\u00F3digo identificador do status oportunidade
   **/
  @ApiModelProperty(value = "C\u00F3digo identificador do status oportunidade")
  public Long getIdStatusOportunidade() {
    return idStatusOportunidade;
  }
  public void setIdStatusOportunidade(Long idStatusOportunidade) {
    this.idStatusOportunidade = idStatusOportunidade;
  }

  
  /**
   * Data cadastro da oportunidade.
   **/
  @ApiModelProperty(value = "Data cadastro da oportunidade.")
  public String getDataCadastro() {
    return dataCadastro;
  }
  public void setDataCadastro(String dataCadastro) {
    this.dataCadastro = dataCadastro;
  }

  
  /**
   * Data atualiza\u00E7\u00E3o da oportunidade.
   **/
  @ApiModelProperty(value = "Data atualiza\u00E7\u00E3o da oportunidade.")
  public String getDataAtualizacao() {
    return dataAtualizacao;
  }
  public void setDataAtualizacao(String dataAtualizacao) {
    this.dataAtualizacao = dataAtualizacao;
  }

  
  /**
   * N\u00FAmero receita federal do cliente ao qual ser\u00E1 ofertada a oportunidade
   **/
  @ApiModelProperty(value = "N\u00FAmero receita federal do cliente ao qual ser\u00E1 ofertada a oportunidade")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * In\u00EDcio da vig\u00EAncia da oportunidade
   **/
  @ApiModelProperty(value = "In\u00EDcio da vig\u00EAncia da oportunidade")
  public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }
  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  
  /**
   * Fim da vig\u00EAncia da oportunidade
   **/
  @ApiModelProperty(value = "Fim da vig\u00EAncia da oportunidade")
  public String getDataFimVigencia() {
    return dataFimVigencia;
  }
  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  
  /**
   * Flag de verifica\u00E7\u00E3o se a oportunidade est\u00E1 ativa
   **/
  @ApiModelProperty(value = "Flag de verifica\u00E7\u00E3o se a oportunidade est\u00E1 ativa")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  
  /**
   * Lista de detalhes da oportunidade
   **/
  @ApiModelProperty(value = "Lista de detalhes da oportunidade")
  public List<DetalheOportunidadeResponse> getDetalhes() {
    return detalhes;
  }
  public void setDetalhes(List<DetalheOportunidadeResponse> detalhes) {
    this.detalhes = detalhes;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class OportunidadeResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoOportunidade: ").append(idTipoOportunidade).append("\n");
    sb.append("  idStatusOportunidade: ").append(idStatusOportunidade).append("\n");
    sb.append("  dataCadastro: ").append(dataCadastro).append("\n");
    sb.append("  dataAtualizacao: ").append(dataAtualizacao).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  dataInicioVigencia: ").append(dataInicioVigencia).append("\n");
    sb.append("  dataFimVigencia: ").append(dataFimVigencia).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("  detalhes: ").append(detalhes).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
