package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Profile
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-19T19:22:40.372Z")
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity(name = "profile")
public class Profile   {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("photoUrls")
  @Valid
  private String photoUrls = null;

  @JsonProperty("settings")
  @Valid
  private String settings = null;

  public Profile id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }


  public Profile photoUrls(String photoUrls) {
    this.photoUrls = photoUrls;
    return this;
  }

  public Profile settings(String settings) {
    this.settings = settings;
    return this;
  }


  /**
   * Get photoUrls
   * @return photoUrls
  **/
  @ApiModelProperty(value = "")


  public String getPhotoUrls() {
    return photoUrls;
  }

  public void setPhotoUrls(String photoUrls) {
    this.photoUrls = photoUrls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Profile profile = (Profile) o;
    return Objects.equals(this.id, profile.id) &&
        Objects.equals(this.photoUrls, profile.photoUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, photoUrls, settings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Profile {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    photoUrls: ").append(toIndentedString(photoUrls)).append("\n");
    sb.append("    settings: ").append(toIndentedString(settings)).append("\n");
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

