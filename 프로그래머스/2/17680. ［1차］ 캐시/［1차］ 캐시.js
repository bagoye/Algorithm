function solution(cacheSize, cities) {
    var answer = 0;
    let cache = [];
    
    if (cacheSize === 0) {
        return cities.length * 5;
    }
    
    for (let i = 0; i < cities.length; i++) {
        const city = cities[i].toLowerCase();
        if (cache.includes(city)) {
            cache.splice(cache.indexOf(city), 1);
            cache.push(city);
            answer += 1;
        } else {
            if (cache.length === cacheSize) {
                cache.shift();
            }
            cache.push(city);
            answer += 5;
        }
    }
        
    return answer;
}