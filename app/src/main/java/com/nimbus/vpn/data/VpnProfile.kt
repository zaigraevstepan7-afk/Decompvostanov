package com.nimbus.vpn.data

import kotlinx.serialization.Serializable
import java.util.UUID

@Serializable
data class VpnProfile(
    val id: String = UUID.randomUUID().toString(),
    val name: String,
    val rawConfig: String,
    val createdAt: Long = System.currentTimeMillis(),
)

@Serializable
data class ProfileIndex(
    val profiles: List<VpnProfile> = emptyList(),
    val activeId: String? = null,
)
