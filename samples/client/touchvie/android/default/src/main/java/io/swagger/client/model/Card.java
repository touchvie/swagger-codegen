package io.swagger.client.model;

import io.swagger.client.model.CardContainer;
import io.swagger.client.model.ImageData;
import io.swagger.client.model.RelationModule;
import java.util.*;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;


/**
 * Basic Dive data unit, represents an item of a given category
 **/
@ApiModel(description = "Basic Dive data unit, represents an item of a given category")
public class Card  {
  
  @SerializedName("card_id")
  private String cardId = null;
  @SerializedName("version")
  private String version = null;
  public enum TypeEnum {
     movie,  serie,  person,  character,  vehicle,  fashion,  location,  historic,  trivia,  quote,  ost,  home,  technology,  art,  song,  look,  weapon,  leisure_sport,  health_beauty,  food_drink,  fauna_flora,  business,  reference,  chapter, 
  };
  @SerializedName("type")
  private TypeEnum type = null;
  @SerializedName("locale")
  private String locale = null;
  @SerializedName("title")
  private String title = null;
  @SerializedName("subtitle")
  private String subtitle = null;
  @SerializedName("image")
  private ImageData image = null;
  @SerializedName("info")
  private List<CardContainer> info = null;
  @SerializedName("relations")
  private List<RelationModule> relations = null;

  /**
   * Card unique identifier
   **/
  @ApiModelProperty(required = true, value = "Card unique identifier")
  public String getCardId() {
    return cardId;
  }
  public void setCardId(String cardId) {
    this.cardId = cardId;
  }

  /**
   * Card version for a given movie and scene
   **/
  @ApiModelProperty(value = "Card version for a given movie and scene")
  public String getVersion() {
    return version;
  }
  public void setVersion(String version) {
    this.version = version;
  }

  /**
   * Card type
   **/
  @ApiModelProperty(required = true, value = "Card type")
  public TypeEnum getType() {
    return type;
  }
  public void setType(TypeEnum type) {
    this.type = type;
  }

  /**
   * Card content locale
   **/
  @ApiModelProperty(required = true, value = "Card content locale")
  public String getLocale() {
    return locale;
  }
  public void setLocale(String locale) {
    this.locale = locale;
  }

  /**
   * Card title
   **/
  @ApiModelProperty(required = true, value = "Card title")
  public String getTitle() {
    return title;
  }
  public void setTitle(String title) {
    this.title = title;
  }

  /**
   * Card subtitle (might be empty)
   **/
  @ApiModelProperty(value = "Card subtitle (might be empty)")
  public String getSubtitle() {
    return subtitle;
  }
  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public ImageData getImage() {
    return image;
  }
  public void setImage(ImageData image) {
    this.image = image;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<CardContainer> getInfo() {
    return info;
  }
  public void setInfo(List<CardContainer> info) {
    this.info = info;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public List<RelationModule> getRelations() {
    return relations;
  }
  public void setRelations(List<RelationModule> relations) {
    this.relations = relations;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Card card = (Card) o;
    return (this.cardId == null ? card.cardId == null : this.cardId.equals(card.cardId)) &&
        (this.version == null ? card.version == null : this.version.equals(card.version)) &&
        (this.type == null ? card.type == null : this.type.equals(card.type)) &&
        (this.locale == null ? card.locale == null : this.locale.equals(card.locale)) &&
        (this.title == null ? card.title == null : this.title.equals(card.title)) &&
        (this.subtitle == null ? card.subtitle == null : this.subtitle.equals(card.subtitle)) &&
        (this.image == null ? card.image == null : this.image.equals(card.image)) &&
        (this.info == null ? card.info == null : this.info.equals(card.info)) &&
        (this.relations == null ? card.relations == null : this.relations.equals(card.relations));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (cardId == null ? 0: cardId.hashCode());
    result = 31 * result + (version == null ? 0: version.hashCode());
    result = 31 * result + (type == null ? 0: type.hashCode());
    result = 31 * result + (locale == null ? 0: locale.hashCode());
    result = 31 * result + (title == null ? 0: title.hashCode());
    result = 31 * result + (subtitle == null ? 0: subtitle.hashCode());
    result = 31 * result + (image == null ? 0: image.hashCode());
    result = 31 * result + (info == null ? 0: info.hashCode());
    result = 31 * result + (relations == null ? 0: relations.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Card {\n");
    
    sb.append("  cardId: ").append(cardId).append("\n");
    sb.append("  version: ").append(version).append("\n");
    sb.append("  type: ").append(type).append("\n");
    sb.append("  locale: ").append(locale).append("\n");
    sb.append("  title: ").append(title).append("\n");
    sb.append("  subtitle: ").append(subtitle).append("\n");
    sb.append("  image: ").append(image).append("\n");
    sb.append("  info: ").append(info).append("\n");
    sb.append("  relations: ").append(relations).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
