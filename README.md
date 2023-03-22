# Desligamento Automatizado

A intenção e bem simples desse projeto, 
documentar um processo de criação de um 
projeto em JavaFX, da sua criação até a 
compilação.

O design do aplicativo é bem simples. 
Você pode adicionar o tempo para desligamento
e reinicio do computador, sem precisar digitar
o comando ```shutdown -s -t 0```.

![Tela principal](https://i.imgur.com/c9rTICH.png)

Sem grandes expectativas...

---
## Compilando o projeto...
No caso, uso o Intellij para estar programando em Java,
então para a outra IDE's o processo é diferente.

Essa plaicação foi feita com o Java17. É necessario que a 
SDK do JavaFX tenha a mesma versão, pois pode ter problemas 
de compilação.
---

**Para Compilar**

- Primeiro, e necessário estar instanciando a classe de 
inicialização, em outra classe, pois por algum motivo, 
não é possível compilar o projeto na classe que extende 
Application.

![](https://i.imgur.com/XAofCT2.png)

**Preparando para compilar.**
![](https://i.imgur.com/hv8ZuBI.gif)
Na seção de Main Class, escolha a classe que inicializa
a classe que extende Application.


Depois só clicar em Build -> Build Artifact -> Build

![](https://i.imgur.com/dL2n53t.gif)

O arquivo JAR vai estar na pasta com o nome do projeto -> 
out -> artifact.







