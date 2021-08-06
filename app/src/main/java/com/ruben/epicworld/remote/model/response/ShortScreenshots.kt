package com.ruben.epicworld.remote.model.response

import com.google.gson.annotations.SerializedName
import com.ruben.epicworld.domain.entity.games.ShortScreenshotsEntity

/**
 * Created by Ruben Quadros on 01/08/21
 **/
data class ShortScreenshots(
    @SerializedName("id")
    val id : Int,
    @SerializedName("image")
    val image : String
)

fun ShortScreenshots.toEntity() = ShortScreenshotsEntity(id, image)

fun List<ShortScreenshots>.toEntity() = map { it.toEntity() }