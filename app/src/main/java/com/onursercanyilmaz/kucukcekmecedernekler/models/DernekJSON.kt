package com.onursercanyilmaz.kucukcekmecedernekler.models


import com.google.gson.annotations.SerializedName

data class DernekJSON(
    @SerializedName("SEFAKÖY PMA")
    var sEFAKÖYPMA: ArrayList<SEFAKÖYPMA?>? = null,
    @SerializedName("Sayfa1")
    var sayfa1: ArrayList<Sayfa1?>? = null
) {
    data class SEFAKÖYPMA(
        @SerializedName("Adres Detay")
        var adresDetay: String? = null,
        @SerializedName("Kurum Adı")
        var kurumAdi: String? = null,
        @SerializedName("Kütük No")
        var kutukNo: String? = null,
        @SerializedName("Nevi")
        var nevi: String? = null
    )

    data class Sayfa1(
        @SerializedName("Adres Detay")
        var adresDetay: String? = null,
        @SerializedName("Kurum Adı")
        var kurumAdi: String? = null,
        @SerializedName("Nevi")
        var nevi: String? = null
    )
}