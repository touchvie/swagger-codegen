package io.swagger.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import io.swagger.client.model.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AccessToken".equalsIgnoreCase(className)) {
      return new TypeToken<List<AccessToken>>(){}.getType();
    }
    
    if ("AuthError".equalsIgnoreCase(className)) {
      return new TypeToken<List<AuthError>>(){}.getType();
    }
    
    if ("AwardData".equalsIgnoreCase(className)) {
      return new TypeToken<List<AwardData>>(){}.getType();
    }
    
    if ("Awards".equalsIgnoreCase(className)) {
      return new TypeToken<List<Awards>>(){}.getType();
    }
    
    if ("AwardsData".equalsIgnoreCase(className)) {
      return new TypeToken<List<AwardsData>>(){}.getType();
    }
    
    if ("Card".equalsIgnoreCase(className)) {
      return new TypeToken<List<Card>>(){}.getType();
    }
    
    if ("CardContainer".equalsIgnoreCase(className)) {
      return new TypeToken<List<CardContainer>>(){}.getType();
    }
    
    if ("Catalog".equalsIgnoreCase(className)) {
      return new TypeToken<List<Catalog>>(){}.getType();
    }
    
    if ("CatalogData".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogData>>(){}.getType();
    }
    
    if ("CatalogSync".equalsIgnoreCase(className)) {
      return new TypeToken<List<CatalogSync>>(){}.getType();
    }
    
    if ("ChannelStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<ChannelStatus>>(){}.getType();
    }
    
    if ("Duple".equalsIgnoreCase(className)) {
      return new TypeToken<List<Duple>>(){}.getType();
    }
    
    if ("DupleData".equalsIgnoreCase(className)) {
      return new TypeToken<List<DupleData>>(){}.getType();
    }
    
    if ("Image".equalsIgnoreCase(className)) {
      return new TypeToken<List<Image>>(){}.getType();
    }
    
    if ("ImageData".equalsIgnoreCase(className)) {
      return new TypeToken<List<ImageData>>(){}.getType();
    }
    
    if ("Link".equalsIgnoreCase(className)) {
      return new TypeToken<List<Link>>(){}.getType();
    }
    
    if ("LinkData".equalsIgnoreCase(className)) {
      return new TypeToken<List<LinkData>>(){}.getType();
    }
    
    if ("Listing".equalsIgnoreCase(className)) {
      return new TypeToken<List<Listing>>(){}.getType();
    }
    
    if ("ListingData".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListingData>>(){}.getType();
    }
    
    if ("Map".equalsIgnoreCase(className)) {
      return new TypeToken<List<Map>>(){}.getType();
    }
    
    if ("MapData".equalsIgnoreCase(className)) {
      return new TypeToken<List<MapData>>(){}.getType();
    }
    
    if ("MovieStatus".equalsIgnoreCase(className)) {
      return new TypeToken<List<MovieStatus>>(){}.getType();
    }
    
    if ("Rating".equalsIgnoreCase(className)) {
      return new TypeToken<List<Rating>>(){}.getType();
    }
    
    if ("RatingData".equalsIgnoreCase(className)) {
      return new TypeToken<List<RatingData>>(){}.getType();
    }
    
    if ("RelationModule".equalsIgnoreCase(className)) {
      return new TypeToken<List<RelationModule>>(){}.getType();
    }
    
    if ("Seasons".equalsIgnoreCase(className)) {
      return new TypeToken<List<Seasons>>(){}.getType();
    }
    
    if ("SeasonsChapters".equalsIgnoreCase(className)) {
      return new TypeToken<List<SeasonsChapters>>(){}.getType();
    }
    
    if ("SeasonsData".equalsIgnoreCase(className)) {
      return new TypeToken<List<SeasonsData>>(){}.getType();
    }
    
    if ("Single".equalsIgnoreCase(className)) {
      return new TypeToken<List<Single>>(){}.getType();
    }
    
    if ("SourceData".equalsIgnoreCase(className)) {
      return new TypeToken<List<SourceData>>(){}.getType();
    }
    
    if ("Text".equalsIgnoreCase(className)) {
      return new TypeToken<List<Text>>(){}.getType();
    }
    
    if ("TextData".equalsIgnoreCase(className)) {
      return new TypeToken<List<TextData>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("AccessToken".equalsIgnoreCase(className)) {
      return new TypeToken<AccessToken>(){}.getType();
    }
    
    if ("AuthError".equalsIgnoreCase(className)) {
      return new TypeToken<AuthError>(){}.getType();
    }
    
    if ("AwardData".equalsIgnoreCase(className)) {
      return new TypeToken<AwardData>(){}.getType();
    }
    
    if ("Awards".equalsIgnoreCase(className)) {
      return new TypeToken<Awards>(){}.getType();
    }
    
    if ("AwardsData".equalsIgnoreCase(className)) {
      return new TypeToken<AwardsData>(){}.getType();
    }
    
    if ("Card".equalsIgnoreCase(className)) {
      return new TypeToken<Card>(){}.getType();
    }
    
    if ("CardContainer".equalsIgnoreCase(className)) {
      return new TypeToken<CardContainer>(){}.getType();
    }
    
    if ("Catalog".equalsIgnoreCase(className)) {
      return new TypeToken<Catalog>(){}.getType();
    }
    
    if ("CatalogData".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogData>(){}.getType();
    }
    
    if ("CatalogSync".equalsIgnoreCase(className)) {
      return new TypeToken<CatalogSync>(){}.getType();
    }
    
    if ("ChannelStatus".equalsIgnoreCase(className)) {
      return new TypeToken<ChannelStatus>(){}.getType();
    }
    
    if ("Duple".equalsIgnoreCase(className)) {
      return new TypeToken<Duple>(){}.getType();
    }
    
    if ("DupleData".equalsIgnoreCase(className)) {
      return new TypeToken<DupleData>(){}.getType();
    }
    
    if ("Image".equalsIgnoreCase(className)) {
      return new TypeToken<Image>(){}.getType();
    }
    
    if ("ImageData".equalsIgnoreCase(className)) {
      return new TypeToken<ImageData>(){}.getType();
    }
    
    if ("Link".equalsIgnoreCase(className)) {
      return new TypeToken<Link>(){}.getType();
    }
    
    if ("LinkData".equalsIgnoreCase(className)) {
      return new TypeToken<LinkData>(){}.getType();
    }
    
    if ("Listing".equalsIgnoreCase(className)) {
      return new TypeToken<Listing>(){}.getType();
    }
    
    if ("ListingData".equalsIgnoreCase(className)) {
      return new TypeToken<ListingData>(){}.getType();
    }
    
    if ("Map".equalsIgnoreCase(className)) {
      return new TypeToken<Map>(){}.getType();
    }
    
    if ("MapData".equalsIgnoreCase(className)) {
      return new TypeToken<MapData>(){}.getType();
    }
    
    if ("MovieStatus".equalsIgnoreCase(className)) {
      return new TypeToken<MovieStatus>(){}.getType();
    }
    
    if ("Rating".equalsIgnoreCase(className)) {
      return new TypeToken<Rating>(){}.getType();
    }
    
    if ("RatingData".equalsIgnoreCase(className)) {
      return new TypeToken<RatingData>(){}.getType();
    }
    
    if ("RelationModule".equalsIgnoreCase(className)) {
      return new TypeToken<RelationModule>(){}.getType();
    }
    
    if ("Seasons".equalsIgnoreCase(className)) {
      return new TypeToken<Seasons>(){}.getType();
    }
    
    if ("SeasonsChapters".equalsIgnoreCase(className)) {
      return new TypeToken<SeasonsChapters>(){}.getType();
    }
    
    if ("SeasonsData".equalsIgnoreCase(className)) {
      return new TypeToken<SeasonsData>(){}.getType();
    }
    
    if ("Single".equalsIgnoreCase(className)) {
      return new TypeToken<Single>(){}.getType();
    }
    
    if ("SourceData".equalsIgnoreCase(className)) {
      return new TypeToken<SourceData>(){}.getType();
    }
    
    if ("Text".equalsIgnoreCase(className)) {
      return new TypeToken<Text>(){}.getType();
    }
    
    if ("TextData".equalsIgnoreCase(className)) {
      return new TypeToken<TextData>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
