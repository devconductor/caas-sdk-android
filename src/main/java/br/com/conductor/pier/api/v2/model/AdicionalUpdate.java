package br.com.conductor.pier.api.v2.model;

import br.com.conductor.pier.api.v2.model.TelefoneAdicionalUpdate;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Objeto Adicional
 **/
@ApiModel(description = "Objeto Adicional")
public class AdicionalUpdate  {
  
  @SerializedName("nome")
  private String nome = null;
  @SerializedName("nomeImpresso")
  private String nomeImpresso = null;
  @SerializedName("numeroReceitaFederal")
  private String numeroReceitaFederal = null;
  @SerializedName("dataNascimento")
  private String dataNascimento = null;
  @SerializedName("sexo")
  private String sexo = null;
  @SerializedName("numeroIdentidade")
  private String numeroIdentidade = null;
  @SerializedName("orgaoExpedidorIdentidade")
  private String orgaoExpedidorIdentidade = null;
  @SerializedName("unidadeFederativaIdentidade")
  private String unidadeFederativaIdentidade = null;
  @SerializedName("dataEmissaoIdentidade")
  private String dataEmissaoIdentidade = null;
  @SerializedName("idParentesco")
  private Long idParentesco = null;
  @SerializedName("telefones")
  private List<TelefoneAdicionalUpdate> telefones = null;

  
  /**
   * Nome completo do Adicional.
   **/
  @ApiModelProperty(required = true, value = "Nome completo do Adicional.")
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  
  /**
   * Nome do Adicional que ser\u00C3\u00A1 gravado no Cart\u00C3\u00A3o.
   **/
  @ApiModelProperty(value = "Nome do Adicional que ser\u00C3\u00A1 gravado no Cart\u00C3\u00A3o.")
  public String getNomeImpresso() {
    return nomeImpresso;
  }
  public void setNomeImpresso(String nomeImpresso) {
    this.nomeImpresso = nomeImpresso;
  }

  
  /**
   * N\u00C3\u00BAmero do CPF ou CNPJ do Adicional.
   **/
  @ApiModelProperty(required = true, value = "N\u00C3\u00BAmero do CPF ou CNPJ do Adicional.")
  public String getNumeroReceitaFederal() {
    return numeroReceitaFederal;
  }
  public void setNumeroReceitaFederal(String numeroReceitaFederal) {
    this.numeroReceitaFederal = numeroReceitaFederal;
  }

  
  /**
   * Data de Nascimento do Adicional em formato yyyy-MM-dd.
   **/
  @ApiModelProperty(value = "Data de Nascimento do Adicional em formato yyyy-MM-dd.")
  public String getDataNascimento() {
    return dataNascimento;
  }
  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino), (\"O\": Outro), (\"N\": N\u00C3\u00A3o Especificado).
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do sexo da Pessoa, quando PF, sendo: (\"M\": Masculino), (\"F\": Feminino), (\"O\": Outro), (\"N\": N\u00C3\u00A3o Especificado).")
  public String getSexo() {
    return sexo;
  }
  public void setSexo(String sexo) {
    this.sexo = sexo;
  }

  
  /**
   * N\u00C3\u00BAmero do Documento de Identidade do Adicional.
   **/
  @ApiModelProperty(value = "N\u00C3\u00BAmero do Documento de Identidade do Adicional.")
  public String getNumeroIdentidade() {
    return numeroIdentidade;
  }
  public void setNumeroIdentidade(String numeroIdentidade) {
    this.numeroIdentidade = numeroIdentidade;
  }

  
  /**
   * Nome do Org\u00C3\u00A3o Emissor do Documento de Identidade do Adicional.
   **/
  @ApiModelProperty(value = "Nome do Org\u00C3\u00A3o Emissor do Documento de Identidade do Adicional.")
  public String getOrgaoExpedidorIdentidade() {
    return orgaoExpedidorIdentidade;
  }
  public void setOrgaoExpedidorIdentidade(String orgaoExpedidorIdentidade) {
    this.orgaoExpedidorIdentidade = orgaoExpedidorIdentidade;
  }

  
  /**
   * Sigla da Unidade Federativa onde o Documento de Identidade do Adicional foi emitido.
   **/
  @ApiModelProperty(value = "Sigla da Unidade Federativa onde o Documento de Identidade do Adicional foi emitido.")
  public String getUnidadeFederativaIdentidade() {
    return unidadeFederativaIdentidade;
  }
  public void setUnidadeFederativaIdentidade(String unidadeFederativaIdentidade) {
    this.unidadeFederativaIdentidade = unidadeFederativaIdentidade;
  }

  
  /**
   * Data de emiss\u00C3\u00A3o do Documento de Identidade do Adicional em formato yyyy-MM-dd.
   **/
  @ApiModelProperty(value = "Data de emiss\u00C3\u00A3o do Documento de Identidade do Adicional em formato yyyy-MM-dd.")
  public String getDataEmissaoIdentidade() {
    return dataEmissaoIdentidade;
  }
  public void setDataEmissaoIdentidade(String dataEmissaoIdentidade) {
    this.dataEmissaoIdentidade = dataEmissaoIdentidade;
  }

  
  /**
   * C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Parentesco do Adicional com o Titular.
   **/
  @ApiModelProperty(value = "C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Parentesco do Adicional com o Titular.")
  public Long getIdParentesco() {
    return idParentesco;
  }
  public void setIdParentesco(Long idParentesco) {
    this.idParentesco = idParentesco;
  }

  
  /**
   * Lista de telefones do adicional.
   **/
  @ApiModelProperty(value = "Lista de telefones do adicional.")
  public List<TelefoneAdicionalUpdate> getTelefones() {
    return telefones;
  }
  public void setTelefones(List<TelefoneAdicionalUpdate> telefones) {
    this.telefones = telefones;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdicionalUpdate {\n");
    
    sb.append("  nome: ").append(nome).append("\n");
    sb.append("  nomeImpresso: ").append(nomeImpresso).append("\n");
    sb.append("  numeroReceitaFederal: ").append(numeroReceitaFederal).append("\n");
    sb.append("  dataNascimento: ").append(dataNascimento).append("\n");
    sb.append("  sexo: ").append(sexo).append("\n");
    sb.append("  numeroIdentidade: ").append(numeroIdentidade).append("\n");
    sb.append("  orgaoExpedidorIdentidade: ").append(orgaoExpedidorIdentidade).append("\n");
    sb.append("  unidadeFederativaIdentidade: ").append(unidadeFederativaIdentidade).append("\n");
    sb.append("  dataEmissaoIdentidade: ").append(dataEmissaoIdentidade).append("\n");
    sb.append("  idParentesco: ").append(idParentesco).append("\n");
    sb.append("  telefones: ").append(telefones).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
