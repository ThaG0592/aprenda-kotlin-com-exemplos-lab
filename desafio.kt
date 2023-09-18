// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario (val idade: Int, var  nomeCompleto: String)

class ConteudoEducacional(val duracao: Int, var  nome: String)


data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
          println(usuario)       
    }
}

fun main() {  
    
   	val usuario1 = Usuario(20, "João Oliveira 4")  
    val usuario2 = Usuario(15, "Maria Joana")  
    val usuario3 = Usuario(25, "Zé da esquina") 
       
    println("Usuários Cadastrados ")
    println("Nome do Usuário " + usuario1.nomeCompleto + " Idade do Usuário: " + usuario1.idade)  
    println("Nome do Usuário " + usuario2.nomeCompleto + " Idade do Usuário: " + usuario2.idade)  
    println("Nome do Usuário " + usuario3.nomeCompleto + " Idade do Usuário: " + usuario3.idade) 
    
    println("-----------------------------------------------------------")   
    println("-----------------------Teste-------------------------------")
    println("-----------------------------------------------------------")

 	val usuario = Usuario(20, "João Oliveira 4")   
    println("Idade do Usuário: " + usuario.idade)                      
    println("Nome do Usuário " + usuario.nomeCompleto)

    val conteudo = ConteudoEducacional(50, "Desenvolvimento de Sistemas")                      
    println("Nome do Curso: " + conteudo.nome)
    println("Hora de duração do curso: " + conteudo.duracao) 
    
 
}

