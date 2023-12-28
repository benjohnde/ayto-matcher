data class MatchingPairs(
    val pairs: List<Pair<Person, Person>>,
    val numberOfMatches: Int,
)

val matchingPairs = listOf(
    MatchingPairs(
        pairs = listOf(
            Pair(lina, ryan),
            Pair(sina, kevin),
            Pair(lisaMarie, eti),
            Pair(shelly, wilson),
            Pair(`tais-mela-pia`, paul),
            Pair(jana, sidar),
            Pair(julia, martin),
            Pair(`tais-mela-pia`, gerrit),
            Pair(maja, paddy),
            Pair(edda, sandro),
        ),
        numberOfMatches = 2
    ), // 1st matching night
    MatchingPairs(
        pairs = listOf(
            Pair(lina, martin),
            Pair(sina, kevin),
            Pair(`tais-mela-pia`, gerrit),
            Pair(jana, sidar),
            Pair(maja, wilson),
            Pair(edda, sandro),
            Pair(afra, eti),
            Pair(`tais-mela-pia`, ryan),
            Pair(lisaMarie, paul),
            Pair(shelly, paddy),
        ),
        numberOfMatches = 2
    ), // 2nd matching night
    MatchingPairs(
        pairs = listOf(
            Pair(julia, paddy),
            Pair(sina, sandro),
            Pair(`tais-mela-pia`, gerrit),
            Pair(jana, ryan),
            Pair(afra, sidar),
            Pair(`tais-mela-pia`, kevin),
            Pair(lisaMarie, martin),
            Pair(shelly, wilson),
            Pair(maja, eti),
            Pair(edda, paul),
        ),
        numberOfMatches = 4
    ), // 3rd matching night
    MatchingPairs(
        pairs = listOf(
            Pair(shelly, wilson),
            Pair(lina, paddy),
            Pair(afra, eti),
            Pair(`tais-mela-pia`, gerrit),
            Pair(lisaMarie, paul),
            Pair(edda, ryan),
            Pair(sina, kevin),
            Pair(julia, martin),
            Pair(`tais-mela-pia`, sandro),
            Pair(jana, sidar),
        ),
        numberOfMatches = 3
    ), // 4th matching night
    MatchingPairs(
        pairs = listOf(
            Pair(`tais-mela-pia`, gerrit),
            Pair(shelly, wilson),
            Pair(sina, sandro),
            Pair(jana, ryan),
            Pair(lisaMarie, martin),
            Pair(maja, eti),
            Pair(edda, paul),
            Pair(lina, paddy),
            Pair(julia, kevin),
            Pair(afra, sidar),
        ),
        numberOfMatches = 4
    ), // 5th matching night
    MatchingPairs(
        pairs = listOf(
            Pair(`tais-mela-pia`, gerrit),
            Pair(shelly, wilson),
            Pair(maja, eti),
            Pair(lina, kevin),
            Pair(jana, ryan),
            Pair(lisaMarie, martin),
            Pair(julia, sidar),
            Pair(sina, paul),
            Pair(edda, paddy),
            Pair(afra, sandro),
        ),
        numberOfMatches = 5
    ), // 6th matching night
)
