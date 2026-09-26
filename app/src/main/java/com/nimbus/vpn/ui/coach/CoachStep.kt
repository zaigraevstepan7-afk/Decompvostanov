package com.nimbus.vpn.ui.coach

enum class CoachStep(val id: Int) {
    OFFER(0),
    ABOUT(12),
    CREATE(1),
    PICK(2),
    CONNECT(3),
    CELEBRATE(4),
    ACCESS(11),
    SETTINGS(5),
    TOUR_AUTO(6),
    TOUR_KILL(7),
    TOUR_LINK(8),
    TOUR_BATTERY(9),
    DONE(10),
    ;

    val explaining: Boolean
        get() = this == TOUR_AUTO || this == TOUR_KILL || this == TOUR_LINK || this == TOUR_BATTERY

    fun nextTour(): CoachStep = when (this) {
        TOUR_AUTO -> TOUR_KILL
        TOUR_KILL -> TOUR_LINK
        TOUR_LINK -> TOUR_BATTERY
        TOUR_BATTERY -> DONE
        else -> this
    }

    /** First-run only. A later server must not rewind the tour onto the gear hint. */
    fun afterServerCreated(heardAccess: Boolean): CoachStep = when (this) {
        CREATE, PICK -> ACCESS
        ACCESS, CELEBRATE, SETTINGS -> if (heardAccess) DONE else this
        else -> this
    }

    /** The gear hint follows the first connect, not every later one. */
    fun afterTunnelUp(): CoachStep = if (this == CONNECT) CELEBRATE else this

    companion object {
        fun from(id: Int): CoachStep = entries.firstOrNull { it.id == id } ?: OFFER
    }
}
