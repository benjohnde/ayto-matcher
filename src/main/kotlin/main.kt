fun findCombinations(
    listA: List<Person>,
    listB: List<Person>,
    currentCombinations: List<Pair<Person, Person>>,
    allCombinations: MutableList<List<Pair<Person, Person>>>
) {
    if (listA.isEmpty()) {
        allCombinations.add(currentCombinations)
        return
    }
    val currentA = listA.first()
    for (it in listB) {
        val newCurrentCombinations = currentCombinations + Pair(currentA, it)
        findCombinations(
            listA.drop(1),
            listB - it,
            newCurrentCombinations,
            allCombinations
        )
    }
}

fun isValid(pairs: List<Pair<Person, Person>>): Boolean {
    matchingPairs.forEach { matchingNight ->
        if (matchingNight.pairs.intersect(pairs.toSet()).count() != matchingNight.numberOfMatches) {
            return false
        }
    }
    return pairs.containsAll(perfectMatch) && !pairs.any { it in noMatch }
}

fun main() {
    val allCombinations = mutableListOf<List<Pair<Person, Person>>>()
    findCombinations(females, males, mutableListOf(), allCombinations)

    println("potential combinations ${String.format("%,d", allCombinations.count())}")

    // test which combination would work
    val validCombinations = allCombinations
        .filter { isValid(it) }

    println("valid combinations ${String.format("%,d", validCombinations.count())}")
    println()

    validCombinations.forEach {
        println("potential combination found")
        println()
        it.filter { !perfectMatch.contains(it) }.forEach {
            println("${it.first.name} <-> ${it.second.name}")
        }
        println()
        println()
    }
}
