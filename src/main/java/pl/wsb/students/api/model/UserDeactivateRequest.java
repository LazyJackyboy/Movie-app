/*
 * Java Course Movie App API
 * Sample Movie App AI
 *
 * OpenAPI spec version: 1.1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package pl.wsb.students.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;

/**
 * UserDeactivateRequest
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaJerseyServerCodegen", date = "2020-04-30T07:31:54.867Z")
public class UserDeactivateRequest   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("status")
  private Boolean status = null;

  public UserDeactivateRequest id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * User id
   * @return id
   **/
  @JsonProperty("id")
  @ApiModelProperty(required = true, value = "User id")
  @NotNull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public UserDeactivateRequest status(Boolean status) {
    this.status = status;
    return this;
  }

  /**
   * Account status
   * @return status
   **/
  @JsonProperty("status")
  @ApiModelProperty(required = true, value = "Account status")
  @NotNull
  public Boolean isStatus() {
    return status;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDeactivateRequest userDeactivateRequest = (UserDeactivateRequest) o;
    return Objects.equals(this.id, userDeactivateRequest.id) &&
        Objects.equals(this.status, userDeactivateRequest.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDeactivateRequest {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

