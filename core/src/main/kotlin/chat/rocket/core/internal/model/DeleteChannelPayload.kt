package chat.rocket.core.internal.model

import se.ansman.kotshi.JsonSerializable

@JsonSerializable
data class DeleteChannelPayload(
        val roomId: String
)