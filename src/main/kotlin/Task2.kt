object Task2 {
    /////////ვამჯობინე რომ გამომეყენებინა ნაკლები პროცესორის სიმძლავრე და მეტი ოპერატიული ///////////////////////
    //////////////ეს უფრო ობიექტზე ორიენტირებული ლოგიკით დაწერილი  კოდი////////////////////////
    fun minCoinsOOP(khurda: Int): Int {
        val coins = intArrayOf(1, 5, 10, 20, 50)
        val m = coins.size
        val answerArray = IntArray(khurda + 1)
        answerArray[0] = 0
        ///ყველა ერეის ელემენტს ვანიჭებთ მაქსიმალურ მნიშვნელობებს გარდა 0 პოზიციაზე მყოფისა
        for (i in 1..khurda) answerArray[i] = Int.MAX_VALUE
        for (i in 1..khurda) {
            repeat(m) {
                if (coins[it] <= i) {
                    val result = answerArray[i - coins[it]]//დროებით ვკითხულობთ და ვიმახსოვრებთ ერეიში ელემენტს
                    /////გადავაწერთერეიში მყოფ ელემენტს იმ ნომინალის მქონე ხურდების მინიმალურ მნიშვნელობას///////
                    if (result != Int.MAX_VALUE && result + 1 < answerArray[i]) answerArray[i] = result + 1
                }
            }
        }
        return answerArray[khurda]
    }

    /////////პროცესზე ორიენტირებული ლოგიკით დაწერილი კოდი ///////////////////////
    fun minCoinsComplexPOP(khurda: Int): Int {
        val coins50 = khurda / 50
        val coins20 = (khurda - coins50 * 50) / 20
        val coins10 = (khurda - coins20 * 20 - coins50 * 50) / 10
        val coins5 = (khurda - coins10 * 10- coins20 * 20 - coins50 * 50) / 5
        val coins = (khurda - coins5 * 5-coins10 * 10 - coins20 * 20 - coins50 * 50)
        return coins50 + coins20 + coins10 + coins10 + coins5 + coins
    }
}