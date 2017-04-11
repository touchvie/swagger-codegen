# DefaultApi

All URIs are relative to *https://pre-api.touchvie.com/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getCardVersion**](DefaultApi.md#getCardVersion) | **GET** /cards/{card_id}/versions/{version} | Full card detail
[**getReadyChannels**](DefaultApi.md#getReadyChannels) | **GET** /channels/{channel_id_list}/ready | Channel sync availability
[**getReadyMovies**](DefaultApi.md#getReadyMovies) | **GET** /movies/{client_movie_id_list}/ready | Movie sync availability
[**getStaticChannelScene**](DefaultApi.md#getStaticChannelScene) | **GET** /channels/{channel_id}/static | One-shot channel scene
[**getStaticMovieScene**](DefaultApi.md#getStaticMovieScene) | **GET** /movies/{client_movie_id}/static/{timestamp} | One-shot movie scene
[**postToken**](DefaultApi.md#postToken) | **POST** /token | Token endpoint


<a name="getCardVersion"></a>
# **getCardVersion**
> Card getCardVersion(authorization, cardId, version, acceptLanguage, contentType, relations, imageSize)

Full card detail

Retrieves a full card detail, and optionally its relations to other cards

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String authorization = "authorization_example"; // String | Authorization token ('Bearer <token>')
String cardId = "cardId_example"; // String | Provided card ID (value of the 'card_id' field)
String version = "version_example"; // String | Provided card version (value of the 'version' field)
String acceptLanguage = "acceptLanguage_example"; // String | Client locale, as <language>-<country>
String contentType = "contentType_example"; // String | application/json
Boolean relations = false; // Boolean | Indicates if the received scene cards should contain the scene hierarchy (true) or be a flat list of the main scene items (false)
String imageSize = "m"; // String | Size of the images returned in the response
try {
    Card result = apiInstance.getCardVersion(authorization, cardId, version, acceptLanguage, contentType, relations, imageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getCardVersion");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization token (&#39;Bearer &lt;token&gt;&#39;) |
 **cardId** | **String**| Provided card ID (value of the &#39;card_id&#39; field) |
 **version** | **String**| Provided card version (value of the &#39;version&#39; field) |
 **acceptLanguage** | **String**| Client locale, as &lt;language&gt;-&lt;country&gt; | [optional]
 **contentType** | **String**| application/json | [optional]
 **relations** | **Boolean**| Indicates if the received scene cards should contain the scene hierarchy (true) or be a flat list of the main scene items (false) | [optional] [default to false]
 **imageSize** | **String**| Size of the images returned in the response | [optional] [default to m] [enum: s, m, l]

### Return type

[**Card**](Card.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReadyChannels"></a>
# **getReadyChannels**
> List&lt;ChannelStatus&gt; getReadyChannels(authorization, channelIdList, acceptLanguage, contentType)

Channel sync availability

Checks if a list of client channel identifiers are currently broadcasting synchronizable content

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String authorization = "authorization_example"; // String | Authorization token ('Bearer <token>')
List<String> channelIdList = Arrays.asList("channelIdList_example"); // List<String> | List of client channel IDs as a comma separated list
String acceptLanguage = "acceptLanguage_example"; // String | Client locale, as <language>-<country>
String contentType = "contentType_example"; // String | application/json
try {
    List<ChannelStatus> result = apiInstance.getReadyChannels(authorization, channelIdList, acceptLanguage, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getReadyChannels");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization token (&#39;Bearer &lt;token&gt;&#39;) |
 **channelIdList** | [**List&lt;String&gt;**](String.md)| List of client channel IDs as a comma separated list |
 **acceptLanguage** | **String**| Client locale, as &lt;language&gt;-&lt;country&gt; | [optional]
 **contentType** | **String**| application/json | [optional]

### Return type

[**List&lt;ChannelStatus&gt;**](ChannelStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getReadyMovies"></a>
# **getReadyMovies**
> List&lt;MovieStatus&gt; getReadyMovies(authorization, clientMovieIdList, acceptLanguage, contentType)

Movie sync availability

Checks whether a list of client movie identifiers (Video On Demand) are available to be synchronized using the Dive API

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String authorization = "authorization_example"; // String | Authorization token ('Bearer <token>')
List<String> clientMovieIdList = Arrays.asList("clientMovieIdList_example"); // List<String> | List of client movie IDs, provided as a comma separated list
String acceptLanguage = "acceptLanguage_example"; // String | Client locale, as <language>-<country>
String contentType = "contentType_example"; // String | application/json
try {
    List<MovieStatus> result = apiInstance.getReadyMovies(authorization, clientMovieIdList, acceptLanguage, contentType);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getReadyMovies");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization token (&#39;Bearer &lt;token&gt;&#39;) |
 **clientMovieIdList** | [**List&lt;String&gt;**](String.md)| List of client movie IDs, provided as a comma separated list |
 **acceptLanguage** | **String**| Client locale, as &lt;language&gt;-&lt;country&gt; | [optional]
 **contentType** | **String**| application/json | [optional]

### Return type

[**List&lt;MovieStatus&gt;**](MovieStatus.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStaticChannelScene"></a>
# **getStaticChannelScene**
> List&lt;Card&gt; getStaticChannelScene(authorization, channelId, acceptLanguage, contentType, relations, imageSize)

One-shot channel scene

Retrieves the list of cards related to the content currently being broadcasted in the provided channel

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String authorization = "authorization_example"; // String | Authorization token ('Bearer <token>')
String channelId = "channelId_example"; // String | Client channel ID
String acceptLanguage = "acceptLanguage_example"; // String | Client locale, as <language>-<country>
String contentType = "contentType_example"; // String | application/json
Boolean relations = false; // Boolean | Indicates if the received scene cards should contain the scene hierarchy (true) or be a flat list of the main scene items (false)
String imageSize = "m"; // String | Size of the images returned in the response
try {
    List<Card> result = apiInstance.getStaticChannelScene(authorization, channelId, acceptLanguage, contentType, relations, imageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStaticChannelScene");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization token (&#39;Bearer &lt;token&gt;&#39;) |
 **channelId** | **String**| Client channel ID |
 **acceptLanguage** | **String**| Client locale, as &lt;language&gt;-&lt;country&gt; | [optional]
 **contentType** | **String**| application/json | [optional]
 **relations** | **Boolean**| Indicates if the received scene cards should contain the scene hierarchy (true) or be a flat list of the main scene items (false) | [optional] [default to false]
 **imageSize** | **String**| Size of the images returned in the response | [optional] [default to m] [enum: s, m, l]

### Return type

[**List&lt;Card&gt;**](Card.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getStaticMovieScene"></a>
# **getStaticMovieScene**
> List&lt;Card&gt; getStaticMovieScene(authorization, clientMovieId, timestamp, acceptLanguage, contentType, relations, imageSize)

One-shot movie scene

Retrieves the current list of cards related to the given movie scene

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String authorization = "authorization_example"; // String | Authorization token ('Bearer <token>')
String clientMovieId = "clientMovieId_example"; // String | Client movie ID being played
Float timestamp = 3.4F; // Float | Current movie timestamp in seconds
String acceptLanguage = "acceptLanguage_example"; // String | Client locale, as <language>-<country>
String contentType = "contentType_example"; // String | application/json
Boolean relations = false; // Boolean | Indicates if the received scene cards should contain the scene hierarchy (true) or be a flat list of the main scene items (false)
String imageSize = "m"; // String | Size of the images returned in the response
try {
    List<Card> result = apiInstance.getStaticMovieScene(authorization, clientMovieId, timestamp, acceptLanguage, contentType, relations, imageSize);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#getStaticMovieScene");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Authorization token (&#39;Bearer &lt;token&gt;&#39;) |
 **clientMovieId** | **String**| Client movie ID being played |
 **timestamp** | **Float**| Current movie timestamp in seconds |
 **acceptLanguage** | **String**| Client locale, as &lt;language&gt;-&lt;country&gt; | [optional]
 **contentType** | **String**| application/json | [optional]
 **relations** | **Boolean**| Indicates if the received scene cards should contain the scene hierarchy (true) or be a flat list of the main scene items (false) | [optional] [default to false]
 **imageSize** | **String**| Size of the images returned in the response | [optional] [default to m] [enum: s, m, l]

### Return type

[**List&lt;Card&gt;**](Card.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="postToken"></a>
# **postToken**
> AccessToken postToken(authorization, grantType, acceptLanguage, contentType, deviceId, refreshToken)

Token endpoint

The token endpoint is used to obtain access tokens which allow clients to make API requests

### Example
```java
// Import classes:
//import io.swagger.client.api.DefaultApi;

DefaultApi apiInstance = new DefaultApi();
String authorization = "authorization_example"; // String | Basic authorization token ('Basic <client_key>')
String grantType = "grantType_example"; // String | Grant type used to obtain the token.
String acceptLanguage = "acceptLanguage_example"; // String | Client locale, as <language>-<country>
String contentType = "contentType_example"; // String | application/json
String deviceId = "deviceId_example"; // String | Device identifier, must uniquely identify the user or device accessing the API. Required only for \"device_credentials\" grant type
String refreshToken = "refreshToken_example"; // String | Refresh token, used to issue a new token without resending client credentials. Required only for \"refresh_token\" grant type
try {
    AccessToken result = apiInstance.postToken(authorization, grantType, acceptLanguage, contentType, deviceId, refreshToken);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DefaultApi#postToken");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **authorization** | **String**| Basic authorization token (&#39;Basic &lt;client_key&gt;&#39;) |
 **grantType** | **String**| Grant type used to obtain the token. | [enum: device_credentials, refresh_token]
 **acceptLanguage** | **String**| Client locale, as &lt;language&gt;-&lt;country&gt; | [optional]
 **contentType** | **String**| application/json | [optional]
 **deviceId** | **String**| Device identifier, must uniquely identify the user or device accessing the API. Required only for \&quot;device_credentials\&quot; grant type | [optional]
 **refreshToken** | **String**| Refresh token, used to issue a new token without resending client credentials. Required only for \&quot;refresh_token\&quot; grant type | [optional]

### Return type

[**AccessToken**](AccessToken.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

