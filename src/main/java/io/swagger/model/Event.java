package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.validation.annotation.Validated;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Event
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2020-04-19T19:22:40.372Z")
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "event")
public class Event   {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("place")
  private String place = null;

  @JsonProperty("when")
  private Integer when = null;

  @JsonProperty("ownerId")
  private Long ownerId = null;

  @JsonProperty("participantsId")
  @Valid
  private List<Long> participantsId = null;

  /**
   * Event status
   */
  public enum StatusEnum {
    AVAILABLE("available"),
    
    CANCELLED("cancelled"),
    
    DURING("during");

    private String value;

    StatusEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static StatusEnum fromValue(String text) {
      for (StatusEnum b : StatusEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("status")
  private StatusEnum status = null;

  public Event id(Long id) {
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

  public Event place(String place) {
    this.place = place;
    return this;
  }

  /**
   * Get place
   * @return place
  **/
  @ApiModelProperty(value = "")


  public String getPlace() {
    return place;
  }

  public void setPlace(String place) {
    this.place = place;
  }

  public Event when(Integer when) {
    this.when = when;
    return this;
  }

  /**
   * Get when
   * @return when
  **/
  @ApiModelProperty(value = "")


  public Integer getWhen() {
    return when;
  }

  public void setWhen(Integer when) {
    this.when = when;
  }

  public Event ownerId(Long ownerId) {
    this.ownerId = ownerId;
    return this;
  }

  /**
   * Get ownerId
   * @return ownerId
  **/
  @ApiModelProperty(value = "")


  public Long getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(Long ownerId) {
    this.ownerId = ownerId;
  }

  public Event participantsId(List<Long> participantsId) {
    this.participantsId = participantsId;
    return this;
  }

  public Event addParticipantsIdItem(Long participantsIdItem) {
    if (this.participantsId == null) {
      this.participantsId = new ArrayList<Long>();
    }
    this.participantsId.add(participantsIdItem);
    return this;
  }

  /**
   * Get participantsId
   * @return participantsId
  **/
  @ApiModelProperty(value = "")


  public List<Long> getParticipantsId() {
    return participantsId;
  }

  public void setParticipantsId(List<Long> participantsId) {
    this.participantsId = participantsId;
  }

  public Event status(StatusEnum status) {
    this.status = status;
    return this;
  }

  /**
   * Event status
   * @return status
  **/
  @ApiModelProperty(value = "Event status")


  public StatusEnum getStatus() {
    return status;
  }

  public void setStatus(StatusEnum status) {
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
    Event event = (Event) o;
    return Objects.equals(this.id, event.id) &&
        Objects.equals(this.place, event.place) &&
        Objects.equals(this.when, event.when) &&
        Objects.equals(this.ownerId, event.ownerId) &&
        Objects.equals(this.participantsId, event.participantsId) &&
        Objects.equals(this.status, event.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, place, when, ownerId, participantsId, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Event {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    place: ").append(toIndentedString(place)).append("\n");
    sb.append("    when: ").append(toIndentedString(when)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
    sb.append("    participantsId: ").append(toIndentedString(participantsId)).append("\n");
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

