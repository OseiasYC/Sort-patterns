package sort.patterns.sortcommand;

public class MergeSortCommand implements Command {

    public Integer[] array;
    Integer tamanho;

    public MergeSortCommand(Integer[] array) {
        this.array = array;
        this.tamanho = array.length;
    }

    public Integer[] execute() {
        Integer[] array = this.array;
        mergeSort(array, tamanho);
        return array;
    }

    private static void mergeSort(Integer[] vetor, Integer tamanho) {
        Integer elementos = 1;
        Integer inicio, meio, fim;

        while (elementos < tamanho) {
            inicio = 0;

            while (inicio + elementos < tamanho) {
                meio = inicio + elementos;
                fim = inicio + 2 * elementos;

                if (fim > tamanho)
                    fim = tamanho;

                intercala(vetor, inicio, meio, fim);

                inicio = fim;
            }

            elementos = elementos * 2;
        }
    }

    private static void intercala(Integer[] vetor, Integer inicio, Integer meio, Integer fim) {
        Integer novoVetor[] = new Integer[fim - inicio];
        Integer i = inicio;
        Integer m = meio;
        Integer pos = 0;

        while (i < meio && m < fim) {
            if (vetor[i] <= vetor[m]) {
                novoVetor[pos] = vetor[i];
                pos = pos + 1;
                i = i + 1;
            } else {
                novoVetor[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
        }

        while (i < meio) {
            novoVetor[pos] = vetor[i];
            pos = pos + 1;
            i = i + 1;
        }

        while (m < fim) {
            novoVetor[pos] = vetor[m];
            pos = pos + 1;
            m = m + 1;
        }

        for (pos = 0, i = inicio; i < fim; i++, pos++) {
            vetor[i] = novoVetor[pos];
        }
    }
}
