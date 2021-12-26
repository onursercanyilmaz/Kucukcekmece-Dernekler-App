package com.onursercanyilmaz.kucukcekmecedernekler.models


import com.google.gson.annotations.SerializedName

class MovieJSON : ArrayList<MovieJSON.MovieJSONItem>(){
    data class MovieJSONItem(
        @SerializedName("capacity")
        var capacity: Int? = null,
        @SerializedName("district")
        var district: String? = null,
        @SerializedName("emptyCapacity")
        var emptyCapacity: Int? = null,
        @SerializedName("freeTime")
        var freeTime: Int? = null,
        @SerializedName("isOpen")
        var isOpen: Int? = null,
        @SerializedName("lat")
        var lat: String? = null,
        @SerializedName("lng")
        var lng: String? = null,
        @SerializedName("parkID")
        var parkID: Int? = null,
        @SerializedName("parkName")
        var parkName: String? = null,
        @SerializedName("parkType")
        var parkType: String? = null,
        @SerializedName("workHours")
        var workHours: String? = null
    )
}