package com.onursercanyilmaz.kucukcekmecedernekler.models


import com.google.gson.annotations.SerializedName

data class MovieJSON(
    @SerializedName("SEFAKÖY PMA")
    var sEFAKÖYPMA: String? = null,
    @SerializedName("Sayfa1")
    var sayfa1: List<Sayfa1?>? = null
) {
    data class SEFAKÖYPMA(
        @SerializedName("Adres Detay")
        var adresDetay: String? = null,
        @SerializedName("Kurum Adı")
        var kurumAdı: String? = null,
        @SerializedName("Kütük No")
        var kütükNo: String? = null,
        @SerializedName("Nevi")
        var nevi: String? = null
    )

    data class Sayfa1(
        @SerializedName("Adres Detay")
        var adresDetay: String? = null,
        @SerializedName("Kurum Adı")
        var kurumAdı: String? = null,
        @SerializedName("Nevi")
        var nevi: String? = null
    )
}