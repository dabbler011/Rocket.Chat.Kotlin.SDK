package chat.rocket.core.internal.model

import chat.rocket.core.model.Attachment

data class MessagePayload(
        val roomId: String,
        val text: String?,
        val alias: String?,
        val emoji: String?,
        val avatar: String?,
        val attachments: List<Attachment>?
)