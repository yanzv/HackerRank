/*
 Minimum Distances
 https://www.hackerrank.com/challenges/minimum-distances/submissions/code/31473268
 
*/

import Foundation

public func getLine() -> String {
    var buf = String()
    var ch = getchar()
    // 10 is ascii code for newline
    while ch != EOF && ch != 10 {
        buf = buf + "\(ch)"
        ch = getchar()
    }
    return buf
}

public func readLn() -> [String] {
    return getLine().components(separatedBy: CharacterSet.whitespaces)
}

public func readLine() -> [Int] {
    let words: [String] = readLn()
    return words.map { Int($0)! }
}

let numIntegers: [Int] = readLine()
let input: [Int] = readLine()

var numDictionary = [Int : Int]()

var minDistance = Int.max

var pos = 0

for num in input {
    if let numPos = numDictionary[num] {
        numDictionary[num] = pos - numPos
        if numDictionary[num]! < minDistance {
            minDistance = numDictionary[num]!
        }
    } else {
        numDictionary[num] = pos
    }
    pos+=1
}

print(minDistance == Int.max ? -1 : minDistance)