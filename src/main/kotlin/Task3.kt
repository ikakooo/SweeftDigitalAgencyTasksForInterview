object Task3 {


    fun notContains(array: IntArray): String {
        if (array.isEmpty()) return "Empty Array"
        var index = 1
        array.sort()
        array.indices.forEach {
            if (index <array[it]&&array[it]>0) return "${index--}" else if (array[it]>0)index=array[it]+1
        }
        return "Null"
    }

}