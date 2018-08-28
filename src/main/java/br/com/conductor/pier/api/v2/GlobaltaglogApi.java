package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.LogAcessoUsuarioPersistencia;
import br.com.conductor.pier.api.v2.model.LogAcessoUsuarioResposta;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class GlobaltaglogApi {
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
   * {{{log_acesso_usuario_recurso_salvar}}}
   * {{{log_acesso_usuario_recurso_salvar_notas}}}
   * @param logAcessoUsuarioPersist logAcessoUsuarioPersist
   * @return LogAcessoUsuarioResposta
   */
  public LogAcessoUsuarioResposta  salvarUsingPOST19 (LogAcessoUsuarioPersistencia logAcessoUsuarioPersist) throws ApiException {
    Object postBody = logAcessoUsuarioPersist;
    
    // verify the required parameter 'logAcessoUsuarioPersist' is set
    if (logAcessoUsuarioPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'logAcessoUsuarioPersist' when calling salvarUsingPOST19");
    }
    

    // create path and map variables
    String path = "/api/logs/log-acessos-usuario".replaceAll("\\{format\\}","json");

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
        return (LogAcessoUsuarioResposta) ApiInvoker.deserialize(response, "", LogAcessoUsuarioResposta.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
