package me.him188.ani.danmaku.protocol

import kotlinx.serialization.Serializable

@Serializable
data class AniUser(
    val id: String,
    val nickname: String,
    val smallAvatar: String,
    val mediumAvatar: String,
    val largeAvatar: String,
    val registerTime: Long? = null,
    val lastLoginTime: Long,
    val clientVersion: String? = null,
)
