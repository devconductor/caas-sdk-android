package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AjusteFinanceiroResponse;
import br.com.conductor.pier.api.v2.model.PageAjusteResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.AjustePersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class AjusteFinanceiroApi {
  String basePath = "http://localhost/";
  ApiInvoker apiInvoker = ApiInvoker.getInstance();

  public void addHeader(String key, String value) {
    getInvoker().addDefaultHeader(key, value);
  }

  public ApiInvoker getInvoker() {
    return apiInvoker;
  }

  public void setBasePath(String basePath) {
    this.basePath = basePath;
  }

  public String getBasePath() {
    return basePath;
  }

  
  /**
   * Apresenta dados de um determinado ajuste financeiro
   * Este m\u00E9todo permite consultar dados de um determinado ajuste a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do ajuste (id)
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse  consultarAjusteFinanceiro (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarAjusteFinanceiro");
    }
    

    // create path and map variables
    String path = "/api/ajustes-financeiros/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AjusteFinanceiroResponse) ApiInvoker.deserialize(response, "", AjusteFinanceiroResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista ajustes existentes na base de dados do Emissor
   * Este recurso permite listar ajustes existentes na base de dados do Emissor
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idTipoAjuste C\u00F3digo identificador do tipo de ajuste
   * @param dataAjuste Data do ajuste no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @param valorAjuste Valor do ajuste
   * @param identificadorExterno Codigo Hexadecimal
   * @param idConta C\u00F3digo identificador da conta
   * @return PageAjusteResponse
   */
  public PageAjusteResponse  listarAjustesFinanceiros (List<String> sort, Integer page, Integer limit, Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, String identificadorExterno, Long idConta) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/ajustes-financeiros".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoAjuste", idTipoAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAjuste", dataAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorAjuste", valorAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "identificadorExterno", identificadorExterno));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    

    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "GET", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (PageAjusteResponse) ApiInvoker.deserialize(response, "", PageAjusteResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lan\u00E7a um ajuste para a conta informada
   * Este recurso insere um ajuste para a conta do id informado
   * @param idTipoAjuste C\u00F3digo identificador do tipo de ajuste
   * @param dataAjuste Data do ajuste no formato yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSSZ
   * @param valorAjuste Valor do ajuste
   * @param idConta C\u00F3digo identificador da conta
   * @param login login
   * @param identificadorExterno Identificador Externo
   * @param idTransacaoOriginal Identificador da transa\u00E7\u00E3o original (estorno)
   * @param idEstabelecimento Identificador do estabelecimento quando o pagamento for efetuado em loja
   * @param flagAtendimento Flag para lan\u00E7ar o atendimento
   * @param mensagemAtendimento Mensagem enviada no atendimento
   * @param descricaoEstabelecimentoExterno Descri\u00E7\u00E3o externa do estabelecimento
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse  salvarAjusteFinanceiro (Long idTipoAjuste, String dataAjuste, BigDecimal valorAjuste, Long idConta, String login, String identificadorExterno, Long idTransacaoOriginal, Long idEstabelecimento, Boolean flagAtendimento, String mensagemAtendimento, String descricaoEstabelecimentoExterno) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idTipoAjuste' is set
    if (idTipoAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'idTipoAjuste' when calling salvarAjusteFinanceiro");
    }
    
    // verify the required parameter 'dataAjuste' is set
    if (dataAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'dataAjuste' when calling salvarAjusteFinanceiro");
    }
    
    // verify the required parameter 'valorAjuste' is set
    if (valorAjuste == null) {
       throw new ApiException(400, "Missing the required parameter 'valorAjuste' when calling salvarAjusteFinanceiro");
    }
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling salvarAjusteFinanceiro");
    }
    

    // create path and map variables
    String path = "/api/ajustes-financeiros".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoAjuste", idTipoAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataAjuste", dataAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorAjuste", valorAjuste));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "identificadorExterno", identificadorExterno));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTransacaoOriginal", idTransacaoOriginal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstabelecimento", idEstabelecimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagAtendimento", flagAtendimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "mensagemAtendimento", mensagemAtendimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricaoEstabelecimentoExterno", descricaoEstabelecimentoExterno));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    

    
    headerParams.put("login", ApiInvoker.parameterToString(login));
    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AjusteFinanceiroResponse) ApiInvoker.deserialize(response, "", AjusteFinanceiroResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Este recurso lan\u00E7a um ajuste para a conta do id informado levando em considera\u00E7\u00E3o o saldo
   * Lan\u00E7a um ajuste para a conta do id informado levando em considera\u00E7\u00E3o o saldo
   * @param id id
   * @param ajustePersist ajustePersist
   * @param login login
   * @return AjusteFinanceiroResponse
   */
  public AjusteFinanceiroResponse  salvarAjusteFinanceiroConta (Long id, AjustePersist ajustePersist, String login) throws ApiException {
    Object postBody = ajustePersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarAjusteFinanceiroConta");
    }
    
    // verify the required parameter 'ajustePersist' is set
    if (ajustePersist == null) {
       throw new ApiException(400, "Missing the required parameter 'ajustePersist' when calling salvarAjusteFinanceiroConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/ajustes/financeiros".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    

    
    headerParams.put("login", ApiInvoker.parameterToString(login));
    

    String[] contentTypes = {
      "application/json"
    };
    String contentType = contentTypes.length > 0 ? contentTypes[0] : "application/json";

    if (contentType.startsWith("multipart/form-data")) {
      // file uploading
      MultipartEntityBuilder builder = MultipartEntityBuilder.create();
      

      HttpEntity httpEntity = builder.build();
      postBody = httpEntity;
    } else {
      // normal form params
      
    }

    try {
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (AjusteFinanceiroResponse) ApiInvoker.deserialize(response, "", AjusteFinanceiroResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
