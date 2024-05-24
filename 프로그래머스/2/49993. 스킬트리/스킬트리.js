function solution(skill, skill_trees) {
    var answer = 0;
    
    // 스킬트리엣 선행스킬 순서에 있는 스킬만 필터링
    let filteredTrees = skill_trees.map(tree => {
        return tree.split("").filter(el => skill.includes(el))
    }) // "CBD" ["BACDE"] => ["B", "C", "D"]
        
    // 필터링된 스킬트리가 선행 스킬 순서를 올바르게 따르는지 확인
    for (let i = 0; i < filteredTrees.length; i++) {
        let isValid = true;
        for (let j = 0; j < filteredTrees[i].length; j++) {
            if(skill[j] !== filteredTrees[i][j]) {
                isValid = false;
                break;
            }
        }
        if (isValid) {
            answer++;
        }
    }
    return answer;
}