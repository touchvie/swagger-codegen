# swagger-android-client

## Requirements

Building the API client library requires [Maven](https://maven.apache.org/) to be installed.

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn deploy
```

Refer to the [official documentation](https://maven.apache.org/plugins/maven-deploy-plugin/usage.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
    <groupId>io.swagger</groupId>
    <artifactId>swagger-android-client</artifactId>
    <version>1.0.0</version>
    <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-android-client:1.0.0"
```

### Others

At first generate the JAR by executing:

    mvn package

Then manually install the following JARs:

* target/swagger-android-client-1.0.0.jar
* target/lib/*.jar

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import io.swagger.client.api.DefaultApi;

public class DefaultApiExample {

    public static void main(String[] args) {
        DefaultApi apiInstance = new DefaultApi();
        String authorization = "authorization_example"; // String | Authorization token ('Bearer <token>')
        String cardId = "cardId_example"; // String | Provided card ID (value of the 'card_id' field)
        String version = "version_example"; // String | Provided card version (value of the 'version' field)
        String acceptLanguage = "acceptLanguage_example"; // String | Client locale, as <language>-<country>
        String contentType = "contentType_example"; // String | application/json
        Boolean relations = false; // Boolean | Indicates if the received scene cards should contain the scene hierarchy (true) or be a flat list of the main scene items (false)
        String imageSize = "m"; // String | Size of the images returned in the response
        try {
            Card result = apiInstance.cardsCardIdVersionsVersionGet(authorization, cardId, version, acceptLanguage, contentType, relations, imageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#cardsCardIdVersionsVersionGet");
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://pre-api.touchvie.com/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DefaultApi* | [**cardsCardIdVersionsVersionGet**](docs/DefaultApi.md#cardsCardIdVersionsVersionGet) | **GET** /cards/{card_id}/versions/{version} | Full card detail
*DefaultApi* | [**channelsChannelIdListReadyGet**](docs/DefaultApi.md#channelsChannelIdListReadyGet) | **GET** /channels/{channel_id_list}/ready | Channel sync availability
*DefaultApi* | [**channelsChannelIdStaticGet**](docs/DefaultApi.md#channelsChannelIdStaticGet) | **GET** /channels/{channel_id}/static | One-shot channel scene
*DefaultApi* | [**moviesClientMovieIdListReadyGet**](docs/DefaultApi.md#moviesClientMovieIdListReadyGet) | **GET** /movies/{client_movie_id_list}/ready | Movie sync availability
*DefaultApi* | [**moviesClientMovieIdStaticTimestampGet**](docs/DefaultApi.md#moviesClientMovieIdStaticTimestampGet) | **GET** /movies/{client_movie_id}/static/{timestamp} | One-shot movie scene
*DefaultApi* | [**tokenPost**](docs/DefaultApi.md#tokenPost) | **POST** /token | Token endpoint


## Documentation for Models

 - [AccessToken](docs/AccessToken.md)
 - [AuthError](docs/AuthError.md)
 - [AwardData](docs/AwardData.md)
 - [Awards](docs/Awards.md)
 - [AwardsData](docs/AwardsData.md)
 - [Card](docs/Card.md)
 - [CardContainer](docs/CardContainer.md)
 - [Catalog](docs/Catalog.md)
 - [CatalogData](docs/CatalogData.md)
 - [CatalogSync](docs/CatalogSync.md)
 - [ChannelStatus](docs/ChannelStatus.md)
 - [Duple](docs/Duple.md)
 - [DupleData](docs/DupleData.md)
 - [Image](docs/Image.md)
 - [ImageData](docs/ImageData.md)
 - [Link](docs/Link.md)
 - [LinkData](docs/LinkData.md)
 - [Listing](docs/Listing.md)
 - [ListingData](docs/ListingData.md)
 - [Map](docs/Map.md)
 - [MapData](docs/MapData.md)
 - [MovieStatus](docs/MovieStatus.md)
 - [Rating](docs/Rating.md)
 - [RatingData](docs/RatingData.md)
 - [RelationModule](docs/RelationModule.md)
 - [Seasons](docs/Seasons.md)
 - [SeasonsChapters](docs/SeasonsChapters.md)
 - [SeasonsData](docs/SeasonsData.md)
 - [Single](docs/Single.md)
 - [SourceData](docs/SourceData.md)
 - [Text](docs/Text.md)
 - [TextData](docs/TextData.md)


## Documentation for Authorization

All endpoints do not require authorization.
Authentication schemes defined for the API:

## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



