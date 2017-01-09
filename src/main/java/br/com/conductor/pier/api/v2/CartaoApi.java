package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.HistoricoImpressaoCartao;
import br.com.conductor.pier.api.v2.model.Cartao;
import br.com.conductor.pier.api.v2.model.LimiteDisponibilidade;
import br.com.conductor.pier.api.v2.model.Portador;
import br.com.conductor.pier.api.v2.model.PageCartoes;
import java.util.Date;
import br.com.conductor.pier.api.v2.model.ValidaCartao;


import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;


public class CartaoApi {
  String basePath = "https://localhost/";
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
   * Realiza a altera\u00C3\u00A7\u00C3\u00A3o do Status de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite que uma Aplica\u00C3\u00A7\u00C3\u00A3o que realize a impress\u00C3\u00A3o de cart\u00C3\u00B5es possa indicar que um determinado idCartao fora impresso ou est\u00C3\u00A1 em processo de impress\u00C3\u00A3o. Para isso, basta informar o respectivo c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do cart\u00C3\u00A3o (id) que deseja ter seu um determinado id_status_impressao atribu\u00C3\u00ADdo a ele. Por padr\u00C3\u00A3o, cart\u00C3\u00B5es provis\u00C3\u00B3rios ou que j\u00C3\u00A1 tenham sido inclu\u00C3\u00ADdos em um arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica ter\u00C3\u00A3o esta requisi\u00C3\u00A7\u00C3\u00A3o negada, se utilizada.
   * @param idCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param idStatusImpressao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status Impress\u00C3\u00A3o (Id).
   * @return HistoricoImpressaoCartao
   */
  public HistoricoImpressaoCartao  alterarStatusImpressaoUsingPUT (Long idCartao, Long idStatusImpressao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling alterarStatusImpressaoUsingPUT");
    }
    
