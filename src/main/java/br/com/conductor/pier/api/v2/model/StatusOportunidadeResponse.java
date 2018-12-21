package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{status_oportunidade_response_description}}}
 **/
@ApiModel(description = "{{{status_oportunidade_response_description}}}")
public class StatusOportunidadeResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("idTipoOportunidade")
  private Long idTipoOportunidade = null;
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("descricao")
  private String descricao = null;
  @SerializedName("flagAtivo")
  private Boolean flagAtivo = null;

  
  /**
   * {{{status_oportunidade_response_id_value}}}
   **/
  @ApiModelProperty(value = "{{{status_oportunidade_response_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{status_oportunidade_response_id_tipo_oportunidade_value}}}
   **/
  @ApiModelProperty(value = "{{{status_oportunidade_response_id_tipo_oportunidade_value}}}")
  public Long getIdTipoOportunidade() {
    return idTipoOportunidade;
  }
  public void setIdTipoOportunidade(Long idTipoOportunidade) {
    this.idTipoOportunidade = idTipoOportunidade;
  }

  
  /**
   * {{{status_oportunidade_response_nome_value}}}
   **/
  @ApiModelProperty(value = "{{{status_oportunidade_response_nome_value}}}")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * {{{status_oportunidade_response_descricao_value}}}
   **/
  @ApiModelProperty(value = "{{{status_oportunidade_response_descricao_value}}}")
  public String getDescricao() {
    return descricao;
  }
  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  
  /**
   * {{{status_oportunidade_response_flag_ativo_value}}}
   **/
  @ApiModelProperty(value = "{{{status_oportunidade_response_flag_ativo_value}}}")
  public Boolean getFlagAtivo() {
    return flagAtivo;
  }
  public void setFlagAtivo(Boolean flagAtivo) {
    this.flagAtivo = flagAtivo;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatusOportunidadeResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  idTipoOportunidade: ").append(idTipoOportunidade).append("\n");
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  descricao: ").append(descricao).append("\n");
    sb.append("  flagAtivo: ").append(flagAtivo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
