package com.nimbus.vpn.tunnel

import org.amnezia.awg.backend.Tunnel

class NimbusTunnel(
    private val tunnelName: String = "nimbus",
    private val ipv4Preferred: Boolean = true,
    private val metered: Boolean = false,
    private val listener: (Tunnel.State) -> Unit = {},
) : Tunnel {
    override fun getName(): String = tunnelName
    override fun isIpv4ResolutionPreferred(): Boolean = ipv4Preferred
    override fun isMetered(): Boolean = metered
    override fun onStateChange(newState: Tunnel.State) {
        listener(newState)
    }
}
