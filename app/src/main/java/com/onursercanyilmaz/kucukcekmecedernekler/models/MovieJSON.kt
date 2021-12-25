package com.onursercanyilmaz.kucukcekmecedernekler.models


import com.google.gson.annotations.SerializedName

data class MovieJSON(
    @SerializedName("items")
    var items: List<Item?>? = null,
    @SerializedName("result")
    var result: Int? = null
) {
    data class Item(
        @SerializedName("age")
        var age: Int? = null,
        @SerializedName("backdropPath")
        var backdropPath: String? = null,
        @SerializedName("cast")
        var cast: List<String?>? = null,
        @SerializedName("countries")
        var countries: List<String?>? = null,
        @SerializedName("genres")
        var genres: List<Int?>? = null,
        @SerializedName("id")
        var id: Int? = null,
        @SerializedName("imdbID")
        var imdbID: String? = null,
        @SerializedName("imdbRating")
        var imdbRating: Int? = null,
        @SerializedName("imdbVoteCount")
        var imdbVoteCount: Int? = null,
        @SerializedName("originalTitle")
        var originalTitle: String? = null,
        @SerializedName("overview")
        var overview: String? = null,
        @SerializedName("posterPath")
        var posterPath: String? = null,
        @SerializedName("runtime")
        var runtime: Int? = null,
        @SerializedName("significants")
        var significants: List<String?>? = null,
        @SerializedName("streamingInfo")
        var streamingInfo: StreamingInfo? = null,
        @SerializedName("tagline")
        var tagline: String? = null,
        @SerializedName("title")
        var title: String? = null,
        @SerializedName("tmdbID")
        var tmdbID: String? = null,
        @SerializedName("video")
        var video: String? = null,
        @SerializedName("year")
        var year: Int? = null
    ) {
        data class StreamingInfo(
            @SerializedName("crave")
            var crave: Crave? = null,
            @SerializedName("disney")
            var disney: Disney? = null,
            @SerializedName("hbo")
            var hbo: Hbo? = null,
            @SerializedName("hotstar")
            var hotstar: Hotstar? = null,
            @SerializedName("hulu")
            var hulu: Hulu? = null,
            @SerializedName("iplayer")
            var iplayer: Iplayer? = null,
            @SerializedName("mubi")
            var mubi: Mubi? = null,
            @SerializedName("netflix")
            var netflix: Netflix? = null,
            @SerializedName("now")
            var now: Now? = null,
            @SerializedName("paramount")
            var paramount: Paramount? = null,
            @SerializedName("peacock")
            var peacock: Peacock? = null,
            @SerializedName("prime")
            var prime: Prime? = null,
            @SerializedName("showtime")
            var showtime: Showtime? = null,
            @SerializedName("stan")
            var stan: Stan? = null,
            @SerializedName("starz")
            var starz: Starz? = null,
            @SerializedName("zee5")
            var zee5: Zee5? = null
        ) {
            data class Crave(
                @SerializedName("ca")
                var ca: Ca? = null
            ) {
                data class Ca(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Disney(
                @SerializedName("ar")
                var ar: Ar? = null,
                @SerializedName("at")
                var at: At? = null,
                @SerializedName("au")
                var au: Au? = null,
                @SerializedName("be")
                var be: Be? = null,
                @SerializedName("br")
                var br: Br? = null,
                @SerializedName("ca")
                var ca: Ca? = null,
                @SerializedName("ch")
                var ch: Ch? = null,
                @SerializedName("cl")
                var cl: Cl? = null,
                @SerializedName("co")
                var co: Co? = null,
                @SerializedName("de")
                var de: De? = null,
                @SerializedName("dk")
                var dk: Dk? = null,
                @SerializedName("es")
                var es: Es? = null,
                @SerializedName("fi")
                var fi: Fi? = null,
                @SerializedName("fr")
                var fr: Fr? = null,
                @SerializedName("gb")
                var gb: Gb? = null,
                @SerializedName("it")
                var `it`: It? = null,
                @SerializedName("mx")
                var mx: Mx? = null,
                @SerializedName("nl")
                var nl: Nl? = null,
                @SerializedName("no")
                var no: No? = null,
                @SerializedName("nz")
                var nz: Nz? = null,
                @SerializedName("pt")
                var pt: Pt? = null,
                @SerializedName("se")
                var se: Se? = null,
                @SerializedName("us")
                var us: Us? = null
            ) {
                data class Ar(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class At(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Au(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Be(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Br(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ca(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ch(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Cl(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Co(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class De(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Dk(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Es(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Fi(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Fr(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Gb(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class It(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Mx(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Nl(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class No(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Nz(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Pt(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Se(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Us(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Hbo(
                @SerializedName("ar")
                var ar: Ar? = null,
                @SerializedName("br")
                var br: Br? = null,
                @SerializedName("cl")
                var cl: Cl? = null,
                @SerializedName("co")
                var co: Co? = null,
                @SerializedName("ec")
                var ec: Ec? = null,
                @SerializedName("mx")
                var mx: Mx? = null,
                @SerializedName("pe")
                var pe: Pe? = null,
                @SerializedName("us")
                var us: Us? = null,
                @SerializedName("ve")
                var ve: Ve? = null
            ) {
                data class Ar(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Br(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Cl(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Co(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ec(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Mx(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Pe(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Us(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ve(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Hotstar(
                @SerializedName("in")
                var inX: In? = null
            ) {
                data class In(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Hulu(
                @SerializedName("us")
                var us: Us? = null
            ) {
                data class Us(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Iplayer(
                @SerializedName("gb")
                var gb: Gb? = null
            ) {
                data class Gb(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Mubi(
                @SerializedName("ca")
                var ca: Ca? = null,
                @SerializedName("de")
                var de: De? = null,
                @SerializedName("fr")
                var fr: Fr? = null,
                @SerializedName("tr")
                var tr: Tr? = null
            ) {
                data class Ca(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class De(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Fr(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Tr(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Netflix(
                @SerializedName("ar")
                var ar: Ar? = null,
                @SerializedName("at")
                var at: At? = null,
                @SerializedName("be")
                var be: Be? = null,
                @SerializedName("br")
                var br: Br? = null,
                @SerializedName("ca")
                var ca: Ca? = null,
                @SerializedName("ch")
                var ch: Ch? = null,
                @SerializedName("cl")
                var cl: Cl? = null,
                @SerializedName("co")
                var co: Co? = null,
                @SerializedName("cz")
                var cz: Cz? = null,
                @SerializedName("de")
                var de: De? = null,
                @SerializedName("dk")
                var dk: Dk? = null,
                @SerializedName("ec")
                var ec: Ec? = null,
                @SerializedName("ee")
                var ee: Ee? = null,
                @SerializedName("es")
                var es: Es? = null,
                @SerializedName("fi")
                var fi: Fi? = null,
                @SerializedName("fr")
                var fr: Fr? = null,
                @SerializedName("gb")
                var gb: Gb? = null,
                @SerializedName("gr")
                var gr: Gr? = null,
                @SerializedName("hu")
                var hu: Hu? = null,
                @SerializedName("id")
                var id: Id? = null,
                @SerializedName("ie")
                var ie: Ie? = null,
                @SerializedName("in")
                var inX: In? = null,
                @SerializedName("it")
                var `it`: It? = null,
                @SerializedName("jp")
                var jp: Jp? = null,
                @SerializedName("kr")
                var kr: Kr? = null,
                @SerializedName("lt")
                var lt: Lt? = null,
                @SerializedName("lv")
                var lv: Lv? = null,
                @SerializedName("mx")
                var mx: Mx? = null,
                @SerializedName("nl")
                var nl: Nl? = null,
                @SerializedName("no")
                var no: No? = null,
                @SerializedName("pe")
                var pe: Pe? = null,
                @SerializedName("ph")
                var ph: Ph? = null,
                @SerializedName("pl")
                var pl: Pl? = null,
                @SerializedName("pt")
                var pt: Pt? = null,
                @SerializedName("ro")
                var ro: Ro? = null,
                @SerializedName("ru")
                var ru: Ru? = null,
                @SerializedName("se")
                var se: Se? = null,
                @SerializedName("sg")
                var sg: Sg? = null,
                @SerializedName("th")
                var th: Th? = null,
                @SerializedName("tr")
                var tr: Tr? = null,
                @SerializedName("ve")
                var ve: Ve? = null
            ) {
                data class Ar(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class At(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Be(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Br(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ca(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ch(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Cl(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Co(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Cz(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class De(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Dk(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ec(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ee(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Es(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Fi(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Fr(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Gb(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Gr(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Hu(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Id(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ie(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class In(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class It(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Jp(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Kr(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Lt(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Lv(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Mx(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Nl(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class No(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Pe(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ph(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Pl(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Pt(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ro(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ru(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Se(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Sg(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Th(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Tr(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ve(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Now(
                @SerializedName("gb")
                var gb: Gb? = null,
                @SerializedName("ie")
                var ie: Ie? = null,
                @SerializedName("it")
                var `it`: It? = null
            ) {
                data class Gb(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ie(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class It(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Paramount(
                @SerializedName("us")
                var us: Us? = null
            ) {
                data class Us(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Peacock(
                @SerializedName("us")
                var us: Us? = null
            ) {
                data class Us(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Prime(
                @SerializedName("ar")
                var ar: Ar? = null,
                @SerializedName("at")
                var at: At? = null,
                @SerializedName("au")
                var au: Au? = null,
                @SerializedName("be")
                var be: Be? = null,
                @SerializedName("br")
                var br: Br? = null,
                @SerializedName("ca")
                var ca: Ca? = null,
                @SerializedName("cl")
                var cl: Cl? = null,
                @SerializedName("de")
                var de: De? = null,
                @SerializedName("dk")
                var dk: Dk? = null,
                @SerializedName("es")
                var es: Es? = null,
                @SerializedName("fi")
                var fi: Fi? = null,
                @SerializedName("gb")
                var gb: Gb? = null,
                @SerializedName("hk")
                var hk: Hk? = null,
                @SerializedName("ie")
                var ie: Ie? = null,
                @SerializedName("in")
                var inX: In? = null,
                @SerializedName("it")
                var `it`: It? = null,
                @SerializedName("mx")
                var mx: Mx? = null,
                @SerializedName("nl")
                var nl: Nl? = null,
                @SerializedName("no")
                var no: No? = null,
                @SerializedName("nz")
                var nz: Nz? = null,
                @SerializedName("pa")
                var pa: Pa? = null,
                @SerializedName("ph")
                var ph: Ph? = null,
                @SerializedName("pl")
                var pl: Pl? = null,
                @SerializedName("se")
                var se: Se? = null,
                @SerializedName("sg")
                var sg: Sg? = null,
                @SerializedName("th")
                var th: Th? = null,
                @SerializedName("vn")
                var vn: Vn? = null
            ) {
                data class Ar(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class At(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Au(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Be(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Br(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ca(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Cl(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class De(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Dk(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Es(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Fi(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Gb(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Hk(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ie(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class In(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class It(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Mx(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Nl(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class No(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Nz(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Pa(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Ph(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Pl(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Se(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Sg(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Th(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )

                data class Vn(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Showtime(
                @SerializedName("us")
                var us: Us? = null
            ) {
                data class Us(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Stan(
                @SerializedName("au")
                var au: Au? = null
            ) {
                data class Au(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Starz(
                @SerializedName("us")
                var us: Us? = null
            ) {
                data class Us(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Long? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }

            data class Zee5(
                @SerializedName("in")
                var inX: In? = null
            ) {
                data class In(
                    @SerializedName("added")
                    var added: Int? = null,
                    @SerializedName("leaving")
                    var leaving: Int? = null,
                    @SerializedName("link")
                    var link: String? = null
                )
            }
        }
    }
}