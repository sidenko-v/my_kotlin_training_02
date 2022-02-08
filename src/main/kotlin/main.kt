//Упростим задачу, чтобы было проще: за переводы с любых карт комиссия 0.75%, минимум 35 рублей.
//Что нужно сделать: напишите небольшую программу, в которой в переменной amount хранится сумма перевода в копейках.
//
//Ваше приложение должно высчитывать комиссию, которую заплатит пользователь при переводе — комиссия также должна быть в копейках.
//
//Итог: у вас должен быть репозиторий на GitHub, в котором расположен ваш Gradle-проект.
//
//https://github.com/netology-code/kt-homeworks/tree/master/02_basics

fun main() {

    val commissionPercentage = 0.75F
    val minCommissionInRub = 35F
    val initTransferAmountInRub = 5000.50F

    val minCommissionInKopecks: Int = (minCommissionInRub * 100).toInt()
    val initTransferAmountInKopecks: Int = (initTransferAmountInRub * 100).toInt()
    val initUserCommissionInKopecks: Int = (initTransferAmountInKopecks * commissionPercentage / 100).toInt()

    var finalUserCommissionInKopecks: Int = 0
    var amount: Int = 0


    if (initUserCommissionInKopecks > minCommissionInKopecks) {
        finalUserCommissionInKopecks = initUserCommissionInKopecks
    } else {
        finalUserCommissionInKopecks = minCommissionInKopecks
    }

    println("Комиссия в копейках " + finalUserCommissionInKopecks)

    amount = initTransferAmountInKopecks + finalUserCommissionInKopecks

    println("Итоговая сумма перевода в копейках " + amount)

}


