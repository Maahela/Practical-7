object Main {
    def calculateSquare(nums: List[Int]): List[Int] = {
        nums.map(num => num * num)
    }

    def main(args: Array[String]): Unit = {
        val input = List(1,2,3,4,5,6)
        val output = calculateSquare(input)
        println(output)
    }
}