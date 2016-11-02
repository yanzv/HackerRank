/*
 Flatland Space Stations
 
 https://www.hackerrank.com/challenges/flatland-space-stations
 
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

let info: [Int] = readLine()
var stationLocations: [Int] = readLine()

var previousStationLocation = -1

var maxDistance = 0

var pos = 0

if info[0] == info[1] {
    print(0)
} else {
    stationLocations = stationLocations.sorted()
    for station in stationLocations {
        if previousStationLocation == -1 {
            previousStationLocation = station
            maxDistance = station
        } else {
            let distance = (station - previousStationLocation) / 2
            maxDistance = max(distance, maxDistance)
            previousStationLocation = station
        }
    }
    
    print(max(maxDistance,(info[0] - previousStationLocation - 1)))
}