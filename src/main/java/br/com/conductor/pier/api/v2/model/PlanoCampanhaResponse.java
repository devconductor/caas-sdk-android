package br.com.conductor.pier.api.v2.model;

import java.math.BigDecimal;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Representa\u00E7\u00E3o da resposta do recurso de plano de campanha
 **/
@ApiModel(description = "Representa\u00E7\u00E3o da resposta do recurso de plano de campanha")
public class PlanoCampanhaResponse  {
  
  @SerializedName("id")
  private Long id = null;
  @SerializedName("parcelas")
  private Integer parcelas = null;
  @SerializedName("taxa")
  private BigDecimal taxa = null;
  @SerializedName("usuario")
  private String usuario = null;

  
  /**
   * Identificador do plano de campanha
   **/
  @ApiModelProperty(value = "Identificador do plano de campanha")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * Quantidade de parcelas
   **/
  @ApiModelProperty(value = "Quantidade de parcelas")
  public Integer getParcelas() {
    return parcelas;
  }
  public void setParcelas(Integer parcelas) {
    this.parcelas = parcelas;
  }

  
  /**
   * Taxa de juros
   **/
  @ApiModelProperty(value = "Taxa de juros")
  public BigDecimal getTaxa() {
    return taxa;
  }
  public void setTaxa(BigDecimal taxa) {
    this.taxa = taxa;
  }

  
  /**
   * Nome do usu\u00E1rio
   **/
  @ApiModelProperty(value = "Nome do usu\u00E1rio")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlanoCampanhaResponse {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  parcelas: ").append(parcelas).append("\n");
    sb.append("  taxa: ").append(taxa).append("\n");
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
