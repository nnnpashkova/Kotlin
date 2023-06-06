package lesson17

fun main() {
    val quiz = Quiz()
    println("Вопрос викторины: ${quiz.question}")
    println("Ответ викторины: ${quiz.answer}")
    quiz.question = "Саленое море"
    println("Новый вопрос викторины: ${quiz.question}")
    quiz.answer = "Саленое море"
    println("Новый ответ викторины: ${quiz.answer}")
}

class Quiz(
) {
    var question = "Назовите самое соленое море в Мировом океане "
        get() = "В это озеро в России впадает 336 рек, а вытекает только одна. Что это за озеро?"
    var answer = "Красное"
        get() = field
        set(value) {
            field = "Байкал"
        }
}

