package br.com.conductor.pier.api.v2;

import br.com.conductor.pier.api.v2.invoker.ApiException;
import br.com.conductor.pier.api.v2.invoker.ApiInvoker;
import br.com.conductor.pier.api.v2.invoker.Pair;

import br.com.conductor.pier.api.v2.model.*;

import java.util.*;

import br.com.conductor.pier.api.v2.model.AdicionalDetalheResponse;
import br.com.conductor.pier.api.v2.model.AdicionalUpdate;
import br.com.conductor.pier.api.v2.model.EnderecoResponse;
import br.com.conductor.pier.api.v2.model.PessoaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PessoaResponse;
import br.com.conductor.pier.api.v2.model.TelefoneResponse;
import br.com.conductor.pier.api.v2.model.AtribuirAssinaturaClientePersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorPersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorResponse;
import br.com.conductor.pier.api.v2.model.CelularRecargaProgramadaPersist;
import br.com.conductor.pier.api.v2.model.CelularRecargaProgramadaResponse;
import br.com.conductor.pier.api.v2.model.AdicionalContaPersist;
import br.com.conductor.pier.api.v2.model.AdicionalContaResponse;
import br.com.conductor.pier.api.v2.model.AdicionalPersist;
import br.com.conductor.pier.api.v2.model.AdicionalResponse;
import br.com.conductor.pier.api.v2.model.PageContaDetalheResponse;
import br.com.conductor.pier.api.v2.model.HistoricoTelefoneResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaResponse;
import br.com.conductor.pier.api.v2.model.PageEnderecoResponse;
import br.com.conductor.pier.api.v2.model.PagePessoaDetalheResponse;
import br.com.conductor.pier.api.v2.model.PageTelefoneResponse;
import br.com.conductor.pier.api.v2.model.ObjectApprovedIndividual;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaAprovadaResponse;
import br.com.conductor.pier.api.v2.model.PessoaJuridicaAprovadaPersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorPropostaPersist;
import br.com.conductor.pier.api.v2.model.IntegracaoEmissorPropostaResponse;

import org.apache.http.HttpEntity;
import org.apache.http.entity.mime.MultipartEntityBuilder;

import java.util.Map;
import java.util.HashMap;
import java.io.File;

