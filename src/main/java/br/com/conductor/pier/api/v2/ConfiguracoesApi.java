package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.ParametroAcumuladorContaOperacaoUpdate;
import br.com.conductor.pier.api.v2.model.ParametroAcumuladorContaOperacaoResponse;
import br.com.conductor.pier.api.v2.model.ParametroAcumuladorProdutoOperacaoUpdate;
import br.com.conductor.pier.api.v2.model.ParametroAcumuladorProdutoOperacaoResponse;
import br.com.conductor.pier.api.v2.model.ParametroAcumuladorContaOperacaoPersist;
import br.com.conductor.pier.api.v2.model.ParametroAcumuladorProdutoOperacaoPersist;
import br.com.conductor.pier.api.v2.model.PageParametroAcumuladorContaOperacaoResponse;
import java.math.BigDecimal;
import br.com.conductor.pier.api.v2.model.PageParametroAcumuladorProdutoOperacaoResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class ConfiguracoesApi {
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
   * Atualizar um par\u00E2metro acumulador entre conta e opera\u00E7\u00E3o
   * Este recurso permite atualizar um par\u00E2metro acumulador de uma conta para uma determinada opera\u00E7\u00E3o previamente cadastrada
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param idOperacao C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   * @param parametroAcumuladorUpdate Objeto de atualiza\u00E7\u00E3o para um par\u00E2metro acumulador de conta/opera\u00E7\u00E3o
   * @return ParametroAcumuladorContaOperacaoResponse
   */
  public ParametroAcumuladorContaOperacaoResponse  atualizarParametroAcumuladorConta (Long idConta, Long idOperacao, ParametroAcumuladorContaOperacaoUpdate parametroAcumuladorUpdate) throws ApiException {
    Object postBody = parametroAcumuladorUpdate;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling atualizarParametroAcumuladorConta");
    }
    
    // verify the required parameter 'idOperacao' is set
    if (idOperacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacao' when calling atualizarParametroAcumuladorConta");
    }
    
    // verify the required parameter 'parametroAcumuladorUpdate' is set
    if (parametroAcumuladorUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'parametroAcumuladorUpdate' when calling atualizarParametroAcumuladorConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{idConta}/operacoes/{idOperacao}/configuracoes/acumuladores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idOperacao" + "\\}", apiInvoker.escapeString(idOperacao.toString()));

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
        return (ParametroAcumuladorContaOperacaoResponse) ApiInvoker.deserialize(response, "", ParametroAcumuladorContaOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Atualizar um par\u00E2metro acumulador entre produto e opera\u00E7\u00E3o
   * Este recurso permite atualizar um par\u00E2metro acumulador de um produto para uma determinada opera\u00E7\u00E3o previamente cadastrada
   * @param idProduto C\u00F3digo de identifica\u00E7\u00E3o do produto
   * @param idOperacao C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   * @param parametroAcumuladorUpdate Objeto de atualiza\u00E7\u00E3o para um par\u00E2metro acumulador de produto/opera\u00E7\u00E3o
   * @return ParametroAcumuladorProdutoOperacaoResponse
   */
  public ParametroAcumuladorProdutoOperacaoResponse  atualizarParametroAcumuladorProduto (Long idProduto, Long idOperacao, ParametroAcumuladorProdutoOperacaoUpdate parametroAcumuladorUpdate) throws ApiException {
    Object postBody = parametroAcumuladorUpdate;
    
    // verify the required parameter 'idProduto' is set
    if (idProduto == null) {
       throw new ApiException(400, "Missing the required parameter 'idProduto' when calling atualizarParametroAcumuladorProduto");
    }
    
    // verify the required parameter 'idOperacao' is set
    if (idOperacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacao' when calling atualizarParametroAcumuladorProduto");
    }
    
    // verify the required parameter 'parametroAcumuladorUpdate' is set
    if (parametroAcumuladorUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'parametroAcumuladorUpdate' when calling atualizarParametroAcumuladorProduto");
    }
    

    // create path and map variables
    String path = "/api/produtos/{idProduto}/operacoes/{idOperacao}/configuracoes/acumuladores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idProduto" + "\\}", apiInvoker.escapeString(idProduto.toString())).replaceAll("\\{" + "idOperacao" + "\\}", apiInvoker.escapeString(idOperacao.toString()));

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
        return (ParametroAcumuladorProdutoOperacaoResponse) ApiInvoker.deserialize(response, "", ParametroAcumuladorProdutoOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastrar um par\u00E2metro acumulador entre conta e opera\u00E7\u00E3o
   * Este recurso permite cadastrar um par\u00E2metro acumulador de uma conta para uma determinada opera\u00E7\u00E3o
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param idOperacao C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   * @param parametroAcumuladorPersist Objeto de cria\u00E7\u00E3o para um par\u00E2metro acumulador de conta/opera\u00E7\u00E3o
   * @return ParametroAcumuladorContaOperacaoResponse
   */
  public ParametroAcumuladorContaOperacaoResponse  cadastrarParametroAcumuladorConta (Long idConta, Long idOperacao, ParametroAcumuladorContaOperacaoPersist parametroAcumuladorPersist) throws ApiException {
    Object postBody = parametroAcumuladorPersist;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling cadastrarParametroAcumuladorConta");
    }
    
    // verify the required parameter 'idOperacao' is set
    if (idOperacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacao' when calling cadastrarParametroAcumuladorConta");
    }
    
    // verify the required parameter 'parametroAcumuladorPersist' is set
    if (parametroAcumuladorPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'parametroAcumuladorPersist' when calling cadastrarParametroAcumuladorConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{idConta}/operacoes/{idOperacao}/configuracoes/acumuladores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idOperacao" + "\\}", apiInvoker.escapeString(idOperacao.toString()));

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
        return (ParametroAcumuladorContaOperacaoResponse) ApiInvoker.deserialize(response, "", ParametroAcumuladorContaOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Cadastrar um par\u00E2metro acumulador entre produto e opera\u00E7\u00E3o
   * Este recurso permite cadastrar um par\u00E2metro acumulador de um produto para uma determinada opera\u00E7\u00E3o
   * @param idProduto C\u00F3digo de identifica\u00E7\u00E3o do produto
   * @param idOperacao C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   * @param parametroAcumuladorPersist Objeto de cria\u00E7\u00E3o para um par\u00E2metro acumulador de produto/opera\u00E7\u00E3o
   * @return ParametroAcumuladorProdutoOperacaoResponse
   */
  public ParametroAcumuladorProdutoOperacaoResponse  cadastrarParametroAcumuladorProduto (Long idProduto, Long idOperacao, ParametroAcumuladorProdutoOperacaoPersist parametroAcumuladorPersist) throws ApiException {
    Object postBody = parametroAcumuladorPersist;
    
    // verify the required parameter 'idProduto' is set
    if (idProduto == null) {
       throw new ApiException(400, "Missing the required parameter 'idProduto' when calling cadastrarParametroAcumuladorProduto");
    }
    
    // verify the required parameter 'idOperacao' is set
    if (idOperacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacao' when calling cadastrarParametroAcumuladorProduto");
    }
    
    // verify the required parameter 'parametroAcumuladorPersist' is set
    if (parametroAcumuladorPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'parametroAcumuladorPersist' when calling cadastrarParametroAcumuladorProduto");
    }
    

    // create path and map variables
    String path = "/api/produtos/{idProduto}/operacoes/{idOperacao}/configuracoes/acumuladores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idProduto" + "\\}", apiInvoker.escapeString(idProduto.toString())).replaceAll("\\{" + "idOperacao" + "\\}", apiInvoker.escapeString(idOperacao.toString()));

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
        return (ParametroAcumuladorProdutoOperacaoResponse) ApiInvoker.deserialize(response, "", ParametroAcumuladorProdutoOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consultar um par\u00E2metro acumulador entre conta e opera\u00E7\u00E3o
   * Este recurso permite consultar um par\u00E2metro acumulador de uma conta para uma determinada opera\u00E7\u00E3o previamente cadastrada
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param idOperacao C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   * @return ParametroAcumuladorContaOperacaoResponse
   */
  public ParametroAcumuladorContaOperacaoResponse  consultarParametroAcumuladorConta (Long idConta, Long idOperacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling consultarParametroAcumuladorConta");
    }
    
    // verify the required parameter 'idOperacao' is set
    if (idOperacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacao' when calling consultarParametroAcumuladorConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{idConta}/operacoes/{idOperacao}/configuracoes/acumuladores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idOperacao" + "\\}", apiInvoker.escapeString(idOperacao.toString()));

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
        return (ParametroAcumuladorContaOperacaoResponse) ApiInvoker.deserialize(response, "", ParametroAcumuladorContaOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Consultar um par\u00E2metro acumulador entre produto e opera\u00E7\u00E3o
   * Este recurso permite consultar um par\u00E2metro acumulador de um produto para uma determinada opera\u00E7\u00E3o previamente cadastrada
   * @param idProduto C\u00F3digo de identifica\u00E7\u00E3o do produto
   * @param idOperacao C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   * @return ParametroAcumuladorProdutoOperacaoResponse
   */
  public ParametroAcumuladorProdutoOperacaoResponse  consultarParametroAcumuladorProduto (Long idProduto, Long idOperacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idProduto' is set
    if (idProduto == null) {
       throw new ApiException(400, "Missing the required parameter 'idProduto' when calling consultarParametroAcumuladorProduto");
    }
    
    // verify the required parameter 'idOperacao' is set
    if (idOperacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacao' when calling consultarParametroAcumuladorProduto");
    }
    

    // create path and map variables
    String path = "/api/produtos/{idProduto}/operacoes/{idOperacao}/configuracoes/acumuladores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idProduto" + "\\}", apiInvoker.escapeString(idProduto.toString())).replaceAll("\\{" + "idOperacao" + "\\}", apiInvoker.escapeString(idOperacao.toString()));

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
        return (ParametroAcumuladorProdutoOperacaoResponse) ApiInvoker.deserialize(response, "", ParametroAcumuladorProdutoOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Excluir um par\u00E2metro acumulador entre conta e opera\u00E7\u00E3o
   * Este recurso permite excluir um par\u00E2metro acumulador de uma conta para uma determinada opera\u00E7\u00E3o previamente cadastrada
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param idOperacao C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   * @return Object
   */
  public Object  excluirParametroAcumuladorConta (Long idConta, Long idOperacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling excluirParametroAcumuladorConta");
    }
    
    // verify the required parameter 'idOperacao' is set
    if (idOperacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacao' when calling excluirParametroAcumuladorConta");
    }
    

    // create path and map variables
    String path = "/api/contas/{idConta}/operacoes/{idOperacao}/configuracoes/acumuladores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idConta" + "\\}", apiInvoker.escapeString(idConta.toString())).replaceAll("\\{" + "idOperacao" + "\\}", apiInvoker.escapeString(idOperacao.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Excluir um par\u00E2metro acumulador entre produto e opera\u00E7\u00E3o
   * Este recurso permite excluir um par\u00E2metro acumulador de um produto para uma determinada opera\u00E7\u00E3o previamente cadastrada
   * @param idProduto C\u00F3digo de identifica\u00E7\u00E3o do produto
   * @param idOperacao C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   * @return Object
   */
  public Object  excluirParametroAcumuladorProduto (Long idProduto, Long idOperacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idProduto' is set
    if (idProduto == null) {
       throw new ApiException(400, "Missing the required parameter 'idProduto' when calling excluirParametroAcumuladorProduto");
    }
    
    // verify the required parameter 'idOperacao' is set
    if (idOperacao == null) {
       throw new ApiException(400, "Missing the required parameter 'idOperacao' when calling excluirParametroAcumuladorProduto");
    }
    

    // create path and map variables
    String path = "/api/produtos/{idProduto}/operacoes/{idOperacao}/configuracoes/acumuladores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "idProduto" + "\\}", apiInvoker.escapeString(idProduto.toString())).replaceAll("\\{" + "idOperacao" + "\\}", apiInvoker.escapeString(idOperacao.toString()));

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
      String response = apiInvoker.invokeAPI(basePath, path, "DELETE", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (Object) ApiInvoker.deserialize(response, "", Object.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar par\u00E2metros acumuladores de contas e opera\u00E7\u00F5es
   * Este recurso permite listar par\u00E2metros acumuladores de contas e opera\u00E7\u00F5es
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idConta C\u00F3digo de identifica\u00E7\u00E3o da conta
   * @param idOperacao C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   * @param qtdOperacoesGratuitasDia Quantidade de opera\u00E7\u00F5es gratuitas permitidas por dia
   * @param qtdOperacoesGratuitasSemana Quantidade de opera\u00E7\u00F5es gratuitas permitidas por semana
   * @param qtdOperacoesGratuitasMes Quantidade de opera\u00E7\u00F5es gratuitas permitidas por m\u00EAs
   * @param valorTAC Valor da taxa de abertura de cr\u00E9dito (TAC)
   * @return PageParametroAcumuladorContaOperacaoResponse
   */
  public PageParametroAcumuladorContaOperacaoResponse  listarParametrosAcumuladoresConta (List<String> sort, Integer page, Integer limit, Long idConta, Long idOperacao, Integer qtdOperacoesGratuitasDia, Integer qtdOperacoesGratuitasSemana, Integer qtdOperacoesGratuitasMes, BigDecimal valorTAC) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/contas/configuracoes/acumuladores".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOperacao", idOperacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qtdOperacoesGratuitasDia", qtdOperacoesGratuitasDia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qtdOperacoesGratuitasSemana", qtdOperacoesGratuitasSemana));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qtdOperacoesGratuitasMes", qtdOperacoesGratuitasMes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorTAC", valorTAC));
    

    

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
        return (PageParametroAcumuladorContaOperacaoResponse) ApiInvoker.deserialize(response, "", PageParametroAcumuladorContaOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Listar par\u00E2metros acumuladores de produtos e opera\u00E7\u00F5es
   * Este recurso permite listar par\u00E2metros acumuladores de produtos e opera\u00E7\u00F5es
   * @param sort Tipo de ordena\u00E7\u00E3o dos registros
   * @param page P\u00E1gina
   * @param limit Limite de elementos por solicita\u00E7\u00E3o (Default =50, Max =50)
   * @param idProduto C\u00F3digo de identifica\u00E7\u00E3o do produto
   * @param idOperacao C\u00F3digo de identifica\u00E7\u00E3o da opera\u00E7\u00E3o
   * @param qtdMaxDia Quantidade m\u00E1xima de opera\u00E7\u00F5es por dia
   * @param qtdMaxSemana Quantidade m\u00E1xima de opera\u00E7\u00F5es por semana
   * @param qtdMaxMes Quantidade m\u00E1xima de opera\u00E7\u00F5es por m\u00EAs
   * @param valorMaxDia Valor m\u00E1ximo de opera\u00E7\u00F5es por dia
   * @param valorMaxSemana Valor m\u00E1ximo de opera\u00E7\u00F5es por semana
   * @param valorMaxMes Valor m\u00E1ximo de opera\u00E7\u00F5es por m\u00EAs
   * @param qtdOperacoesGratuitasDia Quantidade de opera\u00E7\u00F5es gratuitas permitidas por dia
   * @param qtdOperacoesGratuitasSemana Quantidade de opera\u00E7\u00F5es gratuitas permitidas por semana
   * @param qtdOperacoesGratuitasMes Quantidade de opera\u00E7\u00F5es gratuitas permitidas por m\u00EAs
   * @param valorTAC Valor da taxa de abertura de cr\u00E9dito (TAC)
   * @return PageParametroAcumuladorProdutoOperacaoResponse
   */
  public PageParametroAcumuladorProdutoOperacaoResponse  listarParametrosAcumuladoresProduto (List<String> sort, Integer page, Integer limit, Long idProduto, Long idOperacao, Integer qtdMaxDia, Integer qtdMaxSemana, Integer qtdMaxMes, BigDecimal valorMaxDia, BigDecimal valorMaxSemana, BigDecimal valorMaxMes, Integer qtdOperacoesGratuitasDia, Integer qtdOperacoesGratuitasSemana, Integer qtdOperacoesGratuitasMes, BigDecimal valorTAC) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/produtos/configuracoes/acumuladores".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idOperacao", idOperacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qtdMaxDia", qtdMaxDia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qtdMaxSemana", qtdMaxSemana));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qtdMaxMes", qtdMaxMes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorMaxDia", valorMaxDia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorMaxSemana", valorMaxSemana));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorMaxMes", valorMaxMes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qtdOperacoesGratuitasDia", qtdOperacoesGratuitasDia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qtdOperacoesGratuitasSemana", qtdOperacoesGratuitasSemana));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "qtdOperacoesGratuitasMes", qtdOperacoesGratuitasMes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "valorTAC", valorTAC));
    

    

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
        return (PageParametroAcumuladorProdutoOperacaoResponse) ApiInvoker.deserialize(response, "", PageParametroAcumuladorProdutoOperacaoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
