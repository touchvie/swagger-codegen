//
// AccessToken.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class AccessToken: JSONEncodable {
    public enum TokenType: String { 
        case RAWBEARER_ENUMBEARER = "'{raw=bearer, enum=Bearer}'"
    }
    public enum Scope: String { 
        case RAWDEVICE_ENUMDEVICE = "'{raw=device, enum=Device}'"
    }
    /** Auth token, must be included on every API request */
    public var accessToken: String?
    /** Token type */
    public var tokenType: TokenType?
    /** Allows to issue new access tokens without resending client credentials */
    public var refreshToken: String?
    /** Expiration time (in seconds). */
    public var expiresIn: Int32?
    /** Granted auth scope */
    public var scope: Scope?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["access_token"] = self.accessToken
        nillableDictionary["token_type"] = self.tokenType?.rawValue
        nillableDictionary["refresh_token"] = self.refreshToken
        nillableDictionary["expires_in"] = self.expiresIn?.encodeToJSON()
        nillableDictionary["scope"] = self.scope?.rawValue
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
