package br.com.conductor.pier.api.v2.model;


import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * {{{base_response_description}}}
 **/
@ApiModel(description = "{{{base_response_description}}}")
public class BaseResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("servidor")
  private String servidor = null;
  @SerializedName("usuario")
  private String usuario = null;
  @SerializedName("nomeBase")
  private String nomeBase = null;
  @SerializedName("domain")
  private String domain = null;
  @SerializedName("senhaCriptografada")
  private Boolean senhaCriptografada = null;
  @SerializedName("nomeBaseControleAcesso")
  private String nomeBaseControleAcesso = null;
  @SerializedName("idEmissor")
  private Long idEmissor = null;
  @SerializedName("servidorControleAcesso")
  private String servidorControleAcesso = null;
  @SerializedName("nomeBaseUsuarios")
  private String nomeBaseUsuarios = null;
  @SerializedName("servidorUsuarios")
  private String servidorUsuarios = null;
  @SerializedName("flagCluster")
  private Boolean flagCluster = null;

  
  /**
   * {{{base_dto_id_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_id_value}}}")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * {{{base_dto_servidor_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_servidor_value}}}")
  public String getServidor() {
    return servidor;
  }
  public void setServidor(String servidor) {
    this.servidor = servidor;
  }

  
  /**
   * {{{base_dto_usuario_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_usuario_value}}}")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  
  /**
   * {{{base_dto_nome_base_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_nome_base_value}}}")
  public String getNomeBase() {
    return nomeBase;
  }
  public void setNomeBase(String nomeBase) {
    this.nomeBase = nomeBase;
  }

  
  /**
   * {{{base_dto_domain_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_domain_value}}}")
  public String getDomain() {
    return domain;
  }
  public void setDomain(String domain) {
    this.domain = domain;
  }

  
  /**
   * {{{base_dto_senha_criptografada_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_senha_criptografada_value}}}")
  public Boolean getSenhaCriptografada() {
    return senhaCriptografada;
  }
  public void setSenhaCriptografada(Boolean senhaCriptografada) {
    this.senhaCriptografada = senhaCriptografada;
  }

  
  /**
   * {{{base_dto_nome_base_controle_acesso_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_nome_base_controle_acesso_value}}}")
  public String getNomeBaseControleAcesso() {
    return nomeBaseControleAcesso;
  }
  public void setNomeBaseControleAcesso(String nomeBaseControleAcesso) {
    this.nomeBaseControleAcesso = nomeBaseControleAcesso;
  }

  
  /**
   * {{{base_dto_id_emissor_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_id_emissor_value}}}")
  public Long getIdEmissor() {
    return idEmissor;
  }
  public void setIdEmissor(Long idEmissor) {
    this.idEmissor = idEmissor;
  }

  
  /**
   * {{{base_dto_servidor_controle_acesso_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_servidor_controle_acesso_value}}}")
  public String getServidorControleAcesso() {
    return servidorControleAcesso;
  }
  public void setServidorControleAcesso(String servidorControleAcesso) {
    this.servidorControleAcesso = servidorControleAcesso;
  }

  
  /**
   * {{{base_dto_nome_base_usuarios_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_nome_base_usuarios_value}}}")
  public String getNomeBaseUsuarios() {
    return nomeBaseUsuarios;
  }
  public void setNomeBaseUsuarios(String nomeBaseUsuarios) {
    this.nomeBaseUsuarios = nomeBaseUsuarios;
  }

  
  /**
   * {{{base_dto_servidor_usuarios_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_servidor_usuarios_value}}}")
  public String getServidorUsuarios() {
    return servidorUsuarios;
  }
  public void setServidorUsuarios(String servidorUsuarios) {
    this.servidorUsuarios = servidorUsuarios;
  }

  
  /**
   * {{{base_dto_flag_cluster_value}}}
   **/
  @ApiModelProperty(value = "{{{base_dto_flag_cluster_value}}}")
  public Boolean getFlagCluster() {
    return flagCluster;
  }
  public void setFlagCluster(Boolean flagCluster) {
    this.flagCluster = flagCluster;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  servidor: ").append(servidor).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("  nomeBase: ").append(nomeBase).append("\n");
    sb.append("  domain: ").append(domain).append("\n");
    sb.append("  senhaCriptografada: ").append(senhaCriptografada).append("\n");
    sb.append("  nomeBaseControleAcesso: ").append(nomeBaseControleAcesso).append("\n");
    sb.append("  idEmissor: ").append(idEmissor).append("\n");
    sb.append("  servidorControleAcesso: ").append(servidorControleAcesso).append("\n");
    sb.append("  nomeBaseUsuarios: ").append(nomeBaseUsuarios).append("\n");
    sb.append("  servidorUsuarios: ").append(servidorUsuarios).append("\n");
    sb.append("  flagCluster: ").append(flagCluster).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
