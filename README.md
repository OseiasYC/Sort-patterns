Equipe: 

MARCOS CARVALHO PACHECO,
IAGO ROQUE RIBEIRO NOVAES,
HARRISON BORGES DOS SANTOS,
LUCAS FARIAS DA SILVA,
OSEIAS LOPES DA SILVA


O fork de um projeto recente de final de semestre foi o objeto do nosso trabalho. Consiste em um sistema que cria arrays, os ordena, calcula o tempo gasto para a execução da ordenação completa, e exibe ao cliente as métricas. 
Durante o processo de desenvolvimento, nas tentativas de aplicar na prática os padrões de projeto notamos que um padrão pode se conectar a outros, pois durante o processo de implementar o pattern é possível “visualizar” caminhos para resolver problemas no entorno. 
Portanto, nos parece evidente que ao ampliar o repertório de padrões e aplicá-los em diferentes contextos a nossa perspectiva de possibilidades se ampliará. Até que o desenvolvedor não identifique possíveis melhorias a serem feitas, este ciclo de refatoração se repete. 
Aqui o escopo foi reduzido a aplicação de 3 padrões de projetos específicos: Factory Method, Command, Template  Method.





Template Method:

Pode ser bastante útil em situações onde existem algoritmos com sequência de passos quase que semelhantes, onde uma classe abstrata possui um método concreto de execução de uma operação ainda abstrata (um método template) com uma sequência de passos para a operação ser realizada, porém as subclasses que estenderem da classe abstrata são as que implementam determinados passos da operação template apenas com pequenas alterações isso é possível . Uma grande vantagem da aplicação do padrão é a possibilidade de evitar duplicação de código.
No caso do projeto aqui apresentado, ele foi útil para medir o tempo necessário para ordenação de arrays de diferentes configurações usando diferentes métodos de ordenação(QuickSort, HeapSort, etc).

