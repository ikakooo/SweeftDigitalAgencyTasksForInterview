

fun main() {
////////////////////შეამოწმე სიტყვა თუ არის პალინდრომი/////////////////////////
    println("Task1")
    println("პალინდრომია? -" + Task1.isPalindrome("ikiiki"))
    println("პალინდრომია? -" + Task1.isPalindrome("დგგ"))
    println("პალინდრომია? -" + Task1.isPalindrome("იკი"))
    println("პალინდრომია? -" + Task1.isPalindrome("(()())"))
/////////////Task2///ოპტიმალური ხურდა////////////////////////////////////////
    println("Task2")
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsOOP(5262675))
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsComplexPOP(5262675))
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsOOP(6))
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsComplexPOP(6))
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsOOP(26))
    println("მინიმალური მონეტების რაოდენობა: " + Task2.minCoinsComplexPOP(26))
///////////Task3//////////////////////////////////////////////////////////////////////////////
    println("Task3")
    val array = intArrayOf(1,13,17,17,2,3,4,5,6,7,8,9,10,10,0,0,-11,12,-13,4,7,16,14,66,77,5,2,3,6,8,11,15, 10, 20, 50)
    println("ერეიში არ არის რიცხვი: " + Task3.notContains(array))
/////////////////////Task4///////////////////////////////////////////////////////////////////////////////
    println("Task4")
    println("ყველა ბრჩხილი დახურულია? " +Task4.isProperly("{{{}{}{{"))
    println("ყველა ბრჩხილი დახურულია? " +Task4.isProperly("[[[]][]]"))
    println("ყველა ბრჩხილი დახურულია? " +Task4.isProperly("())()"))
    println("ყველა ბრჩხილი დახურულია? " +Task4.isProperly("(()())"))
////////////////////Task5/////////////////////////////////////////////////////////////////////////////////
    println("Task5")
    println("კომბინაციების რაოდენობა: " + Task5.countVariants(6))
///////////////////Task6/////////////////////////////////////////////////////////////////////////////////
    println("Task6")
//////////ქოლექშენ ფუნქციები ყველაზე კარგი დათა სტრუქტურებია ანდროიდში//////////////////////////////////////////////////
///////////კოტლინში გვაქვს მუთაბლე კონტეინერები რომლებიც საშუალებას გვაძლევენ დავამოტოთ და წავშალოთ ელემენტები//////////
    val list = mutableListOf( 1 , 2 , 3 , 4 )
    val map = mutableMapOf(1 to "a", 2 to "b", 3 to "c",4 to "c",5 to "d")
    val set = mutableSetOf( 1 , 2 , 3 , 4 )
    list.removeAt(3)///იშლება მონაცემი ინდექსის მითითებით
    map.remove(2)///იშლება მონაცემი გასაღების მითითებით
    set.remove(1)///იშლება მონაცემი მონაცემის მითითებით
    println(list)
    println(map)
    println(set)
//////////////////////////////Task8/////////////////////////////////////
    println("Task8")
    println("ექსემელის გაპარსვა და დასეტვა ნაჩვენებია ამ რეპოზიტორიაზე ->")
    println("https://github.com/ikakooo/XMLParsing")
    println("AppVideo:")
    println("https://drive.google.com/file/d/1GiV3t15m3RQrfyDNuERysnROuXbxLtrl/view")




}