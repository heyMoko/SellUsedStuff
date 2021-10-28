package com.project.tradeusedstuff.chatdetail

data class ChatItem(
    val senderId: String,
    val message: String
) {
    constructor(): this("", "")
}
