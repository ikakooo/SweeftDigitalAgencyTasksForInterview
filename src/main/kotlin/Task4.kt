
import java.util.*


object Task4 {


        fun isProperly(S: String): Boolean {
            val stack = LinkedList<Char>()
            for (element in S) {
                if (element == '{' || element == '[' || element == '(') {
                    stack.push(element)
                } else {
                    if (stack.isEmpty()) {
                        return false
                    }
                    val corresponding = stack.pop()
                    if (element == ')' && corresponding != '(') {
                        return false
                    }
                    if (element == ']' && corresponding != '[') {
                        return false
                    }
                    if (element == '}' && corresponding != '{') {
                        return false
                    }
                }
            }
            return stack.isEmpty()
        }


}