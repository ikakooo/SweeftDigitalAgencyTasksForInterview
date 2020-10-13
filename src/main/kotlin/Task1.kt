object Task1 {

    fun isPalindrome(s: String): Boolean {
        val n = s.length
        for (i in 0 until n / 2) {
            if (s[i] != s[n - i - 1]) {
                return false
            }
        }
        return true
    }
}