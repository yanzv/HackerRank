/*
Sock Merchant
https://www.hackerrank.com/challenges/sock-merchant
*/

import Cocoa
import Foundation

var socksDict = [String:Int]()

if var input = readLine(stripNewline: true) {
    let numOfSocks = Int(input)
    if let socksInput = readLine(stripNewline: true){
        let socksArray = socksInput.characters.split(" ").map(String.init)
        for var color in socksArray {
            if socksDict[color] != nil {
                socksDict[color]! += 1
            } else {
                socksDict[color] = 1
            }
        }
    }
    
    var countPairs = 0
    for var count in socksDict.values {
        countPairs += count  / 2
    }
    print(countPairs)
}