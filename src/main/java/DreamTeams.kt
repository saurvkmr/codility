data class DreamTeams(var value: Int, var index: Int) : Comparable<Int> {
    override fun compareTo(other: Int) = value.compareTo(other)
}
