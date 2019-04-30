
sealed class Operation

data class Publish(val text: String): Operation()

data class AddFriend(val publicKey: String): Operation()



fun main() {
    println(listOf(Publish("hello world")))
}