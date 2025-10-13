let linha = "6\n1 1\n1 2\n1 3\n2 1\n2 2\n2 3\n6\n1 1\n1 2\n1 3\n2 3\n2 2\n2 1\n2\n1 1\n2 2\n4\n1 2\n1 1\n2 1\n2 2\n7\n1 2\n1 5\n1 1\n1 3\n2 5\n1 4\n2 4\n"
let lines = linha.trim().split('\n');

while (lines.length > 0) {
    let expressao = lines.shift();
    if (expressao === undefined || expressao.trim() === '') break;
    let n = parseInt(expressao.trim());

    let pilha = []
    let fila = []
    let filaPrioridade = []

    let p = true
    let f = true
    let fp = true

    for (let index = 0; index < n; index++) {
        let linhaOperacao = lines.shift();
        if (linhaOperacao === undefined) break;

        let [valor1, valor2] = linhaOperacao.split(' ').map(s => s.trim());
        
        let operacao = parseInt(valor1);
        let numero = parseInt(valor2); 

        if (operacao === 1) {
            if (p) pilha.push(numero)
            if (f) fila.push(numero)
            if (fp) filaPrioridade.push(-numero)
        } else {
            // Pilha (Stack: LIFO - remove do fim)
            if (p) {
                if (pilha.length === 0 || pilha.pop() !== numero) p = false
            }

            // Fila (Queue: FIFO - remove do início)
            if (f) {
                if (fila.length === 0 || fila.shift() !== numero) f = false
            }

            // Fila de Prioridade (Max-Heap simulada por Min-Heap de negativos)
            if (fp) {
                if (filaPrioridade.length === 0) {
                    fp = false
                } else {
                    // Busca e remove o menor valor (que é o maior número original negado)
                    let minValor = Math.min(...filaPrioridade);
                    let idx = filaPrioridade.indexOf(minValor);
                    filaPrioridade.splice(idx, 1);

                    // Compara o número original (negativo do valor extraído)
                    if (-minValor !== numero) fp = false
                }
            }
        }
    }

    if (p && !f && !fp) {
        console.log('stack');
    } else if (!p && f && !fp) {
        console.log('queue');
    } else if (!p && !f && fp) {
        console.log('priority queue');
    } else if (!p && !f && !fp) {
        console.log('impossible');
    } else {
        console.log('not sure');
    }
}