<h1> 📖 S.O.L.I.D</h1>

Os princípios SOLID são cinco princípios do design de classes orientado a objetos. Eles são um conjunto de regras e práticas recomendadas a serem seguidas na criação de uma estrutura de classe.
Esses cinco princípios nos ajudam a entender a necessidade de determinados padrões de projetos e arquitetura de software em geral.

<H2>Single Responsibility Principle (Princípio da responsabilidade única)</H2>

O princípio da responsabilidade única declara que uma classe deve fazer apenas uma coisa e, portanto, deve ter apenas uma razão para ser modificada.

<H2>Open-Closed (Aberto - Fechado)</H2>

O princípio de aberto/fechado diz que as classes devem estar abertas para extensão, mas fechadas para modificação.
Modificação significa alterar o código de uma classe existente, enquanto extensão significa adicionar novas funcionalidades.
O que esse princípio representa, portanto é que: devemos poder adicionar novas funcionalidades sem tocar no código existente para a classe. Isso se dá porque, sempre que modificamos o código existente, estamos nos arriscando a criar bugs em potencial. Assim, devemos evitar de tocar em código em produção testado e confiável (em grande parte), se possível.

<H2>Liskov Substitution (Substituição de Liskov)</H2>

O princípio da substituição de Liskov declara que as subclasses devem ser substituíveis por suas classes de base.
Isso quer dizer que, se a classe B for uma subclasse da classe A, devemos poder passar um objeto da classe B para qualquer método que espere um objeto da classe A e o método não deverá produzir resultados estranhos, nesse caso.
Esse é o comportamento esperado, pois, quando usamos a herança, levamos em conta que a classe filha herda tudo o que a superclasse tem. A classe filha estende o comportamento, mas nunca o reduz.
Portanto, quando uma classe não obedece esse princípio, isso causa alguns bugs ruins e difíceis de detectar.

<H2>Interface Segregation (Segregação por Interface)</H2>

Segregação quer dizer manter as coisas separadas. O princípio da segregação da interface tem a ver com separar as interfaces.
O princípio declara que muitas interfaces específicas do cliente são melhores que uma interface de propósito geral. Os clientes não devem ser forçados a implementar uma função que não necessitam.

<H2>Dependency Inversion (Inversão de Dependência)</H2>

O princípio da inversão da dependência declara que nossas classes devem depender de interfaces ou de classes abstratas em vez de classes concretas e de funções.

Uncle Bob resume esse princípio da seguinte maneira:

"Se o princípio de aberto/fechado declara o objetivo da arquitetura orientada a objetos, o princípio de inversão da dependência declara seu mecanismo principal".

Esses dois princípios, de fato, estão relacionados. Aplicamos esse padrão anteriormente enquanto discutíamos o princípio de aberto/fechado.

Queremos que nossas classes estejam abertas para extensão, por isso reorganizamos nossas dependências para que dependam de interfaces em vez de classes concretas. Nossa classe GerenteDePersistencia depende de PersistenciaDaFatura em vez de classes que implementam aquela interface.

FONTE: `https://www.freecodecamp.org/portuguese/news/os-principios-solid-da-programacao-orientada-a-objetos-explicados-em-bom-portugues/`