![Template Method - UML](https://github.com/mcpmarcos/sort-patterns/assets/95505514/d0fb3ab1-7e87-4f4f-99ee-ca58306144b5)
 Fig.01


Foi criada a Classe abstrata “SortTimeMetrics”(Fig.02), que possui o template method. Cada subclasse será responsável por instanciar o invoker(nesse caso, a classe “SortInvoker” (Fig.XX)) de um comando de ordenação, calcular o custo de tempo para ordenar os arrays e também exibir no terminal as métricas de tempo.

![Abstract Class](https://github.com/mcpmarcos/sort-patterns/assets/95505514/31eb7b31-90f7-4fb6-8c96-43d4fd8bf1df)
Fig.02(Abstract class)

![Concrete Class Pt 1](https://github.com/mcpmarcos/sort-patterns/assets/95505514/500822e6-69ba-4f2f-a87e-4e2cfd45c9eb)
Fig.03(Concrete class)

![Concrete Class Pt 2 ](https://github.com/mcpmarcos/sort-patterns/assets/95505514/711514f4-bdd2-4a56-8830-097e7ada68d2)
Fig.04(Concrete class, continuação)





Factory Method:

Boa solução para se criar objetos abstratos representados através de uma interface, que pode ter seus detalhes especificados pelas classes concretas que as implementam. Nesse caso existe sempre uma relação definida e mantida entre um objeto abstrato(representado pela interface) e a classe abstrata que o cria. Essa estratégia proporciona um ponto de extensão para a eventual inclusão de novos subprodutos do  objeto gerado. 
Uma grande vantagem no uso é que este padrão promove o Open/Close Principle, quando eu precisar estender o comportamento uma funcionalidade do sistema, são minimizadas as chances de que se precise alterar algum código já existente, bastando escrever escrever o novo código.
No caso deste projeto, este padrão foi essencial para a criação genérica de vetores com diferentes configurações iniciais(vetores já ordenados, quase ordenados, randomizados e inversamente ordenados), também para a abstração do objeto “array” .

![Factory Method - UML](https://github.com/mcpmarcos/sort-patterns/assets/95505514/8f99bc7f-7ced-4412-8065-39147733c97b)
Fig.05
 
Para isso foi criada a interface “Array”(Fig.06), onde as classes concretas que as implementam retornando um array preenchido segundo os critérios daquela classe(por exemplo: “SortedArray” (Fig.07)) e também foi criada a classe abstrata “Arrayfactory”(Fig.08) com suas subclasses, responsáveis por determinar qual tipo de “Array” será instanciado(Fig.09).


![Product](https://github.com/mcpmarcos/sort-patterns/assets/95505514/1a0b4a88-56fd-4b59-b1bc-59c830b9737f)
Fig.06(Product)

![Concrete Product](https://github.com/mcpmarcos/sort-patterns/assets/95505514/bf680239-16f9-4686-a45f-b62c499e5078)
Fig.07(Concrete Product)

![Abstract Creator](https://github.com/mcpmarcos/sort-patterns/assets/95505514/c6696eae-f778-4151-9743-4fd17fef6dde)
Fig.08(Abstract Creator)

![Concrete Creator](https://github.com/mcpmarcos/sort-patterns/assets/95505514/cbbb7394-3b4d-428e-88a1-46c35312fa43)
Fig.09(Concrete Creator)






Command:

Uma alternativa para encapsular requisições em um objeto através de polimorfismo, sendo possível inserir parâmetros em minhas solicitações.  A ideia é desacoplar  o objeto que solicita uma operação daquele que tem conhecimento da lógica para executar a operação, isso traz um ganho de flexibilidade, além de promover o Single Responsibility Principle. Outras vantagens como facilidade para definir novos comandos que são independentes de classes já existentes.
Trazendo para o contexto deste projeto, o padrão Command foi importante para ser o intermédio entre o cliente que solicita a ordenação de um array seguindo métodos de ordenação específicos e o “receiver”, aquele quem executa a lógica da solicitação. Em casos mais simples de aplicação, pode não ser necessária a presença de uma classe que represente o “receiver”, podendo a própria classe concreta do Command ser a responsável por executar a lógica por trás da solicitação.

![Command pattern - UML](https://github.com/mcpmarcos/sort-patterns/assets/95505514/fe9f4fce-0cef-4799-b965-bf7f7227885c)
Fig.10

Foi criada uma interface “Command”(Fig.11) para ser a forma abstrata de um comando, que contém um único método que tem seu corpo definido pelas classes que implementam “Command”, sendo cada uma delas responsável por  ordenação de arrays seguindo algum método específico. 
 Por exemplo, um comando para ordenar arrays usando o método Bubble Sort(classe “BubbleSortCommand”(Fig.12)), outro usando Heap Sort(classe “HeapSortCommand”), outro usando Insertion Sort(classe “InsertionSortCommand”), etc. 
Nesse caso, por se tratar apenas da responsabilidade de ordenar um array, a classe concreta de comando acaba tendo também o papel de “receiver”.  Por fim, a classe “SortInvoker”(Fig.13) foi criada como sendo a representação de mais um componente deste padrão de projeto. O invoker é responsável por possuir a instância do comando que irá eventualmente executar, solicitar a execução do comando para uma classe concreta de comando. A classe concreta de comando é quem de fato  irá conhecer o “receiver”, no nosso caso, sendo o próprio “receiver” em si. 


![Interface Command](https://github.com/mcpmarcos/sort-patterns/assets/95505514/b23ee7cb-a3b8-43b0-b103-69605235506f)
Fig.11(Command)

![Concrete Command](https://github.com/mcpmarcos/sort-patterns/assets/95505514/77a089b8-6298-4589-b278-7fc0729491a4)
Fig.12(Concrete Command)

![Invoker](https://github.com/mcpmarcos/sort-patterns/assets/95505514/9453aaa3-b097-473d-a992-42f398c889a4)
Fig.13(Invoker)

Aprender padrões de projeto é importante porque eles fornecem soluções comprovadas e orientadas a objetos para problemas comuns no desenvolvimento de software, percebidas como boas práticas. Utilizá-los também contribui para a manutenibilidade e escalabilidade pois seguem princípios SOLID, com separação de responsabilidades, baixo acoplamento. 
Ao aprender e aplicar padrões de projeto, se desenvolvem habilidades valiosas, capacidade de ter mais insights que podem ser a solução para as situações mais problemáticas, capacidade ter uma noção de como está funcionando a interação dos componentes de um projeto, esse conhecimento coletivo pode contribuir positivamente para o trabalho em equipe, pois existe um vocabulário em comum. 
Um ponto importante é a refatoração, que será presente em um ciclo interminável. Porém a ideia é ter a ciência de que mudanças ou  novas funcionalidades  de um sistema, podem forçar refatorações, separar classes e funcionalidades em outras classes.