public class RegisterClientApi {
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
   * Update Aditional of an Account
   * This method allows to be updated an additional carrier of a determined account
   * @param id Identification Code of the Account (id)
   * @param idPessoa Identification code of the Person (id)
   * @param adicionalUpdate adicionalUpdate
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse  alterar (Long id, Long idPessoa, AdicionalUpdate adicionalUpdate) throws ApiException {
    Object postBody = adicionalUpdate;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterar");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling alterar");
    }
    
    // verify the required parameter 'adicionalUpdate' is set
    if (adicionalUpdate == null) {
       throw new ApiException(400, "Missing the required parameter 'adicionalUpdate' when calling alterar");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adicionais/{idPessoa}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idPessoa" + "\\}", apiInvoker.escapeString(idPessoa.toString()));

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
        return (AdicionalDetalheResponse) ApiInvoker.deserialize(response, "", AdicionalDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update the dates of a determined Address
   * This resource allows to be updated in the base of the Issuer one or more registers linked to a dtermined Address
   * @param id id
   * @param idPessoa Identification Code of the Person which the address belongs (id)
   * @param idTipoEndereco Identification Code of the Address Type (id)
   * @param cep CEP
   * @param logradouro Show the Street name
   * @param numero Show the number of the address
   * @param complemento Show complementary descriptions referring to the address
   * @param pontoReferencia Show the description of the address landmark
   * @param bairro Show the name of the neighborhood
   * @param cidade Show the name of the city
   * @param uf Show Federal Unity Acronym
   * @param pais Show the name of the Country
   * @param tempoResidenciaAnos Displays the number of years spent living in the residence
   * @param tempoResidenciaMeses Displays the number of months spent living in the residence
   * @param aplicativoAlteracao Displays the responsible application for the address change
   * @return EnderecoResponse
   */
  public EnderecoResponse  alterar_1 (Long id, Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais, Integer tempoResidenciaAnos, Integer tempoResidenciaMeses, String aplicativoAlteracao) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterar_1");
    }
    

    // create path and map variables
    String path = "/api/enderecos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoEndereco", idTipoEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "logradouro", logradouro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero", numero));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pontoReferencia", pontoReferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaAnos", tempoResidenciaAnos));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaMeses", tempoResidenciaMeses));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "aplicativoAlteracao", aplicativoAlteracao));
    

    

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
        return (EnderecoResponse) ApiInvoker.deserialize(response, "", EnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update the details of a determined Person
   * This method allows to be altered in the base of issuer the details of a determined Person
   * @param id ID of the Person
   * @param nomeMae Show the mothe name of the physical person
   * @param idEstadoCivil Id Marital Status of the physical person
   * @param idProfissao Occupation of the physical Person
   * @param idNaturezaOcupacao Id Nature Occupation of the physical person
   * @param idNacionalidade Id Nationality of the physical person
   * @param numeroBanco Number of the account
   * @param numeroAgencia Numbe of the angency
   * @param numeroContaCorrente Current Account Number
   * @param email Email of the physical person
   * @param nomeEmpresa Name that should be printed on the card
   * @param nomeReferencia1 Name Reference 1
   * @param enderecoReferencia1 Reference Address 1
   * @param nomeReferencia2 Name Reference 2
   * @param enderecoReferencia2 Reference Address 2
   * @param impedidoFinanciamento Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) 
   * @param naturalidadeCidade Displays the name of the birth city of the individual
   * @param naturalidadeEstado Presents the acronym of the person&#39;s state of birth
   * @param grauInstrucao It shows the degree of instruction of the individual
   * @param numeroDependentes Displays the number of dependents of the individual
   * @param nomePai Displays the name of the parent of the individual
   * @param chequeEspecial Indicates whether individual person joins the overdraft
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse  alterar_2 (Long id, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa, String nomeReferencia1, String enderecoReferencia1, String nomeReferencia2, String enderecoReferencia2, Boolean impedidoFinanciamento, String naturalidadeCidade, String naturalidadeEstado, Integer grauInstrucao, Integer numeroDependentes, String nomePai, Integer chequeEspecial) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterar_2");
    }
    

    // create path and map variables
    String path = "/api/pessoas-detalhes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeMae", nomeMae));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstadoCivil", idEstadoCivil));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProfissao", idProfissao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroBanco", numeroBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeReferencia1", nomeReferencia1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "enderecoReferencia1", enderecoReferencia1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeReferencia2", nomeReferencia2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "enderecoReferencia2", enderecoReferencia2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "impedidoFinanciamento", impedidoFinanciamento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeCidade", naturalidadeCidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeEstado", naturalidadeEstado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "grauInstrucao", grauInstrucao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroDependentes", numeroDependentes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomePai", nomePai));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "chequeEspecial", chequeEspecial));
    

    

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
        return (PessoaDetalheResponse) ApiInvoker.deserialize(response, "", PessoaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * update the dates of a determined Person
   * This method allows to be updated in the base of the issuer a register of a determined Person
   * @param id ID of the person
   * @param nome Full Name of the PF or Full Name of Corporate Name (Company Name)
   * @param tipo Kind of Person (PF or PJ)
   * @param dataNascimento Birth date of the persosn, when PP, or the date of the business opening, when it is LP. This date must be informed in the format yyyy-MM-dd
   * @param cpf CPF number, when it is PF
   * @param cnpj CNPJ number, when it is PJ
   * @param sexo Person Gender
   * @param numeroIdentidade Identity Number
   * @param orgaoExpedidorIdentidade Issue organ of the ID
   * @param unidadeFederativaIdentidade Acronym of the Federal Unity where it was issued the Identity
   * @param dataEmissaoIdentidade Issue date of the Identity
   * @return PessoaResponse
   */
  public PessoaResponse  alterar_3 (Long id, String nome, String tipo, String dataNascimento, String cpf, String cnpj, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterar_3");
    }
    
    // verify the required parameter 'nome' is set
    if (nome == null) {
       throw new ApiException(400, "Missing the required parameter 'nome' when calling alterar_3");
    }
    
    // verify the required parameter 'tipo' is set
    if (tipo == null) {
       throw new ApiException(400, "Missing the required parameter 'tipo' when calling alterar_3");
    }
    
    // verify the required parameter 'dataNascimento' is set
    if (dataNascimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataNascimento' when calling alterar_3");
    }
    

    // create path and map variables
    String path = "/api/pessoas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataNascimento", dataNascimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sexo", sexo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroIdentidade", numeroIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "orgaoExpedidorIdentidade", orgaoExpedidorIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "unidadeFederativaIdentidade", unidadeFederativaIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEmissaoIdentidade", dataEmissaoIdentidade));
    

    

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
        return (PessoaResponse) ApiInvoker.deserialize(response, "", PessoaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Update a determined Telephone
   * This method allows to be updated a determined Telephone in the database of the issuer
   * @param id Identification code of the telephone (id)
   * @param idTipoTelefone Identification Code of the Telephone Type (id)
   * @param ddd Phone DDD
   * @param telefone Phone Number
   * @param ramal Phone branch
   * @return TelefoneResponse
   */
  public TelefoneResponse  alterar_4 (Long id, Long idTipoTelefone, String ddd, String telefone, String ramal) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling alterar_4");
    }
    

    // create path and map variables
    String path = "/api/telefones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "id", id));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoTelefone", idTipoTelefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ddd", ddd));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "telefone", telefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ramal", ramal));
    

    

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
        return (TelefoneResponse) ApiInvoker.deserialize(response, "", TelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Allow to attribute a document to an Account
   * this method allows to be attributed to a determined account a document that is storaged on the PIER Cloud, informing what is the type of the document and its respective Id
   * @param id Identification Code of the Account
   * @param body Identification Code of the File
   * @return Object
   */
  public Object  atribuirAssinaturaCliente (Long id, AtribuirAssinaturaClientePersist body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atribuirAssinaturaCliente");
    }
    
    // verify the required parameter 'body' is set
    if (body == null) {
       throw new ApiException(400, "Missing the required parameter 'body' when calling atribuirAssinaturaCliente");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/atribuir-assinatura-cliente".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
   * Update integrated account with the Issuer
   * This resource allows to update an integrated account with the issuer
   * @param id Identification Code of the Account (id)
   * @param body Description of the input channel
   * @return IntegracaoEmissorResponse
   */
  public IntegracaoEmissorResponse  atualizar (Long id, IntegracaoEmissorPersist body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizar");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/atualizar-registro-integracao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (IntegracaoEmissorResponse) ApiInvoker.deserialize(response, "", IntegracaoEmissorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Updates the mailing address to the typed address
   * This method allows the mailing address of a given account to be updated to the mailing address informed
   * @param id Identification Code of the Address (id)
   * @param idConta Identification Code of the Count
   * @return EnderecoResponse
   */
  public EnderecoResponse  atualizarEnderecoDeCorrespondencia (Long id, Long idConta) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling atualizarEnderecoDeCorrespondencia");
    }
    
    // verify the required parameter 'idConta' is set
    if (idConta == null) {
       throw new ApiException(400, "Missing the required parameter 'idConta' when calling atualizarEnderecoDeCorrespondencia");
    }
    

    // create path and map variables
    String path = "/api/enderecos/{id}/alterar-endereco-correspondencia".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
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
      String response = apiInvoker.invokeAPI(basePath, path, "PUT", queryParams, postBody, headerParams, formParams, contentType);
      if(response != null){
        return (EnderecoResponse) ApiInvoker.deserialize(response, "", EnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Scheduled recharge registration
   * This feature allows you to register a new programmed recharge at the sender base
   * @param persistencia persistencia
   * @return CelularRecargaProgramadaResponse
   */
  public CelularRecargaProgramadaResponse  cadastrar (CelularRecargaProgramadaPersist persistencia) throws ApiException {
    Object postBody = persistencia;
    
    // verify the required parameter 'persistencia' is set
    if (persistencia == null) {
       throw new ApiException(400, "Missing the required parameter 'persistencia' when calling cadastrar");
    }
    

    // create path and map variables
    String path = "/api/celulares/recargas-programadas".replaceAll("\\{format\\}","json");

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
        return (CelularRecargaProgramadaResponse) ApiInvoker.deserialize(response, "", CelularRecargaProgramadaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Make the Add-ons for an Account
   * This method allows an existing person in the base to be an additional account in the informed
   * @param id Code of identification of the account (id)
   * @param adicionalContaPersist adicionalContaPersist
   * @return AdicionalContaResponse
   */
  public AdicionalContaResponse  cadastrarAdicional (Long id, AdicionalContaPersist adicionalContaPersist) throws ApiException {
    Object postBody = adicionalContaPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrarAdicional");
    }
    
    // verify the required parameter 'adicionalContaPersist' is set
    if (adicionalContaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'adicionalContaPersist' when calling cadastrarAdicional");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adicionais".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AdicionalContaResponse) ApiInvoker.deserialize(response, "", AdicionalContaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create the Register of Additional for an Account
   * This method allows to be created an additional carrier for a determined account
   * @param id Identification Code of the Account (id)
   * @param persist persist
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse  cadastrar_5 (Long id, AdicionalPersist persist) throws ApiException {
    Object postBody = persist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling cadastrar_5");
    }
    
    // verify the required parameter 'persist' is set
    if (persist == null) {
       throw new ApiException(400, "Missing the required parameter 'persist' when calling cadastrar_5");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/cadastrar-adicional".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (AdicionalDetalheResponse) ApiInvoker.deserialize(response, "", AdicionalDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Creating additional account
   * This method allows to be  consulted an additional carrier of a determined account
   * @param id Identification code of the Account (id)
   * @param idPessoa Identification Code of the Person (id)
   * @return AdicionalDetalheResponse
   */
  public AdicionalDetalheResponse  consultar (Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling consultar");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adicionais/{idPessoa}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idPessoa" + "\\}", apiInvoker.escapeString(idPessoa.toString()));

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
        return (AdicionalDetalheResponse) ApiInvoker.deserialize(response, "", AdicionalDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Show the dates of a determined Address
   * This resource allows to retrieve a determined address using the id code (id)
   * @param id Identification Code of the Address (id)
   * @return EnderecoResponse
   */
  public EnderecoResponse  consultar_6 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_6");
    }
    

    // create path and map variables
    String path = "/api/enderecos/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (EnderecoResponse) ApiInvoker.deserialize(response, "", EnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the details of a determined person
   * This method allows to retrieve the details of a Person existent in the database of the issuer
   * @param id ID of the Person
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse  consultar_7 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_7");
    }
    

    // create path and map variables
    String path = "/api/pessoas-detalhes/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PessoaDetalheResponse) ApiInvoker.deserialize(response, "", PessoaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the dates of a determined Person
   * This method allows to be listed the People existent in the database of the issuer
   * @param id ID of the Person
   * @return PessoaResponse
   */
  public PessoaResponse  consultar_8 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_8");
    }
    

    // create path and map variables
    String path = "/api/pessoas/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (PessoaResponse) ApiInvoker.deserialize(response, "", PessoaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the dates of a determined Telephone
   * This method allows to retrieve a determined telephone using its identification code (id)
   * @param id Identification Code of the Telephone (id)
   * @return TelefoneResponse
   */
  public TelefoneResponse  consultar_9 (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling consultar_9");
    }
    

    // create path and map variables
    String path = "/api/telefones/{id}".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (TelefoneResponse) ApiInvoker.deserialize(response, "", TelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Inactive Additional of an Account
   * This method allows tobe inactived an additional carrier of a determined account
   * @param id Identification code of the account (id)
   * @param idPessoa Identification Code of the Person (id)
   * @return String
   */
  public String  inativar (Long id, Long idPessoa) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling inativar");
    }
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling inativar");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adicionais/{idPessoa}/inativar".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString())).replaceAll("\\{" + "idPessoa" + "\\}", apiInvoker.escapeString(idPessoa.toString()));

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
   * List the additionals of an account
   * This method allows to be listed additional carriers of a determined account
   * @param id Identification Code of the account (id)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return AdicionalResponse
   */
  public AdicionalResponse  listar (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listar");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/adicionais".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
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
        return (AdicionalResponse) ApiInvoker.deserialize(response, "", AdicionalResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the account of the person
   * Allow to list the accounts of a person using the number at the IRs
   * @param numeroReceitaFederal Identification Number of the client in the IRs (CPF or CNPJ)
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PageContaDetalheResponse
   */
  public PageContaDetalheResponse  listarContasPorPessoa (String numeroReceitaFederal, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'numeroReceitaFederal' is set
    if (numeroReceitaFederal == null) {
       throw new ApiException(400, "Missing the required parameter 'numeroReceitaFederal' when calling listarContasPorPessoa");
    }
    

    // create path and map variables
    String path = "/api/pessoas/listar-contas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroReceitaFederal", numeroReceitaFederal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
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
        return (PageContaDetalheResponse) ApiInvoker.deserialize(response, "", PageContaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the updates of telephones made in the last 60 days
   * This method allows to verify what the telephones of a determined client were updated in the last 60 days
   * @param id Identification Code of the person (id)
   * @return HistoricoTelefoneResponse
   */
  public HistoricoTelefoneResponse  listarHistoricoTelefones (Long id) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarHistoricoTelefones");
    }
    

    // create path and map variables
    String path = "/api/pessoas/{id}/historico-telefones".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (HistoricoTelefoneResponse) ApiInvoker.deserialize(response, "", HistoricoTelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List partners of a legal entity
   * Lista the partners linked to a legal entity registered
   * @param id Identification code of the Legal Person
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @return PagePessoaResponse
   */
  public PagePessoaResponse  listarSocios (Long id, List<String> sort, Integer page, Integer limit) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling listarSocios");
    }
    

    // create path and map variables
    String path = "/api/clientes-pessoas-juridicas/{id}/socios".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
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
        return (PagePessoaResponse) ApiInvoker.deserialize(response, "", PagePessoaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the addresses created by the Issuer
   * This resource allows to be listed the addresses in the datababse of the Issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification Code of the Address (id)
   * @param idPessoa Identification Code of the Person which the address belongs (id)
   * @param idTipoEndereco Identification Code of the Type of Address (id)
   * @param cep List the ZIP Code of the Address (CEP)
   * @param logradouro List the name of the Street
   * @param numero List the number of address
   * @param complemento List complementary descriptions refering to the Address
   * @param pontoReferencia List the description of the reference of the address
   * @param bairro List the name of the neighborhood
   * @param cidade List the name of the city
   * @param uf List the acronym of the Federal Unity
   * @param pais List the name of the Country
   * @param dataInclusao List the date that the address was registered
   * @param dataUltimaAtualizacao Date when was made the last update in this register of the address. When it didn&#39;t occur any update, it will have the same information as the field dateInclusion
   * @param tempoResidenciaAnos Displays the number of years spent living in the residence
   * @param tempoResidenciaMeses Displays the number of months spent living in the residence
   * @return PageEnderecoResponse
   */
  public PageEnderecoResponse  listar_10 (List<String> sort, Integer page, Integer limit, Long id, Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais, String dataInclusao, String dataUltimaAtualizacao, Integer tempoResidenciaAnos, Integer tempoResidenciaMeses) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/enderecos".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoEndereco", idTipoEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "logradouro", logradouro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero", numero));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pontoReferencia", pontoReferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataInclusao", dataInclusao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataUltimaAtualizacao", dataUltimaAtualizacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaAnos", tempoResidenciaAnos));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaMeses", tempoResidenciaMeses));
    

    

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
        return (PageEnderecoResponse) ApiInvoker.deserialize(response, "", PageEnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the People registered in the Issuer
   * This method allows to be listed the People existent in the database of issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification Code of the Person (id)
   * @param nome Shows the &#39;Full name of the PP&#39; or the &#39;Full name of the Social Reason (Business Name)&#39;
   * @param tipo Identification Code of the Physical Person, being: (&#39;PP&#39;: Physical Person), (&#39;LP&#39;: Legal Person)
   * @param cpf Number of CPF, whe it is PP
   * @param cnpj Number of CNPJ, when it is LP
   * @param dataNascimento Born date of the Person, when it is PP, or date of the Business Opening, when it is Legal Person
   * @param sexo Identification Code of sex of the Person, When it is PP, being: (&#39;M&#39;: Male), (&#39;F&#39;: Female), (&#39;O&#39;: Other), (&#39;N&#39;: Not specifie)
   * @param numeroIdentidade Number of Identity Document
   * @param orgaoExpedidorIdentidade Organ issuer of the ID card
   * @param unidadeFederativaIdentidade Acronym of Federal Unity where was issued the Document
   * @param dataEmissaoIdentidade Date of issue of the identity document in format yyyy-MM-dd
   * @return PagePessoaResponse
   */
  public PagePessoaResponse  listar_11 (List<String> sort, Integer page, Integer limit, Long id, String nome, String tipo, String cpf, String cnpj, String dataNascimento, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/pessoas".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataNascimento", dataNascimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sexo", sexo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroIdentidade", numeroIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "orgaoExpedidorIdentidade", orgaoExpedidorIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "unidadeFederativaIdentidade", unidadeFederativaIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEmissaoIdentidade", dataEmissaoIdentidade));
    

    

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
        return (PagePessoaResponse) ApiInvoker.deserialize(response, "", PagePessoaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the details of the people registered in the issuer
   * This method allows to be listed the details of the people existent in the database of the issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param idPessoa Identifier Code of the person
   * @param nomeMae Shows the name of the mother physical person
   * @param idEstadoCivil Id Marital Status of the Physical person
   * @param idProfissao Occupation of the physical person
   * @param idNaturezaOcupacao Id Occupation of the physical person
   * @param idNacionalidade Id Nationallity of the physical person
   * @param numeroBanco Number of the Bank
   * @param numeroAgencia Number of the Agency
   * @param numeroContaCorrente Number of the current account
   * @param email Email of the physical person
   * @param nomeEmpresa Name that may be printed on the card
   * @param naturalidadeCidade Displays the name of the birth city of the individual
   * @param naturalidadeEstado Presents the acronym of the person&#39;s state of birth
   * @param grauInstrucao It shows the degree of instruction of the individual
   * @param numeroDependentes Displays the number of dependents of the individual
   * @param nomePai Displays the name of the parent of the individual
   * @param chequeEspecial Indicates whether individual person joins the overdraft
   * @param impedidoFinanciamento Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) 
   * @return PagePessoaDetalheResponse
   */
  public PagePessoaDetalheResponse  listar_12 (List<String> sort, Integer page, Integer limit, Long idPessoa, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa, String naturalidadeCidade, String naturalidadeEstado, Integer grauInstrucao, Integer numeroDependentes, String nomePai, Integer chequeEspecial, Boolean impedidoFinanciamento) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/pessoas-detalhes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("multi", "sort", sort));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "page", page));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "limit", limit));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeMae", nomeMae));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstadoCivil", idEstadoCivil));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProfissao", idProfissao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroBanco", numeroBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeCidade", naturalidadeCidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeEstado", naturalidadeEstado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "grauInstrucao", grauInstrucao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroDependentes", numeroDependentes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomePai", nomePai));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "chequeEspecial", chequeEspecial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "impedidoFinanciamento", impedidoFinanciamento));
    

    

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
        return (PagePessoaDetalheResponse) ApiInvoker.deserialize(response, "", PagePessoaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * List the Telephones registered in the Issuer
   * This method allows to be listed the telephones in the database of the Issuer
   * @param sort Register ordering type
   * @param page Page
   * @param limit Limit of elements per request (Default =50, Max =50)
   * @param id Identification Code of the Telephone (id)
   * @param idTipoTelefone Identification Code of Type of the Telephone (id)
   * @param idPessoa Identification Code of the Person (id) which the telephone belongs
   * @param ddd Telephone DDD (id)
   * @param telefone Telephone number
   * @param ramal Extension Number
   * @param status Shows the Status of the TElephone, where: &#39;0&#39;: Inactive and &#39;1&#39;: Active?
   * @return PageTelefoneResponse
   */
  public PageTelefoneResponse  listar_13 (List<String> sort, Integer page, Integer limit, Long id, Long idTipoTelefone, Long idPessoa, String ddd, String telefone, String ramal, Integer status) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/telefones".replaceAll("\\{format\\}","json");

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
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoTelefone", idTipoTelefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ddd", ddd));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "telefone", telefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ramal", ramal));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "status", status));
    

    

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
        return (PageTelefoneResponse) ApiInvoker.deserialize(response, "", PageTelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Include an account as a register for integration
   * This resource allows to include an account as a register for integration
   * @param id idConta
   * @param body IntegracaoEmissorPersist
   * @return IntegracaoEmissorResponse
   */
  public IntegracaoEmissorResponse  salvar (Long id, IntegracaoEmissorPersist body) throws ApiException {
    Object postBody = body;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvar");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/incluir-registro-integracao".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (IntegracaoEmissorResponse) ApiInvoker.deserialize(response, "", IntegracaoEmissorResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create the Account and Legal Entity
   * Allow to create the register of an Account Legal Entity one, recieving in this operation all the register dates which are necessary for this. Once created, It can be turn on the method Card Creation for the client and their additionals
   * @param pessoaPersist pessoaPersist
   * @return ObjectApprovedIndividual
   */
  public ObjectApprovedIndividual  salvarPessoaFisicaAprovada (ObjectApprovedIndividual pessoaPersist) throws ApiException {
    Object postBody = pessoaPersist;
    
    // verify the required parameter 'pessoaPersist' is set
    if (pessoaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'pessoaPersist' when calling salvarPessoaFisicaAprovada");
    }
    

    // create path and map variables
    String path = "/api/clientes-pessoas-fisicas".replaceAll("\\{format\\}","json");

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
        return (ObjectApprovedIndividual) ApiInvoker.deserialize(response, "", ObjectApprovedIndividual.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create the Account and Legal Entity
   * Create the Account and Legal Entity allows to do the register of an account for a client  Legal Entity one, recieving in this operation all the register dates which are necessary for this, including the register of each one of the linked partners
   * @param pessoaPersist pessoaPersist
   * @return PessoaJuridicaAprovadaResponse
   */
  public PessoaJuridicaAprovadaResponse  salvarPessoaJuridicaAprovada (PessoaJuridicaAprovadaPersist pessoaPersist) throws ApiException {
    Object postBody = pessoaPersist;
    
    // verify the required parameter 'pessoaPersist' is set
    if (pessoaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'pessoaPersist' when calling salvarPessoaJuridicaAprovada");
    }
    

    // create path and map variables
    String path = "/api/clientes-pessoas-juridicas".replaceAll("\\{format\\}","json");

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
        return (PessoaJuridicaAprovadaResponse) ApiInvoker.deserialize(response, "", PessoaJuridicaAprovadaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Includes integration record
   * This feature allows you to include an integration record
   * @param id Account Identifier
   * @param integracaoEmissorPropostaPersist integracaoEmissorPropostaPersist
   * @return IntegracaoEmissorPropostaResponse
   */
  public IntegracaoEmissorPropostaResponse  salvarRegistroIntegracaoManager (Long id, IntegracaoEmissorPropostaPersist integracaoEmissorPropostaPersist) throws ApiException {
    Object postBody = integracaoEmissorPropostaPersist;
    
    // verify the required parameter 'id' is set
    if (id == null) {
       throw new ApiException(400, "Missing the required parameter 'id' when calling salvarRegistroIntegracaoManager");
    }
    
    // verify the required parameter 'integracaoEmissorPropostaPersist' is set
    if (integracaoEmissorPropostaPersist == null) {
       throw new ApiException(400, "Missing the required parameter 'integracaoEmissorPropostaPersist' when calling salvarRegistroIntegracaoManager");
    }
    

    // create path and map variables
    String path = "/api/contas/{id}/registros-integracao-manager".replaceAll("\\{format\\}","json").replaceAll("\\{" + "id" + "\\}", apiInvoker.escapeString(id.toString()));

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
        return (IntegracaoEmissorPropostaResponse) ApiInvoker.deserialize(response, "", IntegracaoEmissorPropostaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a register of a new Address
   * This resource allows to be created a new Address in the database of the Issuer
   * @param idPessoa Identification Code of the Person which the address belongs (id)
   * @param idTipoEndereco Identification Code of the Address Type (id)
   * @param cep CEP
   * @param logradouro Show the Street name
   * @param numero Show the number of the address
   * @param complemento Show complementary descriptions referring to the address
   * @param pontoReferencia Show the description of the address landmark
   * @param bairro Show the name of the neighborhood
   * @param cidade Show the name of the city
   * @param uf Show Federal Unity Acronym
   * @param pais Show the name of the Country
   * @param tempoResidenciaAnos Displays the number of years spent living in the residence
   * @param tempoResidenciaMeses Displays the number of months spent living in the residence
   * @param aplicativoAlteracao Displays the responsible application for the address change
   * @return EnderecoResponse
   */
  public EnderecoResponse  salvar_14 (Long idPessoa, Long idTipoEndereco, String cep, String logradouro, Integer numero, String complemento, String pontoReferencia, String bairro, String cidade, String uf, String pais, Integer tempoResidenciaAnos, Integer tempoResidenciaMeses, String aplicativoAlteracao) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/enderecos".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoEndereco", idTipoEndereco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cep", cep));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "logradouro", logradouro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numero", numero));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "complemento", complemento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pontoReferencia", pontoReferencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "bairro", bairro));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cidade", cidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "uf", uf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "pais", pais));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaAnos", tempoResidenciaAnos));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tempoResidenciaMeses", tempoResidenciaMeses));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "aplicativoAlteracao", aplicativoAlteracao));
    

    

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
        return (EnderecoResponse) ApiInvoker.deserialize(response, "", EnderecoResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create the register of a new Person
   * this method allows to be registered a new Person in the database of the issuer
   * @param nome Full Name of the PF or Full Name of Corporate Name (Company Name)
   * @param tipo Kind of Person (PF or PJ)
   * @param dataNascimento Birth date of the persosn, when PP, or the date of the business opening, when it is LP. This date must be informed in the format yyyy-MM-dd
   * @param cpf CPF number, when it is PF
   * @param cnpj CNPJ number, when it is PJ
   * @param sexo Person Gender
   * @param numeroIdentidade Identity Number
   * @param orgaoExpedidorIdentidade Issue organ of the ID
   * @param unidadeFederativaIdentidade Acronym of the Federal Unity where it was issued the Identity
   * @param dataEmissaoIdentidade Issue date of the Identity
   * @return PessoaResponse
   */
  public PessoaResponse  salvar_15 (String nome, String tipo, String dataNascimento, String cpf, String cnpj, String sexo, String numeroIdentidade, String orgaoExpedidorIdentidade, String unidadeFederativaIdentidade, String dataEmissaoIdentidade) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'nome' is set
    if (nome == null) {
       throw new ApiException(400, "Missing the required parameter 'nome' when calling salvar_15");
    }
    
    // verify the required parameter 'tipo' is set
    if (tipo == null) {
       throw new ApiException(400, "Missing the required parameter 'tipo' when calling salvar_15");
    }
    
    // verify the required parameter 'dataNascimento' is set
    if (dataNascimento == null) {
       throw new ApiException(400, "Missing the required parameter 'dataNascimento' when calling salvar_15");
    }
    

    // create path and map variables
    String path = "/api/pessoas".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nome", nome));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "tipo", tipo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cpf", cpf));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "cnpj", cnpj));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataNascimento", dataNascimento));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "sexo", sexo));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroIdentidade", numeroIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "orgaoExpedidorIdentidade", orgaoExpedidorIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "unidadeFederativaIdentidade", unidadeFederativaIdentidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "dataEmissaoIdentidade", dataEmissaoIdentidade));
    

    

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
        return (PessoaResponse) ApiInvoker.deserialize(response, "", PessoaResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Save the details of a determined Person
   * This method allows to be included in the base of the issuer the details of a determined Person
   * @param idPessoa Show the identifier code of the person
   * @param nomeMae Show the name of the physical person mother
   * @param idEstadoCivil Id Marital Status of the Physical Person
   * @param idProfissao Physical person occupation
   * @param idNaturezaOcupacao Id Occupation of the physical person
   * @param idNacionalidade Id Nationality of the physical person
   * @param numeroBanco Bank number
   * @param numeroAgencia Agency number
   * @param numeroContaCorrente Current Account Number
   * @param email Email of the physical person
   * @param nomeEmpresa Name that must be printed on the card
   * @param nomeReferencia1 Name Reference 1
   * @param enderecoReferencia1 Reference Address 1
   * @param nomeReferencia2 Name Reference 2
   * @param enderecoReferencia2 Reference Address 2
   * @param naturalidadeCidade Displays the name of the birth city of the individual
   * @param naturalidadeEstado Presents the acronym of the person&#39;s state of birth
   * @param grauInstrucao It shows the degree of instruction of the individual
   * @param numeroDependentes Displays the number of dependents of the individual
   * @param nomePai Displays the name of the parent of the individual
   * @param chequeEspecial Indicates whether individual person joins the overdraft
   * @param impedidoFinanciamento Flag for banks business partners that are cardholders, but cannot operate financed credit transactions (Law n. 4595/64) 
   * @return PessoaDetalheResponse
   */
  public PessoaDetalheResponse  salvar_16 (Long idPessoa, String nomeMae, Long idEstadoCivil, String idProfissao, Long idNaturezaOcupacao, Long idNacionalidade, Integer numeroBanco, Integer numeroAgencia, String numeroContaCorrente, String email, String nomeEmpresa, String nomeReferencia1, String enderecoReferencia1, String nomeReferencia2, String enderecoReferencia2, String naturalidadeCidade, String naturalidadeEstado, Integer grauInstrucao, Integer numeroDependentes, String nomePai, Integer chequeEspecial, Boolean impedidoFinanciamento) throws ApiException {
    Object postBody = null;
    
    // verify the required parameter 'idPessoa' is set
    if (idPessoa == null) {
       throw new ApiException(400, "Missing the required parameter 'idPessoa' when calling salvar_16");
    }
    

    // create path and map variables
    String path = "/api/pessoas-detalhes".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeMae", nomeMae));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idEstadoCivil", idEstadoCivil));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idProfissao", idProfissao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNaturezaOcupacao", idNaturezaOcupacao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idNacionalidade", idNacionalidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroBanco", numeroBanco));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroAgencia", numeroAgencia));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroContaCorrente", numeroContaCorrente));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "email", email));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeEmpresa", nomeEmpresa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeReferencia1", nomeReferencia1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "enderecoReferencia1", enderecoReferencia1));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomeReferencia2", nomeReferencia2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "enderecoReferencia2", enderecoReferencia2));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeCidade", naturalidadeCidade));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "naturalidadeEstado", naturalidadeEstado));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "grauInstrucao", grauInstrucao));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "numeroDependentes", numeroDependentes));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "nomePai", nomePai));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "chequeEspecial", chequeEspecial));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "impedidoFinanciamento", impedidoFinanciamento));
    

    

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
        return (PessoaDetalheResponse) ApiInvoker.deserialize(response, "", PessoaDetalheResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
  /**
   * Create a register of a new Telephone
   * This method allows to be created a new telephone in the database of the issuer
   * @param idTipoTelefone Identification Code of the Telephone Type (id)
   * @param idPessoa Identification Code of the Person (id) which the telephone belongs
   * @param ddd DDD Code of the telephone (id)
   * @param telefone Telephone Number
   * @param ramal Extension Number
   * @return TelefoneResponse
   */
  public TelefoneResponse  salvar_17 (Long idTipoTelefone, Long idPessoa, String ddd, String telefone, String ramal) throws ApiException {
    Object postBody = null;
    

    // create path and map variables
    String path = "/api/telefones".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> queryParams = new ArrayList<Pair>();
    // header params
    Map<String, String> headerParams = new HashMap<String, String>();
    // form params
    Map<String, String> formParams = new HashMap<String, String>();

    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idTipoTelefone", idTipoTelefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "idPessoa", idPessoa));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ddd", ddd));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "telefone", telefone));
    
    queryParams.addAll(ApiInvoker.parameterToPairs("", "ramal", ramal));
    

    

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
        return (TelefoneResponse) ApiInvoker.deserialize(response, "", TelefoneResponse.class);
      }
      else {
        return null;
      }
    } catch (ApiException ex) {
      throw ex;
    }
  }
  
}
