function solution(s) {
    s = s.toLowerCase()
    const words = s.split(' ')
    const convert = words.map((word) => {
        const first = word.substring(0, 1).toUpperCase()
        const rest = word.slice(1).toLowerCase()
        return first + rest
    })
    return convert.join(" ");
}