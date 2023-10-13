data class MatchingPairs(
    val pairs: List<Pair<Person, Person>>,
    val numberOfMatches: Int,
)

val matchingPairs = listOf(
    MatchingPairs(
        pairs = listOf(
            Pair(kim, mike),
            Pair(steffi, teezy),
            Pair(sabrina, emanuell),
            Pair(paulina, steffen),
            Pair(darya, danilo),
            Pair(shakira, marvin),
            Pair(jennifer, elia),
            Pair(sandra, paco),
            Pair(marie, fabio),
            Pair(alicia, petermax),
        ),
        numberOfMatches = 3
    ), // 1st matching night
    MatchingPairs(
        pairs = listOf(
            Pair(kim, paco),
            Pair(steffi, teezy),
            Pair(sabrina, mike),
            Pair(paulina, danilo),
            Pair(darya, emanuell),
            Pair(shakira, petermax),
            Pair(jennifer, marvin),
            Pair(sandra, elia),
            Pair(marie, fabio),
            Pair(alicia, steffen),
        ),
        numberOfMatches = 2
    ), // 2nd matching night
    MatchingPairs(
        pairs = listOf(
            Pair(kim, teezy),
            Pair(steffi, marvin),
            Pair(sabrina, petermax),
            Pair(paulina, mike),
            Pair(darya, danilo),
            Pair(shakira, fabio),
            Pair(jennifer, emanuell),
            Pair(sandra, paco),
            Pair(marie, elia),
            Pair(alicia, steffen),
        ),
        numberOfMatches = 2
    ), // 3rd matching night
    MatchingPairs(
        pairs = listOf(
            Pair(kim, petermax),
            Pair(steffi, emanuell),
            Pair(sabrina, paco),
            Pair(paulina, petermax),
            Pair(darya, danilo),
            Pair(shakira, fabio),
            Pair(jennifer, marvin),
            Pair(sandra, steffen),
            Pair(marie, elia),
            Pair(alicia, teezy),
        ),
        numberOfMatches = 4
    ), // 4th matching night
    MatchingPairs(
        pairs = listOf(
            Pair(kim, teezy),
            Pair(steffi, elia),
            Pair(sabrina, emanuell),
            Pair(paulina, mike),
            Pair(darya, danilo),
            Pair(shakira, paco),
            Pair(jennifer, marvin),
            Pair(sandra, petermax),
            Pair(marie, fabio),
            Pair(alicia, steffen),
        ),
        numberOfMatches = 3
    ), // 5th matching night
    MatchingPairs(
        pairs = listOf(
            Pair(kim, teezy),
            Pair(steffi, emanuell),
            Pair(sabrina, petermax),
            Pair(paulina, mike),
            Pair(darya, danilo),
            Pair(shakira, fabio),
            Pair(jennifer, marvin),
            Pair(sandra, steffen),
            Pair(marie, elia),
            Pair(alicia, paco),
        ),
        numberOfMatches = 4
    ), // 6th matching night
    MatchingPairs(
        pairs = listOf(
            Pair(kim, teezy),
            Pair(steffi, elia),
            Pair(sabrina, emanuell),
            Pair(paulina, marvin),
            Pair(darya, danilo),
            Pair(shakira, petermax),
            Pair(jennifer, paco),
            Pair(sandra, mike),
            Pair(marie, steffen),
            Pair(alicia, fabio),
        ),
        numberOfMatches = 3
    ), // 7th matching night
    MatchingPairs(
        pairs = listOf(
            Pair(darya, danilo),
            Pair(sandra, fabio),
            Pair(steffi, mike),
            Pair(alicia, paco),
            Pair(jennifer, marvin),
            Pair(kim, petermax),
            Pair(shakira, steffen),
            Pair(sabrina, emanuell),
            Pair(paulina, teezy),
            Pair(marie, elia),
        ),
        numberOfMatches = 1
    ), // 8th matching night
)
