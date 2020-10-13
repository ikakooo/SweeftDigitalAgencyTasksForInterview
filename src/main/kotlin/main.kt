

fun main() {
////////////////////შეამოწმე სიტყვა თუ არის პალინდრომი/////////////////////////
    println("Task1")
    println("პალინდრომია? -" + Task1.isPalindrome("ikiiki"))
    println("პალინდრომია? -" + Task1.isPalindrome("დგგ"))
    println("პალინდრომია? -" + Task1.isPalindrome("იკი"))
/////////////Task2///ოპტიმალური ხურდა////////////////////////////////////////
    println("Task2")
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsOOP(5262675))
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsComplexPOP(5262675))
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsOOP(6))
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsComplexPOP(6))
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsOOP(26))
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsComplexPOP(26))
///////////Task3//////////////////////////////////////////////////////////////////////////////
    val array = intArrayOf(1,2,3,4,5,6,7,8,9,10,10,0,0,-11,12,-13,4,7,16,14,66,77, 5,2,3,6,8,11,15, 10, 20, 50)
    println("ერეიში არ არის რიცხვი: " + Task3.notContains(array))

    println("Hello World!")
}