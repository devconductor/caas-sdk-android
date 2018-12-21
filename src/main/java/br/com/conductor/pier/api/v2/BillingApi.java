package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.TypeBillingPersist;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoResponse;
import br.com.conductor.pier.api.v2.model.TipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.TypeBillingPerAccountPersist;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoPorContaResponse;
import br.com.conductor.pier.api.v2.model.PageTipoFaturamentoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class BillingApi {
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
   * Update the Billing
   * Update the configuratioes of a determined type of billing
   * @param id Id
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  alterarTipoFaturamento (Long id, TypeBillingPersist tipoFaturamentoPersist) throws ApiException {
    Object postBody = tipoFaturamentoPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterarTipoFaturamento");
    }
    
    // verify the required parameter 'tipoFaturamentoPersist' is set
    if (tipoFaturamentoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPersist' when calling alterarTipoFaturamento");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoFaturamentoResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Add a new configuration of the billing for an account
   * this method allows to add a new configuration of a billing type for an specific account
   * @param tipoFaturamentoPorContaPersist tipoFaturamentoPorContaPersist
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse  cadastrarFaturamentoPorConta (TypeBillingPerAccountPersist tipoFaturamentoPorContaPersist) throws ApiException {
    Object postBody = tipoFaturamentoPorContaPersist;
    
    // verify the required parameter 'tipoFaturamentoPorContaPersist' is set
    if (tipoFaturamentoPorContaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPorContaPersist' when calling cadastrarFaturamentoPorConta");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento-conta".replaceAll("\\{format\\}","json");

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
        return (TipoFaturamentoPorContaResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoPorContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Add a new Billing
   * Add a new configuration of the type of Billing
   * @param tipoFaturamentoPersist tipoFaturamentoPersist
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  cadastrarTipoFaturamento (TypeBillingPersist tipoFaturamentoPersist) throws ApiException {
    Object postBody = tipoFaturamentoPersist;
    
    // verify the required parameter 'tipoFaturamentoPersist' is set
    if (tipoFaturamentoPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'tipoFaturamentoPersist' when calling cadastrarTipoFaturamento");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento".replaceAll("\\{format\\}","json");

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
        return (TipoFaturamentoResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Retrieve the Billing using the id
   * Retrieve the details of a determined Billing
   * @param id Id
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  consultarTipoFaturamento (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultarTipoFaturamento");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoFaturamentoResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Disable a configuration the type of billing per Account through the id
   * Disable a configuration the type of billing of a determined account
   * @param id Id
   * @return TipoFaturamentoPorContaResponse
   */
  public TipoFaturamentoPorContaResponse  desativarFaturamentoPorConta (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarFaturamentoPorConta");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento-conta/{id}/desativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoFaturamentoPorContaResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoPorContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Disable a configuration of the type of /billing through the id
   * Disable a configuration of type of billing
   * @param id Id
   * @return TipoFaturamentoResponse
   */
  public TipoFaturamentoResponse  desativarTipoFaturamento (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling desativarTipoFaturamento");
    }
    

    // create path and map variables
    String path = "/api/tipos-faturamento/{id}/desativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TipoFaturamentoResponse) ApiInvoker.deserialize(response, "", TipoFaturamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the configurations of the types of billing per Account
   * This method allows to list the configuration of the types of billing registered to an account
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idTipoFaturamentoPorConta Identification Code of the type of billing per account (id)
   * @param ativo Represent if the configuration is activated or disabled for the account
   * @param idConta Identification Code of the type of billing per account (id)
   * @param idTipoFaturamento Identification Code of the type of billing related (id)
   * @param dataHoraInclusao Date of inclusion of the configuration, it must be informed in the format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
   * @param dataHoraCancelamento Date of cancellation of the configuration, it must be informed in the format yyyy-MM-dd&#39;T&#39;HH:mm:ss.SSS&#39;Z&#39;
   * @param modificadoPor Identifier of the responsable for the register modification
   * @return PageTipoFaturamentoPorContaResponse
   */
  public PageTipoFaturamentoPorContaResponse  listarFaturamentoPorConta (List<String> sort, Integer page, Integer limit, Long idTipoFaturamentoPorConta, Boolean ativo, Long idConta, Long idTipoFaturamento, String dataHoraInclusao, String dataHoraCancelamento, String modificadoPor) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-faturamento-conta".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoFaturamentoPorConta", idTipoFaturamentoPorConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ativo", ativo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoFaturamento", idTipoFaturamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraInclusao", dataHoraInclusao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataHoraCancelamento", dataHoraCancelamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "modificadoPor", modificadoPor));
    

    

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
        return (PageTipoFaturamentoPorContaResponse) ApiInvoker.deserialize(response, "", PageTipoFaturamentoPorContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the types of Billing
   * List all the configurations of the types of billing
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idTipoFaturamento Identification Code of the type of billing (id)
   * @param descricao Description of the type of billing
   * @param flagApenasDemonstrativo Flag that represents the billing will be only demonstrative
   * @param idConvenio Identification Code of the agreement related to the type of billing
   * @return PageTipoFaturamentoResponse
   */
  public PageTipoFaturamentoResponse  listarTipoFaturamento (List<String> sort, Integer page, Integer limit, Long idTipoFaturamento, String descricao, Boolean flagApenasDemonstrativo, Long idConvenio) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/tipos-faturamento".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoFaturamento", idTipoFaturamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "descricao", descricao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagApenasDemonstrativo", flagApenasDemonstrativo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConvenio", idConvenio));
    

    

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
        return (PageTipoFaturamentoResponse) ApiInvoker.deserialize(response, "", PageTipoFaturamentoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
