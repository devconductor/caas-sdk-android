package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.DadosBancariosContaResponse;
import br.com.conductor.pier.api.v2.model.DadosBancariosContaUpdate;
import br.com.conductor.pier.api.v2.model.CdtTipoContaBancaria;
import br.com.conductor.pier.api.v2.model.PageDadosBancariosContaResponse;
import br.com.conductor.pier.api.v2.model.DadosBancariosContaPersist;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class DadosBancariosContaApi {
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
   * Atualiza os dados da conta bancaria
   * Esse recurso permite que voc\u00EA altere os detalhes banc\u00E1rios de uma conta
   * @param id id
   * @param update update
   * @return DadosBancariosContaResponse
   */
  public DadosBancariosContaResponse  alterarDadosBancarios (Long id, DadosBancariosContaUpdate update) throws ApiException {
    Object postBody = update;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarDadosBancarios");
    }
    
    // verify the required parameter 'update' is set
    if (update == null) {
       throw new ApiException(400, "Missing the required parameter 'update' when calling alterarDadosBancarios");
    }
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (DadosBancariosContaResponse) ApiInvoker.deserialize(response, "", DadosBancariosContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados banc\u00E1rios de uma determinada conta
   * Este m\u00E9todo permite consultar os dados banc\u00E1rios de uma determinada conta a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do dado banc\u00E1rio da conta (id)
   * @return DadosBancariosContaResponse
   */
  public DadosBancariosContaResponse  consultarDadosBancarios (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarDadosBancarios");
    }
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (DadosBancariosContaResponse) ApiInvoker.deserialize(response, "", DadosBancariosContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta dados de um determinado tipo de conta banc\u00E1ria
   * Este m\u00E9todo permite consultar dados de um determinado tipo de conta banc\u00E1ria a partir de seu codigo de identifica\u00E7\u00E3o (id)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do tipo de conta banc\u00E1ria (id)
   * @return CdtTipoContaBancaria
   */
  public CdtTipoContaBancaria  consultarTipoContaBancaria (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTipoContaBancaria");
    }
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta/tipos-contas-bancarias/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (CdtTipoContaBancaria) ApiInvoker.deserialize(response, "", CdtTipoContaBancaria.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados banc\u00E1rios a partir dos filtros informados
   * Este m\u00E9todo permite consultar os dados banc\u00E1rios a partir dos filtros informados
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param id C\u00F3digo de identifica\u00E7\u00E3o do registro dos dados banc\u00E1rios (id)
   * @param idConta C\u00F3digo de Identifica\u00E7\u00E3o da conta (id)
   * @param codigoBanco Banco
   * @param numeroAgencia Ag\u00EAncia
   * @param numeroContaCorrente Conta Corrente
   * @param idTipoContaBancaria C\u00F3digo de Identifica\u00E7\u00E3o do tipo de conta banc\u00E1ria (id). 
   * @return PageDadosBancariosContaResponse
   */
  public PageDadosBancariosContaResponse  listarDadosBancarios (List<String> sort, Integer page, Integer limit, Long id, Long idConta, Long codigoBanco, Long numeroAgencia, String numeroContaCorrente, Long idTipoContaBancaria) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoBanco", codigoBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoContaBancaria", idTipoContaBancaria));
    

    

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
        return (PageDadosBancariosContaResponse) ApiInvoker.deserialize(response, "", PageDadosBancariosContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os tipos de contas banc\u00E1rias
   * Este recurso permite listar os tipos de contas banc\u00E1rias dispon\u00EDveis
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param descricao Descri\u00E7\u00E3o do tipo de conta banc\u00E1ria
   * @return CdtTipoContaBancaria
   */
  public CdtTipoContaBancaria  listarTiposContasBancarias (List<String> sort, Integer page, Integer limit, String descricao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta/tipos-contas-bancarias".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    

    

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
        return (CdtTipoContaBancaria) ApiInvoker.deserialize(response, "", CdtTipoContaBancaria.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastra registro de dados banc\u00E1rios
   * Este recurso permite associar novos dados banc\u00E1rios a uma conta
   * @param dadosBancariosContaPersist dadosBancariosContaPersist
   * @return DadosBancariosContaResponse
   */
  public DadosBancariosContaResponse  salvarDadosBancarios (DadosBancariosContaPersist dadosBancariosContaPersist) throws ApiException {
    Object postBody = dadosBancariosContaPersist;
    
    // verify the required parameter 'dadosBancariosContaPersist' is set
    if (dadosBancariosContaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'dadosBancariosContaPersist' when calling salvarDadosBancarios");
    }
    

    // create path and map variables
    String path = "/api/dados-bancarios-conta".replaceAll("\\{format\\}","json");

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
      String response = apiInvoker.invokeAPI(basePath, path, "POST", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (DadosBancariosContaResponse) ApiInvoker.deserialize(response, "", DadosBancariosContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
