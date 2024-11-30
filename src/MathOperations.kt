class MathOperations {

    fun gcf(num1: Int, num2: Int): Int {
        var list_1 = mutableListOf<Int>()
        var list_2 = mutableListOf<Int>()

        var index : Double = 1.0
        while (num1 >= index){
            if (num1.toDouble() % index == 0.0){
                list_1.add(index.toInt())
            }
            index++
        }

        index = 1.0
        while (num2 >= index){
            if(num2.toDouble() % index == 0.0){
                list_2.add(index.toInt())
            }
            index++
        }
        var maxList = mutableListOf<Int>()

        if(list_1.size > list_2.size)
            maxList = list_1
        else if (list_2.size == list_1.size)
            maxList = list_1
        else
            maxList = list_2

        var minList = mutableListOf<Int>()

        if(list_1.size < list_2.size)
            minList = list_1
        else if (list_2.size == list_1.size)
            minList = list_2
        else
            minList =  list_2

        for (item in maxList.size - 1 downTo 0){
            if (maxList[item] in minList)
                return maxList[item]
        }

        return -1
    }

    fun lcm(num1: Int, num2: Int): Int {
        return (num1*num2)/gcf(num1, num2)
    }

    fun getSymbol(str : String) : Boolean {
        for(char in str){
            if(char == '$')
                return true
        }
        return false
    }

    fun sumOfEvenHundred() : Int{
        var sum = 0
        var current_sum = 2

        fun helper_sumOfEvenHundred() : Int{
            if ( current_sum > 99)
                return sum

            sum += current_sum
            current_sum += 2

            return helper_sumOfEvenHundred()
        }

        return helper_sumOfEvenHundred()
    }

    fun reverse_num(num : Int) : Int{
        var str_number = num.toString()
        var result = StringBuilder()

        for(char in str_number.reversed()){
            result.append(char)
        }
        return result.toString().toInt()
    }

    fun is_palindrome(s : String) : Boolean {
        var str = s.lowercase()
        str = str.filter{it.isLetterOrDigit()}

        var left = 0
        var right = str.length-1

        while(left <= right){
            if (str[left] != str[right]){
                return false
            }
            left++
            right--
        }
        return true
    }
}