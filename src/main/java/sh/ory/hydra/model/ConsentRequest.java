/*
 * ORY Hydra
 * Welcome to the ORY Hydra HTTP API documentation. You will find documentation for all HTTP APIs here.
 *
 * The version of the OpenAPI document: latest
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package sh.ory.hydra.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import sh.ory.hydra.model.OAuth2Client;
import sh.ory.hydra.model.OpenIDConnectContext;

/**
 * ConsentRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-04-02T10:32:48.736613Z[GMT]")
public class ConsentRequest {
  public static final String SERIALIZED_NAME_ACR = "acr";
  @SerializedName(SERIALIZED_NAME_ACR)
  private String acr;

  public static final String SERIALIZED_NAME_CHALLENGE = "challenge";
  @SerializedName(SERIALIZED_NAME_CHALLENGE)
  private String challenge;

  public static final String SERIALIZED_NAME_CLIENT = "client";
  @SerializedName(SERIALIZED_NAME_CLIENT)
  private OAuth2Client client;

  public static final String SERIALIZED_NAME_CONTEXT = "context";
  @SerializedName(SERIALIZED_NAME_CONTEXT)
  private Object context;

  public static final String SERIALIZED_NAME_LOGIN_CHALLENGE = "login_challenge";
  @SerializedName(SERIALIZED_NAME_LOGIN_CHALLENGE)
  private String loginChallenge;

  public static final String SERIALIZED_NAME_LOGIN_SESSION_ID = "login_session_id";
  @SerializedName(SERIALIZED_NAME_LOGIN_SESSION_ID)
  private String loginSessionId;

  public static final String SERIALIZED_NAME_OIDC_CONTEXT = "oidc_context";
  @SerializedName(SERIALIZED_NAME_OIDC_CONTEXT)
  private OpenIDConnectContext oidcContext;

  public static final String SERIALIZED_NAME_REQUEST_URL = "request_url";
  @SerializedName(SERIALIZED_NAME_REQUEST_URL)
  private String requestUrl;

  public static final String SERIALIZED_NAME_REQUESTED_ACCESS_TOKEN_AUDIENCE = "requested_access_token_audience";
  @SerializedName(SERIALIZED_NAME_REQUESTED_ACCESS_TOKEN_AUDIENCE)
  private List<String> requestedAccessTokenAudience = null;

  public static final String SERIALIZED_NAME_REQUESTED_SCOPE = "requested_scope";
  @SerializedName(SERIALIZED_NAME_REQUESTED_SCOPE)
  private List<String> requestedScope = null;

  public static final String SERIALIZED_NAME_SKIP = "skip";
  @SerializedName(SERIALIZED_NAME_SKIP)
  private Boolean skip;

  public static final String SERIALIZED_NAME_SUBJECT = "subject";
  @SerializedName(SERIALIZED_NAME_SUBJECT)
  private String subject;


  public ConsentRequest acr(String acr) {
    
    this.acr = acr;
    return this;
  }

   /**
   * ACR represents the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.
   * @return acr
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ACR represents the Authentication AuthorizationContext Class Reference value for this authentication session. You can use it to express that, for example, a user authenticated using two factor authentication.")

  public String getAcr() {
    return acr;
  }


  public void setAcr(String acr) {
    this.acr = acr;
  }


  public ConsentRequest challenge(String challenge) {
    
    this.challenge = challenge;
    return this;
  }

   /**
   * Challenge is the identifier (\&quot;authorization challenge\&quot;) of the consent authorization request. It is used to identify the session.
   * @return challenge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Challenge is the identifier (\"authorization challenge\") of the consent authorization request. It is used to identify the session.")

  public String getChallenge() {
    return challenge;
  }


  public void setChallenge(String challenge) {
    this.challenge = challenge;
  }


  public ConsentRequest client(OAuth2Client client) {
    
    this.client = client;
    return this;
  }

   /**
   * Get client
   * @return client
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OAuth2Client getClient() {
    return client;
  }


  public void setClient(OAuth2Client client) {
    this.client = client;
  }


  public ConsentRequest context(Object context) {
    
    this.context = context;
    return this;
  }

   /**
   * Get context
   * @return context
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getContext() {
    return context;
  }


  public void setContext(Object context) {
    this.context = context;
  }


  public ConsentRequest loginChallenge(String loginChallenge) {
    
    this.loginChallenge = loginChallenge;
    return this;
  }

   /**
   * LoginChallenge is the login challenge this consent challenge belongs to. It can be used to associate a login and consent request in the login &amp; consent app.
   * @return loginChallenge
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LoginChallenge is the login challenge this consent challenge belongs to. It can be used to associate a login and consent request in the login & consent app.")

  public String getLoginChallenge() {
    return loginChallenge;
  }


  public void setLoginChallenge(String loginChallenge) {
    this.loginChallenge = loginChallenge;
  }


  public ConsentRequest loginSessionId(String loginSessionId) {
    
    this.loginSessionId = loginSessionId;
    return this;
  }

   /**
   * LoginSessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \&quot;sid\&quot; parameter in the ID Token and in OIDC Front-/Back- channel logout. It&#39;s value can generally be used to associate consecutive login requests by a certain user.
   * @return loginSessionId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "LoginSessionID is the login session ID. If the user-agent reuses a login session (via cookie / remember flag) this ID will remain the same. If the user-agent did not have an existing authentication session (e.g. remember is false) this will be a new random value. This value is used as the \"sid\" parameter in the ID Token and in OIDC Front-/Back- channel logout. It's value can generally be used to associate consecutive login requests by a certain user.")

  public String getLoginSessionId() {
    return loginSessionId;
  }


  public void setLoginSessionId(String loginSessionId) {
    this.loginSessionId = loginSessionId;
  }


  public ConsentRequest oidcContext(OpenIDConnectContext oidcContext) {
    
    this.oidcContext = oidcContext;
    return this;
  }

   /**
   * Get oidcContext
   * @return oidcContext
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OpenIDConnectContext getOidcContext() {
    return oidcContext;
  }


  public void setOidcContext(OpenIDConnectContext oidcContext) {
    this.oidcContext = oidcContext;
  }


  public ConsentRequest requestUrl(String requestUrl) {
    
    this.requestUrl = requestUrl;
    return this;
  }

   /**
   * RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.
   * @return requestUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "RequestURL is the original OAuth 2.0 Authorization URL requested by the OAuth 2.0 client. It is the URL which initiates the OAuth 2.0 Authorization Code or OAuth 2.0 Implicit flow. This URL is typically not needed, but might come in handy if you want to deal with additional request parameters.")

  public String getRequestUrl() {
    return requestUrl;
  }


  public void setRequestUrl(String requestUrl) {
    this.requestUrl = requestUrl;
  }


  public ConsentRequest requestedAccessTokenAudience(List<String> requestedAccessTokenAudience) {
    
    this.requestedAccessTokenAudience = requestedAccessTokenAudience;
    return this;
  }

  public ConsentRequest addRequestedAccessTokenAudienceItem(String requestedAccessTokenAudienceItem) {
    if (this.requestedAccessTokenAudience == null) {
      this.requestedAccessTokenAudience = new ArrayList<String>();
    }
    this.requestedAccessTokenAudience.add(requestedAccessTokenAudienceItem);
    return this;
  }

   /**
   * Get requestedAccessTokenAudience
   * @return requestedAccessTokenAudience
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRequestedAccessTokenAudience() {
    return requestedAccessTokenAudience;
  }


  public void setRequestedAccessTokenAudience(List<String> requestedAccessTokenAudience) {
    this.requestedAccessTokenAudience = requestedAccessTokenAudience;
  }


  public ConsentRequest requestedScope(List<String> requestedScope) {
    
    this.requestedScope = requestedScope;
    return this;
  }

  public ConsentRequest addRequestedScopeItem(String requestedScopeItem) {
    if (this.requestedScope == null) {
      this.requestedScope = new ArrayList<String>();
    }
    this.requestedScope.add(requestedScopeItem);
    return this;
  }

   /**
   * Get requestedScope
   * @return requestedScope
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<String> getRequestedScope() {
    return requestedScope;
  }


  public void setRequestedScope(List<String> requestedScope) {
    this.requestedScope = requestedScope;
  }


  public ConsentRequest skip(Boolean skip) {
    
    this.skip = skip;
    return this;
  }

   /**
   * Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you must not ask the user to grant the requested scopes. You must however either allow or deny the consent request using the usual API call.
   * @return skip
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Skip, if true, implies that the client has requested the same scopes from the same user previously. If true, you must not ask the user to grant the requested scopes. You must however either allow or deny the consent request using the usual API call.")

  public Boolean getSkip() {
    return skip;
  }


  public void setSkip(Boolean skip) {
    this.skip = skip;
  }


  public ConsentRequest subject(String subject) {
    
    this.subject = subject;
    return this;
  }

   /**
   * Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client.
   * @return subject
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Subject is the user ID of the end-user that authenticated. Now, that end user needs to grant or deny the scope requested by the OAuth 2.0 client.")

  public String getSubject() {
    return subject;
  }


  public void setSubject(String subject) {
    this.subject = subject;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsentRequest consentRequest = (ConsentRequest) o;
    return Objects.equals(this.acr, consentRequest.acr) &&
        Objects.equals(this.challenge, consentRequest.challenge) &&
        Objects.equals(this.client, consentRequest.client) &&
        Objects.equals(this.context, consentRequest.context) &&
        Objects.equals(this.loginChallenge, consentRequest.loginChallenge) &&
        Objects.equals(this.loginSessionId, consentRequest.loginSessionId) &&
        Objects.equals(this.oidcContext, consentRequest.oidcContext) &&
        Objects.equals(this.requestUrl, consentRequest.requestUrl) &&
        Objects.equals(this.requestedAccessTokenAudience, consentRequest.requestedAccessTokenAudience) &&
        Objects.equals(this.requestedScope, consentRequest.requestedScope) &&
        Objects.equals(this.skip, consentRequest.skip) &&
        Objects.equals(this.subject, consentRequest.subject);
  }

  @Override
  public int hashCode() {
    return Objects.hash(acr, challenge, client, context, loginChallenge, loginSessionId, oidcContext, requestUrl, requestedAccessTokenAudience, requestedScope, skip, subject);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsentRequest {\n");
    sb.append("    acr: ").append(toIndentedString(acr)).append("\n");
    sb.append("    challenge: ").append(toIndentedString(challenge)).append("\n");
    sb.append("    client: ").append(toIndentedString(client)).append("\n");
    sb.append("    context: ").append(toIndentedString(context)).append("\n");
    sb.append("    loginChallenge: ").append(toIndentedString(loginChallenge)).append("\n");
    sb.append("    loginSessionId: ").append(toIndentedString(loginSessionId)).append("\n");
    sb.append("    oidcContext: ").append(toIndentedString(oidcContext)).append("\n");
    sb.append("    requestUrl: ").append(toIndentedString(requestUrl)).append("\n");
    sb.append("    requestedAccessTokenAudience: ").append(toIndentedString(requestedAccessTokenAudience)).append("\n");
    sb.append("    requestedScope: ").append(toIndentedString(requestedScope)).append("\n");
    sb.append("    skip: ").append(toIndentedString(skip)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

