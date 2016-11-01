/*

Equalize the Array
 
https://www.hackerrank.com/challenges/equality-in-a-array

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

var maxNumOccurrences = 1

var pos = 0

for num in input {
    if let numPos = numDictionary[num] {
        numDictionary[num]! += 1
        if numDictionary[num]! > maxNumOccurrences {
            maxNumOccurrences = numDictionary[num]!
        }
    } else {
        numDictionary[num] = 1
    }
    pos+=1
}

print("\(input.count - maxNumOccurrences)")