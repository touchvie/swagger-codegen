//
// DupleData.swift
//
// Generated by swagger-codegen
// https://github.com/swagger-api/swagger-codegen
//

import Foundation


open class DupleData: JSONEncodable {
    /** Indicates the relationship between the pair of cards (from &gt; rel_type &gt; to) */
    public var relType: String?
    public var from: Card?
    public var to: Card?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["rel_type"] = self.relType
        nillableDictionary["from"] = self.from?.encodeToJSON()
        nillableDictionary["to"] = self.to?.encodeToJSON()
        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
