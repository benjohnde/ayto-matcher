fun findCombinations(
    listA: List<Person>,
    listB: List<Person>,
    currentCombinations: MutableList<Pair<Person, Person>>,
    allCombinations: MutableList<List<Pair<Person, Person>>>
) {
    if (listA.isEmpty()) {
        allCombinations.add(currentCombinations.toList())
        return
    }
    val currentA = listA.first()
    listB.forEach {
        findCombinations(
            listA.drop(1),
            listB - it,
            currentCombinations.apply { add(Pair(currentA, it)) },
            allCombinations
        )
        currentCombinations.removeAt(currentCombinations.size - 1)
    }
}

fun isValid(pairs: List<Pair<Person, Person>>): Boolean {
    matchingPairs.forEach {
        if (it.pairs.intersect(pairs.toSet()).count() != it.numberOfMatches) {
            return false
        }
    }
    return !pairs.any { it in noMatch }
}

fun main() {
    var allCombinations = mutableListOf<List<Pair<Person, Person>>>()
    findCombinations(females, males, mutableListOf(), allCombinations)

    println("potential combinations ${String.format("%,d", allCombinations.count())}")
    println()

    // test which combination would work
    allCombinations.forEach {
        if (isValid(it)) {
            println("potential combination found")
            println()
            it.filter { !perfectMatch.contains(it) }.forEach {
                println("${it.first.name} <-> ${it.second.name}")
            }
            println()
            println()
        }
    }
}
