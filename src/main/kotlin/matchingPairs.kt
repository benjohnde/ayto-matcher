data class MatchingPairs(
    val pairs: List<Pair<Person, Person>>,
    val numberOfMatches: Int,
)

val matchingPairs: List<MatchingPairs>
    get() = listOf(
        MatchingPairs(
            pairs = listOf(
                Pair(LindaDana, Tim),
                Pair(Jennifer, Lukas),
                Pair(Tara, Nikola),
                Pair(Nadja, Lars),
                Pair(Asena, Kaan),
                Pair(Emmy, Chris),
                Pair(LauraL, Alex),
                Pair(Anastasia, MarcRobin),
                Pair(Gabriela, Ozan),
                Pair(LauraM, Antonino),
            ),
            numberOfMatches = 2
        ), // 1st matching night
        MatchingPairs(
            pairs = listOf(
                Pair(LindaDana, Antonino),
                Pair(Jennifer, Alex),
                Pair(Anastasia, Lars),
                Pair(Nadja, Kaan),
                Pair(LindaDana, Tim),
                Pair(Asena, MarcRobin),
                Pair(LauraL, Ozan),
                Pair(Tara, Nikola),
                Pair(LauraM, Lukas),
                Pair(Emmy, Chris),
            ),
            numberOfMatches = 3
        ), // 2nd matching night
        MatchingPairs(
            pairs = listOf(
                Pair(Jennifer, Kaan),
                Pair(Asena, MarcRobin),
                Pair(Anastasia, Alex),
                Pair(LindaDana, Tim),
                Pair(Nadja, Antonino),
                Pair(LindaDana, Lukas),
                Pair(LauraM, Ozan),
                Pair(LauraL, Nikola),
                Pair(Gabriela, Lars),
                Pair(Emmy, Chris),
            ),
            numberOfMatches = 3
        ), // 3rd matching night
        MatchingPairs(
            pairs = listOf(
                Pair(Asena, Kaan),
                Pair(LindaDana, MarcRobin),
                Pair(Anastasia, Nikola),
                Pair(LauraL, Tim),
                Pair(Nadja, Antonino),
                Pair(Gabriela, Lukas),
                Pair(LauraM, Ozan),
                Pair(Tara, Lars),
                Pair(Jennifer, Alex),
                Pair(Emmy, Chris),
            ),
            numberOfMatches = 1
        ), // 4th matching night
        MatchingPairs(
            pairs = listOf(
                Pair(Asena, Antonino),
                Pair(LindaDana, Tim),
                Pair(Anastasia, MarcRobin),
                Pair(LauraL, Nikola),
                Pair(Nadja, Lars),
                Pair(Gabriela, Alex),
                Pair(LindaDana, Ozan),
                Pair(Tara, Kaan),
                Pair(Jennifer, Lukas),
                Pair(Emmy, Chris),
            ),
            numberOfMatches = 5
        ), // 5th matching night
        MatchingPairs(
            pairs = listOf(
                Pair(Jennifer, Lukas),
                Pair(LauraM, MarcRobin),
                Pair(LindaDana, Lars),
                Pair(LindaDana, Tim),
                Pair(Asena, Antonino),
                Pair(Gabriela, Alex),
                Pair(Nadja, Nikola),
                Pair(Tara, Kaan),
                Pair(Anastasia, Ozan),
                Pair(Emmy, Chris),
            ),
            numberOfMatches = 6
        ), // 6th matching night
        MatchingPairs(
            pairs = listOf(
                Pair(LindaDana, Tim),
                Pair(LindaDana, Lukas),
                Pair(LauraL, Lars),
                Pair(Asena, Antonino),
                Pair(Tara, Kaan),
                Pair(Nadja, Nikola),
                Pair(Gabriela, Alex),
                Pair(LauraM, MarcRobin),
                Pair(Anastasia, Ozan),
                Pair(Emmy, Chris),
            ),
            numberOfMatches = 6
        ), // 7th matching night
        MatchingPairs(
            pairs = listOf(
                Pair(Tara, Lukas),
                Pair(LauraM, MarcRobin),
                Pair(Nadja, Nikola),
                Pair(Jennifer, Kaan),
                Pair(Gabriela, Alex),
                Pair(LauraL, Lars),
                Pair(Asena, Antonino),
                Pair(LindaDana, Tim),
                Pair(Anastasia, Ozan),
                Pair(Emmy, Chris),
            ),
            numberOfMatches = 7
        ), // 8th matching night
    )