    // verify the required parameter 'idStatusImpressao' is set
    if (idStatusImpressao == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatusImpressao' when calling alterarStatusImpressaoUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id_cartao}/impressao/{id_status_impressao} ".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_cartao" + "\\}", apiInvoker.escapeString(idCartao.toString())).replaceAll("\\{" + "id_status_impressao" + "\\}", apiInvoker.escapeString(idStatusImpressao.toString()));

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
        return (HistoricoImpressaoCartao) ApiInvoker.deserialize(response, "", HistoricoImpressaoCartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza a atribui\u00C3\u00A7\u00C3\u00A3o de um cart\u00C3\u00A3o pr\u00C3\u00A9-pago a uma pessoa.
   * Esta m\u00C3\u00A9todo tem como permite que um cart\u00C3\u00A3o de cr\u00C3\u00A9dito impresso de forma avulsa e an\u00C3\u00B4nimo seja atribu\u00C3\u00ADdo a uma pessoa para que esta passe a ser a portadora titular deste cart\u00C3\u00A3o.
   * @param idCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id)
   * @param idPessoa C\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o de uma Pessoa (id).
   * @return Cartao
   */
  public Cartao  atribuirPessoaUsingPUT (Long idCartao, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling atribuirPessoaUsingPUT");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling atribuirPessoaUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id_cartao}/atribuir-pessoa".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_cartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_pessoa", idPessoa));
    

    

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
        return (Cartao) ApiInvoker.deserialize(response, "", Cartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o bloqueio de um determinado Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite a realiza\u00C3\u00A7\u00C3\u00A3o do bloqueio (tempor\u00C3\u00A1rio) ou do cancelamento (definitivo) de um determinado cart\u00C3\u00A3o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id). Para isso, \u00C3\u00A9 preciso informar qual o motivo deste bloqueio que nada mais \u00C3\u00A9 do que atribuir um novo StatusCartao para ele dentre as op\u00C3\u00A7\u00C3\u00B5es praticadas pelo emissor.
   * @param idCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param idStatus C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Novo Status Cart\u00C3\u00A3o.
   * @param observacao Texto informando uma observa\u00C3\u00A7\u00C3\u00A3o sobre o bloqueio.
   * @return Cartao
   */
  public Cartao  bloquearUsingPUT (Long idCartao, Long idStatus, String observacao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling bloquearUsingPUT");
    }
    
    // verify the required parameter 'idStatus' is set
    if (idStatus == null) {
       throw new ApiException(400, "Missing the required parameter 'idStatus' when calling bloquearUsingPUT");
    }
    
    // verify the required parameter 'observacao' is set
    if (observacao == null) {
       throw new ApiException(400, "Missing the required parameter 'observacao' when calling bloquearUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id_cartao}/bloqueio".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_cartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_status", idStatus));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "observacao", observacao));
    

    

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
        return (Cartao) ApiInvoker.deserialize(response, "", Cartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o cadastro ou altera\u00C3\u00A7\u00C3\u00A3o da senha de um Cart\u00C3\u00A3o
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que o portador de um determinado cart\u00C3\u00A3o possa definir uma senha a sua escolha.
   * @param idCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param senha Senha para ser cadastrada ou alterada.
   * @return String
   */
  public String  cadastrarAlterarSenhaUsingPUT (Long idCartao, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling cadastrarAlterarSenhaUsingPUT");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling cadastrarAlterarSenhaUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id_cartao}/alterar-senha".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_cartao", idCartao));
    

    
    headerParams.put("senha", ApiInvoker.parameterToString(senha));
    

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os limites do Portador do Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite consultar os Limites configurados para o Portador de um determinado Cart\u00C3\u00A3o, seja ele o titular da conta ou um adicional, a partir do c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param idCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @return LimiteDisponibilidade
   */
  public LimiteDisponibilidade  consultarLimiteDisponibilidadeUsingGET (Long idCartao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarLimiteDisponibilidadeUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id_cartao}/limites-disponibilidades".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_cartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

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
        return (LimiteDisponibilidade) ApiInvoker.deserialize(response, "", LimiteDisponibilidade.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados do Portador do Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite consultar as informa\u00C3\u00A7\u00C3\u00B5es do Portador de um determinado Cart\u00C3\u00A3o a partir do c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param idCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @return Portador
   */
  public Portador  consultarPortadorUsingGET (Long idCartao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarPortadorUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id_cartao}/portadores".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_cartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

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
        return (Portador) ApiInvoker.deserialize(response, "", Portador.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Apresenta os dados de um determinado Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite consultar as informa\u00C3\u00A7\u00C3\u00B5es b\u00C3\u00A1sicas de um determinado Cart\u00C3\u00A3o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param idCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @return Cartao
   */
  public Cartao  consultarUsingGET (Long idCartao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling consultarUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id_cartao}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_cartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

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
        return (Cartao) ApiInvoker.deserialize(response, "", Cartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Realiza o desbloqueio de um determinado Cart\u00C3\u00A3o
   * Este m\u00C3\u00A9todo permite que seja desbloqueado um determinado cart\u00C3\u00A3o a partir do seu c\u00C3\u00B3digo de identifica\u00C3\u00A7\u00C3\u00A3o (id).
   * @param idCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @return Cartao
   */
  public Cartao  desbloquearUsingPUT (Long idCartao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling desbloquearUsingPUT");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id_cartao}/desbloqueio".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id_cartao" + "\\}", apiInvoker.escapeString(idCartao.toString()));

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
        return (Cartao) ApiInvoker.deserialize(response, "", Cartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Lista os Cart\u00C3\u00B5es gerados pelo Emissor
   * Este m\u00C3\u00A9todo permite que sejam listados os cart\u00C3\u00B5es existentes na base do emissor.
   * @param id C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param idStatusCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Status do Cart\u00C3\u00A3o (id).
   * @param idEstagioCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Est\u00C3\u00A1gio de Impress\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param idConta C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Conta a qual o cart\u00C3\u00A3o pertence (id).
   * @param idPessoa C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o da Pessoa a qual o cart\u00C3\u00A3o pertence (id)
   * @param idProduto C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Produto a qual o cart\u00C3\u00A3o pertence (id).
   * @param tipoPortador Apresenta o tipo do Portador do cart\u00C3\u00A3o, sendo: (&#39;T&#39;: Titular, &#39;A&#39;: Adicional).
   * @param numeroCartao Apresenta o n\u00C3\u00BAmero do cart\u00C3\u00A3o.
   * @param nomeImpresso Apresenta o nome impresso no cart\u00C3\u00A3o.
   * @param dataGeracao Apresenta a data em que o cart\u00C3\u00A3o foi gerado.
   * @param dataStatusCartao Apresenta a data em que o idStatusCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   * @param dataEstagioCartao Apresenta a data em que o idEstagioCartao atual do cart\u00C3\u00A3o fora aplicado, quando houver.
   * @param dataValidade Apresenta a data de validade do cart\u00C3\u00A3o em formato yyyy-MM, quando houver.
   * @param dataImpressao Apresenta a data em que o cart\u00C3\u00A3o fora impresso, caso impress\u00C3\u00A3o em loja, ou a data em que ele fora inclu\u00C3\u00ADdo no arquivo para impress\u00C3\u00A3o via gr\u00C3\u00A1fica.
   * @param arquivoImpressao Apresenta o nome do arquivo onde o cart\u00C3\u00A3o fora inclu\u00C3\u00ADdo para impress\u00C3\u00A3o por uma gr\u00C3\u00A1fica, quando houver.
   * @param flagImpressaoOrigemComercial Quando ativa, indica que o cart\u00C3\u00A3o fora impresso na Origem Comercial.
   * @param flagProvisorio Quando ativa, indica que o cart\u00C3\u00A3o \u00C3\u00A9 provis\u00C3\u00B3rio. Ou seja, \u00C3\u00A9 um cart\u00C3\u00A3o para uso tempor\u00C3\u00A1rio quando se deseja permitir que o cliente transacione sem que ele tenha recebido um cart\u00C3\u00A3o definitivo.
   * @param codigoDesbloqueio Apresenta um c\u00C3\u00B3digo espec\u00C3\u00ADfico para ser utilizado como vari\u00C3\u00A1vel no processo de desbloqueio do cart\u00C3\u00A3o para emissores que querem usar esta funcionalidade.
   * @param page P\u00C3\u00A1gina solicitada (Default = 0)
   * @param limit Limite de elementos por solicita\u00C3\u00A7\u00C3\u00A3o (Default = 100, Max = 100)
   * @return PageCartoes
   */
  public PageCartoes  listarUsingGET (Long id, Long idStatusCartao, Long idEstagioCartao, Long idConta, Long idPessoa, Long idProduto, String tipoPortador, String numeroCartao, String nomeImpresso, Date dataGeracao, Date dataStatusCartao, Date dataEstagioCartao, String dataValidade, Date dataImpressao, String arquivoImpressao, Integer flagImpressaoOrigemComercial, Integer flagProvisorio, String codigoDesbloqueio, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/cartoes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idStatusCartao", idStatusCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstagioCartao", idEstagioCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idConta", idConta));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProduto", idProduto));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipoPortador", tipoPortador));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeImpresso", nomeImpresso));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataGeracao", dataGeracao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataStatusCartao", dataStatusCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEstagioCartao", dataEstagioCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataValidade", dataValidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataImpressao", dataImpressao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "arquivoImpressao", arquivoImpressao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagImpressaoOrigemComercial", flagImpressaoOrigemComercial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "flagProvisorio", flagProvisorio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoDesbloqueio", codigoDesbloqueio));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    

    

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
        return (PageCartoes) ApiInvoker.deserialize(response, "", PageCartoes.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite validar um Cart\u00C3\u00A3o Mastercard a partir do chip
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que os Emissores validem o criptograma gerado a partir da leitura de um chip EMV de um Cart\u00C3\u00A3o Mastercard a fim de verificar a sua autenticidade.
   * @param numeroCartao N\u00C3\u00BAmero do cart\u00C3\u00A3o a ser validado.
   * @param criptograma Criptograma do cart\u00C3\u00A3o no formato de55
   * @return ValidaCartao
   */
  public ValidaCartao  validarCartaoChipBandeiradoUsingGET (String numeroCartao, String criptograma) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarCartaoChipBandeiradoUsingGET");
    }
    
    // verify the required parameter 'criptograma' is set
    if (criptograma == null) {
       throw new ApiException(400, "Missing the required parameter 'criptograma' when calling validarCartaoChipBandeiradoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/bandeirados/validar/chip".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "criptograma", criptograma));
    

    

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
        return (ValidaCartao) ApiInvoker.deserialize(response, "", ValidaCartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite validar um Cart\u00C3\u00A3o bandeirado a partir dos dados Impressos
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cart\u00C3\u00A3o a partir do envio dos dados sens\u00C3\u00ADveis impressos nele.
   * @param numeroCartao N\u00C3\u00BAmero do cart\u00C3\u00A3o a ser validado.
   * @param nomePortador Nome do portador do cart\u00C3\u00A3o
   * @param dataValidade Data de validade do cart\u00C3\u00A3o no formato yyyy-MM
   * @param codigoSeguranca C\u00C3\u00B3digo de seguran\u00C3\u00A7a do cart\u00C3\u00A3o com tr\u00C3\u00AAs n\u00C3\u00BAmeros
   * @return ValidaCartao
   */
  public ValidaCartao  validarCartaoDigitadoBandeiradoUsingGET (String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarCartaoDigitadoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'nomePortador' is set
    if (nomePortador == null) {
       throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarCartaoDigitadoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'dataValidade' is set
    if (dataValidade == null) {
       throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarCartaoDigitadoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'codigoSeguranca' is set
    if (codigoSeguranca == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarCartaoDigitadoBandeiradoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/bandeirados/validar/digitado".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomePortador", nomePortador));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataValidade", dataValidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoSeguranca", codigoSeguranca));
    

    

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
        return (ValidaCartao) ApiInvoker.deserialize(response, "", ValidaCartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite validar um Cart\u00C3\u00A3o a partir dos dados Impressos
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cart\u00C3\u00A3o a partir do envio dos dados sens\u00C3\u00ADveis impressos nele.
   * @param numeroCartao N\u00C3\u00BAmero do cart\u00C3\u00A3o a ser validado.
   * @param nomePortador Nome do portador do cart\u00C3\u00A3o
   * @param dataValidade Data de validade do cart\u00C3\u00A3o no formato yyyy-MM
   * @param codigoSeguranca C\u00C3\u00B3digo de seguran\u00C3\u00A7a do cart\u00C3\u00A3o com tr\u00C3\u00AAs n\u00C3\u00BAmeros
   * @return ValidaCartao
   */
  public ValidaCartao  validarCartaoDigitadoNaoBandeiradoUsingGET (String numeroCartao, String nomePortador, String dataValidade, String codigoSeguranca) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarCartaoDigitadoNaoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'nomePortador' is set
    if (nomePortador == null) {
       throw new ApiException(400, "Missing the required parameter 'nomePortador' when calling validarCartaoDigitadoNaoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'dataValidade' is set
    if (dataValidade == null) {
       throw new ApiException(400, "Missing the required parameter 'dataValidade' when calling validarCartaoDigitadoNaoBandeiradoUsingGET");
    }
    
    // verify the required parameter 'codigoSeguranca' is set
    if (codigoSeguranca == null) {
       throw new ApiException(400, "Missing the required parameter 'codigoSeguranca' when calling validarCartaoDigitadoNaoBandeiradoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/nao-bandeirados/validar/digitado".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomePortador", nomePortador));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataValidade", dataValidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "codigoSeguranca", codigoSeguranca));
    

    

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
        return (ValidaCartao) ApiInvoker.deserialize(response, "", ValidaCartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite validar um Cart\u00C3\u00A3o Bandeirado a partir da Tarja
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir que os Emissores validem a autenticidade de um determinado Cart\u00C3\u00A3o a partir da leitura da tarja magn\u00C3\u00A9tica do mesmo.
   * @param numeroCartao N\u00C3\u00BAmero do cart\u00C3\u00A3o a ser validado.
   * @param trilha1 Trilha 1 do cart\u00C3\u00A3o a ser validado
   * @param trilha2 Trilha 2 do cart\u00C3\u00A3o a ser validado
   * @return ValidaCartao
   */
  public ValidaCartao  validarCartaoTarjaBandeiradoUsingGET (String numeroCartao, String trilha1, String trilha2) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroCartao' is set
    if (numeroCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroCartao' when calling validarCartaoTarjaBandeiradoUsingGET");
    }
    
    // verify the required parameter 'trilha1' is set
    if (trilha1 == null) {
       throw new ApiException(400, "Missing the required parameter 'trilha1' when calling validarCartaoTarjaBandeiradoUsingGET");
    }
    
    // verify the required parameter 'trilha2' is set
    if (trilha2 == null) {
       throw new ApiException(400, "Missing the required parameter 'trilha2' when calling validarCartaoTarjaBandeiradoUsingGET");
    }
    

    // create path and map variables
    String path = "/api/cartoes/bandeirados/validar/tarja".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroCartao", numeroCartao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "trilha1", trilha1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "trilha2", trilha2));
    

    

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
        return (ValidaCartao) ApiInvoker.deserialize(response, "", ValidaCartao.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Permite validar a senha de um Cart\u00C3\u00A3o
   * Esta opera\u00C3\u00A7\u00C3\u00A3o tem como objetivo permitir validar que a senha informada pelo portador de um determinado cart\u00C3\u00A3o est\u00C3\u00A1 correta.
   * @param idCartao C\u00C3\u00B3digo de Identifica\u00C3\u00A7\u00C3\u00A3o do Cart\u00C3\u00A3o (id).
   * @param senha Senha para ser validada.
   * @return String
   */
  public String  validarSenhaUsingPOST (Long idCartao, String senha) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idCartao' is set
    if (idCartao == null) {
       throw new ApiException(400, "Missing the required parameter 'idCartao' when calling validarSenhaUsingPOST");
    }
    
    // verify the required parameter 'senha' is set
    if (senha == null) {
       throw new ApiException(400, "Missing the required parameter 'senha' when calling validarSenhaUsingPOST");
    }
    

    // create path and map variables
    String path = "/api/cartoes/{id_cartao}/validar-senha".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id_cartao", idCartao));
    

    
    headerParams.put("senha", ApiInvoker.parameterToString(senha));
    

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
        return (String) ApiInvoker.deserialize(response, "", String.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}

