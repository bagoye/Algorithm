const readline = require('readline').createInterface({
  input: process.stdin,
  output: process.stdout,
});

let input = [];

readline.on('line', function(line) {
  input.push(line.split(' ').map(el => parseInt(el)));
}).on('close', function() {
  function solution() {
  const arr = input.slice(1).map(pair => pair.map(Number));
  const result = [];

  for (let i = 0; i < arr.length; i++) {
    let rank = 1;

    for (let j = 0; j < arr.length; j++) {
      if (i !== j && arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
        rank += 1;
      }
    }

    result.push(rank);
  }

  console.log(result.join(' '));
}

solution();
  process.exit();
});