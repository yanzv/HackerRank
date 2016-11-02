/*
 Fair Rations
 https://www.hackerrank.com/challenges/fair-rations
 
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

let numSubjects: [Int] = readLine()
var numBreads: [Int] = readLine()

var sum = 0
var count = 0

numBreads.map {sum+=$0}

if(sum % 2 != 0) {
    print("NO")
} else {
    for num in 0..<numBreads.count - 1 {
        if numBreads[num] % 2 != 0 {
            numBreads[num]+=1
            numBreads[num + 1]+=1
            count+=2
        }
    }
    print(count)
}