# Padrao-Projeto-Prototype-GOF

### Jogo simulando a força de um Zumbi utilizando Padrão de Projeto Prototype - GOF :alien:

Atividade proposta pelo Prof. Adilson Vahldick - Universidade do Estado de Santa Catarina - UDESC

Intenção: Especificar os tipos de objetos a serem criados usando uma instância-protótipo e criar novos objetos pela cópia desse protótipo.

Aplicabilidade: Use o padrão Prototype quando um sistema tiver que ser independente de como os seus produtos são criados, compostos e representados, e:

- Quando as classes a instanciar forem especificadas em tempo de execução, por exemplo por carga dinâmica; ou
- Para evitar a contrução de uma hierarquia de classes de fábricas paralela à hierarquia de classes de produto; ou
- Quando as instâncias de uma classe puderem ter uma dentre poucas combinações diferentes de estados. Pode ser mais conveniente instalar um número correspondente de protótipos e cloná-los, ao invés de instanciar a classe manualmente, cada vez com um estado apropriado.

#### Estrutura:

![Estrutura Prototype](https://github.com/camimassaneiro/Padrao-Projeto-Prototype-GOF/blob/master/Estrutura%20prototype.PNG)

Participantes:

- Prototype: declara uma interface para clonar a si próprio.
- ConcretePrototype: implementa uma operação para clonar a si próprio.
- Client: cria um novo objeto solicitando a um protótipo que clone a si próprio.

Referência:
GAMMA, E. et al. Padrões de projeto: soluções reutilizáveis de software orientado a objetos.
Porto Alegre: Bookman, 2000. 
