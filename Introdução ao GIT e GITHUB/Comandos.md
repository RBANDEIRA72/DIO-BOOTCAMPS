# Introdução ao Git e GitHub #

## Primeiros comandos com o GIT



- Iniciar o GIT
- Iniciar o versionamento
- Criar um commit



**COMANDOS**

- git init - Iniciar o repositorio do git 
- git add - Mover arquivos
- git commit - Criar o commit



### Criando um repositório

A pasta oculta : .git
É chamada de pasta gerenciao do GIT.
É aonde o GIT versiona os objetos, as versões dos arquivos.[

**FLAGS**

- **-a** - Mostrar arquivos ocultos no diretório

**COMANDOS**

```
$ git add *
```

// ***** significa adicionar todos os arquivos que 

```
$ git commit -m "MEBSAGEN DE TEXTO"
```

// significa mensagem de texto, comentário do autor





- **git config --global --unset user.email** - auterar o email usuario;
- **git config --global -user.email "[EMAIL]"** - adicionar email usuario;
- **git remote add origin [URL.GIT]**  - Empurrar o repositório **LOCAL** para o repositório **REMOTO**;
- **git remote -v** - Lista os repositórios **REMOTOS** que tem cadastrado;
- O nome **origin** poderia ser **QUALQUER** nome, por padrao se utiliza o nome **origin** para identificar a **URL** cadastrada, para nao ter que ficar digitando a url novamente, agora ela passaria a ser chamada de **origin**;
- **git push origin master**  - **Empurrar (push)** os commit para o repositório **origin** 

  

  

  ## [Usando um token na linha de comando](https://docs.github.com/en/github/authenticating-to-github/keeping-your-account-and-data-secure/creating-a-personal-access-token#using-a-token-on-the-command-line)

  Depois de ter um token, você pode inseri-lo em vez de sua senha ao executar operações Git sobre HTTPS.

  Por exemplo, na linha de comando, você digitaria o seguinte:

  ```shell
  $ git clone https://github.com/username/repo.git
  Username: your_username
  Password: your_token
  ```

  

