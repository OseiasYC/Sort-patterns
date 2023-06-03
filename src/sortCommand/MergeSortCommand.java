package sortCommand;

public class MergeSortCommand implements Command {

        public Integer[] array;
        int inicio;
        int fim;

        public  MergeSortCommand(Integer[] array, int inicio, int fim){
            this.array = array;
            this.inicio = inicio;
            this.fim = fim;
        }
    
        public Integer[] execute(){
            mergeSort(this.array, inicio, fim);
            return array;
        }

        public void mergeSort(Integer[] x, int inicio, int fim) {
            int meio;
            if (inicio < fim) {
                meio = (inicio + fim) / 2;
                mergeSort(x, inicio, meio);
                mergeSort(x, meio + 1, fim);
                intercala(x, inicio, meio, fim);
            }
        }

        private void intercala(Integer[] vetor, int inicio, int meio, int fim) {
            int array[] = new int[fim - inicio];
            int i = inicio;
            int m = meio;
            int pos = 0;
    
            while (i < meio && m < fim) {
                if (vetor[i] <= vetor[m]) {
                    array[pos] = vetor[i];
                    pos = pos + 1;
                    i = i + 1;
                } else {
                    array[pos] = vetor[m];
                    pos = pos + 1;
                    m = m + 1;
                }
            }
    
            while (i < meio) {
                array[pos] = vetor[i];
                pos = pos + 1;
                i = i + 1;
            }
    
            while (m < fim) {
                array[pos] = vetor[m];
                pos = pos + 1;
                m = m + 1;
            }
    
            for (pos = 0, i = inicio; i < fim; i++, pos++) {
                vetor[i] = array[pos];
            }
        }
    
}
